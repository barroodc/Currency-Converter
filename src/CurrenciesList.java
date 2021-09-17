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

    public static void main(String[] args){
        CurrenciesList go = new CurrenciesList();
        go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        go.setSize(300,200);
        go.setVisible(true);
    }

}


class Flags {


    public static class CustomComboBoxDemo extends JPanel {
        ImageIcon[] images;
        String[] countries = {"USA", "Canada", "Montreal", "Iran", "Lebanon"};

        public CustomComboBoxDemo() {
            super(new BorderLayout());

            //Load the pet images and create an array of indexes.
            images = new ImageIcon[countries.length];
            Integer[] intArray = new Integer[countries.length];
            for (int i = 0; i < countries.length; i++) {
                intArray[i] = new Integer(i);
                images[i] = createImageIcon("png/paraguay.png");
                if (images[i] != null) {
                    images[i].setDescription(countries[i]);
                }
            }

            JComboBox petList = new JComboBox(intArray);
            ComboBoxRenderer renderer= new ComboBoxRenderer();
            renderer.setPreferredSize(new Dimension(200, 130));
            petList.setRenderer(renderer);
            petList.setMaximumRowCount(3);


            add(petList, BorderLayout.PAGE_START);
            setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        }

        /** Returns an ImageIcon, or null if the path was invalid. */
        protected static ImageIcon createImageIcon(String path) {
            java.net.URL imgURL = CustomComboBoxDemo.class.getResource(path);
            if (imgURL != null) {
                return new ImageIcon(imgURL);
            } else {
                System.err.println("Couldn't find file: " + path);
                return null;
            }
        }

        private static void createAndShowGUI() {
            JFrame.setDefaultLookAndFeelDecorated(true);

            JFrame frame = new JFrame("CustomComboBoxDemo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JComponent newContentPane = new CustomComboBoxDemo();
            newContentPane.setOpaque(true);
            frame.setContentPane(newContentPane);

            frame.pack();
            frame.setVisible(true);
        }

        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
        }

        class ComboBoxRenderer extends JLabel
                implements ListCellRenderer {
            private Font uhOhFont;

            public ComboBoxRenderer() {
                setOpaque(true);
                setHorizontalAlignment(CENTER);
                setVerticalAlignment(CENTER);
            }

            public Component getListCellRendererComponent(
                    JList list,
                    Object value,
                    int index,
                    boolean isSelected,
                    boolean cellHasFocus) {

                int selectedIndex = ((Integer)value).intValue();

                if (isSelected) {
                    setBackground(list.getSelectionBackground());
                    setForeground(list.getSelectionForeground());
                } else {
                    setBackground(list.getBackground());
                    setForeground(list.getForeground());
                }


                ImageIcon icon = images[selectedIndex];
                String pet = countries[selectedIndex];
                setIcon(icon);
                if (icon != null) {
                    setText(pet);
                    setFont(list.getFont());
                } else {
                    setUhOhText(pet + " (no image available)",
                            list.getFont());
                }

                return this;
            }

            protected void setUhOhText(String uhOhText, Font normalFont) {
                if (uhOhFont == null) { //lazily create this font
                    uhOhFont = normalFont.deriveFont(Font.ITALIC);
                }
                setFont(uhOhFont);
                setText(uhOhText);
            }
        }
    }
}

