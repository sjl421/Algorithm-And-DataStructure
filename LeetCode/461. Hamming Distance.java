public class Solution {
    public int hammingDistance(int x, int y) {
          int result = 0;
        int k = x ^ y;
//        out.println(k);
        while (k != 0) {
            if (k % 2 == 1) {
                result += 1;
            }
            k>>=1;
        }
        return result;
    }
}