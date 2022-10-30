// Import two packages: .swing and .awt.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Title        : AnotherFrame.java
 * Description  : This class contains the derived frame of the object.
 *
 * @author Yida Tao
 * @version 1.5
 */
public class AnotherFrame extends JFrame
{
    // This string is to carry those information entered in the MyFrame.java.
    public String[] string = new String[10];
    // Instantiating three JPanels.
    JPanel jPanel1 = new JPanel();// jPanel1 is the heading of the frame, displaying the title with a jLabel.
    JPanel jPanel2 = new JPanel();// jPanel2 has a JTextArea, displaying the information entered in MyFrame.java.
    JPanel jPanel3 = new JPanel();// jPanel3 has a JButton: "Finish".
    // Instantiating a JTextArea, in order to display the information.
    JTextArea jTextArea = new JTextArea();// Used to display the information entered.

    /**
     * This method sets the first panel of the frame.
     */
    public void setjPanel1()
    {
        // Setting jPanel to BorderLayout, and setting the title on its center.
        jPanel1.setLayout(new BorderLayout());
        JLabel jLabel = new JLabel("You have checked in successfully.", JLabel.CENTER);
        jLabel.setFont(new Font("Arial", Font.BOLD, 20));
        jPanel1.add(jLabel, BorderLayout.CENTER);
    }

    /**
     * This method sets the second panel of the frame.
     */
    public void setjPanel2()
    {
        // Displaying the information obtained in MyFrame.java.
        jTextArea.append("Full name : " + string[0] + " " + string[1] + "\n" +
                "Date of birth : " + string[2] + " " + string[3] + "\n" +
                "Programme : " + string[4] + ", Year " + string[5] + "\n" +
                "Email : " + string[6] + "\n" +
                "Phone number : " + string[7] + "\n");
        // Therefore the JTextArea can change line automatically.
        jTextArea.setLineWrap(true);
        // Setting fonts of the JTextArea.
        jTextArea.setFont(new Font("Arial", Font.ITALIC, 15));
        jTextArea.setForeground(Color.BLACK);
        // Disabling edition of the JTextArea.
        jTextArea.setEditable(false);
        // Creating two borders with lower bevel.
        jPanel2.setBorder(BorderFactory.createLoweredBevelBorder());
        jTextArea.setBorder(BorderFactory.createLoweredBevelBorder());
        add(jTextArea);
    }

    /**
     * This method sets the third panel of the frame.
     */
    public void setjPanel3()
    {
        JButton jButton = new JButton("Finish");
        // When the button is pressed, it will quit the program.
        jButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        jPanel3.add(jButton);
    }

    /**
     * This method initials a new derived frame of the program.
     */
    public void initial()
    {
        new JFrame();
        setTitle("Check in complete!");
        setLocation(540, 120);
        setSize(540, 300);
        setResizable(false);
        setLayout(new BorderLayout(20, 0));
        setDefaultCloseOperation(AnotherFrame.EXIT_ON_CLOSE);

        add(jPanel1, BorderLayout.NORTH);
        add(jPanel2, BorderLayout.CENTER);
        add(jPanel3, BorderLayout.SOUTH);
        setjPanel1();
        setjPanel2();
        setjPanel3();
    }
}
