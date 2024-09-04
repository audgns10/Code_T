// 두번째 문제
// 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    println("a = ${a}")
    print("b = ${b}")
} // 나의 답변

fun other(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    print("a = $a\nb = $b")
} // 다른 사람의 답변