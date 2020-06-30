<template>
  <div class="changeUserInfo">
    <el-form
      :model="ruleForm"
      :rules="rules"
      ref="ruleForm"
      label-width="100px"
      class="demo-ruleForm"
    >
      <el-form-item label="原密码" prop="userPwd1">
        <el-input v-model="ruleForm.userPwd1" type="password"></el-input>
      </el-form-item>
      <el-form-item label="新密码" prop="userPwd2">
        <el-input v-model="ruleForm.userPwd2" type="password"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm()" style="float:left;min-width:100%;">立即修改</el-button>
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
        userPwd2: ""
      },
      rules: {
        userPwd1: [
          { required: true, message: "请输入原密码", trigger: "change" }
        ],
        userPwd2: [
          { required: true, message: "请输入新密码", trigger: "change" }
        ]
      }
    };
  },
  props: ["user"],
  methods: {
    // 检查信息是否正确
    // 1、检查原密码和新密码是否正确
    // 2、检查手机账号和原密码是否匹配
    // 3、保存密码修改
    submitForm() {
      if (this.ruleForm.userPwd1 != null && this.ruleForm.userPwd2 != null) {
        // 根据用户手机号获取用户原密码
        // console.log(this.user.userTel);
        Axios.post("/getUserInfo",this.$qs.stringify({  "userTel": this.user.userTel }))
          .then(res => {
            // console.log(res);
            if (this.ruleForm.userPwd1 == res.data) {
              Axios.post("/updateUserInfo", this.$qs.stringify({
                userTel: this.user.userTel,
                userPwd: this.ruleForm.userPwd2
              }))
                .then(res => {
                  // console.log(res);
                  this.$message({
                    message: "密码更新成功！",
                    center: true
                  });
                })
                .catch(err => {
                  console.log(err);
                  this.$message({
                    message: "当前故障，请稍后重试！",
                    center: true
                  });
                });
            } else {
              this.$message({
                message: "请检查账号原密码是否正确！",
                center: true
              });
            }
          })
          .catch(err => {
            console.log(err);
            this.$message({
              message: "当前故障，请稍后重试！",
              center: true
            });
          });
      }
    }
  }
};
</script>
<style>
.el-form-item__error {
  top: 70%;
}
.changeUserInfo {
  height: 350px;
  max-width: 500px;
  min-width: 200px;
  padding-top: 10%;
  margin: 0 auto;
}
</style>