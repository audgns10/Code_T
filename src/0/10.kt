// 10.문제

// 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
// 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        val answer = String = ""
        val tem = overwrite_string.length
        answer = "${my_string.substring(0, s)}${overwrite_string}${overwrite_string.substring(tem + s)}"
        return answer
    }
} // 나의 풀이

// answer의 값을 반환시키는 것이기 때문에 ""으로 초기화를 해주고
// tem 변수는 overwrite_string의 문자열 길이를 저장하는 것이다.(my_string에 덮어씌워줄 길이를 계산)
// 10번째줄이 구현체이다. 0부터 s까지의 인덱스를 쓰게 한다 -> overwrite_string의 값을 그대로 넣어준다 -> tem + s 이후의 인덱스를 가져온다. / 즉, 덮어쓴 이후의 문자열을 가져오는 것이다.

class otherSolution {
    fun other_solution(myString: String, overwriteString: String, s: Int): String =
        myString.replaceRange(s, s + overwriteString.length, overwriteString)
} // 다른 사람의 풀이

// 해당 함수는 myString의 s, s + overwriteString.length 범위의 값을 overwriteString으로 교체를 한다.
// 즉, 주어진 시작 인덱스 s에서 덮어쓸 문자열의 길이만큼 기존 문자열을 대체하는 것이다.
// 1 -> s는 교체를 시작할 인덱스 위치이다. / 2 -> s + overwriteString.length 교체가 끝나는 위치이다. / 3 -> 덮어쓸 문자열 overwriteString이다.
// replaceRange를 사용하여 내가 쓴 코드보다 간결하게 코드를 짰다.