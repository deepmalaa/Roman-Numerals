import java.util.Scanner;
public class RomanNumeral
{
   public static void main(String[] args)
   {
   
      //Creatig Scanner object
      Scanner in = new Scanner(System.in);
      //displaying header
      System.out.println("Do You Know the Roman Numerals?");
      System.out.println("===============================\n\n");
      
      //asking for input from user
      System.out.print("Enter a number (1 - 3999) : ");
      String number = in.nextLine();
      
      System.out.print("Enter the Roman numeral of " + number +": ");
      String userGuess = in.nextLine();
      
      String a= number;
      String romanNumerals="";
      
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

      //thousands
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
           
      
      
      //hundred
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
         
         if (number.substring(1,2).equals("6"))
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


      
         //tens
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
            romanNumerals = romanNumerals + "V";
         }
         
         if (number.substring(2,3).equals("6"))
         {
            romanNumerals = romanNumerals +"VX";
         } 
         
         else if (number.substring(2,3).equals("7"))
         {
            romanNumerals = romanNumerals + "VXX";
         }
         
         else if (number.substring(2,3).equals("8"))
         {
            romanNumerals = romanNumerals + "VXXX";
         }
         
          else if (number.substring(2,3).equals("9"))
         {
            romanNumerals = romanNumerals + "XC";
         }
         
         else if (number.substring(2,3).equals("0"))
         {
            romanNumerals = romanNumerals;
         }


      
      
         //ones     
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

         


      
      
      if (romanNumerals.compareTo(userGuess) == 0)
      {
         System.out.println("* * * Correct * * *");
         
      }
      else
      {
         System.out.println("* * * Inorrect * * *");
         
      }
   
      System.out.println(a +" is a Roman Numerals " + romanNumerals +".");
   }
}