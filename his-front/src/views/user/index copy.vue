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
              <el-button link type="primary" size="small"   @click="toEdit(solt)">   编辑  </el-button>
              <el-button link type="primary" size="small">删除</el-button>
            </template>

          </el-table-column>
    </el-table>
  </div>








  <!-- 添加表单 dialogFormVisible 表示是否显示，  boolean   -->
  <el-dialog v-model="editDialogFormVisible" title="用户编辑" width="500">
    <el-form :model="editForm" label-width="auto"  >
      <el-form-item label="用户名">
        <el-input v-model="editForm.username" />
      </el-form-item>
       <el-form-item label="性别">
            <el-radio-group v-model="editForm.gender">
            <el-radio value="1">男</el-radio>
            <el-radio value="2">女</el-radio>
         </el-radio-group>   
      </el-form-item>
        <el-form-item label="省份">
            <el-select   v-model="editForm.province"  placeholder="请选择省份" size="small"  style="width: 240px"  >
             <!-- ： 形式绑定变量  v-bind：   -->
            <el-option   v-for="province in  provinceList  "  :label="province.label"  :value="province.value"  />
          </el-select>
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
  username:'',
  gender:1,
  province:''
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



function save(){
  //1 获取添加的表单信息

  console.log("editForm.value: ",editForm.value);
  



  //2 发送网络请求 到后端，


  // 3  判断 请求结果，成功与否
  editDialogFormVisible.value = false;


  // 给与用户反馈
   ElNotification({
    title: '提示',
    message: '保存成功!!!!!!!!!!!!!',
    type: 'success',
  })



}


//待编辑
function toEdit({row}){


  editForm.value.username =  row.username
  editForm.value.gender =  row.gender
  editForm.value.province =  row.province

  editDialogFormVisible.value = true;
    
}




onMounted(()=>{

  console.log("组件挂在成功")

  const url ='http://localhost:8080/user/list'
  axios.get( url).then(({status,data}) =>{
      console.log("status",status);
      console.log("data",data);
      tableData.value = data;
      
  })

})




// onUnmounted(()=>{
//     console.log("组件卸载成功")
// })


</script>