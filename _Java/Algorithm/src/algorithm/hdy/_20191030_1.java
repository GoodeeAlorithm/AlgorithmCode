package algorithm.hdy;

public class _20191030_1 {
	// "최댓값과 최솟값 구하기"
	// 주어지는 값

	public static void main(String[] args) {
		int[] n = { 8, 1, 45, 21, 22, 37, 6, 8, 2, 79 };
		solution1(n);
	}

	static void solution1(int[] n) {
		int maxNum = 0;
		int minNum = 0;
		maxNum = minNum = n[0];
		
		for (int i = 1; i < n.length - 1; i++) {
			
			if (n[i] > n[i + 1]) {
				minNum = n[i + 1];
				System.out.println("min: "+minNum);
			} else {
				maxNum = n[i + 1];
			}
		}

		System.out.println("최댓값은 : " + maxNum);
		System.out.println("최솟값은 : " + minNum);
	}
}
