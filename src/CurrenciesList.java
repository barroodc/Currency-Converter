import java.io.*;
import java.util.ArrayList;

public class CurrenciesList extends HomePage {

    public static String[] lineArray;



    public static void Currency() throws IOException {
       BufferedReader input = new BufferedReader(new FileReader("/Users/christopher/Desktop/AlphaCurrencyList.txt"));
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
       lineArray = strings.toArray(new String[]{});
       //Can potentially put the Jcomboboxes over here.
       
   }
}
