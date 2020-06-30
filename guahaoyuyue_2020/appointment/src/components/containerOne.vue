<template>
  <!-- <el-aside>aside</el-aside> -->
  <el-main>
    <div class="warpper">
      <el-tabs :tab-position="tabPosition" style="height:450px;">
        <el-tab-pane label="预约挂号" >
          <paneOne :loginFlag="loginFlag"  :userTel ="userTel" ></paneOne>
        </el-tab-pane>
        <el-tab-pane label="预约须知">
          <paneTwo></paneTwo>
        </el-tab-pane>
        <el-tab-pane label="搜索医生">
          <paneThree></paneThree>
        </el-tab-pane>
      </el-tabs>
    </div>
  </el-main>
</template>
<script>
import paneOne from "../components/paneOne";
import paneTwo from "../components/paneTwo";
import paneThree from "../components/paneThree";
import Axios from "axios";

export default {
  components: {
    paneOne,
    paneTwo,
    paneThree
  },
  props: {
    loginFlag: {
      type: Boolean
    },
    userTel:{
      type:String
    }
  },
  data() {
    return {
      tabPosition: "left"
      // doctorList: [],
      // doctorDuty: []
    };
  },
  created() {
    // this.getData();
  },
  watch: {
  
  },
  method: {
    // 获取医生的信息和值班表
    // getData() {
    //   Axios.get("/getDoctorListAll", "get")
    //     .then(res => {
    //       console.log(res);
    //       doctorList = res.data.doctorList;
    //     })
    //     .catch(err => {
    //       console.log(err);
    //     });
    //   Axios.get("/getDoctorDutyListAll", "get")
    //     .then(res => {
    //       console.log(res);
    //       doctorDuty = res.data.doctorDuty;
    //     })
    //     .catch(err => {
    //       console.log(err);
    //     });
    // }
  }
};
</script>

<style>
/* el-main */
.warpper {
  width: 1200px;
  min-width: 1200px;
  margin: 0 auto;
  /* padding: 20px; */
}
.el-tab-pane {
  width: 90%;
  margin: 0 auto;
}
.el-tabs__item {
  height: 100px;
  line-height: 100px;
}
</style>