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
	
	public static String foil(int num1, int num2, int num3, int num4, String s) {
		int a=num1*num3;
		int b = num1*num4-(num2*num3);
		int c = num2*num4;
		return(a + s+"^2" + "+" + b+ s +"+" + c);
	}
	
	public static boolean isDivisibleBy(int num1, int num2) {
		if (num2=0) throw new
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
			return answer = (double) (answer*100);
		}
		else {
			answer = num-1;
			return answer = (double) (answer*100);
		}	
	}
	public static double exponent(double num, int exp){
		double ans;
		double num2=1.0;
		for(double i=1.0;i <= exp; i++){
			ans= num2*num;
			num2=ans;
		return(double)(ans);			
		}
	}
	public static int factorial(int num){
		if (num<0) throw new IllegalArgumentException("This factorial method does not work with negatives");
		int ans=1;
		int product=1;
		for(int i=1;i<=num; i++){
			ans=product*i;
			product=ans;
		}
		return ans;
	}
	public static boolean isPrime(int num){
		for(int i=2;i<num;i++){
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static int gcf(int a, int b){
		
	}
}
