<template>
  <!-- <el-aside>aside</el-aside> -->
  <el-main>
    <div class="warpper">
      <el-tabs :tab-position="tabPosition" style="height:450px;" v-model="activeName">
        <el-tab-pane label="预约记录" name="a">
          <order-list :user="userForm"></order-list>
        </el-tab-pane>
        <el-tab-pane label="修改信息" name="b">
          <changeUserInfo :user="userForm"></changeUserInfo>
        </el-tab-pane>
        <el-tab-pane label="意见反馈" name="c">
          <div>
            <el-input
              type="textarea"
              placeholder="请输入您宝贵的意见"
              v-model="textarea"
              maxlength="1000"
              show-word-limit
            ></el-input>
            <el-button
              type="primary"
              style="float:right;margin-top:20px;"
              @click="submitSuggest()"
            >提交</el-button>
          </div>
        </el-tab-pane>
      </el-tabs>
    </div>
  </el-main>
</template>

<script>
import orderList from "../components/orderList.vue";
import changeUserInfo from "../components/changeUserInfo";
import Axios from "axios";
import time from "../js/time";

export default {
  components: {
    orderList,
    changeUserInfo
  },
  data() {
    return {
      tabPosition: "left",
      textarea: "", //意见反馈
      activeName: "a"
    };
  },
  props: ["msg", "userForm"],
  mounted() {},
  methods: {
    // 提交用户意见反馈
    submitSuggest() {
      var feedback = {
        userTel: this.userForm.userTel,
        opinion: this.textarea,
        feedbackTime: new Date()
      };
 
      if (feedback.opinion != "" && feedback.opinion.length <= 1000) {
        var that = this;
        // console.log(feedback);
        // console.log(JSON.stringify(feedback));
        Axios({
          headers: {
            "Content-Type": "application/json"
          },
          method: "post",
          url: "/insertFeedback",
          data: JSON.stringify(feedback)
        })
          .then(function(res) {
            // console.log(res);
            that.$message({
              message: "感谢您的反馈意见!",
              center: true
            });
            that.textarea = "";
          })
          .catch(function(err) {
            that.$message({
              message: "当前故障，请稍后重试！",
              center: true
            });
          });
      }

      // Axios.post("/insertFeedback", this.$qs.stringify(feedback))
      //   .then(res => {
      //     console.log(res);
      //     console.log("反馈成功");
      //     this.$message({
      //       message: "感谢您的反馈意见!",
      //       center: true
      //     });
      //   })
      //   .catch(err => {
      //     console.log(err);
      //     this.$message({
      //       message: "当前故障，请稍后重试！",
      //       center: true
      //     });
      //   });
      else {
        this.$message({
          message: "提交错误",
          center: true
        });
      }
    }
  },
  //

  watch: {
    msg(newValue, oldValue) {
      this.activeName = newValue;
      console.log(newValue);
    }
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
  padding-top: 20px;
}
.el-tabs__item {
  height: 100px;
  line-height: 100px;
}

textarea {
  min-height: 200px;
  max-height: 400px;
}
/* .el-textarea__inner {
  width: 90%;
}
.el-textarea .el-input__count {
  bottom: 30px;
  right: 100px;
} */
</style>