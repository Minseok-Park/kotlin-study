package category

enum class Color {
    RED, GREEN
}
fun getColor() = Color.RED
fun getNumber() = 2

fun flowCon() {

    // 코틀린의 if else는 표현식에 해당
    // if.. else 사용
    val job = "Software Developer"

    if(job === "Software Developer") {
        println("개발자")
    } else {
        println("개발자 아님")
    }

    val age : Int = 10
    val str = if (age > 10) {
        "성인"
    } else {
        "아이"
    }

    // 코틀린은 삼항 연산자 존재 X, if..else 가 표현식이기 때문에 불필요
    val a = 1
    val b = 2
    val c = if (b > a) 5 else 10
}

fun flowWhen() {
    // 자바의 switch 문 => 코틀린 when 식
    val day = 2

    val result = when(day) {
        1 -> "일요일"
        2 -> "토요일"
        else -> "아무것도 아님"
    }

    println(result)

    // else를 생략할 수도 있음
    val color = when(getColor()) {
        Color.RED -> println("빨강")
        Color.GREEN -> println("초록")
    }

    val num = when(getNumber()) {
        0, 1 -> println("0 또는 1")
        else -> println("안녕")
    }
}

fun flowLoop() {
    // 범위 연산자 ..를 사용해 for loop 돌리기
    for(i in 0..3) {
        println(i)
        // 결과 => 0,1,2,3
    }

    // until을 사용하면 뒤에 온 숫자는 제외
    for(i in 0 until 3) {
        println(i)
        // 결과 => 0, 1, 2
    }

    // step에 들어온 값 만큼 증가시킴
     for(i in 0..3 step 2) {
        println(i)
        // 결과 => 0. 2
    }

    // downTo를 사용해 반복하면서 값을 감소시킴
    for(i in 3 downTo 1) {
        println(i)
        // 결과 => 3, 2, 1
    }

    // 배열 반복도 가능
    val numbers = arrayOf(1,2,3)
    for(i in numbers) {
        println(i)
        // 결과 1, 2, 3
    }
}

fun flowWhile() {
    // 자바의 while과 동일
    var x = 5

    while(x > 0) {
        println("이런")
        x--
    }
}