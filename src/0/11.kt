// 11.문제

// 길이가 같은 두 문자열 str1과 str2가 주어집니다.
//두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

class Solution_1 {
    fun solution_1(str1: String, str2: String): String {
        val answer = StringBuilder()

        for (i in str1.indices) {
            answer.append(str1[i])
            answer.append(str2[i])
        }

        return answer.toString()
    }
}// 나의 풀이(indices를 활용한)

// answer를 StringBuilder()로 정의를 해준다.(StringBuilder를 String보다 더 효율적으로 String을 조작할 수 있기때문)
// 인덱스를 순열하기 위해서 indices를 사용한다.
// append를 사용해 출력을 한다.(StringBuilder를 사용해 문자 출력하기 위해서는 append 컬랙션을 사용해야한다.)

class Solution_2 {
    fun solution_2(str1: String, str2: String): String {
        val answer = StringBuilder()

        val temLength = str1.length

        for (i in 0 until temLength) {
            answer.append(str1[i])
            answer.append(str2[i])
        }

        return answer.toString()
    }
}// 나의 풀이에서 length을 활용해서 풀이한 버전

// 일단 문자열을 길이를 가져온다.
// for문에서 until은 length의 마지막 값을 가져오지 않기 때문에 0 부터 length - 1 만큼 반복을 한다.
// 그리고 위와 같이 append를 사용하여 String 문자를 출력하고, 최종 문자열을 반환한다.

class Solution {
    fun solution(str1: String, str2: String) = str1.zip(str2).joinToString("") { (a, b) -> "$a$b" }
} // 다른 사람의 풀이

// zip를 사용한다 이는 두 문자열을 묶어서 하나의 쌍으로 만든다(str1 = "aaa", str2 = "bbb" -> [(a, b), (a, b), (a, b)]
// joinToString("")을 사용하여 리스트의 각 요소를 문자열로 구분자 없이("") 하나의 문자열로 합친다.
// zip으로 처리된 값을 어떻게 처리할지에 대한 람다식이다.
// &a&b는 문자열 템플릿으로 두문자를 붙여 하나의 문자열로 만든다.