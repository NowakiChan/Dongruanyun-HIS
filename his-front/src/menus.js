
const sys = {
    path:'/sys',
    icon:'Setting',
    title:'系统设置',
    children:[
        {
            path:'/constanttype',
            title:'常数类别管理',
        },
        {
            path:'/constantitem',
            title:'常数项管理',
        },
        {
            path:'/user',
            title:'用户管理',
        },
    ]
}
const reg =  {
    path:'/reg',
    icon:'Search',
    title:'挂号收费',
    children:[
        {
            path:'/register',
            title:'现场挂号',
        },
        {
            path:'/charge',
            title:'收费',
        }
    ]
}
const doc =  {
    path:'/doc',
    icon:'View',
    title:'门诊医生',
    children:[
        {
            path:'/doctor',
            title:'门诊病历',
        }
    ]
}
const tech =  {
    path:'/tech',
    icon:'Bell',
    title:'医技处置',
    children:[
        {
            path:'/check',
            title:'患者检验',
        }
    ]
}

export const getMenuByUserType=(usertype)=>{
    const menus={
        1:[sys,reg,doc,tech],
        2:[reg],
        3:[doc],
        4:[tech]
    }


    return menus[usertype] || [reg]
}