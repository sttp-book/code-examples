package tudelft.intro;

public class MinMax {

	private int min = Integer.MAX_VALUE;
	private int max = Integer.MIN_VALUE;

	public void find(int[] nums) {
		for (int num : nums) {
			if(num < min)
				min = num;
			if (num > max)
				max = num;
		}
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}
}
