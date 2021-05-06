import java.io.*;
import java.util.Scanner;
class palindrome
{
public static void main(String[] args)
{
int a,rem,quo=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value");
a=s.nextInt();
int b=a;
while(a!=0)
{
rem=a%10;
quo=quo*10+rem;
a=a/10;
}
if(b==quo)
{
System.out.println("given number is palindrome");
}
else
{
System.out.println("given number is not palindrome");
}
}
}

