import java.util.*

fun main(args: Array<String>) {
    var everybody : Any?

    everybody = 11111
    everybody = "문자열 테스트"
    everybody = 21.01010
    everybody = 12.00f

    if( everybody !is String)
    {
        if (everybody is Float)
        {
            println("float 입니다.")
        }
    }

    // everybody = null

    println( everybody == 12.00f)
    println( everybody.equals(12.00f))

    allPrint(1231231)
    allPrint("hi")
    allPrint(Date())

    //Unit형은 값이 없음을 정의하는 형
    var pFunc : (String) -> Unit = {println(it)}
    pFunc("HIHIHIHIHIHI")

    //Nothing형은 미래가 없음을 알리는 형
    TODO("이거 구현해야합니다. .. 일단 실행 했으니 종료합니다.")

}


fun allPrint (a: Any) = println(a.toString())