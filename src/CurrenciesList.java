import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CurrenciesList extends JFrame {

    private JComboBox box;
    private JLabel picture;

    InputStream file = ClassLoader.class.getResourceAsStream("resources/chart.png");

    private static String[] filename = {"/Users/christopher/Desktop/Abkhazian.png"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0]))};

    public CurrenciesList(){
        super("Currency Converter");
        setLayout(new FlowLayout());

        box = new JComboBox(filename);

        box.addItemListener(
                new ItemListener() {
                    public void itemStateChanged(ItemEvent event){
                        if (event.getStateChange() == ItemEvent.SELECTED)
                            picture.setIcon(pics[box.getSelectedIndex()]);
                    }
                }
        );

        add(box);
        picture = new JLabel(pics[0]);
        add(picture);
    }

}
