# 直接插入排序
## 1.代码
```
  **
 * <p>ClassName:InsertionSort</p>
 * <p>Description:	插入排序</p>
 *
 * @author littledream1502@gmail.com
 * @version 1.0
 * @date 2018/4/15 23:16
 */
public class InsertionSort {
    public static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{
                -2, 18, -90, 10, 89, -1000
        };
        insertionSort(arr);
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
   整体思路上来讲,是从第二个数开始,然后往前找,找到一个比他小的数和一个比他大的数,然后将其插入到中间位置;
   (由于在数组中间插入元素的话,后面元素都要向后移动一格);
   代码中是按照相邻对比,如果发现前面的数字比他大,则交换位置,接着和前面的数比较,直到自己到该一轮的最终位置;
```