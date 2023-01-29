package category

// 자바에서 가장 많이 발생하는 예외 유형 => NullPointerException
// 자바에서 NPE를 줄이기 위해 JDK8부터 Optional 객체를 도입
// 자바의 Optional은 값을 래핑하기 때문에 객체 생성에 따른 오버헤드가 발생,
// 컴파일 단계에서 Null 기능성을 검사하지 않음

// 코틀린에서는 널 기능성을 컴파일러가 미리 감지해 NPE의 기능성을 줄임

fun safetyNull() {
//    val a : String = null
//    val b : String = "안녕"
//    b = null

    val a : String? = null
    //a.length => 컴파일 오류

    // 출력 결과 => null
    println(a?.length)


    val b : Int = if(a != null) a.length else 0

    // 엘비스 연산자 => 좌변이 null인 경우 우변을 return
    val c : Int = a?.length ?: 0
}

fun getNullStr() : String? = null

fun getLengthIfNotNull(str : String?) = str?.length ?: 0

val nullableStr= getNullStr()

val nullableStrLength = nullableStr?.length ?: "null인 경우 반환".length
val length = getLengthIfNotNull(null)

fun Test() {
    // 결과 =>  11, 0
    println(nullableStrLength)
    println(length)

    val c:String? = null
    val d = c!!.length // => 단언 연산자 더이상 c는 null이 발생하지 않는다.
    // 개발자가 Handling한다고 컴파일러에게 말해주는 부분
}