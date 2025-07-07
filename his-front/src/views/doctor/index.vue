<template>
    <el-container style="height: 950px; border: 1px solid #eee">
        <el-aside width="350px" >
            <el-container >
                <!--   患者选择区      -->
                <el-header style="padding: 0;margin: 0">
                    <el-row>
                        <el-col :span="21" style="text-align: left">
                            <el-tag>患者选择：</el-tag>
                        </el-col>
                        <el-col :span="3" style="text-align: right">
                            <el-button type="primary"  size="small" @click="reloadUser" style="margin-right: 5px">
                                <el-icon><Refresh/></el-icon>
                            </el-button>
                        </el-col>
                    </el-row>
                    <el-row>
                        <el-input placeholder="请输入内容" v-model="inputPatient"  style="width: 100%">
                            <template #prepend>
                                患者名：
                            </template>
                            <template #append>
                                <el-icon><Search/></el-icon>
                            </template>
                        </el-input>

                    </el-row>
                </el-header>
                <el-main style="height: 800px;padding: 0;margin: 0">
                    <el-tabs type="border-card" >
                        <el-tab-pane label="本人" >
                            <el-tag size="small" >未诊患者：</el-tag>
                            <el-table ref="singleTable" :data="RegistersTable01" highlight-current-row @row-click="handleCurrentChange01"
                                      style="width: 100%;height: 50%" :show-header="false" max-height="400" size="small">
                                <el-table-column property="CaseNumber" label="病历号" width="80">
                                </el-table-column>
                                <el-table-column property="RealName" label="姓名" >
                                </el-table-column>
                                <el-table-column property="Age" label="年龄" width="50">
                                </el-table-column>
                            </el-table><br/><br/>
                            <el-tag size="small" >已诊患者：</el-tag>
                            <el-table ref="singleTable" :data="RegistersTable02" @row-click="handleCurrentChange02"
                                      @row-dblclick = "handleDBCurrentChange"
                                      style="width: 100%;height: 50%" :show-header="false" size="small">
                                <el-table-column property="CaseNumber" label="病历号" width="80">
                                </el-table-column>
                                <el-table-column property="RealName" label="姓名" >
                                </el-table-column>
                                <el-table-column property="Age" label="年龄" width="50">
                                </el-table-column>
                            </el-table>
                        </el-tab-pane>
                        <el-tab-pane label="科室*">
                            <el-tag>未诊患者：</el-tag>

                            <el-table ref="singleTable" :data="MyPatientsData01" highlight-current-row
                                      style="width: 100%;height: 50%" :show-header="false" size="small">
                                <el-table-column property="CaseNumber" label="病历号" width="80">
                                </el-table-column>
                                <el-table-column property="RealName" label="姓名" >
                                </el-table-column>
                                <el-table-column property="Age" label="年龄" width="50">
                                </el-table-column>
                            </el-table>
                            <el-tag>已诊患者：</el-tag>
                            <el-table ref="singleTable" :data="MyPatientsData02"
                                      style="width: 100%;height: 50%" :show-header="false" size="small">
                                <el-table-column property="CaseNumber" label="病历号" width="80">
                                </el-table-column>
                                <el-table-column property="RealName" label="姓名" >
                                </el-table-column>
                                <el-table-column property="Age" label="年龄" width="50">
                                </el-table-column>
                            </el-table>
                        </el-tab-pane>
                    </el-tabs>
                </el-main>
            </el-container>
        </el-aside>

        <el-container direction="vertical" style="height: 950px">
            <el-row>

                <span style="margin-left: 20px;font-size: small;" :span="20">{{showPatientsTop}}</span>
                <el-button type="text" size="small" style="float: right;margin-right: 20px;" @click="endRegister" v-if="showStop" :span="2">诊毕</el-button>

            </el-row>

            <!--
              门诊主要功能区
            -->
            <el-tabs type="border-card" :before-leave="toTab">
                <!-- 患者检查填写  -->
                <el-tab-pane label="病历首页">
                    <!-- 1. 门诊病历 -->
                    <el-container v-loading="loading">


                        <!-- 页面正文 -->
                        <el-main style="width:100%;background:#fff;height:800px;overflow-y: auto">
                            <el-form ref="form" :model="medicalRecord01" label-width="80px" label-position="left" size="small" >
                                <el-row style="background-color: #EAF1F5;margin-top: -20px">
                                    <el-col :span="8" style="margin-top: 4px;">

                                    </el-col>
                                    <el-col :span="4" >
                                        <el-button type="text" size="small"  @click="stageCheck">暂存</el-button>
                                    </el-col>
                                    <el-col :span="4" >
                                        <el-button type="text" size="small"  @click="saveCheck">提交</el-button>
                                    </el-col>
                                    <el-col :span="4" >
                                        <el-button type="text" size="small"  :disabled="isSaved" @click="cleanCheck">清空所有</el-button>
                                    </el-col>
                                    <el-col :span="4" >
                                        <el-button type="text" size="small"  @click="refMedicalRecord">刷新</el-button>
                                    </el-col>
                                </el-row>
                                <el-tag>病史内容：</el-tag>
                                <el-form-item label="主诉">
                                    <el-input type="textarea" :rows="1" v-model="medicalRecord01.Readme" :disabled="isSaved"></el-input>
                                </el-form-item>
                                <el-form-item label="现病史">
                                    <el-input type="textarea" :rows="2" v-model="medicalRecord01.Present" :disabled="isSaved"></el-input>
                                </el-form-item>
                                <el-form-item label="现病治疗情况">
                                    <el-input type="textarea" :rows="2" v-model="medicalRecord01.PresentTreat" :disabled="isSaved"></el-input>
                                </el-form-item>
                                <el-form-item label="既往史">
                                    <el-input type="textarea" :rows="2" v-model="medicalRecord01.History" :disabled="isSaved"></el-input>
                                </el-form-item>
                                <el-form-item label="过敏史">
                                    <el-input type="textarea" :rows="2" v-model="medicalRecord01.Allergy" :disabled="isSaved"></el-input>
                                </el-form-item>
                                <el-form-item label="体格检查">
                                    <el-input type="textarea" :rows="2" v-model="medicalRecord01.Physique" :disabled="isSaved"></el-input>
                                </el-form-item>
                                <el-form-item label="诊断">
                                    <el-input type="textarea" :rows="2" v-model="medicalRecord01.Diagnosis" :disabled="isSaved"></el-input>
                                </el-form-item>

                                <el-form-item label="检查建议">
                                    <el-input type="textarea" :rows="2" v-model="medicalRecord01.Proposal" :disabled="isSaved"></el-input>
                                </el-form-item>
                                <el-form-item label="注意事项">
                                    <el-input type="textarea" :rows="2" v-model="medicalRecord01.Careful" :disabled="isSaved"></el-input>
                                </el-form-item>
                            </el-form>
                            <el-button type="text" size="small"  @click="saveCheck">提交</el-button>
                        </el-main>

                    </el-container>
                </el-tab-pane>
                <!-- 医生给患者根据病历要求患者进行的检查项：一般无比对标准，如B超 -->
                <el-tab-pane label="检查申请" :lazy="true">

                </el-tab-pane>
                <!-- 医生给患者根据病历要求患者进行的检验项：一般有比对标准，如血常规 -->
                <el-tab-pane label="检验申请*" :lazy="true">
                    <div  >
                        <!-- 3.检验申请 -->
                        <el-container direction="horizontal">
                            <!-- 页面弹窗 -->
                            <el-dialog
                                    title="新增检验申请"
                                    :visible.sync="dialog01Visible"
                                    width="30%">
                                <el-form size="small">
                                    <el-form-item>
                                        <el-input placeholder="请输入内容"   style="width: 100%">
                                            <template slot="prepend">检验名称：</template>
                                            <el-button slot="append" icon="el-icon-search"></el-button>
                                        </el-input>
                                    </el-form-item>
                                    <el-form-item>
                                        <el-table border :data="tableData02" size="small">
                                            <el-table-column prop="choose02" label="" width="30px">
                                                <template slot-scope="scope">
                                                    <input type="radio" name="chooseOne02" />
                                                </template>
                                            </el-table-column>
                                            <el-table-column property="feilei" label="分类" width="80">
                                            </el-table-column>
                                            <el-table-column property="xiangmu" label="项目" >
                                            </el-table-column>
                                        </el-table>
                                    </el-form-item>
                                    <el-form-item label="检验科室" >
                                        <el-select  placeholder="请选择">
                                            <el-option
                                                    v-for="item in selectData01"
                                                    :key="item.keshi"
                                                    :label="item.keshi"
                                                    :value="item.keshi">
                                            </el-option>
                                        </el-select>
                                    </el-form-item>
                                    <el-form-item label="是否加急：" >
                                        <el-switch
                                                v-model="switch01"
                                                active-color="#13ce66">
                                        </el-switch>
                                    </el-form-item>
                                    <el-form-item>
                                        <el-button type="primary" @click="dialog01Visible = false">确 定</el-button>
                                        <el-button @click="dialog01Visible = false">取 消</el-button>
                                    </el-form-item>
                                </el-form>
                            </el-dialog>


                            <!-- 页面正文 -->
                            <el-aside  style="width: 700px;height: 500px;">

                                <el-row style="background-color: #EAF1F5">
                                    <el-col :span="8" style="margin-top: 4px;">
                                        <el-tag size="small">本项目金额合计：</el-tag>
                                        <el-tag type="warning" size="small">235.00元</el-tag>
                                    </el-col>
                                    <el-col :span="3"><el-button type="text" size="small"  @click="dialog01Visible=true">新增项目</el-button></el-col>
                                    <el-col :span="3"><el-button type="text" size="small"  @click="showConfirm('删除选择的检验项目')">删除项目</el-button></el-col>
                                    <el-col :span="2"><el-button type="text" size="small"  @click="showConfirm('使科室收到开立的检验项目')">开立</el-button></el-col>

                                </el-row>

                                <el-form ref="form"  label-width="80px">
                                    <el-row>
                                        <el-col :span="2" style="margin-top: 40px;">
                                            <el-input type="textarea" :rows="4" :disabled="true" style="width: 45px;" v-model="msg01">

                                            </el-input>
                                        </el-col>
                                        <el-col :span="22" style="margin-top: 4px;">
                                            <el-table ref="singleTable" :data="tableData02"
                                                      style="width: 100%;margin: 0px;padding: 0px;" :show-header="true">
                                                <el-table-column  type="selection">
                                                </el-table-column>
                                                <el-table-column property="feilei" label="分类" width="80">
                                                </el-table-column>
                                                <el-table-column property="xiangmu" label="项目" >
                                                </el-table-column>
                                                <el-table-column property="keshi" label="执行科室" width="80">
                                                </el-table-column>
                                                <el-table-column property="jiaji" label="加急" width="50">
                                                </el-table-column>
                                                <el-table-column property="zhuangtai" label="状态" width="80">
                                                </el-table-column>
                                                <el-table-column property="danjia" label="单价" width="80">
                                                </el-table-column>
                                                <el-table-column property="jieguo" label="检验结果" width="80">
                                                    <template slot-scope="scope">
                                                        <el-popover
                                                                placement="right"
                                                                width="400"
                                                                trigger="click">
                                                            <img src=""></img>
                                                            <el-button slot="reference" type="text" size="small">查看</el-button>
                                                        </el-popover>

                                                    </template>
                                                </el-table-column>

                                            </el-table>
                                        </el-col>
                                    </el-row>

                                    <el-row>
                                        <el-form-item label="目的要求">
                                            <el-input type="textarea" :rows="4" placeholder="【检验目的：】【患者主诉：】【现病史：】"></el-input>
                                        </el-form-item>
                                    </el-row>

                                </el-form>
                            </el-aside>
                            <el-main style="margin-top: -20px;">
                                <el-tabs type="card" v-model="activeName">


                                </el-tabs>
                            </el-main>
                        </el-container>

                    </div>
                </el-tab-pane>
                <!-- 患者病历填写  -->
                <el-tab-pane label="门诊确诊*" :lazy="true">

                </el-tab-pane>


            </el-tabs>
        </el-container>
    </el-container>
</template>


<script setup>
    import {onMounted, ref} from 'vue'
    import {ElNotification} from 'element-plus'
    import service from '@/utils/request'
    import {Search} from "@element-plus/icons-vue";

    let medicalRecord = ref({MedicalDisease01:[],MedicalDisease02:[]})
    let medicalRecord01 = ref({})
    let showPatientsTop = ref("请选择患者")

    function handleDBCurrentChange(){   //双击选中患者

    }
    onMounted(() => {
        // 加载本人 已诊患者、未诊患者，本科室已诊患者，未诊患者
    })
</script>