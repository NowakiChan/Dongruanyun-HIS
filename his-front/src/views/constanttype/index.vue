<template>
  <el-form :model="form" label-width="auto" style="max-width: 600px" :inline="true">

    <el-form-item>
      <el-button type="primary" @click="toAdd">添加</el-button>
    </el-form-item>
  </el-form>

  <div>
    <el-table :data="tableData" style="width: 100%">
      <el-table-column prop="id" label="常数类别ID" width="180"/>
      <el-table-column prop="constanttypecode" label="常数类别编码" width="180"/>
      <el-table-column prop="constanttypename" label="常数类别名称" width="180"/>
      <el-table-column label="操作">
        <template #default="solt">
          <el-button link type="primary" size="small" @click="toEdit(solt)"> 编辑</el-button>
          <el-button link type="primary" size="small" @click="deleteById(solt.row.id)">删除</el-button>
        </template>

      </el-table-column>
    </el-table>
  </div>

  <!-- 添加表单 dialogFormVisible 表示是否显示，  boolean   -->
  <el-dialog v-model="editDialogFormVisible" title="添加常数类别" width="500">
    <el-form :model="editForm" label-width="auto">
      <el-form-item label="常数类别编码">
        <el-input v-model="editForm.constanttypecode"/>
      </el-form-item>
      <el-form-item label="常数类别名称">
        <el-input v-model="editForm.constanttypename"/>
      </el-form-item>
      <el-form-item label="常数类别ID">
        <el-input v-model="editForm.id"/>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="save">保存</el-button>
      </el-form-item>
    </el-form>
  </el-dialog>

  <el-dialog v-model="editDialogFormVisible2" title="编辑常数类别" width="500px">
    <el-form :model="editForm" label-width="120px">
      <el-form-item label="常数类别编码" prop="constanttypecode">
        <el-input v-model="editForm.constanttypecode" placeholder="请输入编码" />
      </el-form-item>

      <el-form-item label="常数类别名称" prop="constanttypename">
        <el-input v-model="editForm.constanttypename" placeholder="请输入名称" />
      </el-form-item>
      <el-form-item label="常数类别id" prop="id">
        <el-input v-model="editForm.id" placeholder="请输入ID"/>
      </el-form-item>
    </el-form>
    <template #footer>
      <span class="dialog-footer">
        <el-button @click="editDialogFormVisible2 = false">取消</el-button>
        <el-button type="primary" @click="update">保存编辑</el-button>
      </span>
    </template>
  </el-dialog>

</template>




<script setup>
import {onMounted, onUnmounted, ref} from 'vue'
import {ElMessageBox, ElNotification} from 'element-plus'
import service from '@/utils/request'

let form = ref({});
let editForm = ref({
  id:'',
  constanttypecode:'',
  constanttypename:''
});
//是否显示 dialog
let editDialogFormVisible = ref(false);

let editDialogFormVisible2 = ref(false);

//提交数据 到
function onSubmit() {
  console.log("form", form.value);
}

//表格的数据
let tableData = ref([])

function toAdd() {

  editDialogFormVisible.value = true;

}

function save() {
  //1 获取添加的表单信息
  console.log("editForm.value: ", editForm.value);

  service.post("/ConstantType/add",editForm.value).then(
      res=>{
        console.log(res.data)
        // 3  判断 请求结果，成功与否
        editDialogFormVisible.value = false;

        if(res.data){
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
      }
  )


}

function toEdit({row}){


  const id = row.id

  service.get('/ConstantType/getById/'+id).then(({status ,data})=>{
    //根据用户id ，查询当前待修改的数据
    editForm.value.id = data.id;
    editForm.value.constanttypecode =  data.constanttypecode
    editForm.value.constanttypename =  data.constanttypename
    editDialogFormVisible2.value = true;
  })




}

function update(){
  console.log("editForm.value: ", editForm.value);

  const requestBody = {
    id: editForm.value.id,
    constanttypecode: editForm.value.constanttypecode,
    constanttypename: editForm.value.constanttypename
  };

  console.log("【请求体】", requestBody);
  console.log("【id类型】", typeof requestBody.id); // 确认是否为字符串或数字

  // 打印请求信息（包括请求头）
  service.interceptors.request.use(config => {
    console.log("【请求URL】", config.url);
    console.log("【请求方法】", config.method);
    console.log("【请求头】", config.headers);
    console.log("【请求体】", config.data);
    return config;
  });

  service.post("/ConstantType/update", {
    id: editForm.value.id,                // 明确传递ID
    constanttypecode: editForm.value.constanttypecode,
    constanttypename: editForm.value.constanttypename}).then(
      res=>{
        console.log(res.data)
        editDialogFormVisible2.value = false;

        if(res.data){
          // 给与用户反馈
          ElNotification({
            title: '提示',
            message: '保存编辑成功!!!!!!!!!!!!!',
            type: 'success',
          })
          listData();
        }else{
          // 给与用户反馈
          ElNotification({
            title: '提示',
            message: '保存编辑失败!!!!!!!!!!!!!',
            type: 'error',
          })
        }
      }
  )


}

function deleteById(id){
  ElMessageBox.confirm(  '是否确认删除?',  'Warning',   {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning',
      }
  )
      .then(() => {
        service.get('/ConstantType/delete/'+id).then(({status ,data})=>{
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

function listData(){
  service.get("/ConstantType/list").then(
      res => {
        console.log(res)
        tableData.value = res.data
      }
  )
}
onMounted(() => {
  listData()
})
</script>