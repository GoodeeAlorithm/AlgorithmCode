using System;

namespace Algorithm
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] n = {8,1,45,21,22,37,6,3,2,79};
            // 클래스 선언
            var sol1 = new _20191023();
            var sisSol2 = new _20191030();
            
            // 1번 문제
            // sisSol2.solution1(n);
            
            // 2번 문제
            // sisSol2.solution2(10);
            // Console.WriteLine($"1회차 2번 문제 {sol1.solution2("이지홍씨 스터디 하시네욧", 25)}");

            // 3번 문제
            // sisSol2.solution3(100);

            // 4번 문제
            // sisSol2.solution4(n);

            // 5번 문제

            // 6번 문제
            // sisSol2.solution6(153248976);

            // 7번 문제
            sisSol2.solution7(n);
        }
    }
}
