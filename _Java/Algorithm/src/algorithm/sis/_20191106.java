package algorithm.sis;

import java.util.Arrays;

import algorithm.custom.CustomList;

/**
 * 3회차 정렬의 구현
 * 
 * @author 소인성
 * @date 2019-11-06
 */
public class _20191106
{
    public static void main(String[] args)
    {
        int[] input = CustomList.randomIntArray();
        System.out.println("# 버블 정렬 시작!");
        System.out.println("정렬 x 배열 : " + Arrays.toString(input));
        bubbleSort(input);
        System.out.println("정렬 o 배열 : " + Arrays.toString(input));
        System.out.println(">> 버블 정렬 종료!");
        
        input = CustomList.randomIntArray();
        System.out.println("# 삽입 정렬 시작!");
        System.out.println("정렬 x 배열 : " + Arrays.toString(input));
        insertionSort(input);
        System.out.println("정렬 o 배열 : " + Arrays.toString(input));
        System.out.println(">> 삽입 정렬 종료!");
        
        input = CustomList.randomIntArray();
        System.out.println("# 선택 정렬 시작!");
        System.out.println("정렬 x 배열 : " + Arrays.toString(input));
        insertionSort(input);
        System.out.println("정렬 o 배열 : " + Arrays.toString(input));
        System.out.println(">> 선택 정렬 종료!");
    }
    
    static void bubbleSort(int[] n)
    {
        int temp = 0;
        for (int i = 0; i < n.length; i++)
        {
            for (int j = i + 1; j < n.length; j++)
            {
                if (n[i] > n[j])
                {
                    temp = n[j];
                    n[j] = n[i];
                    n[i] = temp;
                }
                
                // 내림차순 정렬
                // if (n[i] < n[j])
                // {
                //     temp = n[j];
                //     n[j] = n[i];
                //     n[i] = temp;
                // }
            }
        }
    }
    
    static void insertionSort(int[] n)
    {
        int temp = 0;
        
        for (int i = 1; i < n.length; i++)
        {
            int j;
            temp = n[i];
            for (j = i; j > 0 && n[j - 1] > temp; j--)
            {
                n[j] = n[j - 1];
            }
            n[j] = temp;
            
        }
    }
    
    static void selectionSort(int[] n)
    {
        int temp = 0;
        for (int i = 0; i < n.length; i++)
        {
            int min = i;
            for (int j = n.length - 1; j > i; j--)
            {
                if (n[j] < n[min])
                    min = j;
            }
            temp = i;
            n[i] = n[min];
            n[min] = temp;
        }
    }
}
