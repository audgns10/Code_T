// 13.문제

// 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.

class Solution {
    fun solution(my_string: String, k: Int) {
        var answer = StringBuilder()
        repeat(k) {
            answer.append(my_string)
        }
        return answer.toString()
    }
} // 나의 풀이

// anser의 문자열을 더 효율적으로 사용하기 위해 StringBuilder()로 변경을 해주고, return에 .toString()를 붙여준다.
// 문제에서 문자열 my_string을 정수 k 만큼 반복하여 return하는 값을 원하기 때문에 repeat()를 사용하여 k번 반복을 한다고 해준다.
// 마지막으로 answer를 return 해주면 된다.

class OtherSolution {
    fun other_solution(my_string: String, k: Int) = my_string.repeat(k)
} // 다른 사람의 풀이

// 해당 풀이는 나와 방법 자체는 같지만 return을 위와 같이 간소화하여 쓸 수 있다는 점을 이용하여 코드를 간소화하여 풀이하였다.