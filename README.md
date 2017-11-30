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
   int main(int argc, char const *argv[]){
       int n;
       int arr[100];
       scanf("%d",&n);
       for(int i=0;i<n;i++){
         scanf("%d",&arr[i]);
       }
       QuickSort(arr, 0, n-1);
       for(int i = 0;i < n; i++){
          if(i != n-1){
             printf("%d ",arr[i]);
          }else{
             printf("%d\n",arr[i]);
          }
       }
   }
```
