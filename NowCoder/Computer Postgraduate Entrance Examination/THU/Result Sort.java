/**
题目描述
查找和排序
题目：输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩
      都按先录入排列在前的规则处理。
   例示：
   jack      70
   peter     96
   Tom       70
   smith     67
   从高到低  成绩            
   peter     96    
   jack      70    
   Tom       70    
   smith     67    
   从低到高
   smith     67  
   Tom       70    
   jack      70    
   peter     96      

输入描述:
输入多行，先输入要排序的人的个数，然后输入排序方法0（降序）或者1（升序）再分别输入他们的名字和成绩，以一个空格隔开


输出描述:
按照指定方式输出名字和成绩，名字和成绩之间以一个空格隔开

输入例子:
3
0
fang 90
yang 50
ning 70

输出例子:
fang 90
ning 70
yang 50
**/

public class Main {
	public static class Node
	{
		String name;
		int result;
	}
	public static class cmp implements java.util.Comparator<Node>
	{

		@Override
		public int compare(Node o1, Node o2) {//升序
			// TODO Auto-generated method stub
			return o1.result-o2.result;
		}
	}
	public static class cmp2 implements java.util.Comparator<Node>{

		@Override
		public int compare(Node o1, Node o2) {
			// TODO Auto-generated method stub
			return o2.result-o1.result;
		}
		
	}
public static void main(String[] args) {
	java.util.Scanner input=new java.util.Scanner(System.in);
	int n,flag;
	while(input.hasNext()){
		n=input.nextInt();
		flag=input.nextInt();
		Node[] node=new Node[n];
		for(int i=0;i<n;i++)
		{
			node[i]=new Node();
			node[i].name=input.next();
			node[i].result=input.nextInt();
		}
		if(flag==0)
		java.util.Arrays.sort(node,new cmp2());
		else 
		java.util.Arrays.sort(node,new cmp());
		for(int i=0;i<n;i++)
		{
			System.out.println(node[i].name+" "+node[i].result);
		}
	}
}
}
