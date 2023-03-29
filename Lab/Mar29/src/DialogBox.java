import javax.swing.*;

public class DialogBox {
    JFrame frame;

    public DialogBox(){
        frame = new JFrame("Dialog Box");
        JOptionPane.showMessageDialog(frame, "Hello World!");
    }

    public static void main(String[] args) {
        new DialogBox();
    }
}
