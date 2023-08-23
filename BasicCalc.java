import java.util.Scanner;

public class BasicCalc {

  public static void main(String[] args) {
    // create a scanner object for user input
    Scanner scanner = new Scanner(System.in);

    // declare and initialize variables for numbers and result
    int num1 = 0;
    int num2 = 0;
    int result = 0;

    // prompt the user to enter the first number
    System.out.println("Enter first number");
    // read the input and assign it to num1
    num1 = scanner.nextInt();
    // add num1 to result
    result += num1;

    // prompt the user to enter the next number
    System.out.println("Enter next number");
    // read the input and assign it to num2
    num2 = scanner.nextInt();
    // add num2 to result
    result += num2;

    // display the result
    System.out.println(result);

    // close the scanner
    scanner.close();
  }
}
