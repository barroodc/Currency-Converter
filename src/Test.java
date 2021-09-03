import javax.swing.*;
import java.awt.*;

public class Test {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Currency Converter");
        JPanel panel = new JPanel();
        frame.getContentPane();
        JButton button = new JButton("Historical Exchange Rates");
        JButton button2 = new JButton("Live Exchange Rates");
        Dimension size = button.getPreferredSize();
        Icon icon = new ImageIcon("/Users/christopher/Desktop/switch1.png");
        JButton button3 = new JButton(icon);
        button.setBounds(150, 180, size.width, size.height);
        Dimension size2 = button2.getPreferredSize();
        button2.setBounds(400,180,size2.width,size2.height);
        button3.setBounds(600,300,50,50);
        JButton button4 = new JButton("Convert");
        Dimension size4 = button4.getPreferredSize();
        button4.setBounds(1000,500,size4.width,size4.height);

        panel.setLayout(null);
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(1200, 600);
        frame.setVisible(true);
    }

}
