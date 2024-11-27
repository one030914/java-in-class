import java.util.Scanner;
import java.security.SecureRandom;

public class ex17{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        final int SIZE = 100;
        int n = 0;
        int[] arr = new int[SIZE];
        n = scanner.nextInt();
        System.out.println("before:");
        for(int i = 0; i < n; i++){
            arr[i] = rand.nextInt(999);
            if(i > 0){
                System.out.print(" ");
            }
            System.out.printf("%d", arr[i]);
        }
        System.out.println("\nafter:");

        QS(arr, 0, n - 1);

        for(int i = 0; i < n; i++){
            System.out.printf("%d ", arr[i]);
        }
    }
    public static void QS(int[] arr, int left, int right){
        int l = left, r = right;
        int pivot = arr[left];

        if(l >= r){
            return;
        }

        while(l != r){
            while(arr[r] >= pivot && l < r){
                r--;
            }
            while(arr[l] <= pivot && l < r){
                l++;
            }
            if(l < r){
                swap(arr, l, r);
            }
        }
        arr[left] = arr[l];
        arr[l] = pivot;
        QS(arr, left, l - 1);
        QS(arr, l + 1, right);        
    }
    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}