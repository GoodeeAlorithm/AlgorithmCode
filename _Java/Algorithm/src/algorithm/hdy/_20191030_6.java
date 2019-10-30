package algorithm.hdy;

public class _20191030_6 {
	//6번 - "수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬하시오."
	public static void main(String[] args) {
		int n = 153248976;
		solution6(n);
	}
	
	static void solution6(int n){
		String answer =  Integer.toString(n);
		System.out.println(answer);

	    System.out.println("정렬된 수 : " + answer);
	}
}
