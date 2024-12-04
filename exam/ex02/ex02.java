import java.util.Scanner;

public class ex02{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] nums = new int[num];
        int step = (nums.length % 2 == 0) ? nums.length / 2 : (nums.length - 1) / 2;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i <= step; i++){
            int temp = nums[i], index = nums.length - 1 - i;
            nums[i] = nums[index];
            nums[index] = temp;
        }
        for (int i = 0; i < nums.length; i++){
            System.out.printf("%d ", nums[i]);
            if (nums[i] > max)
                max = nums[i];
        }
        System.out.println("");
        System.out.println(max);
    }
}