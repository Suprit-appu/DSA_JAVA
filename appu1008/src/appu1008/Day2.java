package appu1008;

import java.security.DomainCombiner;

public class Day2 {
	public static void main(String[] args) {
		int num = 6;
		int count = 0;
		
		if (num > 1)
		{
			for(int i = 1;i<=num;i++)
			{
				if(num%i == 0 )
					count ++;
			}
			if (count == 2)
			{
				System.out.println("It is a prime number");
			}
			else
			{
				System.out.println("It is not a prime number");
			}
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}

}
