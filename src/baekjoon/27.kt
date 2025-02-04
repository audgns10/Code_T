// 문제.27

// 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
// 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
// n=17일때 까지 피보나치 수를 써보면 다음과 같다.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
// n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

import java.io.BufferedReader
import java.io.InputStreamReader

class Solution {
    fun solution(value: Long): Long {
        if (value == 0L) return 0
        if (value == 1L) return 1

        var f1: Long = 0
        var f2: Long = 1
        var f3: Long = 0

        for (i in 2..value) {
            f3 = f1 + f2
            f1 = f2
            f2 = f3
        }

        return f3
    }
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val input = reader.readLine()!!.toLong()

    val solution = Solution()
    val result = solution.solution(input)

    print(result)
} // 나의 풀이

// 먼저 큰 값을 넣었을때 Int형의 범위를 넘어서는 것을 확인하여 Long 타입으로 받고 반환을 해주도록하였다.
// 먼저 피보나치 수열은 0과 1로 시작하기 때문에(F(0) -> 0 / F(1) -> 1) 0과 1이 나오면 바로 0, 1를 반환하도록 해주었다.
// f1, f2, f3 각각 첫번째 값, 두번째 값, 합친 값 이렇게 변수를 만들어주었다.(첫번째, 두번째는 각각 0, 1 이다.)
// 0, 1은 반복문이 없이도 알 수 있는 값이기때문에 i를 2부터 시작할 수 있게 해준다.(Fn = Fn-1 + Fn-2 적용)
// f3에서는 f1과 f2를 더한 값을 저장하고 아래에서는 한칸식 값을 늘려주며 사용자가 입력한 범위까지 계산한다.
// main 함수에서는 직접 입력을 받고 해당 함수를 사용할 수 있도록함