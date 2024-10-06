// 20.문제

// 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때,
// flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.

class Solution {
    fun solution(a: Int, b: Int, flag: Boolean): Int = if (flag) a + b else a - b
} // 나의 풀이

// 간단하게 if .. else 조건식을 사용하여 flag가 ture 일때는 a+b를 출력하고 그외의 값(false ..) 일때는 a-b를 출력할 수 있게 하였다.

// 이번 문제 20번은 다른 사람의 풀이도 비슷하기 때문에 생략하겠다.