<template>
  <div class="containerBody" >
    <el-container >
      <el-header>
        <img class="logo" src="../assets/logo.jpg" />
        <a @click="toIndexOne">
          <span class="text">web版医院网上挂号预约系统</span>
        </a>
        <el-dropdown class="dropdown" v-if="loginFlag" @command="handleCommand">
          <span class="el-dropdown-link">
            {{user.tel}}
            <i class="el-icon-arrow-down el-icon--right"></i>
          </span>
          <el-dropdown-menu slot="dropdown">
            <!-- <el-dropdown-item command="a">个人信息</el-dropdown-item> -->
            <el-dropdown-item command="a">预约记录</el-dropdown-item>
            <el-dropdown-item command="b">账号信息</el-dropdown-item>
            <el-dropdown-item command="c">意见反馈</el-dropdown-item>
            <el-dropdown-item command="d">退出账号</el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
        <span v-else class="login">
          <a @click="loginUp">登录&nbsp;</a>/
          <!-- <el-button type="text" @click="loginIn">登录</el-button>/ -->
          <a @click="loginIn">注册</a>
        </span>
        <el-dialog title :visible.sync="loginUpVisible">
          <!-- 登录 -->
          <loginUp :data="loginFlag" @changeLoginFlag="LoginFlagChange" ref="loginUpVue"></loginUp>
        </el-dialog>
        <el-dialog title :visible.sync="loginInVisible">
          <!-- 注册 -->
          <loginIn :data="loginFlag" @changeLoginFlag="LoginFlagChange" ref="loginInVue"></loginIn>
        </el-dialog>
      </el-header>
      <el-container>
        <containerOne v-if="containerFlag=='one'" v-bind:loginFlag="loginFlag" :userTel="this.userForm.userTel"></containerOne>
        <containerTwo v-else-if="containerFlag=='two'" :msg="containerTwoIndex" :userForm="userForm" ></containerTwo>
      </el-container>
      <el-footer>
        <span>© 惠州学院 计算机科学与工程学院</span>
      </el-footer>
    </el-container>
  </div>
</template>


<script>
import containerOne from "../components/containerOne";
import containerTwo from "../components/containerTwo";
import loginIn from "./loginIn";
import loginUp from "./loginUp";
import axios from "axios";

export default {
  name: "index",
  components: {
    containerOne,
    containerTwo,
    loginIn,
    loginUp
  },
  data() {
    return {
      loginFlag: false,
      // loginFlag: true, //是否登录的标志
      loginInVisible: false,
      loginUpVisible: false,

      containerFlag: "one",
      containerTwoIndex: "a",

      userForm:{
        userTel:"",
      },
      user: {
        tel: ""
      }
    };
  },
  mounted() {
    // this.LoginFlagChange(true);
  },
  methods: {
    // 在登录之后需要获取的用户信息
    // 用户手机号
    getData(){
      // console.log(this.$refs["loginUpVue"]);
      this.userForm.userTel = (this.$refs["loginInVue"]==undefined ?this.$refs["loginUpVue"].ruleForm.userTel:this.$refs["loginInVue"].ruleForm.userTel);
      this.user.tel = this.userForm.userTel.substring(0,6)+"***";
    },

    // 跳转到首页
    toIndexOne() {
      this.containerFlag = "one";
    },
    // 登录
    loginIn() {
      this.loginInVisible = true;
    },
    loginUp() {
      this.loginUpVisible = true;
    },
    LoginFlagChange(params) {
      if (params === true) {
        //表示成功登录或者成功注册
        this.getData();
        this.loginFlag = true;
        this.loginInVisible = false;
        this.loginUpVisible = false;
      } else if (params === false) {
        //表示忘记密码
        this.loginUpVisible = false;
        var _this = this; //
        setTimeout(function() {
          _this.loginInVisible = true;
        }, "500");
      }
    },

    // 跳转
    // 点击预约记录 a
    // 点击预约信息 b
    // 点击意见反馈 c
    // 点击退出当前账号 d
    handleCommand(command) {
      // this.$message("click on item " + command);
      this.containerFlag = "two";
      if (command == "a") {
        this.containerTwoIndex = "a";
      } else if (command == "b") {
        this.containerTwoIndex = "b";
      } else if (command == "c") {
        this.containerTwoIndex = "c";
      } else if (command == "d") {
        location.reload();
      }
    },
  }
};
</script>

<style>
/* header部分 */
@import "../css/index.css";

.login {
  float: right;
  cursor: pointer;
  color: #409eff;
  margin-top: 20px;
  font-size: 14px;
}

/* el-main 部分 */
.el-menu-vertical-demo:not(.el-menu--collapse) {
  width: 200px;
  min-height: 400px;
}

.el-main {
  /* background-color: #e9eef3; */
  color: #333;
  text-align: center;
}

/* footer */

.el-footer span {
  font-size: 10px;
  line-height: 60px;
  color: #666;
}
</style>
