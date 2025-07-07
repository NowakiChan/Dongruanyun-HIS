<template>
  <el-form :model="form" label-width="auto" style="max-width: 600px" :inline="true">
    <el-form-item label="请选择常数类别">
      <el-select
          @change = "typeChange"
          v-model="selectType"
          placeholder="请选择常数类别..."
          size="large"
          style="width: 240px"
      >
        <el-option
            v-for="item in options"
            :key="item.id"
            :label="item.constanttypename"
            :value="item.id"
        />
      </el-select>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="toAdd">添加</el-button>
    </el-form-item>
  </el-form>

  <div>
    <el-table :data="tableData"key="tableKey" style="width: 100%">
      <el-table-column prop="id" label="常数ID" width="180"/>
      <el-table-column prop="constanttypeid" label="常数类别ID" width="180"/>
      <el-table-column prop="constantcode" label="常数项编码" width="180"/>
      <el-table-column prop="constantname" label="常数项名称"/>
      <el-table-column label="操作">
        <template #default="solt">
          <el-button link type="primary" size="small" @click="toEdit(solt)"> 编辑</el-button>
          <el-button link type="primary" size="small" @click="deleteById(solt.row.id)">删除</el-button>
        </template>

      </el-table-column>
    </el-table>
  </div>

  <!-- 添加表单 dialogFormVisible 表示是否显示，  boolean   -->
  <el-dialog v-model="editDialogFormVisible" title="常数项保存" width="500">
    <el-form :model="editForm" label-width="auto">
      <el-form-item label="常数项名称">
        <el-input v-model="editForm.constantname"/>
      </el-form-item>
      <el-form-item label="常数项编码">
        <el-input v-model="editForm.constantcode"/>
      </el-form-item>
      <el-form-item label="常数项类别id">
        <el-input v-model="editForm.constanttypeid"/>
      </el-form-item>
      <el-form-item label="常数项id">
        <el-input v-model="editForm.id"/>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="save">保存</el-button>
      </el-form-item>
    </el-form>
  </el-dialog>

  <!-- 添加表单 dialogFormVisible 表示是否显示，  boolean   -->
  <el-dialog v-model="editDialogFormVisible2" title="常数项编辑" width="500">
    <el-form :model="editForm" label-width="auto">
      <el-form-item label="常数项名称">
        <el-input v-model="editForm.constantname"/>
      </el-form-item>
      <el-form-item label="常数项编码">
        <el-input v-model="editForm.constantcode"/>
      </el-form-item>
      <el-form-item label="常数项类别id">
        <el-input v-model="editForm.constanttypeid"/>
      </el-form-item>
      <el-form-item label="常数项id">
        <el-input v-model="editForm.id"/>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="update">保存</el-button>
      </el-form-item>
    </el-form>
  </el-dialog>
</template>



<script setup>
import {onMounted, onUnmounted, ref} from 'vue'
import {ElMessageBox, ElNotification} from 'element-plus'
import service from '@/utils/request'

let selectType = ref('')    //常数类别列表用户选择的typeid
let options = ref([])   //常数类别列表
let form = ref({});
let editForm = ref({
  constantcode:'',
  constantname:'',
  constanttypeid:'',
  id:''
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
let tableKey = ref(0);
function toAdd() {

  // 初始化添加表单，所有字段置空
  editForm.value = {
    constantcode: '',    // 常数项编码
    constantname: '',    // 常数项名称
    constanttypeid: '',  // 常数项类别ID
    id: ''               // 常数项ID（添加时应为空）
  };

  // 显示添加对话框
  editDialogFormVisible.value = true;

}

function typeChange(a){
  service.post("/ConstantItem/getbytypeid",{id:a}).then(
      res=>{
        //console.log(res)
        tableData.value = res.data
      }
  )
}

function toEdit({row}) {
  // 清空表单（避免残留数据）
  editForm.value = {
    constantname: '',
    constantcode: '',
    constanttypeid: '',
    id: ''
  };

  // 填充当前行数据到表单
  editForm.value.id = row.id;
  editForm.value.constanttypeid = row.constanttypeid;
  editForm.value.constantcode = row.constantcode;
  editForm.value.constantname = row.constantname;

  // 显示编辑对话框
  editDialogFormVisible2.value = true;
}

function update(){
  console.log("editForm.value: ", editForm.value);


  service.post("/ConstantItem/update", {
    id:editForm.value.id,
    constanttypeid: editForm.value.constanttypeid,                // 明确传递ID
    constantcode: editForm.value.constantcode,
    constantname: editForm.value.constantname}).then(
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
function save() {
  //1 获取添加的表单信息
  console.log("editForm.value: ", editForm.value);

  service.post("/ConstantItem/add", editForm.value).then(
      res => {
        console.log(res.data)
        // 3  判断 请求结果，成功与否
        editDialogFormVisible.value = false;

        if (res.data) {
          // 给与用户反馈
          ElNotification({
            title: '提示',
            message: '保存成功!!!!!!!!!!!!!',
            type: 'success',
          })
          listData();
        } else {
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
function deleteById(id){
  ElMessageBox.confirm(  '是否确认删除?',  'Warning',   {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning',
      }
  )
      .then(() => {
        service.get('/ConstantItem/delete/'+id).then(({status ,data})=>{
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
  service.get("/ConstantItem/list").then(
      res=>{
        tableData.value = res.data;
        tableKey.value++;
      }
  )
}

onMounted(() => {
  //加载常数项所有数据
  listData()

  //加载常数类别，提供给用户选择（下拉列别）
  service.get("/ConstantType/list").then(
      res=>{
        options.value = res.data
        // selectType.value = 1
      }
  )
})
</script>