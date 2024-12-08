package study;

// import java.awt.event.InputEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class window {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("大鱼吃小鱼");
        jframe.setBounds(60, 100, 100, 200);
        jframe.setVisible(true);

        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("菜单");
        JMenu subMenu = new JMenu("图片项目");
        JMenuItem item1 = new JMenuItem("hutao",new ImageIcon("E:\\photo\\QQ图片20211222211414-副本.jpg"));
        JMenuItem item2 = new JMenuItem("youla",new ImageIcon("E:\\photo\\QQ图片20220309203309-副本.jpg"));
        item1.setAccelerator(KeyStroke.getKeyStroke('A'));
        item2.setAccelerator(KeyStroke.getKeyStroke('B'));
        menu.add(item1);
        // menu.addSeparator();
        menu.add(item2);
        menu.add(subMenu);
        menubar.add(menu);
        jframe.setJMenuBar(menubar);

    }
}
