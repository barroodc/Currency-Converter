import java.io.*;
import java.util.ArrayList;

public class CurrenciesList extends HomePage {


   public static void Currency() throws IOException {
       BufferedReader input = new BufferedReader(new FileReader("/Users/christopher/Desktop/AlphaCurrencyList.txt"));
       ArrayList<String> strings = new ArrayList<String>();
       try {
           String line = null;
           while (( line = input.readLine()) != null){
               strings.add(line);
               testList.add(strings);
           }
       }

       catch (FileNotFoundException e) {
           System.err.println("Error, file " + "/Users/christopher/Desktop/AlphaCurrencyList.txt" + " didn't exist.");
       }
       finally {
           input.close();
       }
       String[] lineArray = strings.toArray(new String[]{});
       //Can potentially put the Jcomboboxes over here.


   }


}
