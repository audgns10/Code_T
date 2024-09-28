// 18.문제

// 양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면
// n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.

class Solution {
    fun solution(n: Int) : Int {
        var answer: Int = 0
        if (n % 2 == 0) {
            for (i in 0 .. n step 2) {
                answer += i * i
            }
        } else {
            for (i in 1 .. n step 2) {
                answer += i
            }
        }
        return answer
    }
} // 나의 답변

// n이 짝수이면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return을 해야하므로 조건식에서 n이 짝수 2로 나누어 떨어지면 for문을 돌려서 n이하의 짝수의 제곱의 합을 구해준다.
// 위의 조건식이 아닐 경우에는 n이하의 홀수의 합을 구하는 코드를 써준다.

import kotlin.math.pow

class ohterSolution {
    fun other_solution(n: Int) = if (n % 2 != 0) (1..n step 2).sum() else (2..n step 2).map { it.toDouble().pow(2.0) }.sum().toInt()
} // 다른 사람의 답변

// 여기서 첫 번째로 n이 홀수인자 짝수인지 구분하는 조건식이 나오게 된다.
// n이 짝수가 아닐 경우 -> 1부터 n까지 2씩 증가하는 시퀸스를 써주고, 해당 시퀸스의 모든 값의 합을 구하는 .sum()를 반환한다.
// n이 짝수일 경우 -> 2부터 n까지 2씩 증가하는 시퀸스를 써주고, 각 숫자를 Double 타입으로 변환한 후, 그 값의 제곱을 새로운 리스트에 변환하고, 이 모든 리스트의 값을 .sum()으로 구한 후 Int형으로 다시 변환한 후 반환을 한다.