// 문제.24

// 팩토리얼 0의 개수

// N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.
// 첫째 줄에서 N이 주어진다.
// 첫째 줄에 구한 0의 개수를 출력한다.

class Solution {
    fun solution(value: Int?) : Int {
        var answer = 0
        var num = value ?: return 0

        while (num >= 5) {
            num /= 5
            answer += num
        }

        return answer
    }
}

fun main() {
    val input = readLine()?.toIntOrNull()

    val solution = Solution()

    val result = solution.solution(value = input)
    print(result)
} // 나의 풀이

// 먼저 팩토리얼이란 어떤 자연수 이하의 모든 자연수를 차례로 곱한 값이다.
// 해당 문제에서는 팩토리얼 계산법대로 계산을 한 후 마지막에 0이 나오는 개수를 구하는 로직을 짜야한다.
// 먼저 Solution이라는 클래스를 생성한 후 num을 value로 받아서 num 값이 5보다 크거나 같은 경우에만 실행이 되는 while .. 문을 돌려준다.
// while .. 문에서는 매 반복마다 5로 나누고, 몫을 answer값에 더해준다. -> 5의 배수로 나누어 떨어지는 수들의 개수를 확인하기 위해서이다.
// 여기서 왜 5로 나누냐하면 팩토리얼 끝에 붙는 0은 10의 배수에 의해 결정이 된다.
// 10의 배수는 2와 5의 곱이므로, 팩토리얼 계산에서 2의 개수와 5의 개수를 비교해 더 적은 쪽이 10의 개수를 결정하게 된다.
// 하지만 팩토리얼에서는 2가 5보다 항상 더 많이 존재하기 때문에, 5의 배수를 찾아 그 개수를 누적하면 된다. 그렇기 때문에 5로 나누어 값을 더해주는 로직을 짠것이다.
// 위와 같이 while .. 문을 더이상 돌 수 없을때, 즉 모든 연산이 끝났을때 answer를 반환한다.
// main 함수는 먼저 사용자 입력값을 받는다. 여기서 nullable한 코드를 짰기때문에 toIntOrNull() 함수를 사용해준다.
// Solution 클래스와 solution 메서드를 호출하여 결과를 계산한다.
// 계산 결과를 콘솔애 출력한다.

val br = System.`in`.bufferedReader()
fun getInt() = br.readLine().toInt()

fun main() = with(System.out.bufferedWriter()) {
    val n = getInt()
    var key = 5
    var answer = 0
    while (key <= n) {
        answer += n / key
        key *= 5
    }
    write("$answer")
    close()
} // 다른 사람의 풀이

// bufferReader라는 입력을 효율적으로 처리하기 위한 방법을 사용하여 빠르게 데이터를 읽을 수 있도록 하였다.
// getInt는 사용자 입력값이다.
// System.out.bufferedWriter()는 출력 속도를 높이기 위해 사용된다.
// with 키워드는 특정 객체를 블록 내에서 간편하게 사용하도록 한다.
// while 반복문은 현제 key값이 n보다 작거나 같을 경우에 실행을 한다.
// key는 5의 거듭제곱을 나타낸다.
// 로직은 key 배수의 개수를 계산, key는 5의 거듭제곱으로 갱신된다.
// 계산이 끝난 후 answer를 출력, close()를 버퍼에 저장된 데이터를 출력하고 리소스를 해제한다.