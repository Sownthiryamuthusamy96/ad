import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,sum=0,a,n,c,count=1;
n=Integer.parseInt(br.readLine());
a=n;
c=n;
while(a>0)
{
a=a/10;
count++;
}
while(n>0)
{
b=n%10;
sum=(int)(sum+Math.pow(b,count));
n=n/10;
}
if(sum==c)
System.out.println("Armstrong");
else
System.out.println("not Armstrong");
}
}
