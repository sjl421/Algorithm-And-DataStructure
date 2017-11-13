import java.util.List;

public class Solution {

    interface NestedInteger {
        public boolean isInteger();

        public Integer getInteger();

        public List<NestedInteger> getList();
    }

    public int depthSum(List<NestedInteger> nestedList) {
        int res = 0;
        if (nestedList == null || nestedList.size() == 0) {
        	return res;
        }
        return 0;
    }

    public int getValueFormDepth(List<NestedInteger> list, int depth) {
        int res = 0;
        for (NestedInteger nestedInteger : list) {
            if (nestedInteger.isInteger()) {
                res += nestedInteger.getInteger() * depth;
            } else {
                res += getValueFormDepth(nestedInteger.getList(), depth + 1);
            }
        }
        return res;
    }
}
