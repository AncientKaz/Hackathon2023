
/**
 * Write a description of class Password here.
 *
 * @author (Virgil Bryant III)
 * @version (3/2/21)
 */

public class PasswordV
{
  public static boolean isTrue(String Password)
  {
      if (Password.length() >= 8 && isUppercase(Password) && isLowercase(Password) && isDigit(Password)) 
      {
            return true;
 
      }
      else
      {
          return false;
      }
      
  } 
    
  public static boolean isFalse(String Password)
  {
      if (Password.length() >= 7 && isUppercase(Password) && isLowercase(Password) && isDigit(Password)) 
      {
          return false;
      }
      else
      {
          return true;
      }
  }
  public static boolean isUppercase(String Password)
  {
       boolean status=false;
       for (int i = 0; i < Password.length(); i++) 
       {
           char P=Password.charAt(i);
           if (Character.isUpperCase(Password.charAt(i))) 
            status=true;
       }
       return status;
  } 
  
  public static boolean isLowercase( String Password)
  {
     boolean status=false;
     for (int i = 0; i < Password.length(); i++) 
     {
         char P=Password.charAt(i);
         if(Character.isLowerCase(Password.charAt(i)))
         status=true;
     }
     return status;
  }
  
  public static boolean isDigit( String Password)
  {
      boolean status=false;
      for (int i = 0; i < Password.length(); i++) 
      {
          char P=Password.charAt(i);
          if(Character.isDigit(Password.charAt(i)))
          status=true;
      }
      return status;
  }
}  
  
/*  if (Password.length() < 6) 
        {
            return false;
        }
        else
        {
 * 
 * String str="Kingl1";
       
       char[] Password= new char[6];
       str.getChars( 0,6,Password,0);
       System.out.println(Password);*/
