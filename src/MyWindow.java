import javax.swing.*;
import java.awt.*;

public class MyWindow {
    JFrame frame;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    MenuClass myMenu = new MenuClass(this);
    MyWindow(){
        createFrame();
        frame.setVisible(true);
    }
    private void createFrame(){
        frame = new JFrame();
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10,20));

    }
}
