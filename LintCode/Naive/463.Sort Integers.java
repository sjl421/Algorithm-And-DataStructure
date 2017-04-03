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
