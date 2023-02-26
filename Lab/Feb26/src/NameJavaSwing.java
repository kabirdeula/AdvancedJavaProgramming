import javax.swing.*;

public class NameJavaSwing extends JFrame{
    private JLabel nameLabel;

    public NameJavaSwing(){
        setTitle("Display Name");
        nameLabel = new JLabel("Kabir Deula");
        getContentPane().add(nameLabel);
        setSize(200, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new NameJavaSwing();
    }
}