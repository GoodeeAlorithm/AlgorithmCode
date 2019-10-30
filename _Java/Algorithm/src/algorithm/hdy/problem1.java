package algorithm.hdy;

public class problem1 {
//	- "중복이 없는가"
//	  * > 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하라.
//	  * > 자료구조를 추가로 사용하지 않고 풀 수 있는 알고리즘 또한 고민하라.
	
	public static void main(String[] args) {
		// 문자열 선언 초기화 
		// 문자열에 있는 문자를... 뽑아서 비교... 배열..
		String str = "eclipse";
		
		if(isUniqueChars(str)) {
			System.out.println("중복된 문자가 있습니다.");
			return;
		}
		System.out.println("중복된 문자가 없습니다.");
		
	}
	
	static boolean isUniqueChars(String str){
		char[] arr = str.toCharArray();
		
		for(int i =0; i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					 return true;
				}
			}
			return false;
		}		
	    
		 return true;
	}
}
