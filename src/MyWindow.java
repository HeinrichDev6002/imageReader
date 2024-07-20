import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow implements ActionListener {
    JFrame frame;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    JPanel panel;
    MenuClass myMenu = new MenuClass(this);
    MyWindow(){
        createFrame();
        myMenu.createMenu();
        frame.setVisible(true);
    }
    private void createFrame(){
        frame = new JFrame();
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10,20));
        //frame.add(panel, BorderLayout.CENTER);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
String command = e.getActionCommand();
switch (command){
    case "Open":
myMenu.open();
}
    }
}
