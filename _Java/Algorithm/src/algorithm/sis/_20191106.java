package algorithm.sis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import algorithm.custom.CustomList;

/**
 * 3회차 정렬의 구현
 * 
 * @author 소인성
 * @date 2019-11-06
 */
public class _20191106 extends CustomList
{
    static long start = 0;
    
    static long end = 0;
    
    static long total = 0;
    
    public static void main(String[] args)
    {
        int[] n = randomIntArray(1001, 1000);
        List<Integer> n2 = randomIntList();
        
        // 정렬 시작
        System.out.println("정렬 전 : " + Arrays.toString(n));
        start = System.currentTimeMillis();
        bubbleSort(n);
        System.out.println("정렬 시간 : " + (System.currentTimeMillis() - start) + " m/s");
        System.out.println("정렬 후 : " + Arrays.toString(n));
    }
    
    public static int[] bubbleSort(int[] n)
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
        
        return n;
    }
    
    public static void insertionSort(int[] n)
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
    
    public static void selectionSort(int[] n)
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
    
    // 퀵 정렬 : 리스트 형태
    public static List<Integer> quickSort(List<Integer> n)
    {
        if (n.size() < 2)
            return n;
        
        int pivot = n.get(0);
        
        List<Integer> lower = new ArrayList<Integer>();
        List<Integer> higher = new ArrayList<Integer>();
        
        for (int i = 1; i < n.size(); i++)
        {
            if (pivot > n.get(i))
                lower.add(n.get(i));
            else
                higher.add(n.get(i));
        }
        
        List<Integer> answer = quickSort(lower);
        answer.add(pivot);
        answer.addAll(quickSort(higher));
        
        return answer;
    }
    
    // 퀵 정렬 : 배열 형태
    public static void quickSort(int n[], int lower, int higher)
    {
        
        if (lower < higher)
        {
            int pivotNewIndex = partition(n, lower, higher);
            
            quickSort(n, lower, pivotNewIndex - 1);
            quickSort(n, pivotNewIndex + 1, higher);
        }
        
    }
    
    // 퀵 정렬 : 재귀호출(분할)
    public static int partition(int[] n, int lower, int higher)
    {
        
        int pivot = n[(lower + higher) / 2];
        
        while (lower < higher)
        {
            while ((n[lower] < pivot) && (lower < higher))
                lower++;
            while ((n[higher] > pivot) && (lower < higher))
                higher--;
            
            if (lower < higher)
            {
                int temp = n[lower];
                n[lower] = n[higher];
                n[higher] = temp;
            }
        }
        
        return lower;
    }
}
