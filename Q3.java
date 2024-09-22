public class Q3 {

  public static void main(String[] args) {
    int[] nums = new int[10];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) (Math.random() * 10 + 1);
      System.out.println(nums[i]);
    }
    System.out.println("Print the array backwards:");
    for (int i = nums.length - 1; i >= 0; i--) {
      System.out.println(nums[i]);
    }
    int evenCount = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        evenCount++;
      }
    }
    System.out.println("Number of even numbers: " + evenCount);
  }
}
