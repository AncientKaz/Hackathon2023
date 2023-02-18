package hackathon;

import javax.swing.*;
import java.security.*;
// import java.awt.event;
import java.awt.*;


public class Hackathon {

   public static void main (String [] args) throws Exception
    {

        String ID_User, ID_Passcode;
            ID_User = JOptionPane.showInputDialog (null, "Username:", "Input", JOptionPane.QUESTION_MESSAGE );
            ID_Passcode = JOptionPane.showInputDialog(null, "Passcode:", "Input", JOptionPane.QUESTION_MESSAGE );
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
        /*    
            System.out.println("Username: " + ID_User +"\n" +
                    "Password: " + ID_Passcode);
            System.out.println("Username: " + encryptedID_User +"\n" +
                    "Password: " + encryptedID_Password);
        */
    }
    
}
