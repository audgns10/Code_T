// 23.문제

// 정수로 이루어진 리스트 num_list가 주어집니다.
// num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        val sortArray = num_list.sortedArray()
        sortArray.forEachIndexed { index, value ->
            if (index < 5) {
                answer.add(value)
            }
        }
        return answer.toIntArray()
    }
} // 나의 풀이

// 결과를 저장하기 위해 answer를 mutableListOf<Int>로 정의해준다.
// sortedArray()를 사용하여 오름차순 정렬을 해준다.
// forEachIndexed를 사용하여 정렬된 배열을 돌면서, 첫 5개의 값을 answer에 추가합니다. (index < 5 조건)
// 마지막 answer 반환값의 타입을 toIntArray()로 변환해준다.
// mutableList를 사용한 이유는 데이터 수정, 추가 등을 더 수월하게 관리할 수 있기 때문이다.

class otherSolution {
    fun other_solution(num_list: IntArray) : IntArray {
        return num_list.sortedArray().take(5).toIntArray()
    }
} // 다른 사람의 풀이

// .sorted().take(5)를 사용하면 내 코드를 위와 같이 최적화 할 수 있음을 볼 수 있다.