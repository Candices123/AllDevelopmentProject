<template>
  <div class="loginUp" ref="loginUpVue">
    <el-form
      :model="ruleForm"
      :rules="rules"
      ref="ruleForm"
      label-width="100px"
      class="demo-ruleForm"
    >
      <el-form-item label="手机号码" prop="userTel">
        <el-input v-model="ruleForm.userTel"></el-input>
      </el-form-item>
      <el-form-item label="密码" prop="userPwd1">
        <el-input v-model="ruleForm.userPwd1" type="password"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm()" style="float:left;min-width:100%;">登录</el-button>
      </el-form-item>
      <el-form-item>
        <span>
          <a class="forgetPwd" @click="forgetPwd()">忘记密码?</a>
        </span>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
import Axios from "axios";
export default {
  prop: {
    loginFlag: Boolean
  },
  data() {
    return {
      ruleForm: {
        userTel: "",
        userPwd1: ""
      },
      rules: {
        userTel: [
          { required: true, message: "请输入电话号码", trigger: "change" },
          { min: 11, max: 11, message: "电话号码长度为11位", trigger: "blur" }
        ],
        userPwd1: [
          { required: true, message: "请输入密码", trigger: "change" },
          { min: 6, max: 16, message: "长度为6到16位", trigger: "blur" }
        ]
      }
    };
  },
  methods: {
    forgetPwd() {
      this.$emit("changeLoginFlag", false);
    },
    submitForm() {
      Axios.post(
        "http://localhost:8086/getUserInfo",
        this.$qs.stringify({ userTel: this.ruleForm.userTel })
      )
        .then(res => {
          // console.log(res)
          if (this.ruleForm.userPwd1 == res.data) {
            this.$emit("changeLoginFlag", true);
            // console.log("登录成功");
          } else {
            this.$message({
              message: "账号或密码错误，请检查！",
              center: true
            });
          }
        })
        .catch(err => {
          console.log(err);
          this.$message({
            message: "提交失败，请稍后重新提交!!",
            center: true
          });
        });
    }
  }
};
</script>
<style>
.loginUp {
  height: 300px;
  max-width: 500px;
  min-width: 200px;
  margin: 0 auto;
}
.forgetPwd {
  float: right;
  text-decoration: underline;
  margin-top: -10px;
  cursor: default;
}
.forgetPwd:hover {
  color: #409eff;
}
</style>