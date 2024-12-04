import java.util.ArrayList;
import java.util.Arrays;

public class ex19{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5}, arr2 = {1,3,6}, arr3 = {2,5,7,9,10,11,12}, arr4 = {2,3,5,6,10,11};

        set(arr1, arr2);
        set(arr4, arr4);
    }
    public static void set(int[] arr1, int[] arr2){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i = 0, j = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                result.add(arr1[i++]);
            }else if(arr1[i] > arr2[j]){
                result.add(arr2[j++]);
            }else{
                result.add(arr1[i++]);
                j++;
            }
        }
        while (i < arr1.length) {
            if (!result.contains(arr1[i])) {
                result.add(arr1[i]);
            }
            i++;
        }
        while (j < arr2.length) {
            if (!result.contains(arr2[j])) {
                result.add(arr2[j]);
            }
            j++;
        }
        
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println(result.toString());
    }
}