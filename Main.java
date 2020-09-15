import java.text.BreakIterator;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter a number to count down or up from");

    Scanner s = new Scanner (System.in);
    int userInput;
    userInput = s.nextInt();

  if (userInput >= 0 )
    {
      while (userInput >0)
      {
        System.out.println(userInput);
        userInput--;
      }
    }
    else
    {
      while(userInput <= 0)
      {
        System.out.println(userInput);
        userInput++;
      }
    }

    System.out.println("Blast Off!!!");




  }
}