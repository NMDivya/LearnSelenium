package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator myRes= new Calculator();
		
		int sum, subtract;
		double multi;
		float divide;
		
		sum=myRes.add(10, 20, 30);
		System.out.println("Addition of the numbers " + sum);	
		
		subtract=myRes.sub(40, 10);
		System.out.println("Subtraction of the numbers " + subtract);
		
		multi=myRes.multiply(10.00, 50.00);
		System.out.println("Multiplication of the numbers " + multi);
		
		divide=myRes.divide(100, 20);
		System.out.println("Division of the numbers " + divide);

	}

}
