using System;
using System.Collections.Generic;
using System.Linq;

namespace Algorithm
{
    public class implementsClass
    {
        public List<int> QSort(int[] n)
        {          
            if(n.Length < 2)
            {
                return n.ToList();
            }

            int pivot = n[0];
            List<int> lower = new List<int>();
            List<int> higher = new List<int>();

            for(int i = 1; i< n.Length; i++)
            {
                if(n[i] < pivot)
                {
                    lower.Add(n[i]);
                }
                else
                {
                    higher.Add(n[i]);
                }
            }

            List<int> answer = QSort(lower.ToArray());
            answer.Add(pivot);
            answer.AddRange(QSort(higher.ToArray()));

            return answer;
        }
        
    }
}
