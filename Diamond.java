import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int input;
    Scanner scanner;
    // Declare scanner and user input
    System.out.println("Enter a number");
    scanner = new Scanner (System.in);
    input = scanner.nextInt();


    //Checks to see if input is even or odd
    if (input % 2 == 0) {
      //Even Top half of Diamond
      for (int i = 0; i < input; i++){
        for (int spaces = 0; spaces < input - i - 1; spaces++) {
        System.out.print(" ");
        }
        for (int astrix = 0; astrix <= i; astrix++) {
          System.out.print(" *");
        }
        System.out.println();
      }
      //Even Bottom half of Diamond
      for (int i = 0; i < input - 1; i++) {
        for (int spaces = 0; spaces <= i; spaces++){
          System.out.print(" ");
          }
        for (int astrix = 0; astrix < input - i - 1; astrix++) {
          System.out.print(" *");
      }
      System.out.println();
    }
    } else {
      //Odd Top half of Diamond
      for (int i = 0; i <= input / 2; i++) {
        for (int spaces = 0; spaces < input / 2 - i; spaces++) {
          System.out.print(" ");
        }
        for (int astrix = 0; astrix < 2 * i + 1; astrix++) {
          System.out.print("*");
        }
        System.out.println();
      }
      //Odd Bottom half of Diamond
      for (int i = input / 2 - 1; i >= 0; i--){
        for (int spaces = 0; spaces < input / 2 - i; spaces++) {
          System.out.print(" ");
        }
        for (int astrix = 0; astrix < 2 * i + 1; astrix++){
          System.out.print("*");
        }
        System.out.println();
      }
  }
  scanner.close();

}
}
