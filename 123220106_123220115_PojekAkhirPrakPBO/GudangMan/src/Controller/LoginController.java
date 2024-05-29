package Controller;

import DAOImplement.DAOLogin;
import DAOInterface.DAOLoginInterface;
import Frame.FrameInv;
import Frame.FrameLogin;
import Notify.Notify;

public class LoginController {
    FrameLogin frame;
    DAOLoginInterface loginDAO;
    
    public LoginController(FrameLogin frame){
        this.frame = frame;
        loginDAO = new DAOLogin();
    }
    
    public void login(){
        String username = frame.getInputUsername().getText();
        String password = frame.getInputPassword().getText();
        
        int result = loginDAO.login(username, password);
        
        if(result <= 0){
            Notify notify = new Notify("Login Gagal");
            notify.setVisible(true);
        }else{
            frame.dispose();
            FrameInv panelBaru = new FrameInv();
            panelBaru.setVisible(true);
        }
    }
}
