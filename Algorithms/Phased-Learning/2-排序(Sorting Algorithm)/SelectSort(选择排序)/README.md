# 选择排序
## 1.代码
```
  /**
 * <p>ClassName:SelectSort</p>
 * <p>Description:	选择排序</p>
 *
 * @author littledream1502@gmail.com
 * @version 1.0
 * @date 2018/4/15 21:50
 */
public class SelectSort {

    public static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            //每一次找到最小的值之后再调换位置(将此排序算法理解为阶段性冒泡即可);
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(arr, min, i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{
                -2, 5, -9, 10, 23, -100
        };
        selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
```
## 2.时间复杂度
```
  O(N^2)
```
## 3.原理分析
```
  选择排序类似于阶段性冒泡,冒泡是两两相比,根据比较结果实时排序;
  而选择排序则是每次都筛选出最小值之后交换位置;
```
