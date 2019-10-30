using System;

namespace Algorithm
{
    class Program
    {
        static void Main(string[] args)
        {
            // 클래스 선언
            var sol1 = new _20191023();
            
            // 1번 문제
            Console.WriteLine($"1회차 1번 문제 {sol1.solution1("asdfqdfamn")}");
            
            // 2번 문제
            Console.WriteLine($"1회차 2번 문제 {sol1.solution2("이진홍씨 스터디 하시네욧", 25)}");

            // 3번 문제
            int[] array = {1, 5, 2, 6, 3, 7, 4};
            int[,] commands = new int[3, 3]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
            Console.WriteLine($"1회차 3번 문제 {sol1.solution3(array, commands)}");

            // 4번 문제
            int[] n = {5,2,3,4,1};
            sol1.solution4(n);
        }
    }
}
