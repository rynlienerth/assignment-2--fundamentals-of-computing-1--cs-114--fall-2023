import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number");
    int input = scanner.nextInt();

    int spaces = input - 1;
    int astrix = 1;

    if (input % 2 == 0 && input > 0) {
      for (int i = 0; i < input; i += 2){
        for (spaces = 0; spaces < (input-i) / 2; spaces++); {
        System.out.print("  ");
        }
        for (astrix = 0; astrix <= i; astrix++) {
          System.out.print(" *");
        }
        System.out.println();
      }
      for (int i = 0; i < input; i++) {
        for (spaces = 0; spaces < (input - i) / 2; spaces++){
          System.out.print("  ");
      }
      for (astrix = 0; astrix <= i; astrix++) {
        System.out.print(" *");
      }
      System.out.println();
    }
  } else {
      for (int i = 0; i <= input / 2; i++) {
        for (spaces = 0; spaces < input / 2 - i; spaces++) {
          System.out.print(" ");
        }
        for (astrix = 0; astrix < 2 * i + 1; astrix++) {
          System.out.print("*");
        }
        System.out.println();
      }
      for (int i = input / 2 - 1; i >= 0; i--){
        for (spaces = 0; spaces < input / 2 - i; spaces++) {
          System.out.print(" ");
        }
        for (astrix = 0; astrix < 2 * i + 1; astrix++){
          System.out.print("*");
        }
        System.out.println();
      }
  }
  scanner.close();
}
}
