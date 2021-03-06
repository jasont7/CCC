import java.util.Arrays;
import java.util.Scanner;

public class ChoresTime {
	
	/// 2013, Junior #4 ///

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int T = console.nextInt();
		int C = console.nextInt();
		int[] mins = new int[C];
		int result = 0;
		
		for (int i=0; i < C; i++) {
			mins[i] = console.nextInt();
		}
		Arrays.sort(mins);
		
		for (int i=0; i < C; i++) {
			if (mins[i] <= T) {
				result++;
				T -= mins[i];
			}
		}
		
		System.out.println(result);
		
	}

}
