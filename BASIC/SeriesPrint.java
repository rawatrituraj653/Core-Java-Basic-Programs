import java.util.Scanner;
class  SeriesPrint
{
	public static void main(String[] args) 
	{
	Scanner scan= new Scanner(System.in);
	int n,i,s=0;
	System.out.println("enter  n value");
		n=scan.nextInt();
	/*	for(i=1;i<=n;i++){
			if(i%2!=0){
			System.out.print(i+"-");
			s=s+i;
			}
			else{
			System.out.print(i+"+");
			s=s-i;
			}
		}
		System.out.print("\b= "+s+"\n");*/
		for(i=1;i<=n;i++){

		System.out.print(i);
		System.out.print((char)178+"+");
		s=s+i*i;
		}
		System.out.print("\b= "+s+"\n");
	}
}
