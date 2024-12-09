// 문제.25

// N개의 수가 주어졌을 때, 이를 내림차순으로 정렬하는 프로그램을 작성하시오.
// 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
// 첫째 줄부터 N개의 줄에 내림차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

class Solution {
    fun solution(list: List<Int>) : List<Int> {
        return list.sortedDescending()
    }
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val numInput = reader.readLine().toInt()
    val listInput = IntArray(numInput) { reader.readLine().toInt() }

    val solution = Solution()
    val result = solution.solution(listInput.toList())

    val sb = StringBuilder()
    result.forEach { sb.append(it).append("\n") }

    print(sb)
} // 나의 풀이

// Solution 클래스를 먼저 만들어준다.
// 클래스에서는 list의 값을 내림차순으로 정렬해주는 로직을 짠다.
// Solution 클래스를 사용할 main 함수에서는 입력을 효율적으로 처리하기 위한 방법을 사용하여 빠르게 데이터를 읽을 수 있도록 하였다.
// numInput은 사용자 입력값이다.
// listInput은 numInput으로 받아온 값을 리스트 형식으로 바꾸어준다.
// StringBuilder()를 사용하여 입력한값을 한번에 받아오게 하여 성능을 높여준다.
// forEach를 사용하여 각각의 인덱스값에 줄바꿈을 할 수 있도록 해준다.
// 마지막으로 StringBuilder()인 sb를 출력해준다.

fun main() {
    val number = readLine!!.toInt()
    val sortedDigits = number.toString().toCharArray().sortedDescending().joinToString("\n")

    println(sortedDigits)
} // 다른 사람의 풀이

// 먼저 사용자로 부터 입력을 받는다.
// number는 정수형 이므로 문자열로 변환하기 위해서 toString()로 해준다.
// toCharArray()는 문자열을 문자 배열로 변환을 한다.
// sortedDescending() 함수는 toCharArray()로 얻은 문자 배열을 내림차순으로 정렬한다.
// joinToString("\n")를 사용하여 정렬된 문자 배열을 다시 문자열로 합친다. 각 문자를 하나의 문자열로 결합하게 되는데 빈 문자열 "\n"을 구분자로 사용하여 모든 문자들이 어이질 수 있도록 한다.
// 위에서 "\n"를 사용하여 각 문자들마다 줄 바꿈이 될 수 있도록 한다.
// 마지막으로 sortedDigits를 출력한다.