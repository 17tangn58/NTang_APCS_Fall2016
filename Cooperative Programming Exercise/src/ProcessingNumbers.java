// Nathan Tang 2nd period 9/30/16
// Cooperative Programming Exercise
import java.util.*;
public class ProcessingNumbers {
	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		System.out.println("How many numbers would you like to use?");
		int numberCount=userInput.nextInt();
		if(numberCount<0) throw new IllegalArgumentException("Please use more than one number");
		else if(numberCount==1){
			System.out.println("Enter 1 integer.");
		}	
		else{
			System.out.println("Enter "+numberCount+" integers.");
		}
		int max=userInput.nextInt();
		int min=max;
		int EvenSum=0;
		int evenMax=0;
		int nextnum=max;
		if(max%2==0){
			EvenSum=max;
			evenMax=max;
		}
		for(int i=1;i<numberCount;i++){
			nextnum=userInput.nextInt();
			if(nextnum>max){
				max=nextnum;
			}
			if(nextnum<min){
				min=nextnum;
			}
			if(nextnum%2==0){
				EvenSum+=nextnum;
				if(nextnum>evenMax){
					evenMax=nextnum;
				}
			}
		}
		System.out.println("min: "+min);
		System.out.println("max: "+max);
		System.out.println("Sum of all even numbers: "+EvenSum);
		System.out.println("Greatest even input: "+evenMax);
	}

}
