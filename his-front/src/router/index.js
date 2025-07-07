import { createRouter, createWebHistory } from 'vue-router'
import {useCounterStore} from "@/stores/counter.js";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      // http://localhost:5173/
      path: '/',
      name: 'home',
      component: ()=> import('../views/Home.vue'),
      // 子路由
      children:[
         // http://localhost:5173/user
        {
          path:'/user',
          name: 'user',
          component: ()=> import('../views/user/index.vue'),
        },
        // http://localhost:5173/role
        {
          path:'/role',
          name: 'role',
          component: ()=> import('../views/role/index.vue'),
        },

        {
          path:'/constantitem',
          name: 'constantitem',
          component: ()=> import('../views/constantitem/index.vue'),
        },
        {
          path:'/constanttype',
          name: 'constanttype',
          component: ()=> import('../views/constanttype/index.vue'),
        },
        {
          path:'/register',
          name: 'register',
          component: ()=> import('../views/register/index.vue'),
        },
        {
          path:'/doctor',
          name: 'doctor',
          component: ()=> import('../views/doctor/index.vue'),
        }
        ,
        {
          path:'/charge',
          name: 'charge',
          component: ()=> import('../views/charge/index.vue'),
        }
      ]
    },
    // http://localhost:5173/login
    {
      path: '/login',
      name: 'login',
      component: () => import('../views/Login.vue'),
    },
  ],
})


router.beforeEach(
    (to,from,next)=>{
      if( to.path == "/login" ){
        next();
      }else{
        const counter = useCounterStore();
        //console.log(counter.vo_user.value)
        if(counter.vo_user.value){
          next()
        }else{
          router.push({path:"/login"})
        }
      }
    }
)
export default router
