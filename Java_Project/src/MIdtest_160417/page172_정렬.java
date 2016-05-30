package MIdtest_160417;

import java.util.Arrays;

public class page172_Á¤·Ä {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {5,4,3,2,10,9};
		int z=0;

		int[] k = new int[s.length];
		for(int i=0; i<s.length; i++)
		{
			z=0;
			for(int j=0; j<s.length; j++)
			{
				if(s[i]>s[j])
				{
					z=z+1;
				}
			}
			k[z]=s[i];

		}
		for(int c:k)
		System.out.print(c+"  ");
	}
}
