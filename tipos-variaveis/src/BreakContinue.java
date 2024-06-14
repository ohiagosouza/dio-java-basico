public class BreakContinue {
  public static void main(String[] args) {
    for (int number = 1; number <= 100; number++) {

      if (number % 2 == 0) {
        break;
        // continue;
      }
      System.out.println(number);
    }
  }
}
