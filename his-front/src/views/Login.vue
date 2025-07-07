<script setup>
</script>


<template>

    <el-form :model="form" label-width="auto"  >
        <el-form-item label="用户名">
            <el-input v-model="form.username" />
        </el-form-item>
        <el-form-item label="Password">
            <el-input v-model="form.password" />
        </el-form-item>


        <el-form-item >
            <el-button type="primary"  @click="login" >登录</el-button>
        </el-form-item>
    </el-form>

</template>


<script setup>
    import {onMounted, onUnmounted, ref} from 'vue'
    import { ElNotification } from 'element-plus'
    import axios  from 'axios';
    import { ElMessage, ElMessageBox } from 'element-plus'
    import { useRouter } from 'vue-router'
    import { useCounterStore } from "@/stores/counter.js";

    // 在 setup 中使用
    const router = useRouter()
    import service from '@/utils/request'

    let form = ref({username:'admin',password:'admin123'})
    let counter = useCounterStore()
    function login(){
        service.post("/user/login?username="+form.value.username+"&password="+form.value.password).then(
            res=>{
               // console.log(window.__VUE_DEVTOOLS_GLOBAL_HOOK__.apps[0].config.globalProperties.$pinia)
               // console.log(import.meta.env.MODE)
                //console.log(res.data)
                if(res.data!=null){
                    //1.将userid存入pinia
                    counter.vo_user.value =res.data

                    //2.路由跳转
                    router.replace({path:"/"})
                }else{
                    //给提示
                }
            }
        )
    }
    </script>
<style>

    /* 样式 */
</style>