import javax.swing.*;
// import java.awt.*;

public class MenuDemo {
    JMenu menu, BCAJMenu;
    JMenuItem csit, bhm, bim, bbm;
    JMenuItem ds, ae, aj, mp, np;

    MenuDemo(){
        JFrame frame = new JFrame("Menu Example");
        JMenuBar menuBar = new JMenuBar();
        menu = new JMenu("NCCS");
        BCAJMenu = new JMenu("BCA");

        csit = new JMenuItem("CSIT");
        bhm = new JMenuItem("BHM");
        bim = new JMenuItem("BIM");
        bbm = new JMenuItem("BBM");

        ds = new JMenuItem("Distributed System");
        ae = new JMenuItem("Applied Economics");
        aj = new JMenuItem("Advanced Java");
        mp = new JMenuItem("Mobile Programming");
        np = new JMenuItem("Network Programming");
        
        menu.add(csit);  
        menu.add(bhm);
        menu.add(bim);
        menu.add(bbm);
        
        BCAJMenu.add(ds);
        BCAJMenu.add(ae);
        BCAJMenu.add(aj);
        BCAJMenu.add(mp);
        BCAJMenu.add(np);
        menu.add(BCAJMenu);

        menuBar.add(menu);

        frame.setJMenuBar(menuBar);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}
