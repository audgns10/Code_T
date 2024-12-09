// 12.문제

// 문자들이 담겨있는 배열 arr가 주어집니다.
// arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

class Solution {
    fun solution(arr: Array<String>) = arr.joinToString("") // 나의 풀이
}

// 문자열로 이루어진 배열 arr 인자를 받는다.
// 배열이나 리스트의 메소드인 배열의 각 요소를 주어진 구분자를 사용해 하나의 문자열을 만들 수 있는 joinToString을 사용한다.
// 여기서는 ""으로 했기 때문에 배열의 문자열들은 아무런 구분없이 그냥 붙여주게 된다.(""이 아니라 ,였다면 문자열의 각 문자에 ,이 붙어서 나왔을 것이다.)

class otherSolution {
    fun other_solution(arr: Array<String>): String {
        var answer: String = ""
        arr.forEach {
            answer += it
        }
        return answer
    }
} // 다른 사람의 풀이

// 위와 같이 문자열로 이루어진 배열 arr 인자를 받는다.
// forEach를 사용해 arr 문자열 배열의 문자를 하나씩 순열하며 answer값을 붙여서 나오게 해준다.