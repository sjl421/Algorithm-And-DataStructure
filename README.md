## Programming in Java
### Recording Personal life's Coding in Algorithms , Data Structures , etc about programming.
``` C++
   #include<bits/stdc++.h>
   using namespace std;
   inline void QuickSort(int *arr,int left,int right){
     if(left > right) return ;
     int i=left,int j=right,key=arr[left];
     while(i < j){
        while(i < j && key < arr[j]){
         j--;
        }
        arr[j]=arr[i];
        while(i < j && key >= arr[i]){
         i++;
        }
        arr[i]=arr[j];
     }
     key=arr[i];
     QuickSort(arr , left, i-1);
     QuickSort(arr, i+1, right);
   }
```
