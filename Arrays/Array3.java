import java.util.Scanner;
class Array3 {
	public static void main(String[] args) {
		int n,s=0,i,max1=-32768,max2=-32768,min1=32767,min2=32767; int a[]=new int[100]; 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Array element");
		n=scan.nextInt();
		if(n<1||n>100)System.out.println("enter array size between 1 to 100 ");
		else{
		System.out.println("enter "+n+" element");
		/*for(i=0;i<n;i++){
		  a[i]=scan.nextInt();
		  if(max<a[i])max=a[i];
		  if(min>a[i])min=a[i];
		  }
		  System.out.println("Maximum is: "+max+"\nMinimum is: "+min);
		}*/
		for(i=0; i<n;i++){
			a[i]=scan.nextInt();
			if(max1<a[i]){
				max2=max1;
				max1=a[i];
			}
			else if(max2<a[i])max2=a[i];
			if(min1>a[i]){
				min2=min1;
				min1=a[i];
			}
			else if(min2>a[i])min2=a[i];
		}
		if(max1==max2)System.out.println("there is no Second Maximum");
		else System.out.println("MAX1= "+max1+"\tMAX2= "+max2);
		if(min1==min2)System.out.println("there is no Second Minimum");
		else
		System.out.println("MIN1= "+min1+"\tMIN2= "+min2);
	}
	}
}
