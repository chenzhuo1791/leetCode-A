package chen.practiceC;

import java.util.HashSet;
import java.util.Set;

public class StringLongestLength {

	public static void main(String[] args){
		String string = "afsafsdd" ;
		Integer result = lengthOfLongestSubString(string);
		System.out.println("  @@ lengthOfLongestSubString : " + result);
	}

	public static Integer lengthOfLongestSubString(String string){
		Integer result = 0 ;
		if (string != null) {
			Integer length = string.length();
			for (int j = 0 ; j < length ; j++) {
				for (int k = j + 1; k <= length; k++) {
					boolean checkFlag = allUnique(string, j, k);
					if (checkFlag == true) {
						result = Math.max(result, k - j);
					}
				}
			}
		}
		return result ;
	}

	public static boolean allUnique(String string , Integer start , Integer end){
		boolean flag = false ;
		Set<Character> set = new HashSet<Character>();
		for (int i = start ; i < end ; i++) {
			Character temp = string.charAt(i);
			if (set.contains(temp)) {
				return flag;
			} else {
				set.add(temp);
			}
		}
		flag = true ;
		return flag ;
	}


}
