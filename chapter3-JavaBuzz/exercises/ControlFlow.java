// what imports will you need?
import java.util.Scanner;
// can you remember how to set up your main function?
public class ControlFlow {
  public static void main(String[] args){
    while(true) {
      System.out.println("Enter your number");
      Scanner sc = new Scanner(System.in);
      int i = sc.nextInt();
      int quotient = i/2;
      if(i == 17){
        System.out.println("Thanks for playing.");
        break;
      } else if(quotient*2 == i){
        System.out.println(i + " is even.");
      } else {
        System.out.println(i + " is odd.");
      }
    }
  }
}
// find a way to read in user input

// write a method that will check if a number is odd or even
// (assume user only ever enters integers)

// print the answer to the console
