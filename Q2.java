
public class Q2 {

  public static void main(String[] args) {
    double sum = 0.0;
    double[] nums = {85.8, 93.7, 76, 88.5, 100, 91.3};
    for (int x=0; x<nums.length; x++) {
      sum = nums[x]+sum;
    }
    double average = sum/nums.length;
    System.out.printf("The average is %.3f", average);
  }
}
