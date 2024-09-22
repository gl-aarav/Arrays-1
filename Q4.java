import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    int[] ages = new int[20];
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < ages.length; i++) {
      System.out.print("Enter age #" + (i+1) + ": ");
      ages[i] = input.nextInt();
    }
    input.close();
    int count = 0;
    for (int age : ages) {
      if (age > 15) {
        count++;
      }
    }
    System.out.println("Number of ages greater than 15: " + count);
  }
}
