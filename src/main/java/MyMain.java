import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
      if (ch >= 65 && ch <= 90) {
        ch = (char) (ch + 32);
        return ch;
      }
      if (ch >= 97 && ch <= 122) {
        return ch;
      }
      else {
        System.out.print("wrong input: ");
      }
      return ch;
        
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
     String w = " ";
     for (int i = 0; i < str.length(); i++){
       char axe = str.charAt(i);
       if (axe >= 65 && axe <= 90) {
         axe = (char) (axe + 32);
       }
       w = w + axe;
     }
     return(w);
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
      if (ch >= 65 && ch <= 90) {
        return ch;
      }
      if (ch >= 97 && ch <= 122) {
        ch = (char) (ch - 32);
        return ch;
      }
      else {
        System.out.print("wrong input: ");
      }
      return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
      String w = " ";
      for (int i = 0; i < str.length(); i++){
        char axe = str.charAt(i);
        if (axe >= 97 && axe <= 122) {
          axe = (char) (axe - 32);
        }
        w = w + axe;
      }
      return(w);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char y = 'A';
        char z = 'y';
        System.out.println(toUpper(z));
        System.out.println(toLower(y));

        System.out.print("Please enter a string: ");
        String x = scan.nextLine();
        System.out.println("this in uppercase is: " + myToUpperCase(x));
        System.out.println("this in lowercase is: " + myToLowerCase(x));
    }
        
        
    }