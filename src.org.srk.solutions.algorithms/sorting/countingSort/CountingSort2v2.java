package sorting.countingSort;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingSort2v2 {
	
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. 
		 */
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		Map<Integer, Integer> count = new HashMap<>();
		for(int i=0; i<100; i++)
			count.put(i, 0);
		
		for(int i=0; i<size; i++) {
			int num = sc.nextInt();
			if(count.containsKey(num)) {
				count.put(num, count.get(num) + 1);
			}
		}
		
		// Output all the numbers of the list in order based on their count
		count.forEach((k,v)->{
			while(v-- > 0) {
				System.out.print(k + " ");	
			}
		});
				
		sc.close();
	}
}
