/**
 * the usage of array
 */
package demos;

import java.util.Arrays;

public class Lottery {
	public static void work() {
	//Choose 7 numbers from 36 numbers
		final int N=36, K=7;
		int[] number = new int[N];
		int[] result = new int[K];
		for ( int i=0 ; i < number.length ; i++ )
			number[i] = i+1;
		int n=N;
		for (int i=0 ; i<result.length ; i++) {
			int tmp= (int) Math.floor( Math.random() * n );
			result[i] = number[tmp];
			number[tmp] = number[n-1];
			n--;
		}
		//for (int ele : result) System.out.println(ele);
		Arrays.sort(result);
		System.out.println("lottery result:");
		System.out.println(Arrays.toString(result));
	}

}
