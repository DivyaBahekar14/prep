import java.util.Scanner;
public class Reverse{
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
n=sc.nextInt();
int temp,rem,reverse;
temp=n;
rem=0;
reverse=0;
while(temp>0){
rem=temp%10;
reverse =reverse*10+rem;
temp/=10;
}
System.out.println(n+"reverse of number is "+reverse);
}
} 