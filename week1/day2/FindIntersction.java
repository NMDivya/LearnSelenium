package week1.day2;

public class FindIntersction {

	public static void main(String[] args) {
	int[] first= {3,2,11,4,6,7};
	int[] sec= {1,2,8,4,9,7};
	
	for(int i=0;i<=first.length-1;i++)
	{
		for(int j=0;j<=sec.length-1;j++)
		{
			if(first[i]==sec[j])
				System.out.println(first[i]);
		}
	
	}

	}

}
