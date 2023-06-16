# Lab

| S.N. | Topic                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | Date       | Status |
| :--: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | :--------- | :----- |
|  1.  | [Write a program to create interface A in this interface we have two method method1 and method2. Implement this interface in another class named MyClass.](#lab-1)                                                                                                                                                                                                                                                                                                                                                                                                         | 2023/04/11 | ToDo   |
|  2.  | [Write a program for example of multiple catch statements occuring in a program.](#lab-2)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | 2023/04/11 | ToDo   |
|  3.  | [Write a program to create a dialogbox and menu.](#lab-3)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | 2023/04/13 | ToDo   |
|  4.  | [Write a program that will display checkboxes and option buttons they are numbered from 1 to 10. Use a textbox to display the number those corresponding boxes or button checked.](#lab-4)                                                                                                                                                                                                                                                                                                                                                                                 | 2023/04/13 | ToDo   |
|  5.  | [Write a program using swing components to add two numbers. Use text fields for inputs and output. Your program should display the result when the user presses a button.](#lab-5)                                                                                                                                                                                                                                                                                                                                                                                         | 2023/04/16 | ToDo   |
|  6.  | [Write a program to illustrate BorderLayout.](#lab-6)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | 2023/04/16 | ToDo   |
|  7.  | [Write a program to illustrate MouseEvent and MouseListener Interface.](#lab-7)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | 2023/04/18 | ToDo   |
|  8.  | [Write a program using JDBC to insert data to database.](#lab-8)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | 2023/04/18 | ToDo   |
|  9.  | [Write a program using JDBC to retrieve data from database.](#lab-9)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | 2023/04/21 | ToDo   |
| 10.  | [Write an example of PreparedStatement.](#lab-10)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | 2023/04/21 | ToDo   |
| 11.  | [Write an example of RowSet.](#lab-11)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | 2023/04/25 | ToDo   |
| 12.  | [Write a program to illustrate JavaBeans.](#lab-12)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | 2023/04/28 | ToDo   |
| 13.  | [Write a program using Servlet to print Hello. Also write the web.xml file.](#lab-13)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | 2023/05/02 | ToDo   |
| 14.  | [Write a program using Servlet to sum two numbers.](#lab-14)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | 2023/05/09 | ToDo   |
| 15.  | [Write a program using Servlet to set cookies values and get these values.](#lab-15)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | 2023/05/12 | ToDo   |
| 16.  | [Write a JSP program to display contents of data entered from any form.](#lab-16)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | 2023/05/16 | ToDo   |
| 17.  | [Write a JSP program to demonstrate exception handling.](#lab-17)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | 2023/05/30 | ToDo   |
| 18.  | [Write a JSP program to print "NCCS College" 10 times.](#lab-18)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | 2023/06/02 | ToDo   |
| 19.  | [Write a RMI program to subtract between two numbers.](#lab-19)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | 2023/06/06 | ToDo   |
| 20.  | [Write a program to design an interface containing fields User ID, Password and Account type, and buttons login, cancel, edit by mixing border layout and flow layout. Add events handling to the button login and cancel such that click in in login checks for matching user id and password in the database and opens another window if login checks for matching user id and password in the database and opens another window if login is successfuk and displays appropriate message if login is not successful. Clicking in cancel terminates our program](#lab-20) | 2023/06/09 | ToDo   |

## Lab 1

### Source Code

```java
interface InterfaceA {
    void method1();
    void method2();
}

public class MyClass implements InterfaceA{
    @Override
    public void method1(){
        System.out.println("Implementing method 1");
    }

    @Override
    public void method2(){
        System.out.println("Implementing method 2");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
    }
}
```

### Output

```
Implementing method 1
Implementing method 2
```

[Go to Top](#lab)

[Main File](/Lab/20230616/MyClass.java)

## Lab 2

### Source Code

```java
public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
```

### Output

```
ArithmeticException occurred: / by zero
```

[Go to Top](#lab)

[Main File](/Lab/20230616/MultipleCatchDemo.java)

## Lab 3

### Source Code

```java
import java.awt.event.*;
import javax.swing.*;

public class DialogBoxAndMenuDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dialog Box and Menu Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        
        JMenu fileMenu = new JMenu("File");
        
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);

        openItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Open Menu Item Selected.");
            }
        });

        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Save Menu Item Selected.");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}

```

### Output

![Output1](./images/0301.png)
![Output2](./images/0302.png)
![Output3](./images/0303.png)

[Go to Top](#lab)

[Main File](/Lab/20230616/DialogBoxAndMenuDemo.java)

## Lab 4

### Source Code

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckboxAndRadioButtonDemo {
    private JFrame frame;
    private JTextField textField;
    private JCheckBox[] checkboxes;
    private JRadioButton[] radioButtons;

    public CheckboxAndRadioButtonDemo() {
        frame = new JFrame("Checkbox and Radio Button Example.");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(12, 1));

        textField = new JTextField(10);

        JLabel checkboxLabel = new JLabel("Checkboxes: ");
        panel.add(checkboxLabel);

        checkboxes = new JCheckBox[10];
        for (int i = 0; i < checkboxes.length; i++) {
            checkboxes[i] = new JCheckBox("Checkbox " + (i + 1));
            checkboxes[i].addItemListener(new CheckboxListener());
            panel.add(checkboxes[i]);
        }

        JLabel radioButtonLabel = new JLabel("Radio Buttons: ");
        panel.add(radioButtonLabel);

        ButtonGroup buttonGroup = new ButtonGroup();
        radioButtons = new JRadioButton[10];
        for (int i = 0; i < radioButtons.length; i++) {
            radioButtons[i] = new JRadioButton("Option " + (i + 1));
            radioButtons[i].addItemListener(new RadioButtonListener());
            buttonGroup.add(radioButtons[i]);
            panel.add(radioButtons[i]);
        }

        panel.add(textField);

        frame.add(panel);
        frame.setVisible(true);
    }

    private class CheckboxListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            String selected = "";
            for (JCheckBox checkBox : checkboxes) {
                if (checkBox.isSelected()) {
                    selected += checkBox.getText() + " ";
                }
            }
            textField.setText(selected.trim());
        }
    }

    public class RadioButtonListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            String selected = "";
            for (JRadioButton radioButton : radioButtons) {
                if (radioButton.isSelected()) {
                    selected = radioButton.getText();
                    break;
                }
            }
            textField.setText(selected);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CheckboxAndRadioButtonDemo();
            }
        });
    }

}
```

### Output

![Output1](./images/0401.png)
![Output2](./images/0402.png)

[Go to Top](#lab)

[Main File](/Lab/20230616/CheckboxAndRadioButtonDemo.java)

## Lab 5

### Source Code

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingSum {
    private JFrame frame;
    private JTextField num1TextField, num2TextField, resultTextField;

    public SwingSum() {
        frame = new JFrame("Sum of Two Numbers.");
        frame.setSize(330, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setLayout(new GridLayout(4, 2));

        JLabel num1Label = new JLabel("Number 1:");
        num1TextField = new JTextField(10);
        panel.add(num1Label);
        panel.add(num1TextField);

        JLabel num2Label = new JLabel("Number 2:");
        num2TextField = new JTextField(10);
        panel.add(num2Label);
        panel.add(num2TextField);

        JButton addButton = new JButton("Sum");
        addButton.addActionListener(new ButtonListener());
        panel.add(addButton);

        JLabel resultLabel = new JLabel("Result:");
        resultTextField = new JTextField(10);
        resultTextField.setEditable(false);
        panel.add(resultLabel);
        panel.add(resultTextField);

        frame.add(panel);
        frame.setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int num1 = Integer.parseInt(num1TextField.getText());
                int num2 = Integer.parseInt(num2TextField.getText());
                int sum = num1 + num2;
                resultTextField.setText(String.valueOf(sum));
            } catch (Exception error) {
                JOptionPane.showMessageDialog(frame, "Invalid input! Please enter valid numbers.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingSum();
            }
        });
    }
}
```

### Output

![Output1](./images/0501.png)
![Output2](./images/0502.png)

[Go to Top](#lab)

[Main File](/Lab/20230616/SwingSum.java)

## Lab 6

### Source Code

```java
import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Demo");
        frame.setSize(400, 300);

        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton centerButton = new JButton("Center");
        
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(northButton, BorderLayout.NORTH);
        frame.add(centerButton, BorderLayout.CENTER);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(southButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
```

### Output

![Output](./images/06.png)

[Go to Top](#lab)

[Main File](/Lab/20230616/BorderLayoutDemo.java)

## Lab 7

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 8

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 9

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 10

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 11

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 12

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 13

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 14

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 15

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 16

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 17

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 18

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 19

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 20

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)
