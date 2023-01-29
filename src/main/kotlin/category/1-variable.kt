package category

fun variable() {
    // 변수 타입, 명, 초기화
   val a : Int = 1

    // 타입 생략 가능 자동 추론
   val b = 2

    // 지연 할당 가능
    val c : Int
    c = 3

    // 지연 할당 시 타입을 명시해주지 않으면 컴파일 오류 발생
    val d : Int
    d = 4

    // 변수 선언 키워드 2가지 존재 val, var
    // val = 한번 값을 초기화 한 후에는 재할당 불가 (자바의 final과 같다고 생각하면 됨)
    // var = 값을 할당 후에 재 할당 가능

    var va: String = "안녕하세요"
    va = "궁금"

    // 초기 타입을 Int 로 지정 후 String으로 변경은 불가
    var vs = 3
//    vs = "ㅇㅇㅇ"
}