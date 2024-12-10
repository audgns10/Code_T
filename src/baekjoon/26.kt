import java.util.Stack

// 문제.26

// 괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다.
// 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다.
// 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다. 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다.
// 여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.

class Solution {
    fun solution(value: String): Boolean {
        val charStack = Stack<Char>()

        for (char in value) {
            if (char == '(') {
                charStack.push(char)
            } else if (char == ')') {
                if (charStack.isEmpty()) {
                    return false
                }
            } else {
                charStack.pop()
            }
        }

        return charStack.isEmpty()
    }
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val numInput = reader.readLine!!().toInt()

    val solution = Solution()

    repeat(numInput) {
        val stringInput = reader.readLine()!!
        if (solution.solution(value = stringInput)) {
            print("YES")
        } else {
            print("NO")
        }
    }
} // 나의 풀이

// 해당 문제는 자료 구조, 문자열, 스택 알고리즘을 활용하여 풀어야하는 문제이다.
// Solution 클래스 생성 <- value 문자열 입력 값 <- 문자열이 유효한지 Boolean으로 판별
// Stack<Char>()를 활용하여 스택에 추가 및 제거할 수 있도록 한다.
// for문은 value의 각 문자에 대해 반복한다.
// 여는 괄호 '('가 나오면 스택에 추가, 닫는 괄호 ')'가 나온다면 스택를 삭제하여 열리고 닫히는 서로 대응되는 값을 처리해준다.
// 스택이 비어있을때 닫는 괄호 ')'가 나오면 false 값 반환을 한다.
// 마지막으로 연산이 끝났을때 스택에 아무런 값도 존재하지 않는다면 true, 값이 존재하면 false <- 열리고 닫히는 괄호가 각각 대응이 된다면 스택에 값이 안들어있기때문
// BufferedReader를 사용하여 입력처리가 더 빨리되도록한다.
// numInput은 테스트하는 값들이 개수 / stringInput은 테스트를 하는 괄호 문자열의 값
// 테스트 개수를 repeat로 읽는다.
// 각각 괄호 문자열을 읽어 solution 함수로 전달한다.
// 함수에서 로직을 수행하고 맞는 값이면 "YES" 아니라면 "NO" 둘 중 하나로 출력한다.

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()

    for(i in 0 until n) {
        val str = readLine()
        solve(str)
    }
}

fun solve(str: String){
    val stack = Stack<Char>()

    for(i in str){
        if(i == '('){
            stack.add(i)
        }

        else if(i == ')'){
            if(stack.isEmpty()){
                println("NO")
                return
            }

            if(stack.pop() == ')'){
                println("NO")
                return
            }
        }
    }

    if(stack.isEmpty()){
        println("YES")
    }
    else{
        println("NO")
    }
} // 다른 사람의 풀이

// solve라는 문제를 해결하기 위한 주요 로직이 있는 함수를 생성한다.
// Stack<Char>()를 생성한다.
// 문자열의 각각의 괄호들이 for문을 돌게 된다.
// 여는 괄호라면 스택에 추가해준다.
// 닫는 괄호일때는 비거나 서로 짝이 맞지 않을 경우에 "NO"를 출력한다.
// 연산 종료 시 스택이 비어있다면 "YES" 출력 아니라면 "NO"를 출력한다.
// 위 함수를 사용하는 main에서는 테스트하는 개수를 받고, 0부터 개수만큼 for문을 돌며 테스트의 괄호 문자열들이 solve를 차례로 수행하게 된다.