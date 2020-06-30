// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'


// 引用全局的ElementUI
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';


Vue.use(ElementUI);

import router from './router'

Vue.config.productionTip = false

import qs from 'qs'
Vue.prototype.$qs = qs
    //引入mock.js的路径
    // require('./axios/mock')

/* eslint-disable no-new */
new Vue({
    el: '#app',
    router,
    components: { App },
    template: '<App/>',
})