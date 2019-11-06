package algorithm.hdy;

import java.util.Arrays; 

import algorithm.custom.CustomList;

public class _20191106 {

	public static void main(String[] args) {

		CustomList cl = new CustomList();

		// 중복 없는 랜덤 난수 배열 생성
		int[] n = cl.randomIntArray(100, 20);
		System.out.println("중복 없는 랜덤 난수 배열 출력 :");
		System.out.println(Arrays.toString(n));
		
		System.out.println("버블");
		System.out.println(Arrays.toString(bubbleSort(n)));
		
		System.out.println("선택");
		System.out.println(Arrays.toString(selectSort(n)));

	}

	// 스왑 메소드 어떻게 구현.. ?
	public static void swap() {

	}

	// 버블 정렬
	public static int[] bubbleSort(int[] list) {

		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < list[i]) { // j 가 뒤
					int temp = list[j];
					list[j] = list[i];
					list[i] = temp;
				}
			}
		}
		return list;
	}

	// 선택 정렬
	public static int[] selectSort(int[] list) {
		
		
		
		int maxIndex= list.length-1;
		
		for (int i = list.length-1; i <=0; i--) {
			for (int j = i; j >= 0; j--) {
				if (list[maxIndex] < list[j]) {
					maxIndex = j;
				}
			}
			
			int temp = list[i];
			list[i] = list[maxIndex];
			list[maxIndex] = temp;	
		}
		return list;
	}

	// 삽입 정렬
	public static void insertSort(int[] list) {
		
	}
	
	// 퀵 정렬
	public static void quickSort(int[] list) {
		
	}

}
