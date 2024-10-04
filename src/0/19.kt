// 문제.19

// 문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.
//
//두 수가 n과 m이라면
//">", "=" : n >= m
//"<", "=" : n <= m
//">", "!" : n > m
//"<", "!" : n < m
//두 문자열 ineq와 eq가 주어집니다. ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다.
// 그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.

class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        val answer: Int = 0
        when ("$ineq$eq") {
            ">=" -> answer = if (n >= m) 1 else 0
            "<=" -> answer = if (n <= m) 1 else 0
            ">!" -> answer = if (n > m) 1 else 0
            "<!" -> answer = if (n < m) 1 else 0
        }
        return answer
    }
} // 나의 풀이

// 해당 문제는 문자열에 따라 다음과 같이 두 수의 크기를 비교하는 문제이다.
// 일단 두 수를 비교하는 문자열을 각각의 조건에 맞게 나와야하기 때문에 when문을 사용하여 간단하게 처리할 수 있다.
// 간단하게 조건식은 참이면 1이 나오고 거짓이라면 0이 나오게 되어있다.

class otherSolution {
    fun other_solution(ineq: String, eq: String, n: Int, m: Int): Int {
        return when {
            ineq == "<" && eq == "=" -> n <= m
            ineq == "<" && eq == "!" -> n < m
            ineq == ">" && eq == "=" -> n >= m
            ineq == ">" && eq == "!" -> n > m
            else -> false
        }.let { if (it) 1 else 0 }
    }
} // 다른 사람의 풀이

// 해당 코드는 나의 코드와 비슷하게 when을 사용하여 간단하게 처리하는 방법이다.
// 각각의 조건을 쓰고, 해당 조건식이 하나라도 없다면 false를 반환하게 된다.
// when문의 결과는 Boolean으로 Ture와 False로 나온다.
// let 블럭을 사용하여 만약에 Ture일 경우에는 1을 출력하고 False일 때는 0을 출력하게 된다. 