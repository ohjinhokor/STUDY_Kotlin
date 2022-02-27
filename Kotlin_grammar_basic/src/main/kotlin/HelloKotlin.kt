fun main() {
    // 1. 기본
//    println("HelloKotlin");
//    println("hi")

    // 2. 파라미터 사용
//    println("args[0] = ${args[0]}")
//    println(args[1])

    // 3. 자료형
//    val username: String = "Kildong";
//    // 값 변경 불가능  username = "dooly"
//
//    var my_name: String = "jinho"
//    my_name = "ohjinho"
//
//    var count = 3 // 타입 생략가능
//
//    println("username : $username")
//    println("myname : $my_name")
//    println("count $count")
//
//    val user = "kildong"
//    // 사용 불가능 var username
//    val init: Int
//    val str : String8
//    val number = 10
//
//    val exp1 = 123
//    val exp2 = 123L
//    val exp3 = 0x0F
//
//    val exp4 : Byte = 127
//    val exp5 = 1234
//    val exp6 : Short = 127
//    val exp7 = 1_000_000
//
//    println("IntMax : ${Int.MAX_VALUE}")
//    println("IntMin : ${Int.MIN_VALUE}")

//    var str1 = "Hello"
//    var str2 = "World"
//    var str3 = "Hello"
//
//    println("str1 === str2 :  ${str1 === str2}")
//    println("str1 === str3 :  ${str1 === str3}") // === 는 참조하는 곳까지 비교할 수 있음. 자바에는 없는 기능

//    var int1 = 3
//    var str4 = "int1 is $int1"
//    val str5 = "int1 + 1 = ${int1+1}"
//
//    println("$str4  and $str5")

    // 4. null
//    var a : Int? = null
//    var b : String? = "Hello"
//
//    println(a)
//    println(b?.length)
//    println(b!!.length) // 잘 사용하지 않는다.

    // 5. 자료형의 비교와 연산
//    val a : Int = 1
//    val b : Double
//    b = a.toDouble()
//
//    // 자료형 불일치 val c : Int =1.1
//    val result = 1L+3 // 이 경우에는 Long 타입으로 인식 됨

//    val a : Int = 128
//    val b =128
//    val c : Int? = a
//    val d : Int? = c
//
//    val e : Int? = 128
//    val f : Int? = b
//    // 비교 연산
//    println(a==b)
//    println(a===b)
//    println(a==c)
//    println(a===c)
//    println(c===d)
//    println(e===f)
//    println(a===f)
//    println(b===f)

//    var ex1 : Any = 3
//    ex1 = 50L
//    if(ex1 is Long){
//        println("ex1 is Long")
//    }

    // 6. 연산자

//    var a =10
//    var b =10
//
//    var result = ++a
//    var result2 = b++
//    println("$result , $result2")

    // 7. 함수
//    fun sum(a : Int, b : Int): Int{
//        return a+b
//    }
//    fun sum2(a : Int, b : Int): Int = a+b
//    fun sum3(a : Int, b : Int) = a+b
//    val sum = sum(1,2)
//    val sum2 = sum2(3,4)
//    val sum3 = sum3(5,6)
//
//    println("$sum, $sum2, $sum3")

//    val maxnum = max(3,6)
//    println(maxnum)
//    outfunc("print this")
//    outfunc2("print this2")

//    normalVarargs(1,2,3,4,5)

    // 8. 함수형 프로그래밍 기초

//    val result = highFunc(1,3){x, y ->
//        x+y
//    }
//    println(result)

    // 9. 람다식
//    val result: Int
//    val multi1 = {a:Int, b:Int -> a+b}
//    val multi2: (a: Int, b: Int) -> Int = {a,b->
//        println("a : ${a}, b: ${b}")
//        a+b
//    }
//
//    // 람다식이 할당 된 변수는 함수처럼 사용 가능
//    result = multi2(10,20)
//    println(result)
//
//    val nestedLambda: ()->()->Unit = {{println("nestedLambda")}}


    // 10. 고차함수

//    val result = sum(10, 10)
//    val result2 = mul(sum(10,5), 10)
//
//    val result3 = funcFunc(20,30)
//
//    println("$result, $result2 $result3")
//
//    val result4 = callByValue(lambda())
//    println(result4 )

//    val result = callByName(otherlambda)
//    println(result)
//
//    funcParam(3,2,::sum)

    // 11. 람다식의 여러가지 유형
//    noParam { "Hello" }
//    oneParam { "Hello! $it" }
//    moreParam{a,b -> "Hello world! $a $b"}
//    moreParam{_,b -> "Hello World $b"}

//    withArgs("Arg1", "Arg2",{ a ,b -> "Hello World! $a, $b"})
//    withArgs("Arg1", "Arg2"){a,b ->
//        "Hello World! $a, $b"
//    }

//    twoLambda({a,b->"First $a, $b"}, {"Second $it"})

    // 12. 다양한 함수의 유형
//    shortFunc(3, {a ->println("a: $a")})
//inline 함수
//    shortFunc(3){println("a: $it")}
//    shortFunc2(4){println("a: $it")}

// 중위 표현 법
//    val multi = 3 multiply 10
//    println(multi)
//
//
//    val str = 3 strPlus "can we do this?"
//    println(str)


// 재귀 함수
    val number =5
    println(factorial(number))
}



// 7의 함수에서 사용한 함수들
//    fun sum(a : Int, b : Int): Int{
//        return a+b
//    }
//    fun sum2(a : Int, b : Int): Int = a+b
//    fun sum3(a : Int, b : Int) = a+b

//fun max(a : Int, b : Int): Int{
//    return if (a>b) a else b
//}
//fun outfunc(a : String): Unit{
//    println(a)
//}
//fun outfunc2(a: String) = println(a)

//fun normalVarargs(vararg a : Int){
//    for(num in a){
//        println(num)
//    }
//}


// 8(함수형 프로그래밍)에서 사용
//fun highFunc(a : Int, b : Int, sum : (Int, Int) -> Int, ) : Int {
//    return sum(a,b)
//}

// 10 고차함수에서 사용
//fun sum(a:Int, b:Int): Int{
//    return a+b
//}
//fun sum(a:Int, b:Int) = a+b
//
//fun mul(a:Int, b:Int): Int{
//    return a*b
//}
//
//fun funcFunc(a: Int, b: Int) = sum(a,b)
//
//fun callByValue(b:Boolean):Boolean{
//    println("callByValue function")
//    return b
//}
//
//val lambda:()->Boolean ={
//    println("lambda function")
//    true
//}

//fun callByName(b : ()->Boolean): Boolean{
//    println("callByName function")
//    return b()
//}
//
//val otherlambda: ()->Boolean={
//    println("otherLambda function")
//    true
//}

//fun sum(x : Int, y : Int): Int = x+y
//fun funcParam(a : Int, b : Int, c:(Int,Int)->Int): Int{
//    return c(a,b)
//}

//fun noParam(out: () -> String) = println(out())
//fun oneParam(out: (String) -> String){
//    println(out("OneParam"))
//}
//fun moreParam(out: (String, String) -> String){
//    println(out("OneParam", "TwoParam"))
//}

//fun withArgs(a: String, b: String, out:(String, String) -> String){
//    println(out(a,b))
//}

//fun twoLambda(first: (String, String) -> String, second:(String)->String){
//    println(first("OneParam", "TwoParam"))
//    println(second("OneParam"))
//}


// 12 다양한 함수에서 사용
//inline fun shortFunc(a: Int, out: (Int) -> Unit){
//    println("Hello")
//    out(a)
//}
//inline fun shortFunc2(a: Int, noinline out: (Int) -> Unit){
//    println("Hello")
//    out(a)
//}

// 중위 표현 법
//infix fun Int.multiply(x: Int): Int{
//    return this * x
//}
//
//infix fun Int.strPlus(x: String): String{
//    return "$x version $this"
//}

// 재귀 함수
tailrec fun factorial(n: Int, run: Int=1): Long{
    return if(n==1) run.toLong() else n*factorial(n-1)
}
