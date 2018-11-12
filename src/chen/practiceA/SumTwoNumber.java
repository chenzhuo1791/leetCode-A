package chen.practiceA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumTwoNumber {

	public static void main(String[] args){
		System.out.println("  hello world !");
//		int[] nums = {2, 7, 11, 15} ; int target = 26 ;
		int[] nums = {15, 11, 2, 7} ; int target = 26 ;
		/** method1 **/
//		int[] results = twoSum(nums, target);
//		System.out.println(Arrays.toString(results));
		/** method2 **/
//		int[] results = twoSumHashA(nums, target);
//		System.out.println(Arrays.toString(results));
		/** method3 **/
		int[] results = twoSumHashB(nums, target);
		System.out.println(Arrays.toString(results));

	}

	/**
	 *	简单来说，时间复杂度指的是语句执行次数，空间复杂度指的是算法所占的存储空间
	 *	时间复杂度是指执行算法所需要的计算工作量,时间复杂度的计算并不是计算程序具体运行的时间，而是算法执行语句的次数。
	 *	平均时间复杂度是指所有可能的输入实例均以等概率出现的情况下，算法的期望运行时间。
	 *	通常我们计算时间复杂度都是计算最坏情况
	 *	空间复杂度(Space Complexity)是对一个算法在运行过程中临时占用存储空间大小的量度
	 */

	/**
	 *	因为 HashMap 的低时间复杂度，同时索引值逐层向上包容，所以，最后索引值的结果中
	 *	前面的索引值存放于map的反转 getValue 中
	 */

	public static int[] twoSum(int[] nums, int target) {
		int length = nums.length ;
		int[] results = new int[2];
		for(int i = 0 ; i < length -1 ; i++ ){
			for(int j = i+1 ; j <length ; j++) {
				if (nums[ i ] + nums[ j ] == target) {
					results[ 0 ] = i;
					results[ 1 ] = j;
					break;
				}
			}
		}
		return results ;
	}

	public static int[] twoSumHashA(int[] nums, int target){
		int[] results = new int[ 2 ];
		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for (int i = 0 ; i < nums.length ; i++) {
			numberMap.put(nums[ i ], i);
		}
		for (int i = 0 ; i < nums.length ; i ++) {
			int component = target - nums[i] ;
			if (numberMap.keySet().contains(component) && numberMap.get(component) != i){
				results = new int[]{numberMap.get(component), i};
			}
		}
		return results;
	}

	public static int[] twoSumHashB(int[] nums, int target) {
		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for (int i = 0 ; i < nums.length ; i ++) {
			int component = target - nums[ i ];
			if (numberMap.keySet().contains(component) && numberMap.get(component) != i){
				return new int[]{numberMap.get(component), i};
			}
			numberMap.put(nums[ i ], i);
		}
		throw new IllegalArgumentException(" There is no such two number");
	}

}
