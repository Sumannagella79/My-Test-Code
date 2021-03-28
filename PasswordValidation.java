import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReading {
    public static void main(String args[]) throws FileNotFoundException{
      Scanner fileScan = new Scanner (new File("test.txt"));
      boolean found = false; // added this variable
      while (fileScan.hasNextLine()) {
        String input = fileScan.nextLine();
        String Username = input.substring(0,input.indexOf(' '));
        String Password = input.substring(input.indexOf(' ')+1,input.length());


        if ((Username.equals("suman")) && (Password.equals("nagella"))) {
          found = true; // added this to set found
          System.out.println("Success");

        } 
      }

      if(!found) { 
        System.out.println("failed");
      }
    }
}
