<script setup>
// 组件
    import  NavMenu  from '../components/NavMenu.vue'


</script>


<template>
    <el-container>
      <el-header class="header">
          东软云医院
      </el-header>
      <el-container  class="container">
        <el-aside width="200px" class="aside">
              <NavMenu></NavMenu>
        </el-aside>
        <el-main class="content">
           <RouterView></RouterView>
        </el-main>
      </el-container>
    </el-container>


</template>


<style>

    /* 样式 */
.header{
    background-color: #C6E2FF;
}



/* container */
.container{
    height:  calc( 100vh - 60px);
}



.aside{
    background-color: #D9ECFF;
}

.content{

    background-color: #ECF5FF;

}


</style>