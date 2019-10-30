package algorithm.hdy;

public class problem2 {
//	"URI변환"
//* 문자열에 들어 있는 모든 공백을 '%20'으로 바꿔 주는 메서드를 작성하라.
//* 최종적으로 모든 문자를 다 담을 수 있을 만큼 충분한 공간이 이미 확보되어 있다.
//* 문자열의 최종 길이가 함께 주어진다고 가정해도 된다.
//* (자바로 구현한다면 배열 안에서 작업할 수 있도록 문자 배열(character array)를 이용하길 바란다)

public static void main(String[] args) {
	// 일단 문자열 선언
	String str = "ecli ps e "; // 공백이 3개 여기서 문자열 길이는 10 3개에 %20 이 들어가면 3*3는 9개... 그래서 최종 길이는 19
	// System.out.println(str.charAt(4));
	char[] strArr = replaceSpaces(str, 19);
	
	System.out.println(strArr);
	// 공간 확보 문자열의 최종 길이가 함께 주어진다.
}

static char[] replaceSpaces(String str, int trueLength){
    char[] array = new char[trueLength];	// 미정
    char[] twe = {'%', '2', '0'};
    //  System.out.println(twe);
    int temp = 0;
    
    for(int i=0;i<str.length();i++) {
    	// 공백 있나요?
    	if(str.charAt(i) == ' '){ //공백 있으면 %20 넣기 
    		// System.out.println("temp: "+temp);	// 4, 7, 9나옴 공백 뽑기 완료 
    		for(int j=0; j<3; j++) {
    			array[temp] = twe[j];
    			// System.out.println(temp +"자리에 넣기 "+twe[j]);
    			temp++;
    		}
    		continue;
    	}
    	// 어레이에 str 그대로 저장
    	array[temp] = str.charAt(i);
    	temp++;
    }
    // charAt(index)
    //" "이면 %20을....넣는다.
    	    
    return array;
}
}