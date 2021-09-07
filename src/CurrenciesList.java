import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.Scanner;

public class CurrenciesList extends HomePage {

    public static String []theWayHome;

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
           System.err.println("Error, file " + "/Users/christopher/Desktop/AlphaCurrencyList" + " didn't exist.");
       }
       finally {
           input.close();
       }

      theWayHome = strings.toArray(new String[]{});


   }

}
