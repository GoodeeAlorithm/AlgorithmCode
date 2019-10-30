package algorithm.hdy;

public class problem3 {
//	배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
//
//	예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
//	array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
//	1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
//	2에서 나온 배열의 3번째 숫자는 5입니다.
//
//	배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해
//	앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//
//	[제한사항]
//	array의 길이는 1 이상 100 이하입니다.
//	array의 각 원소는 1 이상 100 이하입니다.
//	commands의 길이는 1 이상 50 이하입니다.
//	commands의 각 원소는 길이가 3입니다.
	  
	
	public static int[] solution(int[] array, int[][] commands) {
		System.out.println("::: solution :::");
		int now =0;
		if(commands[1][0] > commands[1][1]) {
			now = commands[1][0] - commands[1][1] +1;
		}
		else {
			now = commands[1][1] - commands[1][0]+1;
		}
		
		System.out.println(now);
	    int[] answer = new int[now];
	    
	    int count=0;
	    System.out.println((commands[1][0]-1)+" ~ "+(commands[1][1]-1));
	    for(int i = commands[1][0]-1 ; i < commands[1][1] ; i++) {
	    	answer[count] = array[i];
	    	System.out.println("count:"+count+i);
	    	
    		for(int j=0;j<count;j++) {
    			if(answer[j]>answer[count]) {
    				int temp = answer[j];
    				answer[j] = answer[count];
    				answer[count]=temp;
    			}
    		}
	    	
	    	
	    	count++; // 0 -> 1 2 3 4 
	    	if(count==commands[1][1]) {
	    		System.out.println("탈출");
	    		break;
	    	}
	    }

	    for (int i : answer) {
			System.out.print(i+"  ");
		}  
	    System.out.println("END");
	    return answer;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 6, 2, 11,5, 3, 7, 4, 10, 9};
		int i =2, j=8, k=3;
		int[] temp = {i,j,k};
		int[][] commands = new int[2][];	// 비정방형 배열 
		commands[0] = array;
		commands[1] = temp;
		
		int sol[] = solution(array, commands);
		
		System.out.println(sol[commands[1][2]-1]);

	}

}
