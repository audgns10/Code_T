// 문제.29

// 요세푸스 문제는 다음과 같다.
// 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다.
// 이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.
// 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다.
// 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
// N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.

class Solution {
    fun solution(n: Int, m: Int) : List<Int> {
        val people = (1..n).toMutableList()
        val answer = mutableListOf<Int>()
        var index = 0

        while (people.isNotEmpty()) {
            index = (index + m - 1) % people.size
            answer.add(people.removeAt(index))
        }

        return answer
    }
}

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }

    val solution = Solution()

    print(solution.solution(n, k).joinToString(", ", "<", ">"))
} // 나의 풀이

// 먼저 둘러 앉아있는 사람 N명의 수와 사람을 제거할 K번째의 수를 받고 리스트로 반환을 해주도록한다.
// people이라는 변수가 1부터 n까지의 리스트를 가지도록한다.
// answer은 제거된 사람들의 순서를 저장할 수 있도록한다.
// index는 제거된 사람의 위치를 알 수 있도록 하기 위해서 초기화를 하였다.
// people의 리스트가 비지 않을때까지 while문을 순환하도록 한다.
// index + (m -1)로 m번째 위치를 찾을 수 있도록 하고, 0부터 시작하는 인덱스이기때문에 m - 1을 더해준다.
// people.size 이렇게 리스트의 사이즈를 나머지 연산할 수 있도록한 이유는 리스트의 끝에 도달하면 처음으로 돌아가야 하기 때문이다.
// 마지막으로 제거된 순서를 리스트로 반환한다.
// main 함수에서는 각각 사람 수와 제거할 번수를 입력 받는다.
// 마지막으로 solution 함수에서 오세푸스 순열을 돌고나서 print로 출력을 해준다.