// 첫번째 문제

// 문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.

fun main(args: Array<String>) {
    val s1 = readLine()!!
    println(s1)
} // 나의 답

fun other(args: Array<String>) {
    readLine()?.let(::println)
} // 다른 사람의 답변