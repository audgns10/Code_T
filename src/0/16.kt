// 16.문제

// 정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.

class Solution {
    fun solution(num: Int, n: Int): Int {
        if (num % n == 0) {
            return 1
        } else {
            return 0
        }
    }
} // 나의 풀이

// 간단하게 n의 배수인지 배수가 아닌지만 구분하는 if .. else 조건식만 있으면 되기때문에
// 위와 같이 num을 n으로 나누었을때 나누어 떨어진다면 1을 출력하고 그게 아니라면 0을 출력하는 로직을 짜면 된다.

class otherSolution {
    fun other_solution(num: Int, n: Int): Int {
        return if (num % n == 0) 1 else 0
    }
} // 다른 사람의 풀이

// 위의 코드에서 더 간단하게 코드를 써준것이다.
// 로직은 동일하다.