/*Date:April.13th, 2017
*Author: Sophie Du
*Discription:This program uses GUI in java to create a calculator that calculates the hypotenuse of a right angled triangle. 
User can enter the 2 known sides of a triangle and get its hypotenuse value right away!
*/

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class hypotenuseCalculator extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JButton ok = new JButton("OK");
    JTextField sideA, sideB, sideC;

    public void actionPerformed(ActionEvent e) {
      DecimalFormat df = new DecimalFormat("#.00");
        Double a = Double.valueOf(sideA.getText().toString());
        Double b = Double.valueOf(sideB.getText().toString());
        Double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        sideC.setText(df.format(c));
    }
    public void createFrame() {
        ok.addActionListener(this);
        //Creating the Frame
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);

        JLabel labelA = new JLabel("Side A");
        sideA = new JTextField(10); // accepts upto 10 characters
        JLabel labelB = new JLabel("Side B");
        sideB = new JTextField(10); // accepts upto 10 characters
        JLabel labelC = new JLabel("Side C");
        sideC = new JTextField(10); // accepts upto 10 characters

        panel.add(labelA); // Components Added using Flow Layout
        panel.add(sideA);
        panel.add(labelB); // Components Added using Flow Layout
        panel.add(sideB);
        panel.add(labelC); // Components Added using Flow Layout
        panel.add(sideC);
        panel.add(ok);
        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
    }
    public static void main(String args[]) {
      hypotenuseCalculator gui = new hypotenuseCalculator();
      gui.createFrame();
    }
}
