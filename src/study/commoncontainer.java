package study;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;

public class commoncontainer extends JFrame{
    private JButton button;
    private JTextField account;
    private JPasswordField password;
    public commoncontainer(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void init(){
        
        add(new JLabel("账号:"));
        account = new JTextField(10);
        add(account);
        add(new JLabel("密码:"));
        password = new JPasswordField(6);
        add(password);
        button = new JButton("确定");
        add(button);
    }
    public static void main(String[] args) {
        commoncontainer c = new commoncontainer();
        c.setBounds(100,10,310,100);
        c.setTitle("登录界面");
        
        FlowLayout k = new FlowLayout();
        c.setLayout(k);
    }
}
