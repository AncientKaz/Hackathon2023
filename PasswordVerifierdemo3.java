
/**
 * Write a description of class k here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
  import javax.swing.*;
import java.security.*;
// import java.awt.event;
import java.awt.*;
import java.util.regex.*;
import java.util.*;


public class PasswordVerifierdemo3 
{

   public static void main (String [] args) throws Exception
    {
       
       
       /*******************************
        * Asks for User ID and Password
            using a String command.
        *******************************/
        Scanner n = new Scanner(System.in);
        String ID_User, ID_Password;
        System.out.print("Please enter your Username: ");
        ID_User = n.nextLine();
        
        System.out.print ("Password: ");
        ID_Password = n.nextLine();
        
            /* 
                ID_User = JOptionPane.showInputDialog (null, "Username:", "Input", JOptionPane.QUESTION_MESSAGE );
                ID_Passcode = JOptionPane.showInputDialog(null, "Passcode:", "Input", JOptionPane.QUESTION_MESSAGE );
            */
        
        /*******************************
         * Creating separate boolean code 
            for checking special char
            for username and password.
        ********************************/
            Pattern codepattern = Pattern.compile("[^a-zA-Z0-9]");
            Matcher codematch = codepattern.matcher(ID_Password);
            
            boolean passcontainsSpecial = codematch.find();
            for (int passcodeattempt = 0; passcodeattempt <2; passcodeattempt++) 
            {
                /*
                 * 
                if (passcontainsSpecial = false) 
                {
                    System.out.println("Username is accepted.");
                }
                */
                 
                if (passcontainsSpecial = true)
                {
                    //System.out.println("Passcode contains special characters! "+ "One attempt remaining.");
                    String retry = n.nextLine();
                }
                
                else if (passcodeattempt == 2) 
                {
                    System.out.println ("System locked due to multiple failed attempts. Try again later.");
                }
                
           if(PasswordV.isTrue(ID_Password))
          {
           //System.out.println("Valid password:");
           System.out.println("Passcode contains special characters! "+ "One attempt remaining.");
                    String retry = n.nextLine();
          }
           else
            {
           System.out.println("Invalid You have two attempts left");
            }
            
            if(PasswordV.isFalse(ID_Password))
            {
                 System.out.println("Try again"); 
            }
             else if(PasswordV.isFalse(ID_Password))
            {
               System.out.println("System lockout about to occur");
            }
    
                System.out.println("System error lockout");
        }
        /********************************
         * Creating similar statement for
            checking if the username 
            contains special characters.
        *********************************/
            Pattern userPattern = Pattern.compile("[^a-zA-Z0-9]");
            Matcher userMatch = userPattern.matcher(ID_User);
            
            boolean userContainsSpecial = userMatch.find();
            for (int userAttempt = 0; userAttempt <2; userAttempt++) 
            {
                if (userContainsSpecial = false) 
                {
                System.out.println("Your username " + ID_User + " contains special character "+ userMatch + " \n " + "One attempt remaining.");
                }
            }
            
        /**********************************************************************************************
            String encryptedID_User = null;
            try
            {
                // 
                MessageDigest user = MessageDigest.getInstance("MD5");
                // 
                user.update(ID_User.getBytes());
                // 
                byte[] bytes = user.digest();
                //
                StringBuilder abc = new StringBuilder();
                for (int i=0; i<bytes.length; i++)
                {
                    abc.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                }
                encryptedID_User = abc.toString();
                
            }
            catch (NoSuchAlgorithmException userf)
            {
                userf.printStackTrace();
            }
         String encryptedID_Password = null;
            try
            {
                // 
                MessageDigest pass = MessageDigest.getInstance("MD5");
                // 
                pass.update(ID_Passcode.getBytes());
                // 
                byte[] bytes1 = pass.digest();
                //
                StringBuilder abc = new StringBuilder();
                for (int i=0; i<bytes1.length; i++)
                {
                    abc.append(Integer.toString((bytes1[i] & 0xff) + 0x100, 16).substring(1));
                }
                encryptedID_Password = abc.toString();
                
            }
            catch (NoSuchAlgorithmException userfa)
            {
                userfa.printStackTrace();
            }
        *********************************************************************************************/
        /*    
            System.out.println("Username: " + ID_User +"\n" +
                    "Password: " + ID_Passcode);
            System.out.println("Username: " + encryptedID_User +"\n" +
                    "Password: " + encryptedID_Password);
        */
    }
    
}

