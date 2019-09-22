class Student1 
{
	public static void main(String[] args) 
	{
		int sid,s1,s2,s3,s4,s5,s6,tot;
		String name;
		float avg;
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter the student id");
		sid=scan.nextInt();
		System.out.println("enter the student name");
		name =scan.next();
		System.out.println("enter all subject marks ");
		s1=scan.nextInt();
		s2=scan.nextInt();
		s3=scan.nextInt();
		s4=scan.nextInt();
		s5=scan.nextInt();
		s6=scan.nextInt();
		tot=s1+s2+s3+s4+s5+s6;
		avg=tot/6;
		System.out.println("SID\tSNAME\tTOTAL\tAVG\tRESULT");
		System.out.println("----------------------------------------");
		System.out.print(sid+"\t"+name+"\t"+tot+"\t"+avg+"\t");
		if(s1>=33&& s2>=33&& s3>=33&&s4>=33&&s5>=33&&s6>=33){
			if(avg>=60)
				System.out.println("first");
			else if(avg>=50)	System.out.println("second");
			else  System.out.print("third");
		}
			else {
							System.out.println("FAIL");

			}

		
		}
}
