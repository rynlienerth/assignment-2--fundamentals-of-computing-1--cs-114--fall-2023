public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number");
    int input = scanner.nextInt();

    if (input % 2 == 0) {
      for (int i = 0; i < input; i++){
        for (int spaces = 0; spaces < input - i - 1; spaces++);
        System.out.print("  ");
        }
        for (int astrix = 0; astrix 2 * i + 1; astrix++) {
          System.out.print("* ");
        }
        System.out.println();
        }
      for (int i = input - 2; i >= 0; i--) {
        for (int spaces = 0; spaces < input - i - 1; spaces++)
          System.out.print("   ");
      }
      for (int astrix = 0; astrix < 2 * i + 1; astrix++) {
        System.out.print("* ");
      }
      System.out.println();
      }
      } else {
       for (int i = 0; i < input / 2; i++) {
        for (int spaces = 0; spaces < input / 2 - i; spaces++) {
          System.out.print(" ");
        }
        for (int astrix = 0; astrix < 2 * i + 1; astrix++){
          System.out.print("*");
        }
        System.out.println();
       }
       for (int i = input / 2 - 2; i >= 0; i--){
        for (int spaces = 0; spaces < input / 2 - i; spaces++) {
          System.out.print(" ");
        }
        for (int astrix = 0; astrix < 2 * i + 1; astrix++) {
          System.out.print("*");
        }
        System.out.println();
       }
       scanner.close();
      }
      }
    }
  }
}
