
/**
 * Write a description of class hack2 here.
 * Crerate an onion layered encryption code that gives the user 3 attempts
 * @author (Virgil Bryant III)
 * @version (2/17/23)
 */
import java.util.Scanner;

public class PasswordVerifierdemo2
{
   public static void main (String [] args)
  {
    Scanner in= new Scanner(System.in);
    String str;
    System.out.println("Please enter a 8 character Password:");
    String Password= in.nextLine();
    
    
  
     if(PasswordV.isTrue(Password))
    {
      System.out.println("Valid password:");
    }
     else
    {
      System.out.println("Invalid You have two attempts left");
    }
    if(PasswordV.isFalse(Password))
    {
       System.out.println("Try again"); 
    }
    else if(PasswordV.isFalse(Password))
    {
        System.out.println("System lockout about to occur");
    }
    
    
    
    
    
    
  for (int passAttempts = 0; passAttempts < 2; passAttempts++) 
  {
    System.out.println(" Invalid 1 attempt remaining.");
      String inputPass = in.nextLine();

  }
  //System.out.println("You now have ONE attempt left !!!!");
  
  System.out.println("Last attempt invalid");
  
  System.out.println("System error lockout");
}
}