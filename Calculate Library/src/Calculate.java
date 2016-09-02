/**
 * 
 */

/**
 * @author APCS2
 *
 */
public class Calculate {

	public static int square(int number) {
		
		return (number * number);
	}
	
	public static int cube(int number) {
		
		return (number * number * number);
	
	}
	
	public static double average(double num1, double num2) {
		
		return ((num1 + num2) / 2);
	}
	
	public static double average(double num1, double num2, double num3) {
		
		return ((num1 + num2 + num3)/ 2);
	}
	
	public static double toDegrees(double number) {
		
		return (number * 180/3.14159);
	}
	
	public static double toRadians(double number) {
		
		return(number * 3.14/180);
	}
	
	public static double discriminant(double a, double b, double c) {
		
		return((b*b)-4*a*c);
	}
	
	public static String toImproperFrac(int num1, int num2, int num3) {
		int answer = num1 * num3+ num2;
		return(answer + "/" + num3);
	}
	
	public static String toMixedNum(int num1, int num2) {
		int numerator = num1/num2;
		int b = num1%num2;
		return(numerator+"_"+b+"/"+num2);
	}
	
	public static String foil(int num1, int num2, int num3, int num4, String[] args) {
		int a=num1*num3;
		int b = num1*num4-num2*num3;
		int c = num2*num4;
		String x = "String";
		return(a + x+"2" + "+" + b+x +"+" + c);
	}
	
	public static boolean isDivisibleBy(int num1, int num2) {
		if (num1%num2==0)
			return(true);
		else;
			return(false); 
	}
	
	public static double absValue(double num) {
		if(num>=0)
			return(num);
		else;
			return(num*-1);
	}
	public static int max(int num1, int num2) {
		if(num1>num2)
			return(num1);
		else;
			return(num2);
	}
	public static double max(double num1, double num2, double num3) {
		if(num1>num2&&num1>num3)
			return(num1);
		if(num2>num1&&num2>num3)
			return(num2);
		else;
			return(num3);
	}
	public static int min(int num1, int num2) {
		if (num1<num2)
			return(num1);
		else;
			return(num2);
	}
	public static double round2(double num) {
		int b = (int) (num*100);
		double answer;
		if (100*num-b>=.5){
			answer = num+1;
			answer = (double)(answer*100);
		}
		else {
			answer = num-1;
			answer = (double)(answer*100);
		}	
	}
	
}
