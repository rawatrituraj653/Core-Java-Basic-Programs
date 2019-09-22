import java.util.Scanner;
class Array1 {
	public static void main(String[] args) {
		int n,s=0,i; int a[]=new int[100]; 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Array element");
		n=scan.nextInt();
		if(n<1||n>100) System.out.println("enter  size between 1 to 100");
		else{
		System.out.println("enter "+n+" element");
		for(i=0;i<n;i++){
		a[i]=scan.nextInt();
		s=s+a[i];
		}
		System.out.println("Sum of the given Numbers: "+s);
		System.out.println("Mean of the given Numbers: "+(float)s/n);
		}
	}
}
