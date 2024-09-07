// 3.문제

// 문자열 str과 정수 n이 주어집니다.
//str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.

fun main(args: Array<String>) {
    val input = readLine()!!.split(' ')
    val s1 = input[0]
    val a = input[1]!!.toInt()

    repeat(a) {
        print(s1)
    }
} // 나의 풀이

// repeat를 사용해 a 즉, 몇번 반복을 할 것인지 명시해주고 print로 s1을 찍어주면 a가 입력된 값 만큼 s1의 문자열이 반복되어 나온다.
// 그리고 println을 사용하면 문자열이 개행이 되지만 예시 답에서는 개행이 되지 않은 문자열이 반복되므로 print로 해주어야한다.

fun other(args: Array<String>) {
    val input = readLine()!!.split(' ')
    val s1 = input[0]
    val a = input[1]!!.toInt()
    for (i in 0 until a) {
        print(s1)
    }
} // 다른 사람의 풀이

// for문을 사용한 방법 또한 존재한다.
// for문에서 until을 사용하게 되는 오른쪽 숫자 보다 1작은 범위를 반복한다.
// a의 값이 5가 입력이 된다면 0부터 4까지 총 5번 반복이 된다.(python range 개념과 유사.)