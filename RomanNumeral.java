//importing Scanner class
import java.util.Scanner;

//creating a class RomanNumerals
public class RomanNumeral
{
   //Creating main method
   public static void main(String[] args)
   {
   
      //Creating Scanner object
      Scanner in = new Scanner(System.in);
      
      //displaying header
      System.out.println("Do You Know the Roman Numerals?");
      System.out.println("===============================\n");
      
      System.out.println("+------------------------------------+");
      System.out.println("|           Roman Numerals           |");
      System.out.println("+------------------------------------+");
      System.out.println("| 1   5   10   50   100   500   1000 |");
      System.out.println("+------------------------------------+");
      System.out.println("| I   V   X    L    C     D     M    |");
      System.out.println("+------------------------------------+\n");
      
      
      //asking for user choice number
      System.out.print("Enter a number (1 - 3999) : ");
      String number = in.nextLine();
      
      //asking user to enter roman numeral of their choice number 
      System.out.print("\nEnter the Roman numeral of " + number +": ");
      String userGuess = in.nextLine();
      
      //making a copy of user input for displaying output purposes
      String numberCopy= number;
      
      //initilizing an empty string to store the roman numeral value
      String romanNumerals="";
      
      /*determining the length of user input and arranging all as string
      of length '4' by adding space characters.*/
      
      if (number.length()==3)
      {
         number=" "+number;
      }
      
      else if (number.length()==2)
      {
         number="  "+number;
      }
      else if (number.length()==1)
      {
         number="   "+number;
      }
   
   
      //THOUSANDS
      
      if (number.substring(0,1).equals("1"))
      {
         romanNumerals = romanNumerals +"M";
      } 
         
      else if (number.substring(0,1).equals("2"))
      {
         romanNumerals = romanNumerals + "MM";
      }
         
      else if (number.substring(0,1).equals("3"))
      {
         romanNumerals = romanNumerals + "MMM";
      }
           
      
      
      //HUNDREDS
      if (number.substring(1,2).equals("1"))
      {
         romanNumerals = romanNumerals +"C";
      } 
         
      else if (number.substring(1,2).equals("2"))
      {
         romanNumerals = romanNumerals + "CC";
      }
         
      else if (number.substring(1,2).equals("3"))
      {
         romanNumerals = romanNumerals + "CCC";
      }
         
      else if (number.substring(1,2).equals("4"))
      {
         romanNumerals = romanNumerals + "CD";
      }
         
      else if (number.substring(1,2).equals("5"))
      {
         romanNumerals = romanNumerals + "D";
      }
         
      else if (number.substring(1,2).equals("6"))
      {
         romanNumerals = romanNumerals +"DC";
      } 
         
      else if (number.substring(1,2).equals("7"))
      {
         romanNumerals = romanNumerals + "DCC";
      }
         
      else if (number.substring(1,2).equals("8"))
      {
         romanNumerals = romanNumerals + "DCCC";
      }
         
      else if (number.substring(1,2).equals("9"))
      {
         romanNumerals = romanNumerals + "CM";
      }
      else if (number.substring(1,2).equals("0"))
      {
         romanNumerals = romanNumerals;
      }
   
   
      
      //TENS
      if (number.substring(2,3).equals("1"))
      {
         romanNumerals = romanNumerals +"X";
      } 
         
      else if (number.substring(2,3).equals("2"))
      {
         romanNumerals = romanNumerals + "XX";
      }
         
      else if (number.substring(2,3).equals("3"))
      {
         romanNumerals = romanNumerals + "XXX";
      }
         
      else if (number.substring(2,3).equals("4"))
      {
         romanNumerals = romanNumerals + "XL";
      }
         
      else if (number.substring(2,3).equals("5"))
      {
         romanNumerals = romanNumerals + "L";
      }
         
      else if (number.substring(2,3).equals("6"))
      {
         romanNumerals = romanNumerals +"LX";
      } 
         
      else if (number.substring(2,3).equals("7"))
      {
         romanNumerals = romanNumerals + "LXX";
      }
         
      else if (number.substring(2,3).equals("8"))
      {
         romanNumerals = romanNumerals + "LXXX";
      }
         
      else if (number.substring(2,3).equals("9"))
      {
         romanNumerals = romanNumerals + "XC";
      }
         
      else if (number.substring(2,3).equals("0"))
      {
         romanNumerals = romanNumerals;
      }
   
   
      
      
      //ONES     
      if (number.substring(3,4).equals("1"))
      {
         romanNumerals = romanNumerals +"I";
      } 
         
      else if (number.substring(3,4).equals("2"))
      {
         romanNumerals = romanNumerals + "II";
      }
         
      else if (number.substring(3,4).equals("3"))
      {
         romanNumerals = romanNumerals + "III";
      }
         
      else if (number.substring(3,4).equals("4"))
      {
         romanNumerals = romanNumerals + "IV";
      }
         
      else if (number.substring(3,4).equals("5"))
      {
         romanNumerals = romanNumerals + "V";
      }
         
      else if (number.substring(3,4).equals("6"))
      {
         romanNumerals = romanNumerals + "VI";
      }
      else if (number.substring(3,4).equals("7"))
      {
         romanNumerals = romanNumerals + "VII";
      }
      else if (number.substring(3,4).equals("8"))
      {
         romanNumerals = romanNumerals + "VIII";
      }
      else if (number.substring(3,4).equals("9"))
      {
         romanNumerals = romanNumerals + "IX";
      }
         
      else if (number.substring(3,4).equals("0"))
      {
         romanNumerals = romanNumerals;
      }
      
      //checking if the user guess matches with the correct roman numerals.
      if (romanNumerals.compareTo(userGuess) == 0)
      {
         //displaying incorect message 
         System.out.println("\n* * * Correct * * *");
         
      }
      else
      {
         //displaying correct message   
         System.out.println("\n* * * Inorrect * * *");
         
         //second chance
         System.out.print("\nWould you like one more try? (y/n): ");
         String decision = in.nextLine();
         
         
         if (decision.substring(0,1).equals("y"))
         {
            
            System.out.print("\nEnter the Roman numeral of " + number +": ");
            userGuess = in.nextLine();
            
            //second compare
            if (romanNumerals.compareTo(userGuess) == 0)
            {
               System.out.println("\n* * * Correct * * *");
               
            }
            
            
            else
            {
               System.out.println("\n* * * Inorrect * * *");
            }
         }
         
      }
      //displaying final result statement
      System.out.println("\n" + numberCopy +" is a Roman numeral " + romanNumerals +".");
   }
}