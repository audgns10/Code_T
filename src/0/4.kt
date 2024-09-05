// 네번째 문제

// 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
// 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

fun main(args: Array<String>) {
    val s1 = readLine()!!

    println(s1.indices.joinToString("") {
        if (s1[it].isUpperCase())
            s1[it].lowercase()
        else
            s1[it].uppercase() } )
} // 나의 풀이

// indices를 사용하여 글자의 길이 즉, 인덱스로 반환을 해주어 0부터 시작해 -1을 한 값이 변환이 된다. -> [0 .. ?]
// joinToString을 사용하므로써 변환된 문자들이 하나의 문자열로 합쳐져 나오게 된다.
// 아래 조건식에서의 it은 joinToString에 전달된 매개변수이다. it이 3이라면 s[3]인 것이다.
// 그리고 이제 해당 인덱스가 조건문을 거쳐서 대문자면 소문자로, 그게 아니라면 대문자로 변환이 될 수 있게 되어있다

fun other(args: Array<String>) {
    val s1 = readLine()!!
    s1.map { if (it.isLowerCase()) it.uppercase() else it.lowercase() }
        .joinToString("")
        .also { println(it) }
} // 다른 사람의 풀이

// map을 사용해 문자열의 각 문자에 대해 변환을 적용하고, 새로운 리스트로 반환을 한다.
// 나의 답변과 비슷한 조건식을 거친다.
// joinToString을 사용하여 변환된 문자들이 하나의 문자열로 합쳐 나올 수 있게 한다.
// 출력은 also을 사용하여 최종적인 결과를 it에 담아서 출력을 한다.