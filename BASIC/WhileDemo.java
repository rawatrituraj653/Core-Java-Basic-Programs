import java.util.Scanner;
class WhileDemo 
{
	public static void main(String[] args) 
	{
		int m,n;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter value for base");
	 n=scan.nextInt();
	/*System.out.println("enter value for power");
	a=scan.nextInt();
	while(a<=n){
	System.out.print("\t"+a);
	a++;
	}*/
	
	/*while(n>=1){
	System.out.print("\t"+n);
	n--;
	}*/
	/*while(n>=1){
	a=a*n;
	n--;
	}
	System.out.println("factorial is:  "+a);
	long pow=1;
	while(a>=1){
	pow=pow*n;
	a--;
	}
	System.out.println("the power value is:  "+pow);

	int pow=1,s=0;
	while(a>=1){
	pow=pow*n;
	s=s+pow;
	a--;
	}
	System.out.println("the power value is:  "+pow);
	System.out.println("the sum of power  is:  "+s);

	double s=0;
	while(a>=1){
	s=s+Math.pow(n,a);
	a--;
	}
	System.out.println("the sum of power  is:  "+s);
	int s=0;
	while(n!=0){
	s=s+n%10;
	n=n/10;
	}
	System.out.println("the sum of digit  is:  "+s);
	int s=0;
	s=(n*(n+1))/2;
	System.out.println("the sum of 1 to 10 number  is:  "+s);
	int s=0,a=1;
	while(a<=n){
	s=s+a;
	a++;
	}
System.out.println("the sum of numbers is:  "+s);
*/
int s=0;
m=n;
while(m!=0){
	s=s+m;
	if(m>0)m--;
	else m++;
}
	System.out.println("the sum of digit  is:  " +s+"  mean is  "+(float)s/Math.abs(n));

	}
}
