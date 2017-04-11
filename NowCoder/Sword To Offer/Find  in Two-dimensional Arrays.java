/**
 * 题目描述:
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 **/
 
 public class Solution {
    public boolean Find(int target, int [][] array) {
                int m=array[0].length;//矩阵的列数
		int n=array.length;//矩阵的行数
		int i=m-1,j=0;
		while(i>=0&&j<=n-1){
			if(array[j][i]>target){
				i-=1;
			}else if(array[j][i]<target)
			{
				j+=1;
			}else if(array[j][i]==target){
				return true;
			}
		}
		return false;
    }
}
