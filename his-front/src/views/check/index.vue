<template>
    <div class="container">
        <div id="headBar" style="display: flex;flex-direction: row;">
            <el-input placeholder="查询检验单" style="width: 30vh" again="left" v-model="keywords">
            </el-input>
            <el-button type="primary" style="margin-left: 3px" @click="getData">
                <el-icon><Search /></el-icon> 搜索
            </el-button>
        </div>
        
        <div id="dataArea">
            <el-table style="width: 93%;height: 95%;" stripe :data="tableData" @row-click="handleClick">
                <el-table-column prop="id" label="病历号" width="200"></el-table-column>
                <el-table-column prop="type" label="分类" width="300"></el-table-column>
                <el-table-column prop="name" label="项目" width="350"></el-table-column>
                <el-table-column prop="urgent" label="加急" width="80"></el-table-column>
                <el-table-column prop="status" label="状态" width="180"></el-table-column>
                <el-table-column prop="operate" label="操作" width="200" align="center">
                    <div style="display: flex;flex-direction: row;text-align: center;">
                        <el-button type="primary" style="margin-left: 3px" @click="handleComfirm">执行确认</el-button>
                        <el-button type="info" style="margin-left: 3px" @click="handleCancle">取消执行</el-button>
                    </div>
                </el-table-column>
            </el-table>
        </div>
    </div>
</template>

<script setup>
import service from '@/utils/request';
import {onMounted, ref} from 'vue';
import { ElMessage } from 'element-plus'

    let tableData = ref([{id:1,type:2,name:3,urgent:'no',status:'good'}]);
    let keywords = ref('');

    const getData = () => {
        service.get("/check/search?"+keywords.value).then(
            res => {
                if(res.status === 200){
                    console.log(res.data);
                    tableData.value = res.data;
                }
                else{

                }
            }
        )
    }
    const handleComfirm = () => {
        service.get("/check/confirm").then(
            res => {
                if(res.status === 200){
                    ElMessage({type:'success',message:'已确认检查单'});
                    getData();
                }
                else
                    ElMessage({type:'error',message:'发生错误,请重试'});
            }
        )
    }

    const handleCancle = () => {
        service.get("/check/cancle").then(
            res => {
                if(res.status === 200){
                    ElMessage({type:'success',message:'已取消检查单'});
                    getData();
                }
                else
                    ElMessage({type:'error',message:'发生错误,请重试'});
            }
        )
    }

    const handleClick = (row,column) => {

    }
</script>