import java.util.Scanner;
/**
 *
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    System.out.println("What Fibonacci number would you like to find?");

    int userNumber = input.nextInt();
    int[] numbers = new int [userNumber];

    numbers[0] = 1;
    numbers[1] = 1;

    for(int i=2;i<userNumber;i++){
      numbers[i] = numbers[i-1] + numbers[i-2];
    }


    System.out.println("The " + userNumber + " Fibonacci number is " + numbers[userNumber -1]);
  }
}
