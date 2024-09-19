// 14.문제

// 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
// 12 ⊕ 3 = 123
// 3 ⊕ 12 = 312
// 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.

class Solution {
    fun solution(a: Int, b: Int): Int {
        val first = "$a$b"
        val second = "$b$a"
        return if (first.toInt() > second.toInt() || first.toInt() == second.toInt()) {
            first.toInt()
        } else {
            second.toInt()
        }
    }
} // 나의 풀이

// 일단 두가지 형태의 정수를 둘이 비교를 해야하기 때문에 위와 같이 first와 second로 두가지 형태의 비교를 해야하는 정수 두개를 만들어주고,
// return을 if 문으로 해서 first가 second 보다 그거나 같다면 first를 출력 그게 아니라면 second를 출력하게 끔 문제에 맞게 조건식을 써주었다.

import kotlin.math.*

class otherSolution {
    fun other_solution(a: Int, b: Int): Int = max("$a$b".toInt(), "$b$a".toInt())
} // 다른 사람의 풀이

// 다른 사람의 풀이는 조건 식을 사용하지 않고, 더 큰 값을 리턴 시키는 max()를 사용하여 간단하게 쓸 수 있다.
// 참고로 max()를 쓰기 위해서는 import문을 써주어야한다.