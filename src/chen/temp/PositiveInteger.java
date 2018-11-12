package chen.temp;


public class PositiveInteger {

	public static void main(String[] args){
		int[] A = {1,3};
		int result = solution(A);
		System.out.println(" result : " + result);
	}

	public static int solution(int[] A) {
		int length = A.length;
		int finalResult = length + 1  ;
		for (int result = 1; result <= length; result++) {
			int resultSign = 1 ;
			for (int j = 0; j < length; j++) {
				if (result == A[ j ]) {
					resultSign = 0 ;
					break;
				}
			}
			if (resultSign == 1) {
				if (result < finalResult) {
					finalResult = result;
					return finalResult ;
				}
			}
		}
		return finalResult ;
	}

}
