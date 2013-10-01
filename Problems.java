public class  Problems {
	
	public static void main(String[] args) {

		int[] a = {2, 4, 4, 4, 5, 5, 7, 9};





	}

	//Given an array of ints, return true if the value 3 appears
	//in the array exactly 3 times, and no 3's are next to each other.
	
	public static boolean haveThree(int[] nums) {

		int count = 0;
		
		for (int i=0; i < nums.length; i++) {
			if (nums[i] == 3) {
				count++;	
			}		
		}


		for (int i=0; i < nums.length-1; i++) {
			if (nums[i] == 3 && nums[i+1] == 3) {
				return false;
			}
		}


		if (count==3) {
			return true;
		}

		return false;
	}


	//Given an array of ints, return true if every 2 that appears 
	//in the array is next to another 2.

	public static boolean	twoTwo(int[] nums) {

		if (nums.length == 0) {
			return true;
		}
		if (nums.length == 1) {
			if (nums[0] == 2) {
				return false;
			} else {
				return true;
			}
		}

		if (nums[nums.length - 1] == 2) {
			if (nums[nums.length - 1] != nums[nums.length - 2]) {
				return false;
			}
		}

		for (int i = 0; i < nums.length-1; i++) {
			
			if (nums[i] == 2) {
				if (nums[i+1] != 2) {
					return false;			
				} else {
					i++;
				}			
			}		

		}


		return true;


	}


	// Return true if the group of N numbers at the start and end of the array are the same. 
	//For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and 
	//false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.
	public static boolean sameEnds(int[] nums, int len) {

		if (len == 0) {
			return true;
		}

		for (int i=0; i < len ; i++) {
			if (nums[i] != nums[(nums.length) - len + i]) {
				return false;
			}
		}

		return true;

	}


	//Return true if the array contains, somewhere, three increasing adjacent 
	//numbers like .... 4, 5, 6, ... or 23, 24, 25.
	public static boolean tripleUp(int[] nums) {

		if (nums.length < 3) {
			return false;
		}

		for (int i=2; i<nums.length; i++) {
			if (nums[i] == (nums[i-1] + 1) && nums[i-1] == (nums[i-2] + 1))  {
				return true;	
			}
		}

		return false;

	}

	//Given start and end numbers, return a new array containing the sequence of integers 
	//from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. 
	//The end number will be greater or equal to the start number. Note that a length-0 array is valid.
	public int[] fizzArray3(int start, int end) {

		int[] array = new int[(end-start)];
		int count = 0;

		for (int i = start; i < end; i++) {
			array[count] = i;
			count ++;
		}

		return array;
	}

	
	//Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and 
	//return the given array, or return a new array. 
	public int[] shiftLeft(int[] nums) {

		if (nums.length == 0) {
			return nums;
		}

		int first = nums[0];

		for (int i = 0; i < nums.length-1; i++) {
			nums[i] = nums[i+1];
		}

		nums[nums.length-1] = first;

		return nums;

	}


	//Given a non-empty array of ints, return a new array containing the elements from the original
	//array that come before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0. 
	public int[] pre4(int[] nums) {

		int length = 0;

		for (int i=0; nums[i]!=4; i++) {
			length++;
		}

		int[] array = new int[length];

		for (int i=0; i < nums.length; i++) {
			if (nums[i] == 4) {
				return array;
			}
			array[i] = nums[i];
		}

		return array;

	}


	//We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, 
	//at least one of the pair is that value. Return true if the given value is everywhere in the array. 
	public int[] isEverywhere(int[] nums, int val) {

		for (int i=0; i<nums.length-1; i++) {
			if (nums[i] != val && nums[i+1] != val) {
				return false;
			}
		}

		return true;

	}

	//Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both. 
	public boolean either24(int[] nums) {

		int fours = 0;
		int twos = 0;

		for (int i=0; i<nums.length-1; i++) {
			if (nums[i] == 4 && nums[i+1] == 4) {
				fours++;
			}
			if (nums[i] == 2 && nums[i+1] == 2) {
				twos++;
			}
		}

		if (fours > 0 && twos == 0) {
			return true;
		} else if (twos > 0 && fours ==0) {
			return true;
		} else {
			return false;
		}

	}

	


}