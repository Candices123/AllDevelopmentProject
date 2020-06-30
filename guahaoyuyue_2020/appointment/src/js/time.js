export default {
    // 获取当前时间
    getCurrentTime() {
        var date = new Date();
        // console.log(date);
        var year = date.getFullYear();
        var month = date.getMonth() + 1;
        var day = date.getDate();
        var hh = (date.getHours() < 10 ? '0' + date.getHours() : date.getHours());
        var mm = (date.getMinutes() < 10 ? '0' + date.getMinutes() : date.getMinutes());
        var ss = (date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds());

        var dateString = year + "-" + (month < 10 ? '0' + month : month) + "-" + (day < 10 ? '0' + day : day) + " " + hh + ":" + mm;
        console.log(dateString);
        // console.log(ss);
        return dateString;
    },
    transTime(date) {
        // 将日期转化为字符串形式进行比较
        var year = date.getFullYear();
        var month = date.getMonth() + 1;
        var day = date.getDate();
        var dateString = year + (month < 10 ? '0' + month : month) + (day < 10 ? '0' + day : day);
        // console.log(dateString);
        // console.log(ss);
        return dateString;

    },
    showTime(date, timeSlot) {
        // 将日期转化为字符串显示 y-m-d 9:00-11:30 
        // 将日期转化为字符串显示 y-m-d 14:00-17:30 
        var temp = date.year + "-" +
            (date.month < 10 ?
                "0" + date.month :
                date.month) + "-" +
            (date.day < 10 ?
                "0" + date.day :
                date.day);
        if (timeSlot == 0) {
            temp += " 9:00-11:30"
        } else {
            temp += " 14:00-17:30"
        }
        return temp;
    }

}