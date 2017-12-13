# Array 数组

## 1.声明数组
```java
   class Main{
     public static void main(String[] args){
        int[] arr;
        String[] str;
        String str1[]=new String[5];
        int num[]=new int[6];
     }
   }
```
## 2.初始化数组
```java
   class Main{
    public static void main(String[] args){
        
       //定义一个长度为5的int数组;
       int[] arr=new int[]{1,2,3,4,5};
    
    }
   }
```
## 3.查看数组长度
```java
   class Main{
    public static void main(String[] args){
      int[] arr=new int[10];
      String[] str=new String[5];
      //对int数组来说,数组长度是数组的一个属性值,属性值的大小代表着数组的长度;
      int len_arr=arr.length;
      //对String数组来说,长度是数组的一个方法,方法的返回值是数组长度的大小;
      int len_str=str.length();
    }
   }
```
