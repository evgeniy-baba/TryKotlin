package lesson4

fun main(args: Array<String>) {

    myFirstFun();
    myFirstFun2(1);
    myFirstFun3();
    var result = myFirstFun4(1, 3.2);

    println(result)
}


fun myFirstFun(): Int {

    return 1;
}


fun myFirstFun2(a: Long): Int {

    return a.toInt();
}

fun myFirstFun3() {

}

fun myFirstFun4(a: Long, b: Double)= a + b