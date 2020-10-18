package week1.day2;

public class ArmstrongNum {

	public static void main(String[] args) {
		int input = 154;
		int calculated =0, reminder, original;
		
		original=input;
		
		while (input>0) {
			
			reminder=input%10;
			input=input/10;
			calculated+=(reminder*reminder*reminder);
		}
	if (calculated==original)
		System.out.println("It is an Armstrong number");
	else
		System.out.println("It is not an Armstrong number");
	}

}
