
public class Solution {

	public static void main(String[] args) {
		
		int[] input = {1,3,1,4,2,3,4,4};
		
		int time = solution(5, input);
		System.out.print(time);
		
	}
	
	public static int solution(int X, int[] A) {
		int earliestTime = -1;
		
		int count = X;
		
		int[] position = new int[X + 1];
		
		for(int i=0; i<A.length; i++) {
			
			position [A[i]] += 1;
			
			if(position[A[i]] == 1) {
			count--;
			if (count == 0) {
				earliestTime = i;
				break;
			}
			}
		}
		
		return earliestTime;
	}

}
