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
		int b = num1*num4+(num2*num3);
		int c = num2*num4;
		return(a + s+"^2" + "+" + b+ s +"+" + c);
	}
	
	public static boolean isDivisibleBy(int num1, int num2) {
		if (num2==0) throw new IllegalArgumentException("Nothing is divisible by zero");
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
		int b = (int)(num*100);
		double answer=1;
		if (100*num-b>=.5){
			if(num<0){
				answer=b-1;
			}
			else
				answer = (b+1);
		}
		else {
			answer = (b);
		}	
		return answer/100;
	}
	public static double exponent(double num, int exp){
		if (exp<0) throw new IllegalArgumentException("This method does not work with negative exponents");
		double ans=1;
		double num2=1.0;
		for(int i=1;i <= exp; i++){
			ans= num2*num;
			num2=ans;
		}
		return(ans);			
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
		for(int i=num-1;i<1;i--){
			if(Calculate.isDivisibleBy(num, i)==true)
				return false;
		}
		return true;
	}
	public static int gcf(int a, int b){
		int ans= 1;
		for(int i=1; i<=a || i<=b; i++){
			if (Calculate.isDivisibleBy(a, i) || Calculate.isDivisibleBy(b, i)) {
				ans= i;
			}
			else;
				return 1;
		}
		return ans;
	}
	public static double sqrt(double a) {
		if (a<0) throw new IllegalArgumentException("Negative square roots result in imaginary numbers");
		double x=1.0;
		double ans=a/2;
		if (a==0){
			return 0;
		}
		else{
			do{
				x=ans;
				ans=(x+(a/x))/2;
			}
			while((x-ans)!=0); 
				return Calculate.round2(ans);
		}
	}
	public static String quadForm(int a, int b, int c){
		double discriminant = Calculate.discriminant((double)(a), (double)(b), (double)(c));
		if (discriminant<0)
			return ("no real roots");
		double sqrt = Calculate.sqrt(discriminant);
		double ans1=((-b+sqrt)/2/(a));
		double ans2=((-b-sqrt)/2/(a));
		ans1=Calculate.round2(ans1);
		ans2=Calculate.round2(ans2);
		if (ans1>ans2){
			return (ans2+" and "+ans1);
		}
		else
			return (ans1+" and "+ans2);
	}
}

