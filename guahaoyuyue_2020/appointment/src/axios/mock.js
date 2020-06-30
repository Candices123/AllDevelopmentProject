// mock.js
import Mock from 'mockjs'

var user = {
    userTel: "17727260000",
    userPwd: "123456"
};

var orderList = [
    { orderId: "1", userTel: "17727260000", departmentName: "内科", doctorName: "刘三", diseaseDescription: "头痛", appointmentTime: "year-month-day", timeFlag: "0表示上午/1表示下午", orderTime: "下单时间2019-1-1 hh：mm：ss", visitingState: "1" },
    { orderId: "2", userTel: "17727260000", departmentName: "内科", doctorName: "张三", diseaseDescription: "头痛", appointmentTime: "year-month-day", timeFlag: "0表示上午/1表示下午", orderTime: "下单时间2019-1-1 hh：mm：ss", visitingState: "0" },
    { orderId: "3", userTel: "17727260000", departmentName: "内科", doctorName: "张三", diseaseDescription: "头痛", appointmentTime: "year-month-day", timeFlag: "0表示上午/1表示下午", orderTime: "下单时间2019-1-1 hh：mm：ss", visitingState: "-1" },
    { orderId: "4", userTel: "17727260000", departmentName: "内科", doctorName: "张三", diseaseDescription: "头痛", appointmentTime: "year-month-day", timeFlag: "0表示上午/1表示下午", orderTime: "下单时间2019-1-1 hh：mm：ss", visitingState: "-1" },
    { orderId: "1", userTel: "17727260000", departmentName: "内科", doctorName: "刘三", diseaseDescription: "头痛", appointmentTime: "year-month-day", timeFlag: "0表示上午/1表示下午", orderTime: "下单时间2019-1-1 hh：mm：ss", visitingState: "1" },
    { orderId: "2", userTel: "17727260000", departmentName: "内科", doctorName: "张三", diseaseDescription: "头痛", appointmentTime: "year-month-day", timeFlag: "0表示上午/1表示下午", orderTime: "下单时间2019-1-1 hh：mm：ss", visitingState: "0" },
    { orderId: "3", userTel: "17727260000", departmentName: "内科", doctorName: "张三", diseaseDescription: "头痛", appointmentTime: "year-month-day", timeFlag: "0表示上午/1表示下午", orderTime: "下单时间2019-1-1 hh：mm：ss", visitingState: "-1" },
    { orderId: "4", userTel: "17727260000", departmentName: "内科", doctorName: "张三", diseaseDescription: "头痛", appointmentTime: "year-month-day", timeFlag: "0表示上午/1表示下午", orderTime: "下单时间2019-1-1 hh：mm：ss", visitingState: "-1" }

];

var doctorList = [{
    doctorId: "1",
    doctorName: "刘一",
    doctorProfile: "内科主任医师。大学本科，医学学士。",
    departmentName: "内科",
    doctorCount: "50",
    doctorTitle: "院士"
}, {
    doctorId: "2",
    doctorName: "李二",
    doctorProfile: "内科主任医师。大学本科，医学学士。",
    departmentName: "内科",
    doctorCount: "50",
    doctorTitle: "院士"
}]

var doctorDuty = [{
    doctorDutyId: "1",
    doctorId: "1",
    dotorDate: {
        year: "2020",
        month: "6",
        day: "6"
    },
    timeFlag: "0"
}, {
    doctorDutyId: "2",
    doctorId: "2",
    dotorDate: {
        year: "2020",
        month: "6",
        day: "7"
    },
    timeFlag: "1"
}]

// 获取手机验证码
Mock.mock("/getCode", "post", function(options) {
    console.log(options);
    return {
        yanzhengma: "123456"
    }
});

// 注册或者忘记密码时
Mock.mock("/loginIn", "post", function(options) {
    console.log(options);
    return {
        message: "注册成功"
    }
});

// 根据用户手机号获取登录信息
Mock.mock("/getUserInfo", "post", function(options) {
    return {
        user
    }
});
// 根据用户手机号、用户新密码更新用户手机号、用户密码
Mock.mock("/updateUserInfo", "post", function(options) {
    return {
        message: "更新成功"
    }
})


// 获取所有的用户预约单
Mock.mock("/getOrderListAll", "get", {
    orderList
});


// 获取所有医生的信息
Mock.mock("/getDoctorListAll", "get", {
    doctorList
});

// 获取所有的执勤表
Mock.mock("/getDoctordutyListAll", "get", {
    doctorDuty
})

// 发送用户的意见
Mock.mock("/sendSuggest", "post", function(options) {
    console.log(options);
    return {
        message: "已收到用户的意见反馈。"
    }
});

// 发送预约挂号请求
Mock.mock("/yuyue", "post", function(options) {
    console.log(options);
    return {
        message: "成功预约"
    }
})