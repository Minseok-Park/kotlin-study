package category

// 기본적인 함수 선언 스타일
fun sum(a : Int, b : Int) : Int {
    return a + b
}

// 표현식 스타일
fun sum2(a : Int, b : Int) : Int = a + b

// 표현식 & 반환타입 생략
fun sum3(a : Int, b: Int) = a + b

// 몸통이 있는 함수는 반환 타입을 제거하면 컴파일 오류 발생
//fun sum4(a: Int, b : Int) {
//    return a + b
//}

// 반환타입이 없는 함수는 Unit을 반환한다
fun printSum(a : Int, b : Int): Unit {
    println("$a + $b = ${a + b}")
}

// 디폴트 파라미터
fun greeting(message : String = "안녕하세요!") {
    println(message)
    // ex) greeting() ,  greeting("안녕")

    //public void greeting(String message) {
//    if(message == null || message.length == 0) {
//        System.out.println("안녕하세요");
//        return;
//    }
//}
}

// Named Argument !!
fun log(level : String = "INFO", message : String) {
    println("[$level] $message")
}
