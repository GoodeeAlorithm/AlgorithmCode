package algorithm.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * 랜덤 난수 리스트/배열 생성
 * 
 * @author 소인성
 * @date 2019-11-06
 */
public class CustomList
{
    public static void main(String[] args)
    {
        System.out.print("[ ");
        for (int i : randomIntList(15, 10))
            System.out.print(" " + i + " ");
        System.out.println(" ]");
        
        System.out.println();
        System.out.println("====================================================");
        
        System.out.print("[ ");
        for (int i : randomIntArray())
            System.out.print(" " + i + " ");
        System.out.println(" ]");
    }
    
    /**
     * 중복 없는 난수 리스트 생성
     * 
     * @param maxInt
     *            난수의 범위(예: maxInt = 5 일 때 1 ~ 5 사이의 난수 생성)
     * @param listSize
     *            난수 리스트의 원소 갯수(예: listSize = 5 일 때 5개의 난수를 담은 리스트 생성)
     * @return List<Integer>
     */
    public static List<Integer> randomIntList(int maxInt, int listSize)
    {
        if (maxInt < listSize)
        {
            throw new IllegalArgumentException("숫자 범위의 갯수보다 리스트의 크기가 클 수 없습니다.");
        }
        
        Random rng = new Random();
        
        Set<Integer> generated = new LinkedHashSet<Integer>();
        
        while (generated.size() < listSize)
        {
            Integer next = rng.nextInt(maxInt) + 1;
            generated.add(next);
        }
        
        return new ArrayList<Integer>(generated);
    }
    
    /**
     * 중복 없는 난수 리스트 포워드
     * 
     * @default maxInt = 100, listSzie = 20;
     * @return List<Integer>
     */
    public static List<Integer> randomIntList()
    {
        return randomIntList(100, 20);
    }
    
    /**
     * 중복 없는 난수 배열 생성
     * 
     * @param maxInt
     *            난수의 범위(예: maxInt = 5 일 때 1 ~ 5 사이의 난수 생성)
     * @param arrSize
     *            난수 리스트의 원소 갯수(예: listSize = 5 일 때 5개의 난수를 담은 배열 생성)
     * @return
     */
    public static int[] randomIntArray(int maxInt, int arrSize)
    {
        if (maxInt < arrSize)
        {
            throw new IllegalArgumentException("숫자 범위의 갯수보다 배열의 크기가 클 수 없습니다.");
        }
        
        Random rng = new Random();
        
        Set<Integer> generated = new LinkedHashSet<Integer>();
        
        while (generated.size() < arrSize)
        {
            Integer next = rng.nextInt(maxInt) + 1;
            generated.add(next);
        }
        
        return Arrays.stream(Arrays.copyOf(generated.toArray(), generated.size(), Integer[].class)).mapToInt(i -> i).toArray();
    }
    
    /**
     * 중복 없는 난수 배열 포워드
     * 
     * @default maxInt = 100, listSzie = 20;
     * @return
     */
    public static int[] randomIntArray()
    {
        return randomIntArray(100, 20);
    }
}
