// 7.문제

// 문자열 붙여서 출력하기

fun main(args: Array<String>) {
    val input = readLine()!!.split(' ')
    val s1 = input[0].replace(" ", "")
    val s2 = input[1].replace(" ", "")

    print("$s1$s2")
} // 나의 풀이

// 나는 s1과 s2를 replace를 사용하여서 공백을 공백이 제거가 되어 나올 수 있도록 하였는데 굳이 이렇게 할 필요가 없이
// print("$s1$s2") 이렇게 붙여서 print를 해주면 되는 것이였다.

fun other(args: Array<String>) {
    println(readln().replace(" ", ""))
} // 다른 사람의 풀이

// 이렇게 그냥 println 안에서 문자열을 받고 공백이 있는 부분을 위와 같이 replace를 사용해서 제거하는 더 간단한 방법을 사용하였다.