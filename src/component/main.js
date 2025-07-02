import Toolbar from '@mui/material/Toolbar';
import '../css/main.css'
import Box from '@mui/material/Box'
import AppBar from '@mui/material/AppBar';
import Typography from '@mui/material/Typography';
import { useState } from 'react';
import IconButton from '@mui/material/IconButton';
import MenuIcon from '@mui/icons-material/Menu'
import { ThemeProvider } from '@emotion/react';
import { createTheme } from '@mui/material/styles';
import Drawer from '@mui/material/Drawer';
import Divider from '@mui/material/Divider';
import List from '@mui/material/List'
import ListItemButton from '@mui/material/ListItemButton';
import ListItemIcon from '@mui/material/ListItemIcon';
import EmergencyIcon from '@mui/icons-material/Emergency';
import ListItemText from '@mui/material/ListItemText';

export function MainApp()
{
    return(
        <>
            <NavBar/>
        </>
    );
}

function NavBar(props)
{
    const [position,setPosition] = useState('主页');
    const [drawerOpen,setDrawer] = useState(false);
    const handleClose = () => {
        setDrawer(false)
    }
    const titleTheme = createTheme({
        typography: {
            h6: {
                paddingTop: '4px'
            }
        }
    });
    return(
        <>
            <Box sx={{ flexGrow : 1}}>
                <AppBar position='static'>
                    <Toolbar>
                        <IconButton
                            size='large'
                            edge='start'
                            color='inherit'
                            aria-label='menu'
                            sx = {{ mr : 2}}
                            onClick={() => { setDrawer(true); }}
                        >
                            <MenuIcon />
                        </IconButton>
                        <ThemeProvider theme={titleTheme}>
                            <Typography variant='h6' component='div' sx={{ flexGrow : 1 }}>{position}</Typography>
                        </ThemeProvider>
                    </Toolbar>
                </AppBar>
            </Box>
            <SideBar config={drawerOpen} handler={handleClose} setPos={setPosition}/>
        </>
    );
}

function SideBar(props)
{
    const DrawerContent = (
        <Box sx={{ width: 250 }} role="presentation" onClick={props.handler}>
            <List>
                <ListItemButton onClick={() => { props.setPos('医院服务'); }}>
                    <ListItemIcon>
                        <EmergencyIcon />
                    </ListItemIcon>
                    <ListItemText>医院服务</ListItemText>
                </ListItemButton>
            </List>
            <Divider />
            <List>

            </List>
        </Box>
    );
    return(
        <>
            <Drawer open={props.config} onClose={props.handler}>{DrawerContent}</Drawer>
        </>
    );
}