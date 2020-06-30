<template>
  <div>
    <el-header class="paneOneHeader">
      <div class="block">
        <span class="demonstration">科室：</span>
        <el-select v-model="departmentValue" placeholder="请选择">
          <el-option
            v-for="item in options"
            :key="item.value"
            :label="item.value"
            :value="item.value"
          ></el-option>
        </el-select>
      </div>

      <div class="block">
        <span class="demonstration">日期：</span>
        <el-date-picker
          v-model="timeValue"
          type="daterange"
          range-separator="至"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
          :picker-options="pickerOptions"
        ></el-date-picker>
      </div>

      <div class="block">
        <el-radio v-model="timeRadio" label="0">上午9:00-11:30</el-radio>
        <el-radio v-model="timeRadio" label="1">下午2:00-5:30</el-radio>
      </div>
    </el-header>

    <el-container class="paneOneContainer">
      <div style="width:100%;">
        <el-table
          :data="tableData"
          height="350"
          border
          style=" width: 100%; box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.1);"
        >
          <el-table-column prop="departmentName" label="科室"></el-table-column>
          <el-table-column prop="doctorName" label="医生姓名"></el-table-column>
          <el-table-column prop="doctorTitle" label="职称"></el-table-column>
          <el-table-column prop="doctorCount" label="可预约名额(人)"></el-table-column>
          <el-table-column label="操作">
            <template slot-scope="scope">
              <el-button
                size="mini"
                type="primary"
                @click="handleDelete(scope.$index, scope.row)"
              >预约</el-button>
            </template>
          </el-table-column>
        </el-table>
        <el-dialog :visible.sync="visible">
          <div style="height:400px;">
            <el-input
              type="textarea"
              placeholder="请填写病症情况，以便医生更好地了解您的情况！"
              v-model="textarea"
              maxlength="200"
              show-word-limit
            ></el-input>
            <el-button type="primary" style="float:right;margin-top:20px;" @click="submitOrder()">提交</el-button>
          </div>
        </el-dialog>
      </div>
    </el-container>
  </div>
</template>

<script>
import Axios from "axios";
import time from "../js/time";
export default {
  props: {
    loginFlag: {
      type: Boolean
    },
    userTel: {
      type: String
    }
  },
  data() {
    return {
      options: [
        { value: "内科" },
        { value: "外科" },
        { value: "妇科" },
        { value: "儿科" },
        { value: "眼科" },
        { value: "口腔科" },
        { value: "皮肤科" }
      ],
      departmentValue: "",
      timeValue: "",
      pickerOptions: {
        disabledDate(time) {
          return time.getTime() < Date.now();
        }
      },
      timeRadio: "0",
      tableData: [],
      visible: false,
      textarea: "",
      doctorList: [],
      doctorDuty: [],
      newOrderList: {}
    };
  },
  watch: {
    timeValue: function() {
      this.checkValue();
      // console.log(this.timeValue);
    },
    departmentValue: function() {
      this.checkValue();
      // console.log(this.departmentValue);
    },
    timeRadio: function() {
      this.checkValue();
    }
  },
  created() {
    this.getDoctor();
    this.getDoctorDuty();
    this.getInit();
  },

  methods: {
    getInit() {
      // 初始化日期选择器
      var now = new Date();
      var startDate = new Date(
        Date.UTC(now.getFullYear(), now.getMonth(), now.getDate() + 1)
      )
        .toISOString()
        .slice(0, 10);
      var endDate = new Date(
        Date.UTC(now.getFullYear(), now.getMonth(), now.getDate() + 1)
      )
        .toISOString()
        .slice(0, 10);
      this.timeValue = [];
      this.timeValue.push(startDate);
      this.timeValue.push(endDate);
    },
    getDoctor() {
      Axios.get("/getDoctorListAll")
        .then(res => {
          // console.log(res.data.extend);
          this.doctorList = res.data.extend.doctorList;
        })
        .catch(err => {
          console.log(err);
        });
    },
    getDoctorDuty() {
      Axios.get("/getDoctorDutyListAll")
        .then(res => {
          // console.log(res.data.extend);
          this.doctorDuty = res.data.extend.doctorDutyList;
        })
        .catch(err => {
          console.log(err);
        });
    },
    searchDoctorDutyAndDoctor() {
      // 先根据科室departmentValue搜索
      // 再根据日期搜索
      // 再根据上下午搜索
      var _that = this;
      var temp = [];
      if (this.doctorList != null && this.doctorDuty != null) {
        this.doctorList.filter(item => {
          if (item.departmentName == _that.departmentValue) {
            _that.doctorDuty.filter(item2 => {
              if (item.doctorId == item2.doctorId) {
                var tempTimeFirst = time.transTime(
                  new Date(_that.timeValue[0])
                );
                var tempTimeLate = time.transTime(new Date(_that.timeValue[1]));
                var centerTime = time.transTime(new Date(item2.doctorDate));
                if (
                  tempTimeFirst <= centerTime &&
                  centerTime <= tempTimeLate &&
                  item2.timeFlag == _that.timeRadio
                ) {
                  var tempObject = item;
                  tempObject.doctorTime = new Date(item2.doctorDate);
                  temp.push(tempObject);
                }
              }
            });
          }
        });
      }
      this.tableData = temp;
      // console.log(this.tableData);
    },
    checkValue() {
      if (this.timeValue != null && this.departmentValue != null) {
        this.searchDoctorDutyAndDoctor();
      }
    },
    handleDelete(index, row) {
      if (!this.loginFlag) {
        //没有登录，不能预约
        this.$message({
          message: "请登录后再预约！",
          center: true
        });
      } else if (row.doctorCount == 0) {
        this.$message({
          message: "该医生不可预约，请尝试其他操作！",
          center: true
        });
      } else {
        // console.log(index, row);
        // row表示这一行的医生信息
        // 创建一个新的对象表示 即将发送的一条预约记录
        this.newOrderList = {
          // orderId: 4,
          appointmentTime: new Date(row.doctorTime),
          callNumberState: null,
          departmentName: row.departmentName,
          diseaseDescription: this.textarea,
          doctorId: row.doctorId,
          doctorName: row.doctorName,
          orderTime: new Date(),
          timeFlag: this.timeRadio,
          userTel: this.userTel,
          visitingState: "-1"
        };
        this.visible = true;
      }
    },
    submitOrder() {
      // 检查是否登录
      // 检查是否支付
      // 发送请求  并减少医生的可就诊人数
      this.newOrderList.diseaseDescription = this.textarea;
      var that = this;
      Axios({
        headers: {
          "Content-Type": "application/json"
        },
        method: "post",
        url: "/insertOrderlist",
        data: JSON.stringify(this.newOrderList)
      })
        .then(function(res) {
          // console.log(res);
          that.visible = false;
          that.textarea = "";
          that.$message({
            message: "预约成功",
            center: true
          });
        })
        .catch(function(err) {
          that.$message({
            message: "网络请求错误",
            center: true
          });
          // console.log(err);
        });
    }
  }
};
</script>
<style>
.paneOneHeader {
  padding-top: 10px;
  margin-bottom: 20px;
}
.block {
  float: left;
  margin-right: 30px;
}
.block span {
  font-size: 14px;
}
.block .el-radio {
  font-size: 14px;
  line-height: 40px;
}
.paneOneContainer {
  width: 100%;
}
.messageSpan {
  display: block;
  width: 100%;
  text-align: center;
  line-height: 300px;
  color: #666;
}
</style>