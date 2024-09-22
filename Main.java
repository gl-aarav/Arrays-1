
public class Main {

  public static void main(String[] args) {
    int[] sneakers = new int [3];
    sneakers[0] = 10;
    sneakers[1] = 22;
    sneakers[2] = 15;
    double[] sneakersPrice = {64.45, 87.35, 93.98};
    System.out.print("The total number of sneakers we have in stock = ");
    System.out.println((sneakers[0] + sneakers[1] + sneakers[2]) + ".");
    System.out.print("\nWe have " + sneakers[1] + " available pairs of sneakers which cost $");
    System.out.println(sneakersPrice[1] + " per pair.");
    double total = sneakers[0] * sneakersPrice[0];
    total += sneakers[1] * sneakersPrice[1];
    total += sneakers[2] * sneakersPrice[2];
    System.out.println( "Our total store investment in sneakers is $" + total + ".");

  }

}
