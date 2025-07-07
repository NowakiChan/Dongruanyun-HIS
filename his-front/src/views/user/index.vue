<template>


<el-form :model="form" label-width="auto" style="max-width: 600px" :inline="true" >
    <el-form-item label="用户名">
      <el-input v-model="form.usernamername" />
    </el-form-item>
   
   
    <el-form-item>
      <el-button type="primary" @click="onSubmit">搜索</el-button>
    </el-form-item>

      <el-form-item>
      <el-button type="primary" @click="toAdd">添加</el-button>
    </el-form-item>

      <el-form-item>
      <el-button type="primary" @click="append">更加数据</el-button>
    </el-form-item>
  </el-form>


  <div>
    <el-table :data="tableData" style="width: 100%">
        <el-table-column prop="realName" label="昵称" width="180" />
        <el-table-column prop="userName" label="用户名" width="180" />
        <el-table-column prop="registLeID" label="registLeID" />
          <el-table-column  label="操作" >
            <template #default="solt">
              <el-button link type="primary" size="small"   @click="toEdit(solt)">   编辑 :{{solt.row.id}} </el-button>
              <el-button link type="primary" size="small"  @click="removeById(solt.row.id)">删除</el-button>
            </template>

          </el-table-column>
    </el-table>
  </div>








  <!-- 添加表单 dialogFormVisible 表示是否显示，  boolean   -->
  <el-dialog v-model="editDialogFormVisible" title="用户编辑" width="500">
    <el-form :model="editForm" label-width="auto"  >
      <el-form-item label="用户名">
        <el-input v-model="editForm.userName" />
      </el-form-item>
      <el-form-item label="Password">
        <el-input v-model="editForm.password" />
      </el-form-item>
      <el-form-item label="RealName">
        <el-input v-model="editForm.realName" />
      </el-form-item>
      
        <el-form-item >
              <el-button type="primary"  @click="save" >保存</el-button>
      </el-form-item>
    </el-form>


  </el-dialog>


</template>


<script setup>
import {onMounted, onUnmounted, ref} from 'vue'
import { ElNotification } from 'element-plus'
import axios  from 'axios';
import { ElMessage, ElMessageBox } from 'element-plus'

import service from '@/utils/request'





//是否显示 dialog
let editDialogFormVisible = ref(false);

//用于接收表单内容的
let form =ref( {
    username:'',
    gender:1
})


// 修改表单
let editForm = ref({
  id:'',
  userName:'',
  password:'',
  realName:''
})


let  provinceList = ref([

    { label:'黑龙江',value:'HLJ'  }, 
    { label:'辽宁',value:'LJ'  },
    { label:'吉林',value:'JL'  },
    { label:'江西',value:'JX'  },
    { label:'山西',value:'SX'  },

])





//提交数据 到 
function onSubmit(){
    console.log("form",form.value);
    
}

//表格的数据
let tableData = ref([])


// 模拟数据的变更
function append(){

    console.log("tableData.value",tableData.value);
    
     tableData.value.push({
          username: 'appendUser',
            name: 'Tom',
            address: 'No. 189, Grove St, Los Angeles',
     })
}


function toAdd(){

  editDialogFormVisible.value = true;

}


function listData(){
   console.log("简单封装了 service， 组件挂在成功",service)

    service
        .get( '/user/list')
        .then(
            ({status,data}) =>
            {
                tableData.value = data
            }
        )
}


function save(){
  //1 获取添加的表单信息

  console.log("editForm.value: ",editForm.value);
  


  service.post( '/user/saveOrUpdate',editForm.value).then(({status,data}) =>{
      console.log("data",data);


        // 3  判断 请求结果，成功与否
        editDialogFormVisible.value = false;

        if(data){
          // 给与用户反馈
          ElNotification({
            title: '提示',
            message: '保存成功!!!!!!!!!!!!!',
            type: 'success',
          })
          listData();
        }else{
            // 给与用户反馈
            ElNotification({
              title: '提示',
              message: '保存失败!!!!!!!!!!!!!',
              type: 'error',
            })
        }
      

  })


  //2 发送网络请求 到后端，





}


//待编辑
function toEdit({row}){


  const id = row.id


  service.get('/user/getById/'+id).then(({status ,data})=>{
        //根据用户id ，查询当前待修改的数据  
        editForm.value.id =  data.id
        editForm.value.userName =  data.userName
        editForm.value.password =  data.password
        editForm.value.realName =  data.realName

        editDialogFormVisible.value = true;
  })

    
}


function removeById(id){

    //确认是否删除
    ElMessageBox.confirm(  '是否确认删除?',  'Warning',   {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning',
        }
      )
        .then(() => {
        

          service.get('/user/deleteById/'+id).then(({status ,data})=>{
                if(data){
                  // 给与用户反馈
                  ElNotification({
                    title: '提示',
                    message: '删除成功!!!!!!!!!!!!!',
                    type: 'success',
                  })
                  //查询最新的数据
                  listData();
                }else{
                    // 给与用户反馈
                    ElNotification({
                      title: '提示',
                      message: '删除失败',
                      type: 'error',
                    })
                }
          })




        })
       

  



   

}



onMounted(()=>{

  //加载数据
  listData();

})




// onUnmounted(()=>{
//     console.log("组件卸载成功")
// })


</script>