
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class HomePage {

        public static String[] list = CurrenciesList.theWayHome;
        public static String[] lineArray = new String[176];





        public static String[] getLineArray() {
                return lineArray;
        }

        public static void setLineArray(String[] lineArray) {
                HomePage.lineArray = lineArray;
        }

        public static void main(String[] args) throws IOException {
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
        button2.setBounds(400, 180, size2.width, size2.height);
        button3.setBounds(620, 310, 50, 50);
        JButton button4 = new JButton("Convert");
        Dimension size4 = button4.getPreferredSize();
        button4.setBounds(1000, 500, size4.width, size4.height);


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


        JLabel amount = new JLabel("Amount");
        amount.setBounds(150, 275, 200, 30);
        Font labelFont = amount.getFont();
        amount.setFont(new Font(labelFont.getName(), Font.PLAIN, 20));

        JLabel from = new JLabel("From");
        from.setBounds(400, 275, 200, 30);
        Font labelFont2 = from.getFont();
        from.setFont(new Font(labelFont2.getName(), Font.PLAIN, 20));

        JLabel to = new JLabel("To");
        to.setBounds(715, 275, 200, 30);
        Font labelFont3 = to.getFont();
        to.setFont(new Font(labelFont3.getName(), Font.PLAIN, 20));

        frame.add(amount);
        panel.add(amount);
        frame.add(from);
        panel.add(from);
        frame.add(to);
        panel.add(to);

        JTextField motto1 = new JTextField();
        motto1.setFont(motto1.getFont().deriveFont(Font.PLAIN, 20));
        motto1.setBounds(150, 325, 200, 30);
        frame.add(motto1);
        panel.add(motto1);
               /* BufferedReader input = new BufferedReader(new FileReader("/Users/christopher/Desktop/AlphaCurrencyList.txt"));
                ArrayList<String> strings = new ArrayList<String>();
                try {
                        String line = null;
                        while (( line = input.readLine()) != null){
                                strings.add(line);
                        }
                }

                catch (FileNotFoundException e) {
                        System.err.println("Error, file " + "/Users/christopher/Desktop/AlphaCurrencyList.txt" + " didn't exist.");
                }
                finally {
                        input.close();
                }
                String[] lineArray = strings.toArray(new String[]{});

                */


        JComboBox cb = new JComboBox(lineArray);
        cb.setFont(cb.getFont().deriveFont(Font.PLAIN, 20));
        cb.setBounds(400, 325, 180, 20);
        frame.add(cb);
        frame.setLayout(null);
        frame.setSize(400, 500);
        frame.setVisible(true);
        panel.add(cb);


        JComboBox cb2 = new JComboBox(lineArray);
        cb2.setFont(cb.getFont().deriveFont(Font.PLAIN, 20));
        cb2.setBounds(715, 325, 180, 20);
        frame.add(cb2);
        frame.setLayout(null);
        frame.setSize(400, 500);
        frame.setVisible(true);
        panel.add(cb2);


      }


}


