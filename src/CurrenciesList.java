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



        /*
         * Despite its use of EmptyBorder, this panel makes a fine content
         * pane because the empty border just increases the panel's size
         * and is "painted" on top of the panel's normal background.  In
         * other words, the JPanel fills its entire background if it's
         * opaque (which it is by default); adding a border doesn't change
         * that.
         */
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


            //Create the combo box.
            JComboBox countriesList = new JComboBox(intArray);
            countriesList.setFont(countriesList.getFont().deriveFont(Font.PLAIN, 20));
            countriesList.setBounds(300, 325, 2000, 20);
            ComboBoxRenderer renderer= new ComboBoxRenderer();
            renderer.setPreferredSize(new Dimension(200, 130));
            countriesList.setRenderer(renderer);
            countriesList.setMaximumRowCount(3);


            //Lay out the demo.
            add(countriesList, BorderLayout.PAGE_START);
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

        /**
         * Create the GUI and show it.  For thread safety,
         * this method should be invoked from the
         * event-dispatching thread.
         */
        private static void createAndShowGUI() throws IOException {
            //Make sure we have nice window decorations.
            JFrame.setDefaultLookAndFeelDecorated(true);

            //Create and set up the window.
            JFrame frame = new JFrame("Currency Converter");
            JButton button = new JButton();
            //frame.setVisible(true);

            //Create and set up the content pane.
            JComponent newContentPane = new CustomComboBoxDemo();
            newContentPane.setOpaque(true); //content panes must be opaque
            frame.setContentPane(newContentPane);

            //Display the window.
            frame.pack();
            frame.setVisible(true);
        }

        public static void main(String[] args) {
            //Schedule a job for the event-dispatching thread:
            //creating and showing this application's GUI.
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



            /*
             * This method finds the image and text corresponding
             * to the selected value and returns the label, set up
             * to display the text and image.
             */
            public Component getListCellRendererComponent(
                    JList list,
                    Object value,
                    int index,
                    boolean isSelected,
                    boolean cellHasFocus) {
                //Get the selected index. (The index param isn't
                //always valid, so just use the value.)
                int selectedIndex = ((Integer)value).intValue();

                if (isSelected) {
                    setBackground(list.getSelectionBackground());
                    setForeground(list.getSelectionForeground());
                } else {
                    setBackground(list.getBackground());
                    setForeground(list.getForeground());
                }

                //Set the icon and text.  If icon was null, say so.
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

            //Set the font and text when no image was found.
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
