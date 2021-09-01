
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage implements ActionListener {
private int clicks = 0;
private JLabel label = new JLabel("Number of clicks: 0 ");
private JFrame frame = new JFrame();

public HomePage(){

    JButton button = new JButton("Conversion");
    JButton button2 = new JButton("Live Exchange Rates");
    JButton button3 = new JButton("Historical Exchange Rates");
    button.addActionListener(this);

    JTextField dollarAmount = new JTextField("");
    JTextField countryFrom = new JTextField("");
    JTextField countryTo = new JTextField("");

    JPanel panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(220, 320, 200, 350));
    panel.setLayout(new GridLayout(0, 1));
    panel.add(button);
    panel.add(button2);
    panel.add(button3);
    panel.add(dollarAmount);
    panel.add(countryFrom);
    panel.add(countryTo);
    panel.add(label);

    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Currency Converter");
    frame.pack();
    frame.setVisible(true);

}

public void actionPerformed(ActionEvent e) {
    clicks++;
    label.setText("Number of clicks: " + clicks);
}

public static void main(String[] args){
    new HomePage();
}

}
