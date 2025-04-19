public class Main6 {
  public static void main(String[] args) {
      try {
          int a = 5 / 0;
      } catch (ArithmeticException e) {
          System.out.println("Error: Division by zero!");
      } finally {
          System.out.println("This block is always executed.");
      }
  }
}

