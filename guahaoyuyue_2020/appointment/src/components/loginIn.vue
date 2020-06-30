<template>
  <!-- 注册 -->
  <div class="loginIn" ref="loginInVue">
    <el-form
      :model="ruleForm"
      :rules="rules"
      ref="ruleForm"
      label-width="100px"
      class="demo-ruleForm"
    >
    <el-form-item label="用户昵称" prop="userName">
        <el-input v-model="ruleForm.userName"></el-input>
      </el-form-item>
      <el-form-item label="手机号码" prop="userTel">
        <el-input v-model="ruleForm.userTel"></el-input>
      </el-form-item>
      <el-form-item label="验证码" prop="yanzhengma">
        <el-input v-model="ruleForm.yanzhengma" class="codeBox"></el-input>
        <el-button
          type="primary"
          @click="sendCode"
          :disabled="disabled"
          v-if="disabled==false"
          class="sendCodeBox"
        >发送验证码</el-button>
        <el-button
          class="sendCodeBox"
          type="button"
          @click="sendCode"
          :disabled="disabled"
          v-if="disabled==true"
        >{{btntxt}}</el-button>
      </el-form-item>
      <el-form-item label="密码" prop="userPwd1">
        <el-input v-model="ruleForm.userPwd1"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm()" style="float:left;min-width:100%;">立即提交</el-button>
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
        userPwd1: "",
        userName:"",
        yanzhengma: ""
      },
      yanzhengma: {
        value: ""
      },
      rules: {
        userTel: [
          { required: true, message: "请输入电话号码", trigger: "change" }
        ],
        userPwd1: [
          { required: true, message: "请输入密码", trigger: "change" },
          { min: 6, max: 16, message: "长度为6到16位", trigger: "blur" }
        ],
        yanzhengma: [
          { required: true, message: "请输入验证码", trigger: "change" }
          // { min: 6, max: 16, message: "长度为6到16位", trigger: "blur" }
        ],
        userName:[ { required: true, message: "请输入姓名", trigger: "change" },
        { min: 1, max: 10, message: "长度为1到10位", trigger: "blur" }
        ]
      },
      disabled: false,
      time: 0,
      btntxt: "重新发送"
      
    };
  },
  mounted() {},

  methods: {
    //手机验证发送验证码
    sendCode() {
      const reg = 11 && /^((13|14|15|17|18)[0-9]{1}\d{8})$/;
      if (this.ruleForm.userTel == "") {
        this.$message({
          message: "手机号不能为空",
          center: true
        });
        return;
      } else if (!reg.test(this.ruleForm.userTel)) {
        this.$message({
          message: "请输入正确的手机号",
          center: true
        });
        return;
      } else {
        // 跟后台获取验证码
        Axios.post(
          "/getCode",
          this.$qs.stringify({ userTel: this.ruleForm.userTel })
        )
          .then(res => {
            this.yanzhengma.value = res.data;
            // console.log(res);
          })
          .catch(err => {
            console.log(err);
          });
        this.$message({
          message: "验证码已发送，请注意短信提醒",
          type: "success",
          center: true
        });
        this.time = 60;
        this.disabled = true;
        this.timer();
      }
    },
    //60S倒计时
    timer() {
      if (this.time > 0) {
        this.time--;
        this.btntxt = this.time + "s后重新获取";
        setTimeout(this.timer, 1000);
      } else {
        this.time = 0;
        this.btntxt = "获取验证码";
        this.disabled = false;
      }
    },
    submitForm() {
      // 检查注册的信息正确与否
      var flag = true;
      const reg = 11 && /^((13|14|15|17|18)[0-9]{1}\d{8})$/;
      if (
        this.ruleForm.userPwd1 == null ||
        this.ruleForm.userPwd1.length < 6 ||
        this.ruleForm.userPwd1.length > 16
      ) {
        this.$message({
          message: "密码的位数为6~16位",
          center: true
        });
        flag = false;
      }
      if (this.ruleForm.userTel == "" || !reg.test(this.ruleForm.userTel)) {
        this.$message({
          message: "请输入正确的手机号",
          center: true
        });
        flag = false;
      }
      if (flag) {
        if (this.yanzhengma.value != this.ruleForm.yanzhengma) {
          this.$message({
            message: "验证码错误",
            center: true
          });
          } else if (this.yanzhengma.value == this.ruleForm.yanzhengma) {
          Axios.post(
            "/loginIn",
            this.$qs.stringify({
              userTel: this.ruleForm.userTel,
              userPwd: this.ruleForm.userPwd1,
              userName: this.ruleForm.userName
            })
          ).then(res => {
              // 提交注册请求
              // console.log(res);
              // console.log("注册成功");
              this.$message({
                message: "注册成功！",
                center: true
              });
              this.$emit("changeLoginFlag", true);
            }).catch(err => {
              console.log(err);
              this.$message({
                message: "提交失败，请稍后重新提交!!",
                center: true
              });
            });
        }
      }
    }
  }
};
</script>
<style>
.loginIn {
  height: 380px;
  max-width: 500px;
  min-width: 200px;
  margin: 0 auto;
}
.codeBox {
  width: 70%;
  float: left;
}
.sendCodeBox {
  width: 30%;
  float: right;
}
</style>