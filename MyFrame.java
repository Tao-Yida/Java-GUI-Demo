// Import two packages: .swing and .awt.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Title        : MyFrame.java
 * Description  : This class contains the class for the original frame of the project.
 *
 * @author Yida Tao
 * @version 1.5
 */
public class MyFrame extends JFrame
{
    // Instantiating nine JPanels, from jPanel1 to jPanel9.
    JPanel jPanel1 = new JPanel();// jPanel1 is the heading of the frame, displaying the title with a jLabel.
    JPanel jPanel2 = new JPanel();// jPanel2 has 2 JTextFields, one to enter first name, and another to enter surname.
    JPanel jPanel3 = new JPanel();// jPanel3 has 2 JComboBoxes, which get the month and year of users' DoB.
    JPanel jPanel4 = new JPanel();// jPanel4 has 2 JComboBoxes, which get the programme and the grade of users.
    JPanel jPanel5 = new JPanel();// jPanel5 uses a JTextField to obtain users' email.
    JPanel jPanel6 = new JPanel();// jPanel6 uses a JTextField to obtain users' phone number.
    JPanel jPanel7 = new JPanel();// jPanel7 uses a JTextField to obtain users' booking reference code.
    JPanel jPanel8 = new JPanel();// jPanel8 has 2 JCheckBoxes for users to confirm the agreement and information.
    JPanel jPanel9 = new JPanel();// jPanel9 has 3 JButtons: "Next Step","Clear" and "Exit".

    // Calling 5 JTextFields, from jTextField1 to jTextField5, but not instantiated yet.
    JTextField jTextField1;// Obtain the users' first name.
    JTextField jTextField2;// Obtain the users' last name.
    JTextField jTextField3;// Obtain the users' email.
    JTextField jTextField4;// Obtain the users' phone number.
    JTextField jTextField5;// Obtain the users' booking reference number.

    // Calling 4 JComboBoxes, from jComboBox1 to jComboBox5, but not instantiated yet.
    JComboBox<String> jComboBox1;// Obtain the users' month of DoB.
    JComboBox<String> jComboBox2;// Obtain the users' year of DoB.
    JComboBox<String> jComboBox3;// Obtain the users' programme.
    JComboBox<String> jComboBox4;// Obtain the users' grade year.

    // Calling 2 JCheckBox, from jCheckBox1 to jCheckBox5, but not instantiated yet.
    JCheckBox jCheckBox1;// For user to agree the terms and conditions.
    JCheckBox jCheckBox2;// For user to confirm the correctness of the entered information.

    // Instantiating a object from class "AnotherFrame", setting up a connection of two classes.
    AnotherFrame anotherFrame = new AnotherFrame();

    /**
     * This method sets the first panel of the frame.
     */
    public void setjPanel1()
    {
        // Setting jPanel1 to BorderLayout, and setting the title on its center.
        jPanel1.setLayout(new BorderLayout());
        JLabel jLabel1 = new JLabel("Please complete the information below:", JLabel.CENTER);
        jLabel1.setFont(new Font("Arial", Font.BOLD, 20));
        jPanel1.add(jLabel1, BorderLayout.CENTER);
    }

    /**
     * This method sets the second panel of the frame.
     */
    public void setjPanel2()
    {
        jTextField1 = new JTextField(10);
        jTextField2 = new JTextField(10);
        // Creating three borders with titles.
        jPanel2.setBorder(BorderFactory.createTitledBorder("Name"));
        jTextField1.setBorder(BorderFactory.createTitledBorder("First Name"));
        jTextField2.setBorder(BorderFactory.createTitledBorder("Surname"));
        jPanel2.add(jTextField1);
        jPanel2.add(jTextField2);
    }

    /**
     * This method sets the third panel of the frame.
     */
    public void setjPanel3()
    {
        // Creating two String arrays, one containing months and another containing years.
        final String[] month = new String[]{"---", "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        final String[] year = new String[]{"---", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005"};
        jComboBox1 = new JComboBox<>(month);
        jComboBox2 = new JComboBox<>(year);
        // Creating three borders with titles.
        jPanel3.setBorder(BorderFactory.createTitledBorder("Date of Birth"));
        jComboBox1.setBorder(BorderFactory.createTitledBorder("Month"));
        jComboBox2.setBorder(BorderFactory.createTitledBorder("Year"));
        jPanel3.add(jComboBox1);
        jPanel3.add(jComboBox2);
    }

    /**
     * This method sets the fourth panel of the frame.
     */
    public void setjPanel4()
    {
        // Creating two String arrays, one containing programmes and another containing years of grade.
        final String[] course = new String[]{"---", "Telecommunications Engineering with Management",
                "E-Commerce Engineering with Law", "Internet of Things Engineering"};
        final String[] year = new String[]{"---", "1 ", "2 ", "3 ", "4 "};
        jComboBox3 = new JComboBox<>(course);
        jComboBox4 = new JComboBox<>(year);
        //Creating three borders, one with title and the other two without.
        jPanel4.setBorder(BorderFactory.createTitledBorder("Programme"));
        jComboBox3.setBorder(BorderFactory.createLoweredBevelBorder());
        jComboBox4.setBorder(BorderFactory.createLoweredBevelBorder());
        jPanel4.add(jComboBox3);
        jPanel4.add(jComboBox4);
    }

    /**
     * This method sets the fifth panel of the frame.
     */
    public void setjPanel5()
    {
        // Creating a text field with lowered bevel border.
        jTextField3 = new JTextField(30);
        // Creating a border with title.
        jPanel5.setBorder(BorderFactory.createTitledBorder("Email"));
        jTextField3.setBorder(BorderFactory.createLoweredBevelBorder());
        jPanel5.add(jTextField3);
    }

    /**
     * This method sets the sixth panel of the frame.
     */
    public void setjPanel6()
    {
        // Same as setJPanel5().
        jTextField4 = new JTextField(30);
        jPanel6.setBorder(BorderFactory.createTitledBorder("Phone Number"));
        jTextField4.setBorder(BorderFactory.createLoweredBevelBorder());
        jPanel6.add(jTextField4);
    }

    /**
     * This method sets the seventh panel of the frame.
     */
    public void setjPanel7()
    {
        //Same as setJPanel5().
        jTextField5 = new JTextField(8);
        jPanel7.setBorder(BorderFactory.createTitledBorder("Booking reference code"));
        jTextField5.setBorder(BorderFactory.createLoweredBevelBorder());
        jPanel7.add(jTextField5);
    }

    /**
     * This method sets the eighth panel of the frame.
     */
    public void setjPanel8()
    {
        // Creating two checkboxes.
        jCheckBox1 = new JCheckBox("I have read and agree the terms and conditions.");
        jCheckBox2 = new JCheckBox("I confirm that the information provided is correct.");
        jPanel8.add(jCheckBox1);
        jPanel8.add(jCheckBox2);
    }

    /**
     * This method sets the ninth panel of the frame.
     */
    public void setjPanel9()
    {
        // Creating three buttons
        JButton jButton1 = new JButton("Next Step");
        JButton jButton2 = new JButton("Clear");
        JButton jButton3 = new JButton("Exit");
        // Creating a panel border of lower bevel.
        jPanel9.setBorder(BorderFactory.createLoweredBevelBorder());
        // Defining what will happen when "Next Step" is pressed.
        jButton1.addActionListener(new ActionListener()
        {
            /**
             * This method will apply when the "Next Step" button is pressed, and then begin to obtain and check the
             * information.
             * @param e No specific meaning.
             */
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //After pressed, it first obtains the information entered, then checks if there are any errors.
                informationGet();
                informationCheck();
            }
        });
        // Defining what will happen when "Clear" is pressed.
        jButton2.addActionListener(new ActionListener()
        {
            /**
             * This method will apply when the "Clear" button is pressed, and then begin to reset all information and
             * restored the all borders to original form.
             * @param e No specific meaning.
             */
            @Override
            public void actionPerformed(ActionEvent e)
            {
                informationReset();
                borderReset();
            }
        });
        // Defining what will happen when "Exit" is pressed.
        jButton3.addActionListener(new ActionListener()
        {
            /**
             * This method will apply when the "Exit" button is pressed, and then quit from the program and close all
             * the windows.
             * @param e No specific meaning.
             */
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        jPanel9.add(jButton1);
        jPanel9.add(jButton2);
        jPanel9.add(jButton3);
    }

    /**
     * This method obtains the information entered.
     */
    private void informationGet()
    {
        anotherFrame.string[0] = jTextField1.getText();
        anotherFrame.string[1] = jTextField2.getText();
        anotherFrame.string[2] = (String) jComboBox1.getSelectedItem();
        anotherFrame.string[3] = (String) jComboBox2.getSelectedItem();
        anotherFrame.string[4] = (String) jComboBox3.getSelectedItem();
        anotherFrame.string[5] = (String) jComboBox4.getSelectedItem();
        anotherFrame.string[6] = jTextField3.getText();
        anotherFrame.string[7] = jTextField4.getText();
        anotherFrame.string[8] = jTextField5.getText();
    }

    /**
     * This method erased all the information entered.
     */
    private void informationReset()
    {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
    }

    /**
     * This method resets all the borders to their original form if reddened.
     */
    public void borderReset()
    {
        jTextField1.setBorder(BorderFactory.createTitledBorder("First Name"));
        jTextField2.setBorder(BorderFactory.createTitledBorder("Surname"));
        jComboBox1.setBorder(BorderFactory.createTitledBorder("Month"));
        jComboBox2.setBorder(BorderFactory.createTitledBorder("Year"));
        jComboBox3.setBorder(BorderFactory.createLoweredBevelBorder());
        jComboBox4.setBorder(BorderFactory.createLoweredBevelBorder());
        jTextField3.setBorder(BorderFactory.createLoweredBevelBorder());
        jTextField4.setBorder(BorderFactory.createLoweredBevelBorder());
        jTextField5.setBorder(BorderFactory.createLoweredBevelBorder());
        jCheckBox1.setForeground(Color.BLACK);
        jCheckBox2.setForeground(Color.BLACK);


    }

    /**
     * This method checks the information entered. If an error occurs, the relevant border will be reddened to
     * highlight the position.
     */
    private void informationCheck()
    {
        // check1 is the index of "@" that first appears.
        int check1 = anotherFrame.string[6].indexOf("@");
        // check2 is the index of "." that first appears.
        int check2 = anotherFrame.string[6].indexOf(".");
        /*A try-catch, which is used to detect the syntax of the phone number entered. If the number entered
        contains not-digit, it will show an error message window.*/
        long check3;
        try
        {
            check3 = Long.parseLong(anotherFrame.string[7]);
        } catch (Exception e)
        {
            check3 = -1;
        }
        // If any of these errors happen, the error message window will come up, stopping the next movement.
        if (anotherFrame.string[0].equals("") || anotherFrame.string[1].equals("") ||
                anotherFrame.string[2].equals("---") || anotherFrame.string[3].equals("---") ||
                anotherFrame.string[4].equals("---") || anotherFrame.string[5].equals("---") ||
                anotherFrame.string[6].equals("") || anotherFrame.string[7].equals("") ||
                anotherFrame.string[8].equals("") || !jCheckBox1.isSelected() || !jCheckBox2.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Please fill the missing information.",
                    "Missing Information", JOptionPane.ERROR_MESSAGE);
            borderReset();
            checkErrorSeparately();
        }
        /* This part is in order to check the syntax of email,which must contain a "@" and a ".". If the email entered
         doesn't have "@" or "." or there is a "@." or the "." appears before "@", the program will show an error
          message window. */
        else if (check1 == 0 || check1 == -1 || check2 == 0 || check2 == -1 || check2 - check1 == 1 || check2 < check1)
        {
            borderReset();
            JOptionPane.showMessageDialog(null, "Wrong email syntax! Please check your information.",
                    "Missing Information", JOptionPane.ERROR_MESSAGE);
            jTextField3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED, 2)));
        }
        // This part is to check the syntax of phone number.
        else if (check3 == -1)
        {
            borderReset();
            JOptionPane.showMessageDialog(null, "Wrong phone number syntax! Please check your information.",
                    "Missing Information", JOptionPane.ERROR_MESSAGE);
            jTextField4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED, 2)));
        }
        // If there are no errors, it will show an information confirming window.
        else
        {
            borderReset();
            Object[] confirm = new Object[]{"No", "Yes"};
            int option = JOptionPane.showOptionDialog(null,
                    "Have you checked all information is correct? You can't change the information once the " +
                            "information is submitted.", "Confirm check in?", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, confirm, confirm[0]);
            // If pressed "Yes", it will initialize a "AnotherFrame" object, then show it.
            if (option == 1)
            {
                anotherFrame.initial();
                anotherFrame.setVisible(true);
                setVisible(false);
            }
            // If pressed "No", it will close the confirming window, and the user can recheck its data.
            if (option == 0)
            {
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        }
    }

    /**
     * This method is to find the accurate position where the error happened. When a error detected, its border will
     * be reddened.
     */
    private void checkErrorSeparately()
    {
        if (anotherFrame.string[0].equals(""))
            jTextField1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED, 2),
                    "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
                            TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        if (anotherFrame.string[1].equals(""))
            jTextField2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED, 2),
                    "Surname", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
                            TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        if (anotherFrame.string[2].equals("---"))
            jComboBox1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED, 2),
                    "Month", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
                            TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        if (anotherFrame.string[3].equals("---"))
            jComboBox2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED, 2),
                    "Year", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
                            TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        if (anotherFrame.string[4].equals("---"))
            jComboBox3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED, 2)));
        if (anotherFrame.string[5].equals("---"))
            jComboBox4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED, 2)));
        if (anotherFrame.string[6].equals(""))
            jTextField3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED, 2)));
        if (anotherFrame.string[7].equals(""))
            jTextField4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED, 2)));
        if (anotherFrame.string[8].equals(""))
            jTextField5.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED, 2)));
        if (!jCheckBox1.isSelected())
        {
            jCheckBox1.setForeground(Color.RED);
        }
        if (!jCheckBox2.isSelected())
        {
            jCheckBox2.setForeground(Color.RED);
        }
    }

    /**
     * This method initials a new original frame of the program.
     */
    public void initial()
    {
        new JFrame();

        setTitle("Workshop CheckIn");
        setLocation(520, 60);
        setSize(480, 720);
        setLayout(new GridLayout(9, 1));
        setResizable(false);
        setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);

        add(jPanel1);
        add(jPanel2);
        add(jPanel3);
        add(jPanel4);
        add(jPanel5);
        add(jPanel6);
        add(jPanel7);
        add(jPanel8);
        add(jPanel9);
        setjPanel1();
        setjPanel2();
        setjPanel3();
        setjPanel4();
        setjPanel5();
        setjPanel6();
        setjPanel7();
        setjPanel8();
        setjPanel9();
        setVisible(true);
    }
}
