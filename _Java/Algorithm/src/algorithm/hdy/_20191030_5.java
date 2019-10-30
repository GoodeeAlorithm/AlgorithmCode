package algorithm.hdy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class _20191030_5 {
//	- "알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오."
//	  * > 길이가 짧은 것부터
//	  * > 길이가 같으면 사전 순으로
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		int hell = sc.nextInt();
//		System.out.println(hell);
		
		solution5();
	}
	
	// jhhh hh ahhh
	
	// 스캐너 사용시
	static void solution5(){
		System.out.println("진입");
	    Scanner sc = new Scanner(System.in);
	    String name = sc.nextLine(); // 라인 전체 읽어 오기 
	    
	    System.out.println(name.split(" "));
	    String arr[] = name.split(" "); // 공백으로 나눈다.
	    
	    System.out.println(arr.length);
	    for(String i: arr) {
	    	System.out.print(i + " ");
	    }
	    System.out.println();
	    for(int i =0;i<arr.length-1;i++) {
	    	for(int j=i;j<arr.length-1;j++) {
	    		if(arr[j].length()>arr[j+1].length()) {
	    			System.out.println("바꿉니다. "+arr[j+1].length());
		    		String temp = arr[j];
		    		arr[j] = arr[j+1];
		    		arr[j+1] = temp;
		    	}	    		
	    	}	    	
	    	
	    	if(arr[i].length() == arr[i+1].length()) {
    			System.out.println("같습니다. 검사 합니다");
    			// 문자 비교 
    			for(int num =0;num<arr[i].length();num++) {
    				if(arr[i].charAt(num) > arr[i+1].charAt(num)) {
    					System.out.println("앞 놈이 알파벳순으로 빠르다 바꾼다!!");
    					String temp = arr[i];
    		    		arr[i] = arr[i+1];
    		    		arr[i+1] = temp;
    		    		break;
    				}
    			}
    			
    		}
	    }
	    
	    for(String i: arr) {
	    	System.out.print(i + " ");
	    }
	    
	    
	    
	    
	}

	// 버퍼드리더 사용시
	void solution55(){
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	    int n = Integer.parseInt(br.readLine());

	    // 코드 작성
	}
	
}
