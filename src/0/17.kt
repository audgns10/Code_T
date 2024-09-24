// 17.문제

// 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

class Solution {
    fun solution(number: Int, n: Int, m: Int): Int = if (number % n == 0 && number % m == 0) 1 else 0
} // 나의 풀이

// 공배수 즉, number가 n과 m의 배수일 경우에 1을 return하고 그것이 아닌 경우에는 0을 return하게 하게 하였다.

class otherSolution {
    fun other_solution(number: Int, n: Int, m: Int): Int {
        var answer: Int = 0
        return 1.takeIf{number % n == 0 && number % m == 0} ?: 0
    }
} // 다른 사람의 풀이

// 해당 풀이는 takeIf라는 함수를 처음보게 되어 가지고 와보았다.
// 핵심 로직 14번째 줄은 takeIf은 ture일 때는 자기 자신을 반환(해당 코드에서는 1)하고, false일 때는 null 값을 반환한다.
// ?: 는 엘비스 연산자 이다. 즉, 왼쪽의 값이 null일 때 오른쪽 값(해당 코드에서는 0)을 반환하는 코드이다.