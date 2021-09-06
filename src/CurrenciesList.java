import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CurrenciesList {

   public static void Currency() throws FileNotFoundException {
       File file = new File("/Users/christopher/Desktop/AlphaCurrencyList.txt");
       Scanner sc = new Scanner(file);

       ArrayList<String> alphaList = new ArrayList<>();

       while (sc.hasNext()){
           alphaList.add(sc.nextLine());
       }
       String[] finalAlphaList = alphaList.toArray(new String[alphaList.size()]);


   }

    public static void main(String[] args) throws FileNotFoundException {
       Currency();
    }
}
