// Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.

// Note: a and b are not ordered!

// Examples (a, b) --> output (explanation)
// (1, 0) --> 1 (1 + 0 = 1)
// (1, 2) --> 3 (1 + 2 = 3)
// (0, 1) --> 1 (0 + 1 = 1)
// (1, 1) --> 1 (1 since both are same)
// (-1, 0) --> -1 (-1 + 0 = -1)
// (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)

public class SumOfNumbers {
    public int GetSum(int a, int b)
        {
        int total = 0;
        if(a == b){
            return a;
        } else if(a + 1 == b || b + 1 == a){
            return a + b;
        } else if (a < b){
            for(int i = a; i < b + 1; i++){
            total += i;
            }
            return total;
        } else{
            for(int i = b; i < a + 1; i++){
            total += i;
            }
            return total;
        }
        }
  }
