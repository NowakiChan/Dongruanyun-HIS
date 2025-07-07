<template>
    <div>
        <el-button type="primary" size="small" style="margin-left: 3px" @click="addNewReg()">
            <el-icon>
                <Edit/>
            </el-icon> &nbsp;挂号
        </el-button>

        <el-button type="primary" size="small" style="margin-left: 3px" @click="clear()">
            <el-icon>
                <Refresh/>
            </el-icon>&nbsp;清空
        </el-button>

        <br><br>
        <div style="font-size:15px;font-family:'Microsoft YaHei'">挂号信息</div>&nbsp;
        <el-row :gutter="2">
            <el-col :span="4">
                <div class="grid-content bg-purple">
                    <span style="color:red">*</span>
                    <span style="font-size:13px;font-family:'Microsoft YaHei'">病 历 号 :</span>&nbsp;
                    <el-input placeholder="输入病历号" style="width: 110px" again="left" size="small"
                              v-model="formData.casenumber"
                              @blur="blhcx()">
                    </el-input>

                </div>
            </el-col>
            <el-col :span="4">
                <div class="grid-content bg-purple">
                    <span style="color:red">*</span>
                    <span style="font-size:13px;font-family:'Microsoft YaHei'">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名:</span>&nbsp;
                    <el-input placeholder="输入姓名" style="width: 110px" again="left" size="small"
                              v-model="formData.realname">
                    </el-input>
                </div>
            </el-col>
            <el-col :span="4">
                <div class="grid-content bg-purple">
                    <span style="color:red">*</span>
                    <span style="font-size:13px;font-family:'Microsoft YaHei'">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:</span>&nbsp;
                    <el-select placeholder="选择性别" style="width: 110px" size="small" v-model="formData.gender">
                        <el-option
                                v-for="item in sexData"
                                :key="item.id"
                                :label="item.constantname"
                                :value="item.id">
                        </el-option>
                    </el-select>

                </div>
            </el-col>
            <el-col :span="7">
                <div class="grid-content bg-purple">
                    <span style="color:red">*</span>
                    <span style="font-size:13px;font-family:'Microsoft YaHei'">年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄:</span>&nbsp;
                    <el-input placeholder="输入年龄" style="width: 110px" again="left" size="small" v-model="formData.age">
                    </el-input>
                    <span style="color:red">*</span>
                    <el-select placeholder="选择岁" style="width: 110px" size="small" v-model="formData.agetype">
                        <el-option label="岁" value="岁"></el-option>
                        <el-option label="月" value="月"></el-option>
                        <el-option label="天" value="天"></el-option>
                    </el-select>
                </div>
            </el-col>
        </el-row>

        <el-row :gutter="2">
            <el-col :span="4">
                <div class="grid-content bg-purple">
                    <span style="font-size:13px;font-family:'Microsoft YaHei'">出生日期:</span>
                    <el-date-picker
                            @change="calculateAge"
                            v-model="formData.birthdate"
                            type="date"
                            placeholder="出生日期" size="small" style="width: 124px" value-format="YYYY-MM-DD">
                    </el-date-picker>

                </div>
            </el-col>

            <el-col :span="7">
                <div class="grid-content bg-purple">
                    <span style="font-size:13px;font-family:'Microsoft YaHei'">身份证号:</span>&nbsp;&nbsp;&nbsp;
                    <el-input placeholder="在此输入身份证号" style="width: 230px" size="small"
                              v-model="formData.idnumber"></el-input>
                </div>
            </el-col>
            <el-col :span="7">
                <div class="grid-content bg-purple">
                    <span style="font-size:13px;font-family:'Microsoft YaHei'">家庭住址:</span>&nbsp;
                    <el-input placeholder="在此输入家庭住址" style="width: 250px" again="left" size="small"
                              v-model="formData.homeaddress">
                    </el-input>
                </div>
            </el-col>
        </el-row>

        <el-row :gutter="2">
            <el-col :span="4">
                <div class="grid-content bg-purple">
                    <span style="color:red">*</span>
                    <span style="font-size:13px;font-family:'Microsoft YaHei'">结算类别:</span>&nbsp;
                    <el-select placeholder="结算类别" style="width: 100px" size="small" v-model="formData.settleid">
                        <el-option
                                v-for="item in categories4"
                                :key="item.ID"
                                :label="item.SettleName"
                                :value="item.ID">
                        </el-option>
                    </el-select>
                </div>
            </el-col>
            <el-col :span="5">
                <div class="grid-content bg-purple">
                    <span style="color:red">*</span>
                    <span style="font-size:13px;font-family:'Microsoft YaHei'">看诊日期:
                        <el-date-picker
                                v-model="formData.visitdate"
                                type="date"
                                placeholder="看诊日期" size="small" style="width: 125px" value-format="YYYY-MM-DD"
                                @change="kzrq_select()">
                        </el-date-picker>

                    </span>
                </div>
            </el-col>
            <el-col :span="4">
                <div class="grid-content bg-purple">
                    <span style="color:red">*</span>
                    <span style="font-size:13px;font-family:'Microsoft YaHei'">午别:</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                    <el-select placeholder="午别" style="width: 90px" size="small" v-model="formData.noon"
                               @change="Noon_select()">
                        <el-option
                                v-for="item in categories5"
                                :key="item.noon"
                                :label="item.noon"
                                :value="item.noon">
                        </el-option>
                    </el-select>
                </div>
            </el-col>

            <el-col :span="4">
                <div class="grid-content bg-purple">
                    <span style="color:red">*</span>
                    <span style="font-size:13px;font-family:'Microsoft YaHei'">挂号科室:</span>&nbsp;
                    <el-select placeholder="挂号科室" style="width: 108px" size="small" v-model="formData.deptid"
                               @change="Dept_select()">
                        <el-option
                                v-for="item in deptData"
                                :key="item.id"
                                :label="item.deptname"
                                :value="item.id">
                        </el-option>
                    </el-select>
                </div>
            </el-col>
        </el-row>
        <el-row :gutter="2">
            <el-col :span="4">
                <div class="grid-content bg-purple">
                    <span style="color:red">*</span>
                    <span style="font-size:13px;font-family:'Microsoft YaHei'">号&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:</span>&nbsp;

                    <el-select placeholder="号别" style="width: 100px" size="small" v-model="formData.registleid"
                               @change="RegistLe_select()">
                        <el-option
                                v-for="item in categories6"
                                :key="item.did"
                                :label="item.RegistName"
                                :value="item.did">
                        </el-option>
                    </el-select>
                </div>
            </el-col>

            <el-col :span="4">
                <div class="grid-content bg-purple">
                    <span style="color:red">*</span>
                    <span style="font-size:13px;font-family:'Microsoft YaHei'">看诊医生:</span>
                    <el-select placeholder="看诊医生" style="width: 110px" size="small" v-model="formData.userid"
                               @change="user_select()">
                        <el-option
                                v-for="item in doctorData"
                                :key="item.id"
                                :label="item.realName"
                                :value="item.id">
                        </el-option>
                    </el-select>
                </div>
            </el-col>

        </el-row>

        <el-row :gutter="2">
            <el-col :span="4">
                <div>

                    <span style="font-size:13px;font-family:'Microsoft YaHei'">病历本</span>

                    <input type="checkbox" name="" v-model="formData.isbook" true-value="1" false-value="0"
                           @change="book_select()"
                    />
                </div>
            </el-col>

            <el-col :span="4">
                <div>
                    <span style="color:red">*</span>
                    <span style="font-size:13px;font-family:'Microsoft YaHei'">应收金额:</span>&nbsp;
                    <el-input placeholder="应收金额" style="width: 100px" again="left" size="small" v-model="formData.fee"
                              readonly>
                    </el-input>
                </div>
            </el-col>

            <el-col :span="4">
                <div>
                    <span style="color:red">*</span>
                    <span style="font-size:13px;font-family:'Microsoft YaHei'">收费方式:</span>&nbsp;
                    <el-select placeholder="收费方式" style="width: 100px" size="small" v-model="formData.feetype">
                        <el-option
                                v-for="item in categories3"
                                :key="item.ID"
                                :label="item.ConstantName"
                                :value="item.ID">
                        </el-option>
                    </el-select>
                </div>
            </el-col>
        </el-row>
    </div>
</template>


<script setup>
    import {onMounted, ref} from 'vue'
    import service from '@/utils/request'
    import { useCounterStore } from "@/stores/counter.js";

    const counter = useCounterStore();
    let formData = ref({})
    let sexData = ref([])       //性别数据
    let deptData = ref([])
    let doctorData = ref([])

    function addNewReg() {
        formData.value.registerid = counter.vo_user.userid
        formData.value.registleid = 1
        formData.value.settleid = 1
        formData.value.isbook = '是'
        formData.value.noon = '上午'
        formData.value.fee = 21
        console.log(formData.value)
        service.post("/register/add",formData.value).then()
    }

    function Dept_select() {
        //formData.deptid 就是当前选中的科室
        service.get("/user/getbydeptid?deptid=" + formData.value.deptid).then(
            res => {
                console.log(res.data)
                doctorData.value = res.data
            }
        )
    }

    function calculateAge() {
        console.log(formData.value.birthdate)
        const birthdate = new Date(formData.value.birthdate);
        const today = new Date();

        // 计算时间差（毫秒）
        const timeDiff = today - birthdate;
        // 计算天数
        const daysDiff = Math.floor(timeDiff / (1000 * 60 * 60 * 24));
        // 计算月数（近似值）
        const monthsDiff = Math.floor(daysDiff / 30.44);
        // 计算年数
        let yearsDiff = today.getFullYear() - birthdate.getFullYear();
        // 调整年数（如果今年生日还没到）
        const monthCheck = today.getMonth() - birthdate.getMonth();
        if (monthCheck < 0 || (monthCheck === 0 && today.getDate() < birthdate.getDate())) {
            yearsDiff--;
        }
        // 确定显示类型（岁/月/天）
        let ageValue, ageType;

        if (yearsDiff >= 2) {
            ageValue = yearsDiff;
            ageType = '岁';
        } else if (monthsDiff >= 1) {
            ageValue = monthsDiff;
            ageType = '个月';
        } else {
            ageValue = daysDiff;
            ageType = '天';
        }

        // 更新显示
        //console.log("ageType="+ageType)
        //console.log("ageValue="+ageValue)
        formData.value.age = ageValue
        formData.value.agetype = ageType


    }

    onMounted(() => {
        //1.加载性别、结算方式、午别、挂号科室、号别、收费方式数据
        service.get("/constantitem/getbytypeid2?id=7").then(
            res => {
                sexData.value = res.data
            }
        )

        //午别 categories5
        let categories5 = ref([{noon:'上午'},{noon:'下午'}])
        service.get("/dept/list").then(
            res => {
                deptData.value = res.data
            }
        )


    })
</script>