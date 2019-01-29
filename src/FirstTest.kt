fun main(args: Array<String>) {

//    1. 코틀린을 시작하기 전에 알아야할 지식들을 설명한다.
//    2. psvm을 상단에 치면, main 함수를 자동으로 생성해준다.
//    3. 종결자를 사용하지 않아도 된다. (java의 경우 system.out.println(); 이런식으로 사용한다.)
//    4. 형을 선언하지 않았다면 변수를 대입시 형이 결정된다.
//    5. 변수는 읽기전용과 읽기쓰기 상태로 선언된다.
//    6. null을 엄격하게 구분한다. (?: 엘비스 프레스)
//    7. kt파일은 내부적으로 class로 재구성된다.

    println("종결자(;)없어도 됩니다. ")
    println("var는 읽기쓰기. val는 읽기전용")

    var nCount: Int = 0
    var name = "psw"

    val age = 0
//age++

    var MyMoney: Int? = null
    var message = "위에서는 액세스 불가함"

    println(hiMessage)
}

val hiMessage: String = "Hi" //멤버변수로 인식하기에 위에서 출력이 가능하다.