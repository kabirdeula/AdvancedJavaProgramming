import java.awt.*;
import javax.swing.*;

public class ControlsDemo {
    JFrame frame;
    JPanel panel1, panel2, panel3, sPanel1, sPanel2;
    JLabel labelName, labelPassword, labelSex, labelHobby, labelCountry, labelComments;
    JTextField textName;
    JPasswordField textPassword;
    JRadioButton radioButtonMale, radioButtonFemale;
    ButtonGroup buttonGroup;
    JCheckBox checkPlay, checkRead, checkVisit, checkTicket;
    JComboBox comboCountry;
    JTextArea textArea;
    JScrollPane scrollPane;
    JSlider slider;

    ControlsDemo() {
        frame = new JFrame("Controls Demo");
        frame.setSize(600, 400);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        sPanel1 = new JPanel();
        sPanel2 = new JPanel();

        panel1.setPreferredSize(new Dimension(600, 50));
        panel2.setPreferredSize(new Dimension(50, 400));

        // Adding three panels in frame
        frame.setLayout(new BorderLayout());
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.CENTER);
        panel3.setLayout(new GridLayout());

        // Adding two panels in Panel panel3
        panel3.add(sPanel1);
        panel3.add(sPanel2);

        // Defining border of panels
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // No Layout Manager
        sPanel1.setLayout(null);
        sPanel2.setLayout(null);

        // Setting background color of panels
        sPanel1.setBackground(Color.ORANGE);
        sPanel2.setBackground(Color.ORANGE);

        // Creating and Adding Label and TextField
        labelName = new JLabel("Username");
        textName = new JTextField(20);
        labelName.setBounds(80, 20, 100, 25);
        textName.setBounds(20, 20, 200, 25);
        sPanel1.add(labelName);
        sPanel2.add(textName);

        // Creating and Adding PasswordField
        labelPassword = new JLabel("Password");
        textPassword = new JPasswordField(20);
        labelPassword.setBounds(80, 50, 100, 25);
        textPassword.setBounds(20, 50, 200, 25);
        sPanel1.add(labelPassword);
        sPanel2.add(textPassword);

        // Creating and Adding Radio Button
        labelSex = new JLabel("Sex");
        radioButtonFemale = new JRadioButton("Female", true);
        radioButtonMale = new JRadioButton("Male");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButtonFemale);
        buttonGroup.add(radioButtonMale);
        labelSex.setBounds(80, 80, 100, 25);
        radioButtonFemale.setBounds(20, 80, 75, 25);
        radioButtonMale.setBounds(100, 80, 75, 25);
        sPanel1.add(labelSex);
        sPanel2.add(radioButtonFemale);
        sPanel2.add(radioButtonMale);

        // Creating and Adding Checkbox
        labelHobby = new JLabel("Hobbies");
        checkPlay = new JCheckBox("Playing");
        checkRead = new JCheckBox("Reading");
        checkVisit = new JCheckBox("Visiting");
        checkTicket = new JCheckBox("Ticketing");
        labelHobby.setBounds(80, 110, 100, 25);
        checkPlay.setBounds(20, 110, 75, 25);
        checkRead.setBounds(100, 110, 75, 25);
        checkVisit.setBounds(180, 110, 75, 25);
        checkTicket.setBounds(20, 140, 90, 25);
        sPanel1.add(labelHobby);
        sPanel2.add(checkPlay);
        sPanel2.add(checkRead);
        sPanel2.add(checkVisit);
        sPanel2.add(checkTicket);

        // Creating and Adding Combo Box
        labelCountry = new JLabel("Country");
        comboCountry = new JComboBox();
        comboCountry.addItem("Nepal");
        comboCountry.addItem("South Korea");
        comboCountry.addItem("India");
        labelCountry.setBounds(80, 170, 100, 25);
        comboCountry.setBounds(20, 170, 100, 25);
        comboCountry.setSelectedIndex(0);
        sPanel1.add(labelCountry);
        sPanel2.add(comboCountry);

        // Creating and Adding TextArea and Scroll Pane
        labelComments = new JLabel("Comments");
        textArea = new JTextArea(3,20);
        scrollPane = new JScrollPane(textArea);
        labelComments.setBounds(80, 200, 100, 25);
        scrollPane.setBounds(20, 200, 200, 75);
        sPanel1.add(labelComments);
        sPanel2.add(scrollPane);

        // Creating and Adding Slider
        slider = new JSlider();
        slider.setBounds(20, 280, 200, 25);
        sPanel2.add(slider);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ControlsDemo();
    }
}
