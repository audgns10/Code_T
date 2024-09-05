// 여섯번째 문제

// 덧셈식 출력하기

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    val result = a + b
    println("$a + $b = $result")
} // 나의 풀이

// a + b를 한 값에 대한 변수를 만들고 println으로 찍어냈다.

const val MIN_VALUE = 1
const val MAX_VALUE = 100

fun other(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    val isRangeValueWithA = a in MIN_VALUE .. MAX_VALUE
    val isRangeValueWithB = b in MIN_VALUE .. MAX_VALUE

    if(isRangeValueWithA && isRangeValueWithB) {
        println("$a + $b = ${a+b}")
    }
} // 다른 사람의 풀이

// 문제에서 보면 범위를 정해주었기 때문에 const val MAX(MIN)으로 범위값을 정해준다.
// const val은 컴파일 시간에 결정이 되며 변경이 불가하다.
// 각각 a와 b에 범위를 지정해주고 아래 조건식에서는 isRangeValueWithA, isRangeValueWithB이 두개의 값이 참일 경우에 실행을 한다.