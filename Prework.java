import java.util.Scanner;
public class Prework {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.printIn("Enter a number maximum 9 digit");
int num=input.nextInt();
System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();
int a=input.nextInt();
switch (a) {

case 0:
a = 0;
break;

case 1:
int k=num;
int reverse=0,rem;
while(num>0){
rem=num%10;
reverse=reverse*10+rem;
num=num/10;
}
if(reverse==k)
System.out.printIn(k+"is a palindrome number");
else
System.out.printIn(k+"is not a palindrome number");
break;

case 2:
System.out.printIn("Enter the number of rows:");
int rows=sc.nextInt();
for(int i=rows-1;i>=0;i--)
{
    for(int j=0;j<=i;j++)
    {
        System.out.print("*"+"" );
    }
System.out.printIn();
}
break;

case 3:
int flag=0;
for(int i=2;i<num;i++){
    if(num%i==o)
    {
        System.out.printIn(num+"is not a prime number");
        flag=1;
        break;
    }
}
if(flag==0)
System.out.printIn(num+"is a prime number");
break;

case 4:
int count,num1=0,num2=1;
count=scanner.nextIn();
int i=1;
while(i<=count)
{
    System.out.print(num1+"");
    int sumofPrevTwo=num1+num2;
    num1=num2;
    num2=sumofPrevTwo;
    i++;
}
break;
default:

System.out.println("Invalid choice. Enter a valid no.\n");
{
 while (a!= 0);

System.out.println("Exited Successfully!!!");
}
sc.close();
}
}
}
