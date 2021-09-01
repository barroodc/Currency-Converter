
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage {

public HomePage(){

    JFrame f = new JFrame("Hello");

    JPanel MyPanel = new JPanel();

    MyPanel.setLayout( new FlowLayout() );

    JButton liveExchangeRate = new JButton("Live Exchange Rate");
    JButton historicalExchangeRate = new JButton("Historical Exchange Rate");
    Icon icon = new ImageIcon("/Users/christopher/Desktop/switch1.png");
    JButton flipConversions = new JButton(icon);

    JButton convert = new JButton("Convert");
    MyPanel.add(liveExchangeRate);
    MyPanel.add(historicalExchangeRate);
    MyPanel.add(flipConversions);
    MyPanel.add(convert);

    f.getContentPane().add(MyPanel, "Center");
    f.setSize(300, 300);
    f.setVisible(true);

}

public static void main(String[] args){
    new HomePage();
}

}
