                                           import java.util.Scanner;
import java.text.DecimalFormat;
class Circle{
	 static double PI=3.14;
		static DecimalFormat df=new DecimalFormat(".##");
	public static void main(String[]s){
	 	double r,area,circum;
	
	Scanner scan=new Scanner(System.in);
		System.out.println("enter Circle radius");
		r =scan.nextFloat();
		area=PI*r*r;
	circum=2*PI*r;
		System.out.println("Area of Circle is: "+area);
			System.out.println("Circumference of circle is:"+df.format(circum));

	}
}
