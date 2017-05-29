import java.util.HashSet;
import java.util.Scanner;

public class Solution {
     //Solution 1:
    private static int removeDuplicatesFromSortedArray(int[] num) {
        if (num.length == 0) return 0;
        int index = 1;
        for (int i = 1; i < num.length; i++) {
            if (num[i] != num[index - 1]) {
                num[index++] = num[i];
            }
        }
        return index;
    }
    //Solution 2:
    private static int removeDuplicatesFromSortedArray1(int[] num) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            hashSet.add(num[i]);
        }
        return hashSet.size();
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(removeDuplicatesFromSortedArray(arr));
        System.out.println(removeDuplicatesFromSortedArray1(arr));
    }
}
