// 문제.28

// 상근이는 퀴즈쇼의 PD이다. 이 퀴즈쇼의 참가자는 총 8개 문제를 푼다.
// 참가자는 각 문제를 풀고, 그 문제를 풀었을 때 얻는 점수는 문제를 풀기 시작한 시간부터 경과한 시간과 난이도로 결정한다.
// 문제를 풀지 못한 경우에는 0점을 받는다. 참가자의 총 점수는 가장 높은 점수 5개의 합이다.
// 상근이는 잠시 여자친구와 전화 통화를 하느라 참가자의 점수를 계산하지 않고 있었다.
// 참가자의 8개 문제 점수가 주어졌을 때, 총 점수를 구하는 프로그램을 작성하시오.

class Solution {
    fun solution(list: List<Int>): Pair<Int, List<Int>> {
        val top5 = list
            .withIndex()
            .sortedByDescending { it.value }
            .take(5)

        val sum = top5.sumOf { it.value }
        val index = top5.sortedBy { it.index }.map { it.index + 1 }

        return Pair(sum, index)
    }
}

fun main() {
    val listInput = List(8) { readln().toInt() }

    val solution = Solution()

    val (sum, index) = solution.solution(listInput)

    print("$sum\n")
    print(index.joinToString(" "))
} // 나의 풀이

// 먼저 list 형식을 사용사로 부터 받는다. 그리고 Pair를 사용하여 합, 선정된 5개의 리스트를 반환할 수 있도록 한다.
// top5라는 변수 안에서는 받은 변수에서는 먼저 index, value를 구할 수 있는 withIndex()를 사용해주고, sortedByDescending 내림차순으로 정렬하도록 한다. 즉, 큰 값이 위로 올 수 있게
// take(5)로 그중 5개를 골라온다.
// sum 변수에서는 sumOf를 사용하여 선정된 5개의 합을 구한다.
// index에서는 먼저 내림차순으로 정렬된 인덱스를 다시 원래 인덱스로 돌려놓고 그중에서 인덱스를 뽑는다.(인덱스가 0부터 시작하기 때문에 1을 더해주어 1부터 시작할 수 있도록 함)
// 각각의 sum, index를 반환해준다.
// 사용자에게 총 8개의 리스트를 받고, 기능을 구현한 함수를 사용하여 각각 계산을 돌린뒤, print를 해준다.