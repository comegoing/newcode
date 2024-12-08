package experiment8;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
class OKListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("it is ok");
    }
}
public class simpleeventdemo extends JFrame{
    public simpleeventdemo(){
        JButton jbtok = new JButton("OK");
        add(jbtok);
        OKListener ok = new OKListener();
        jbtok.addActionListener(ok);
    }
    public static void main(String[] args) {
        simpleeventdemo frame = new simpleeventdemo();
        frame.setVisible(true);
        frame.setBounds(100, 100, 100, 100);
    }
}

