// 8.문제

// 문자열 str이 주어집니다.
//문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.

fun main(args: Array<String>) {
    val s1 = readLine()!!

    for(i in s1) {
        println(i)
    }
} // 나의 풀이

// readLine()!!으로 코드를 받는다.
// for문을 사용해서 각 문자열의 문자를 순열합니다
// 각 문자를 출력을 할때마다 줄바꿈을 할 수 있도록 합니다.

fun other(args: Array<String>) {
    val s1 = readLine()!!

    s1.map(::println)
} // 다른 사람의 풀이

// s1의 각 문자열을 map를 사용하여 순열을 합니다.
// 각 문자마다 println을 사용하여 줄바꿈을 할 수 있도록 합니다.