// 9.문제

//자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.

fun main(args: Array<String>) {
    val a = readLine()!!.toInt()

    if (a % 2 == 0) {
        println("$a is even")
    } else {
        println("$a is odd")
    }
} // 나의 풀이

// 6번째 줄에서 문법 문제가 있다.(before -> val a = readLine().!!toInt() / after -> val a = readLine()!!.toInt())
// 조건문을 통해 2로 나누었을때 0으로 떨어지면 짝수를 아니면 홀수를 출력하도록 하였다.

fun other(args: Array<String>) {
    val a = readLine()!!.toInt()

    println("$a is ${if (a % 2 == 0) "even" else "odd"}")
} // 다른 사람의 풀이

// 마찬가지로 문법 문제를 해결함
// println에 조건문을 넣어서 코드를 간소화하였다.