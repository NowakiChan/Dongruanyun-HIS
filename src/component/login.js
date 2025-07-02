import TextField from '@mui/material/TextField'
import Button from "@mui/material/Button";
import '../css/login.css'
import Snackbar from "@mui/material/Snackbar";
import { useState } from 'react';
import { useNavigate } from 'react-router-dom';

export function Login()
{
    const [box_state,setBoxState] = useState(false);
    const [hint_text,setHintText] = useState('');
    const [usrname,setUsrname] = useState('');
    const [pwd,setPwd] = useState('');
    const main_page_navigate = useNavigate();

    const getUsrname = (e) => { setUsrname(e.target.value); }
    const getPwd = (e) => { setPwd(e.target.value); }
    const checkAspect = () => {
        if(usrname.length === 0) {
            setBoxState(true);
            setHintText('请输入用户名');
            return false;
        }

        if(pwd.length === 0) {
            setBoxState(true);
            setHintText('请输入密码');
            return false;
        }

        return true;
    }

    const handleSubmit = () => {
        const url = 'http://localhost:8080/login';
        if(checkAspect()){
            main_page_navigate('/home');
            // fetch(url).then(info => {
            //     console.log(info);
            // }).then(data => {
            //     console.log(data);
            // }).then(err => {
            //     console.log(err);
            // });
        }
    }

    const handleClose = (event,reason) => {
        setBoxState(false);
    }

    return(
        <>
            <div className="LoginMainBox">
                <h1>用户登录</h1>
                <TextField 
                    required id="outlined-controlled" 
                    label="用户名" size="small" 
                    variant="standard" 
                    onChange={getUsrname}
                />
                <TextField 
                    required id="outlined-password-input" 
                    label="密码" 
                    size="small" 
                    variant="standard"
                    type="password"
                    onChange={getPwd}
                />
                <Button variant="contained" size="small" onClick={handleSubmit}>登录</Button>
            </div>
            <Snackbar
                open={box_state}
                autoHideDuration={5000}
                message={hint_text}
                onClose={handleClose}
                size='small'
                anchorOrigin={{vertical : 'top',horizontal : 'center'}}
            />
        </>
    );
} 