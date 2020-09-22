import java.util.Scanner;

public class Main {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
      if (ch >= 65 && ch <= 90) {
        return Character.toLowerCase(ch);
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
      char[] ch = str.toCharArray();
         
      for(int i=0;i<ch.length;i++){    
        int chi = ch[i]; 
        System.out.println("char");
      
        
        if (chi >= 65 && chi <= 90) {
          int y = chi + 32;
          char x = (char) y;
          return w + x;
        }
        if (chi >= 97 && chi <= 122) {
          char x = (char) chi;
          return w + x;
          
        }
        else {
          System.out.print("wrong input: ");
        }
        
      }
      return w;
      
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
      if (ch >= 65 && ch <= 90) {
        return ch;
      }
      if (ch >= 97 && ch <= 122) {
        return Character.toUpperCase(ch);
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
      char[] ch = str.toCharArray();
         
      for(int i=0;i<ch.length;i++){    
        int chi = ch[i]; 
        System.out.println("char");
      
        
        if (chi >= 65 && chi <= 90) {
          
          char x = (char) y;
          return w + x;
        }
        if (chi >= 97 && chi <= 122) {
            int y = chi - 32;
          char x = (char) chi;
          return w + x;
          
        }
        else {
          System.out.print("wrong input: ");
        }
        
      }
      return w;
      
    }
        // REPLACE WITH YOUR CODE HERE
        return "";
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