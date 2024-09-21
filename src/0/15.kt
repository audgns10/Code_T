// 15.문제

// 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
// 12 ⊕ 3 = 123
// 3 ⊕ 12 = 312
// 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
// 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.

class Solution {
    fun solution(a: Int, b: Int): Int {
        var first = "$a$b"
        var second = 2 * a * b
        return if (first.toInt() > second || first.toInt() == second) {
            first.toInt()
        } else {
            second
        }
    }
} // 나의 풀이

// 14번 문제와 같이 로직을 짜고, first와 second 함수의 값만 변경해서 if .. else 조건식으로
// first가 second의 값보다 더 크다면 first 또는 서로 값이 같다면 first가 나올 수 있게 하고, 그외의 값은 second로 나오게 해주면 된다.

class otherSolution {
    fun other_solution(a: Int, b: Int): Int = max("$a$b".toInt(), 2 * a * b)
} // 다른 사람의 풀이

// max라는 두개의 수 중에서 더 큰값을 리턴 시키는 함수를 사용하여
// 나의 풀이 보다 더 간소화 된 코드를 확인할 수 있다.
// return은 생략하고 위와 같이 사용할 수 있다.