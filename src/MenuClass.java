import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MenuClass {
    JMenuBar menuBar;
    JMenu menu, menuLanguage, menuColor;
    JMenuItem iOpen, iSave, iSaveAs, iColorDarkGray, iColorBlack, iColorWhite, iLanguageENG, iLanguagePT;
    MyWindow myWindow;
    String fileName, fileAdress;
    BufferedImage img = null;
    JLabel image;
   public MenuClass(MyWindow myWindow){
   this.myWindow = myWindow;

    }
    public void createMenu(){

       menuBar = new JMenuBar();
       myWindow.frame.setJMenuBar(menuBar);
       iOpen = new JMenuItem("Open");
       iSave = new JMenuItem("Save");
       iSaveAs = new JMenuItem("Save as");
       iColorDarkGray = new JMenuItem("Dark gray");
       iColorBlack = new JMenuItem("Black");
       iColorWhite = new JMenuItem("White");
       iLanguageENG = new JMenuItem("English");
       iLanguagePT = new JMenuItem("Português");

       menu = new JMenu("File");
       menu.add(iOpen);
       menu.add(iSave);
       menu.add(iSaveAs);
       menuColor = new JMenu("Color");
        menuColor.add(iColorDarkGray);
        menuColor.add(iColorBlack);
        menuColor.add(iColorWhite);
        menuLanguage = new JMenu("Language");
        menuLanguage.add(iLanguageENG);
        menuLanguage.add(iLanguagePT);

        iOpen.addActionListener(myWindow);
        iOpen.setActionCommand("Open");


        menuBar.add(menu);
        menuBar.add(menuColor);
        menuBar.add(menuLanguage);





    }
    public void open(){
        FileDialog fileDialog = new FileDialog(myWindow.frame,"Files",FileDialog.LOAD);
        fileDialog.setVisible(true);
        if(fileDialog.getFile()!=null) {
            fileAdress = fileDialog.getDirectory();
            fileName = fileDialog.getFile();


        }
        try{
            img = ImageIO.read(new File(fileAdress + fileName));
            System.out.println(img);
            ImageIcon imageIcon = new ImageIcon(img);
            JLabel label = new JLabel();
            label.setIcon(imageIcon);
            myWindow.frame.add(label);
            label.setBounds(200,200,myWindow.frame.getWidth(), myWindow.frame.getHeight());


        } catch (Exception e){
            e.printStackTrace();

        }

   }


}