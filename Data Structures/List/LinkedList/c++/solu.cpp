#include<bits\stdc++.h>
using namespace std;
typedef long long ll;


int main(int argc, char const *argv[])
{
   ll a;
   cin>>a;
   int count=0;
   while(a/10!=0){
     if(a%10==0){
        count+=1;
     }
     a/=10;
   }
   printf("%d\n", count);
}