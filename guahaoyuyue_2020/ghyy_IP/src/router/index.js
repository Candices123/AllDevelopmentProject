import Vue from 'vue'
import Router from 'vue-router'
// import HelloWorld from '@/components/HelloWorld'
import index from '@/components/index'
import loginIn from '@/components/loginIn'
import loginUp from '@/components/loginUp'

Vue.use(Router)

export default new Router({
    // mode: 'history',
    routes: [{
            path: "/",
            redirect: "/index"
        },
        {
            // redirect: "/index",
            path: '/index',
            name: 'index',
            component: index


            // children: [
            //     { path: 'home', name: 'home', component: home },
            //     { path: '/login', name: 'login', component: Login }
            // ]
        }, {
            path: '/loginUp',
            component: loginUp
        },
        {
            path: '/loginIn',
            component: loginIn
        }
    ]
})