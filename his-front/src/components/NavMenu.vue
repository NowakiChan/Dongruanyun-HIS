<template>

    <el-menu
        active-text-color="#ffd04b"
        background-color="#545c64"
        class="el-menu-vertical-demo"
        default-active="2"
        text-color="#fff"
        router
      >
        <el-sub-menu :index="item.path" v-for="item in menus" :key="item.path">
            <template #title>
                <el-icon><component :is="item.icon" /></el-icon>
                <span>{{ item.title }}</span>
            </template>
            <el-menu-item-group v-if="item.children">
                <el-menu-item v-for="item2 in item.children"  :index="item2.path">{{item2.title}}</el-menu-item>

            </el-menu-item-group>
        </el-sub-menu>




      </el-menu>

</template>
<script setup>
    import {useCounterStore} from "@/stores/counter.js";
    import {computed} from "vue";
    import { getMenuByUserType} from "@/menus.js";

    const counter = useCounterStore()
    const menus = computed(
        ()=>{
            return getMenuByUserType(counter.vo_user.value.useType)
        }
    )
   // console.log(menus.value)
</script>