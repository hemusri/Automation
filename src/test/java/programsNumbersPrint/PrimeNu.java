
package programsNumbersPrint;

public class PrimeNu {

	public static void main(String[] args) {

		
		int i,j;

		for(i=0; i<=10; i++)  //i=1;
		{
			for(j=1; j<i; j++) //2<1
			{
				if(i%j==0)  //1%2==0(1==0),2%2==0(0==0)break-->if(2==2) 
					break;
			}
			if(i==j)
				System.out.println("Prime Number "+i);
		}
	}
}

