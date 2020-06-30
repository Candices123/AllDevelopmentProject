<template>
  <!-- 搜索医生 -->
  <div style="margin-top: 15px;">
    <el-input placeholder="请输入医生的姓名或者想要查询的科室" v-model="keyword" class="input-with-select">
      <!-- <el-select v-model="select" slot="prepend" placeholder="请选择"> 
      <el-option label="餐厅名" value="1"></el-option>
      <el-option label="订单号" value="2"></el-option>
      <el-option label="用户电话" value="3"></el-option>
      </el-select>-->
      <el-button slot="append" icon="el-icon-search" @click="searchDoctor"></el-button>
    </el-input>
    <el-table :data="tableData" stripe style="width: 100%" height="350">
      <el-table-column prop="doctorName" label="医生姓名"></el-table-column>
      <el-table-column prop="doctorProfile" label="简介" class="doctorProfile" width="350"></el-table-column>
      <el-table-column prop="departmentName" label="所属科室"></el-table-column>
      <el-table-column prop="doctorTitle" label="职称" class="doctorTitle"></el-table-column>
      <el-table-column prop="doctorCount" label="可就诊人数"></el-table-column>
      <!-- <el-table-column prop="doctorTime" label="值班时间" width="200"></el-table-column> -->
    </el-table>
  </div>
</template>


<script>
import Axios from "axios";
export default {
  data() {
    return {
      keyword: "",
      select: "",

      tableData: [],
      doctorListAll: []
    };
  },
  mounted() {
    this.getDoctorListAll();
  },
  methods: {
    searchDoctor() {
      var tableData = this.doctorListAll.filter(item => {
        if (
          item.doctorName.includes(this.keyword) ||
          item.departmentName.includes(this.keyword)
        ) {
          return item;
        }
      });
      if (tableData != null) {
        this.tableData = tableData;
      }
    },
    getDoctorListAll() {
      Axios.get("/getDoctorListAll")
        .then(res => {
          // console.log(res);
          this.doctorListAll = res.data.extend.doctorList;
        })
        .catch(err => {
          console.log(err);
        });
    }
  }
};
</script>
<style>
.el-input {
  margin-bottom: 20px;
}
.el-select .el-input {
  width: 130px;
}
.input-with-select .el-input-group__prepend {
  background-color: #fff;
}

/* 显示医生的信息 */

.time {
  font-size: 13px;
  color: #999;
}

.bottom {
  margin-top: 13px;
  line-height: 12px;
}

.button {
  padding: 0;
  float: right;
}

.clearfix:before,
.clearfix:after {
  display: table;
  content: "";
}

.clearfix:after {
  clear: both;
}
.doctorProfile {
  width: 100px;
  height: 10px;
  overflow: hidden;
  text-overflow: ellipsis;
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
}
</style>

