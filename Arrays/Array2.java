import java.util.Scanner;
class Array2 {
	public static void main(String[] args) {
		int n,s=0,i,temp; int a[]=new int[100]; 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Array element");
		n=scan.nextInt();
		if(n<1||n>100)System.out.println("enter array size between 1 to 100 ");
		else{
		System.out.println("enter "+n+" element");
		for(i=0;i<n;i++){
		a[i]=scan.nextInt();
		}
		for(i=0;i<n/2;i++){
		temp =a[i];
		a[i]=a[n-i-1];
		a[n-i-1]=temp;
		}	
		System.out.println("Reverse  element of array are");
		for(i=0;i<n;i++){
		System.out.print(a[i]+"\t");
		}
		System.out.println();
		}
	}
}