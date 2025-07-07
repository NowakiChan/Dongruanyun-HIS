<template>
    <div class="container">
        <span style="span-size:15px;span-family:'Microsoft YaHei'">
            患者信息查询</span>&nbsp;
        <el-row :gutter="2">
            <el-col :span="4">
                <div class="grid-content bg-purple">
                    <span style="color:red">*</span>
                    <span style="span-size:13px;span-family:'Microsoft YaHei'">病 历 号 :</span>&nbsp;
                    <el-input placeholder="病历号" style="width: 110px" again="left" v-model="keywords">
                    </el-input>
                </div>
            </el-col>

            <el-col :span="5">
                <div class="grid-content bg-purple">
                    <el-button type="primary" style="margin-left: 3px"
                               @click="gosearch"><el-icon><Search /></el-icon> 搜索
                    </el-button>
                </div>
            </el-col>
        </el-row>

        <br>
        <span style="span-size:15px;span-family:'Microsoft YaHei'">
            患者信息确认</span>&nbsp;

        <el-row :gutter="2">
            <el-col :span="4">
                <div class="grid-content bg-purple">
                    <span style="span-size:13px;span-family:'Microsoft YaHei'">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名:</span>&nbsp;
                    <el-input placeholder="姓名" style="width: 110px" again="left" readonly
                              v-model="info.realname">
                    </el-input>
                </div>
            </el-col>

            <el-col :span="7">
                <div class="grid-content bg-purple">
                    <span style="span-size:13px;span-family:'Microsoft YaHei'">身份证号:</span>
                    <el-input placeholder="身份证号" style="width: 180px" readonly
                              v-model="info.idnumber"></el-input>
                </div>
            </el-col>

            <el-col :span="9">
                <div class="grid-content bg-purple">
                    <span style="span-size:13px;span-family:'Microsoft YaHei'">家庭住址:</span>
                    <el-input placeholder="家庭住址" style="width: 330px" readonly
                              v-model="info.address"></el-input>
                </div>
            </el-col>
        </el-row>

        <!-- :data="categories"  -->
        <el-main class="gao_cate_mana_main">
            <span style="span-size:15px;span-family:'Microsoft YaHei'">
                患者消费信息</span>&nbsp;
            <el-table
                    ref="multipleTable"
                    :data="tableData"
                    tooltip-effect="dark"
                    style="width: 100%"
                    @selection-change="handleSelectionChange" v-loading="loading">

                <el-table-column
                        type="selection"
                        width="55" align="left">
                </el-table-column>

                <!-- v-if='false' -->


                <el-table-column
                        label="病历号"
                        prop="MedicalID"
                        width="120" align="left">
                </el-table-column>

                <el-table-column
                        label="项目名称"
                        prop="Name"
                        width="120" align="left">
                </el-table-column>

                <el-table-column
                        label="单价"
                        prop="Price"
                        width="120" align="left">
                </el-table-column>

                <el-table-column
                        label="数量"
                        prop="Num"
                        width="120" align="left">
                </el-table-column>

                <el-table-column
                        label="开立时间"
                        prop="CreationTime"
                        width="220" align="left">
                </el-table-column>


                <el-table-column
                        label="状态"
                        prop="State"
                        width="120" align="left">
                    <template #default="scope">
                        <span v-if="scope.row.State==1">已开立未缴费</span>
                        <span v-if="scope.row.State==2">已收费</span>
                        <span v-if="scope.row.State==3">已执行</span>

                    </template>
                </el-table-column>
            </el-table>

            <br>
            <!--:disabled="selItems.length==0" -->
            <el-button type="primary" icon="el-icon-goods"
                       style="margin-top: 10px;width: 100px;"
                       @click="chargeAll" v-if="tableData.length>0">收费结算
            </el-button>
        </el-main>
    </div>
</template>


<script setup>
    import {onMounted, ref} from 'vue'
    import service from '@/utils/request'

    let keywords = ref('')      //要查询的关键字：病历号
    let tableData = ref([])     //患者消费信息
    let info = ref({realname:'',idnumber:'',address:''})    //患者的确认信息
    let tableInfo = ref([])


    function gosearch(){
        //根据mid（keywords）查询checkapply and price
        service.get("/check/getbymid?mid="+keywords.value).then(
            res=>{
                console.log(res.data)
                tableData.value = res.data.list
                info.value.realname = res.data.info.realname
                info.value.address =  res.data.info.homeaddress
                info.value.idnumber =  res.data.info.idnumber
            }
        )
    }
    onMounted(() => {
        // console.log("组件挂载成功")
    })
</script>