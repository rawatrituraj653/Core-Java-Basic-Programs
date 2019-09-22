import java.util.Scanner;
class Tables 
{
	public static void main(String[] args) 
	{
		int n,t,i,c=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		n=scan.nextInt();
		/*for(t=1;t<=n;t++){
			for(i=1;i<=10;i++){
			System.out.println(t+"*"+i+"="+t*i);
			}
		}*/
		for(i=1;i<=10;i++){
			for(t=1;t<=n;t++){
			System.out.print(t+"*"+i+"="+t*i+"\t");
			c++;
			if(c%9==0)break;
			}
			System.out.print("\n");
			if(c%9==0) continue;
			
		}
		System.out.println(c);
	}	}