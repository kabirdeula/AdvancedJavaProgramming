import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo {
    private JFrame frame;
    private JPanel cardPanel;
    private CardLayout cardLayout;
    private JButton nextButton;
    private JButton prevButton;

    public CardLayoutDemo() {
        frame = new JFrame("Card Layout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.setForeground(Color.WHITE);
        panel1.add(new JLabel("This is Panel 1"));

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.setForeground(Color.WHITE);
        panel2.add(new JLabel("This is Panel 2"));

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);
        panel3.setForeground(Color.WHITE);
        panel3.add(new JLabel("This is Panel 3"));

        cardPanel.add(panel1, "Panel 1");
        cardPanel.add(panel2, "Panel 2");
        cardPanel.add(panel3, "Panel 3");

        nextButton = new JButton("Next");
        prevButton = new JButton("Previous");

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });

        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(cardPanel);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CardLayoutDemo();
            }
        });
    }
}
