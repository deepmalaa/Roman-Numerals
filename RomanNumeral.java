import java.util.Scanner;
public class RomanNumeral
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
   System.out.println("Do You Know the Roman Numerals?");
   System.out.println("===============================\n\n");
   
   
   System.out.print("Enter a number (1 - 3999) : ");
   int number = in.nextInt();
   
   System.out.print("Enter the Roman numeral of " + number +": ");
   String userGuess = in.nextLine();
   
   if (romanNumerals.compareTo(userGuess) == 0)
   {
      System.out.print("* * * Correct * * *")
   }
   else
   {
      System.out.print("* * * Correct * * *")
   }
   
   }
}