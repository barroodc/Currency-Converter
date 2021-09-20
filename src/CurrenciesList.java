import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class CurrenciesList {



    public static class CustomComboBoxDemo extends JPanel {
        ImageIcon[] images;
        String s = "AbkhazianApsar(ABK)\n" +
                "AfghanistanAfghani(AFN)\n" +
                "AlbanianLek(ALL)\n" +
                "AlderneyPound(none)\n" +
                "AlgerianDinar(DZD)\n" +
                "AndorranFranc(ADF)\n" +
                "AndorranPeseta(ADP)\n" +
                "AngolanKwanza(AOA)\n" +
                "AngolanOldKwanza(AON)\n" +
                "ArgentinePeso(ARS)\n" +
                "ArmenianDram(AMD)\n" +
                "ArtsakhDram(none)\n" +
                "ArubanFlorin(AWG)\n" +
                "AustralianDollar(AUD)\n" +
                "AustrianSchilling(ATS)\n" +
                "AzerbaijaninewManat(AZN)\n" +
                "AzerbaijanOldManat(AZM)\n" +
                "BahamianDollar(BSD)\n" +
                "BahrainiDinar(BHD)\n" +
                "BangladeshiTaka(BDT)\n";
        String[] countries = s.split("\\s");


        public CustomComboBoxDemo() throws IOException {

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


            JComboBox countriesList = new JComboBox(intArray);
            countriesList.setFont(countriesList.getFont().deriveFont(Font.PLAIN, 20));
            countriesList.setBounds(300, 325, 2000, 20);
            ComboBoxRenderer renderer= new ComboBoxRenderer();
            renderer.setPreferredSize(new Dimension(200, 130));
            countriesList.setRenderer(renderer);
            countriesList.setMaximumRowCount(3);


            add(countriesList, BorderLayout.PAGE_START);
            setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        }

        protected static ImageIcon createImageIcon(String path) {
            java.net.URL imgURL = CustomComboBoxDemo.class.getResource(path);
            if (imgURL != null) {
                return new ImageIcon(imgURL);
            } else {
                System.err.println("Couldn't find file: " + path);
                return null;
            }
        }

        private static void createAndShowGUI() throws IOException {

            JFrame.setDefaultLookAndFeelDecorated(true);


            JFrame frame = new JFrame("Currency Converter");
            JButton hERates = new JButton("Historical Exchange Rates");
            Dimension size = hERates.getPreferredSize();
            hERates.setBounds(50, 180, size.width, size.height);
            JButton lERates = new JButton("Live Exchange Rates");
            Dimension size2 = lERates.getPreferredSize();
            lERates.setBounds(300, 180, size2.width, size2.height);
            Icon icon = new ImageIcon("/Users/christopher/Desktop/switch1.png");
            JButton theSwitch = new JButton(icon);


            JComponent newContentPane = new CustomComboBoxDemo();
            newContentPane.setOpaque(true); //content panes must be opaque
            frame.setContentPane(newContentPane);
            frame.add(hERates);
            frame.add(lERates);
            frame.add(theSwitch);


            frame.pack();
            frame.setVisible(true);
        }

        public static void main(String[] args) {

            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    try {
                        createAndShowGUI();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
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
                if (uhOhFont == null) {
                    uhOhFont = normalFont.deriveFont(Font.ITALIC);
                }
                setFont(uhOhFont);
                setText(uhOhText);
            }
        }
    }
}
