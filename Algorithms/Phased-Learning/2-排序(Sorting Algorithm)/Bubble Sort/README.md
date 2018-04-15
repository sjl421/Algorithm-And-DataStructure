# 冒泡排序
## 1.代码
### 1.1 写法一:
```
/**
 * @author littledream1502@gmail.com
 * @date 2017/12/20
 * @desc 冒泡排序
 */
public class BubbleSort {

    public static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    public static int[] BubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = false;
                }
            }
            //代表没有排序,原本都是顺序排列;
            if (flag) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{
                2, -8, 3, 1, 89, -90
        };
        BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
```
## 2. 时间复杂度
``` 
  O(n^2)
```
## 3. 原理分析
![](https://images2015.cnblogs.com/blog/1024555/201611/1024555-20161126001352300-2027386210.png)
