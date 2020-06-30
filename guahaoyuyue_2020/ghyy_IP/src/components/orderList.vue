 <!-- orderList 用户预约单 -->
<template>
  <div>
    <el-table :data="tableData" style="width: 100%" height="450">
      <el-table-column prop="orderId" label="订单编号"></el-table-column>
      <el-table-column prop="departmentName" label="就诊科室"></el-table-column>
      <el-table-column prop="doctorName" label="就诊医生"></el-table-column>
      <el-table-column prop="diseaseDescription" label="病症描述"></el-table-column>
      <el-table-column prop="appointmentTime" label="预约就诊日期" width="150" :formatter="formatDate2"></el-table-column>
      <el-table-column prop="timeFlag" label="预约时间段" :formatter="translateDate" width="200"></el-table-column>
      <el-table-column prop="orderTime" label="预约申请时间" width="150" :formatter="formatDate1"></el-table-column>
      <el-table-column label="操作">
        <template slot-scope="scope">
          <el-button
            v-if="scope.row.visitingState=='-1'"
            size="mini"
            type="danger"
            @click="handleDelete(scope.$index, scope.row)"
          >取消预约</el-button>
          <el-button
            v-else-if="scope.row.visitingState=='0'"
            size="mini"
            type="info"
            @click="handleDelete(scope.$index, scope.row)"
            disabled
          >预约过期</el-button>
          <el-button
            v-else-if="scope.row.visitingState=='1'"
            size="mini"
            type="success"
            @click="handleDelete(scope.$index, scope.row)"
            disabled
          >就诊成功</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>



<script>
import Axios from "axios";
import time from "../js/time";
export default {
  props: ["user"],
  data() {
    return {
      tableData: []
    };
  },
  mounted() {
    this.getOrderListAll();
  },
  methods: {
    formatDate2(row, column) {
      let data = row[column.property];
      if (data == null) {
        return "";
      }
      let dt = new Date(data);
      var year = dt.getFullYear();
      var month = dt.getMonth() + 1;
      var day = dt.getDate();
      return (
        year +
        "-" +
        (month < 10 ? "0" + month : month) +
        "-" +
        (day < 10 ? "0" + day : day)
      );
    },
    formatDate1(row, column) {
      let data = row[column.property];
      if (data == null) {
        return "";
      }
      let dt = new Date(data);
      var year = dt.getFullYear();
      var month = dt.getMonth() + 1;
      var day = dt.getDate();
      var hh = dt.getHours();
      var mm = dt.getMinutes();
      return (
        year +
        "-" +
        (month < 10 ? "0" + month : month) +
        "-" +
        (day < 10 ? "0" + day : day) +
        " " +
        (hh < 10 ? "0" + hh : hh) +
        ":" +
        (mm < 10 ? "0" + mm : mm)
      );
    },
    translateDate(row, column) {
      let timeFlag = row[column.property];
      if (timeFlag == null) return "";
      if (timeFlag == 0) return "上午 9:00-11:30";
      else if (timeFlag == 1) return "下午2:00-5:30";
    },
    handleDelete(index, row) {
      if (row.visitingState == -1) {
        var that = this;
        Axios({
          headers: {
            "Content-Type": "application/json"
          },
          method: "post",
          url: "http://localhost:8086/deleteOrderlist",
          data: JSON.stringify(parseInt(row.orderId))
        })
          .then(function(res) {
            // console.log(res);
            that.$message({
              message: "取消预约成功!",
              center: true
            });
            that.getOrderListAll();
          })
          .catch(function(err) {
            console.log(err);
          });
      }
      // console.log(index, row);
    },

    getOrderListAll() {
      Axios.post(
        "http://localhost:8086/getOrderlist",
        this.$qs.stringify({ userTel: this.user.userTel })
      )
        .then(res => {
          this.tableData = res.data.extend.orderlist;
          this.tableData.filter(item => {
            // 获取预约的时间
            // 获取现在的时间
            // 如果现在的时间大于预约的时间并且还未就诊表示预约已过期
            if (item.visitingState == -1) {
              var currentTime = time.transTime(new Date());
              var appointmentTime = time.transTime(new Date(item.appointmentTime));
              if (item.timeFlag == 0) {
                appointmentTime = appointmentTime + "0";
              } else {
                appointmentTime = appointmentTime + "1";
              }
              var date = new Date();
              if (date.getHours() < 12) {
                currentTime = currentTime + "0";
              } else if (date.getHours >= 12 && date.getHours() < 18) {
                currentTime = currentTime + "1";
              } else if (date.getHours >= 18) {
                currentTime = currentTime + "2";
              }
              // console.log(currentTime);
              // console.log(appointmentTime);
              if(currentTime > appointmentTime){
                item.visitingState = 0;
              }
            }
          });
          // console.log(res);
          // console.log(this.tableData);
        })
        .catch(err => {
          console.log(err);
        });
    }
  }
};
</script>
<style>
.el-table .warning-row {
  background: oldlace;
}

.el-table .success-row {
  background: #f0f9eb;
}
</style>