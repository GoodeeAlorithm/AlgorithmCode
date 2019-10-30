package algorithm.hdy;

public class problem4 {
//	동혁이는 나무 조각을 5개 가지고 있다. 나무 조각에는 1부터 5까지 숫자 중 하나가 쓰여져 있다.
//	또, 모든 숫자는 다섯 조각 중 하나에만 쓰여 있다.
//
//	동혁이는 나무 조각을 다음과 같은 과정을 거쳐서 1, 2, 3, 4, 5 순서로 만들려고 한다.
//
//	첫 번째 조각의 수가 두 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
//	두 번째 조각의 수가 세 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
//	세 번째 조각의 수가 네 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
//	네 번째 조각의 수가 다섯 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
//
//	만약 순서가 1, 2, 3, 4, 5 순서가 아니라면 1 단계로 다시 간다.
//
//	처음 조각의 순서가 주어졌을 때, 위치를 바꿀 때 마다 조각의 순서를 출력하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {
		int[] n = {1, 5, 4, 3, 2};
		for(int h :n) {
			System.out.print(h+" ");
		}
		System.out.println();
		solution4(n);
	}
	
	public static void solution4(int[] n) {
		
		for(int i =0; i< n.length-1 ; i++) {
			System.out.println(":::"+ i +":::");
			
			
			if(n[i] > n[i+1]) {
				int temp = n[i];
				n[i] = n[i+1];
				n[i+1]=temp;
			}
			
			if(i == n.length-2) {
				System.out.println("came in");
				for(int j =0; j < i ; j++) {
					for(int k = j;k<n.length-1;k++) {
						if(n[k]>n[k+1]) {
							i=0;
							break;
						}	
					}
					if(i==0) {
						break;
					}
				}
				
			} 
			System.out.println("확인");
			for(int h :n) {
				System.out.print(h+" ");
			}
			System.out.println();
		}
		
		System.out.println("최종");
		for(int h :n) {
			System.out.print(h+" ");
		}
	}
	
}

