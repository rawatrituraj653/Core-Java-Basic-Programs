class Test{
		/*//static int a=20;
		static int a;

			static {
				int a=100;
			System.out.println(a);
			}*/
		public static void main(String[] args) {
			//System.out.println("a: "+a);
		/*
			int n=179;
			System.out.print(n+": the reverse number is: "+n%10);
			n=n/10;
			System.out.print(n%10);
			System.out.print(n/10);*//*
			int a=20,b=10;
			int c=a-(-b);
			int d=a-(~b)-1;
			System.out.println("Sum is: "+c );
			System.out.println("Sum is: "+ d);*/
			/*double b=22.5,h=15.5,area=.5*b*h;
			System.out.println(area);
*//*
			int a=16;
			System.out.println(a*a*a);
			System.out.println(sqrt(a));

			int temp,a=20,b=30;
			System.out.println("before swap a= "+a+"b= "+b);
			temp=a;
			a=b;
			b=temp;
			System.out.println("after swap a= "+a+"b= "+b);
		*/
			int a=40,b=30;
			System.out.println("before swap a= "+a+"  b= "+b);
			//a=a+b;b=a-b;a=a-b;
			//a=a*b;b=a/b;a=a/b;
			a=a^b;b=a^b;a=a^b;
			System.out.println("after swap a= "+a+"  b= "+b);




		}

}