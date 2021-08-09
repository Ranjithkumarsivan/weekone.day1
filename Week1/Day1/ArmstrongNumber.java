package firstprogrem;

public class ArmstrongNumber {
	public static void main(String [] arg)
	{
		int number = 153,originalNumber,remainder,result = 0;
		originalNumber = number;
		while (originalNumber !=0){
			remainder = originalNumber % 10;
			result +=Math.pow(remainder, 3);
			originalNumber /=10;
					}
		if (result == number)
			System.out.println(number + " Is an Armstrong number");
		else
		System.out.println(number + " Is not an Armstrong number");
	}
	

};

