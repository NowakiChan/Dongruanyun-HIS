// import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'
import App from './App.vue'
import router from './router'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'

// 导入 
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

const app = createApp(App)

for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}
// 让ElementPlus生效
app.use(ElementPlus)


app.use(createPinia())
app.use(router)

app.mount('#app')








