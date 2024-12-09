// 22.문제

// 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.

class Solution {
    fun solution(num_str: String): Int {
        var answer: Int = 0
        val num_str_array = num_str.toCharArray()
        num_str_array.forEach {
            answer += it.digitToInt()
        }
        return answer
    }
} // 나의 풀이

// 먼저 String으로 받은 문자열을 배열로 바꾸어 한글자씩 나눈다.
// forEach로 배열의 각 문자를 돌고, digitToInt()를 사용해 문자를 숫자로 변환하고, answer에 각각의 숫자를 더하도록 해준다.
// 여기서 배열로 바꾸어주는 로직은 굳이 없어도 될듯함.

class otherSolution {
    fun other_solution(num_str: String): Int {
        return num_str.map{ it.digitToInt() }.sum()
    }
} // 다른 사람의 풀이

// num_str의 값 각각을 .digitToInt()를 사용해서 Int형으로 바꾸어주고 sum()를 사용하여 변환된 리스트의 값을 모두 더해준다.