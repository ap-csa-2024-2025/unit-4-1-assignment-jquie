import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter any numbers (Enter -1 to stop)");
    int num = 0;
    int sum = 0;
    while (num != -1)
    {
      num = sc.nextInt();
      sum += num;
    }
    sum++;
    System.out.println("Sum is " + sum);
  
    // Problem 2
    int max = Integer.MIN_VALUE;
    System.out.println("How many numbers would you like to input?");
    int count = sc.nextInt();
    System.out.println("Enter the scores:");
    int i = 0;
    while (i < count)
    {
      int input = sc.nextInt();
      if (input > max)
      {
        max = input;
      }
      i++;
    }
    System.out.println("The largest score is " + max);

   // Problem 3
   System.out.println("Input a word");
   String word = sc.nextLine();
   int count = word.length();
   int i = 0;
   while ( i < count)
   {
    if (i < count-1)
    {
      System.out.print(word.substring (i, i+2));
    }
    if (i == count-1)
    {
      System.out.print(word.substring(i));
    }
    i += 3;
   }
  }
}
