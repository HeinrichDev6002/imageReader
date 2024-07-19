import javax.swing.*;

public class MenuClass {
    JMenuBar menuBar;
    JMenu menu, menuLanguage, menuColor;
    JMenuItem iOpen, iSave, iSaveAs, iColorDarkGray, iColorBlack, iColorWhite, iLanguageENG, iLanguagePT;
    MyWindow myWindow;
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
       menuLanguage = new JMenu("Language");
       menuColor = new JMenu("Color");




    }

}
