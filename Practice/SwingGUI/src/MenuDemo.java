import javax.swing.*;

public class MenuDemo {
    JFrame frame;
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, helpMenu;
    JMenuItem newItem, openItem, saveItem, exitItem, cutItem, copyItem, pasteItem, aboutItem;

    MenuDemo() {
        frame = new JFrame("Menu Demo");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        menuBar = new JMenuBar();
        
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        newItem = new JMenuItem("New", 'n');
        openItem = new JMenuItem("Open", 'o');
        saveItem = new JMenuItem("Save", 's');
        exitItem = new JMenuItem("Exit", 'e');

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        cutItem = new JMenuItem("Cut", 't');
        copyItem = new JMenuItem("Copy", 'c');
        pasteItem = new JMenuItem("Paste", 'p');

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        aboutItem = new JMenuItem("About", 'a');

        helpMenu.add(aboutItem);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}