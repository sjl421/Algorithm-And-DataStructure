/**
 * URL:http://www.lintcode.com/en/problem/sort-integers/
 * Question:
 * Given an integer array, sort it in ascending order. Use selection sort, bubble sort, insertion sort or any O(n2) algorithm.
 */
public class Solution {
    /**
     * @param A an integer array
     * @return void
     */
    public void sortIntegers(int[] A) {
        // Write your code here
        int temp=0;
        for(int i=1;i<A.length;i++){
            for(int j=0;j<A.length-i;j++){
                if(A[j]>A[j+1]){
                    temp=A[j+1];
                    A[j+1]=A[j];
                    A[j]=temp;
                }
            }
        }
    }
}
/**
 * 
 *
 */
