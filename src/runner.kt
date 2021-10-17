fun main() {
    val str = "hello"
    val result1 = str.let {
        it.length
    }
    println(result1)
    val result2 = with(str){
        str.length
    }
    println(result2)
    val result3 = str.run {
        str.length
    }
    println(result3)
    val result4 = str.apply {
        str.length
    }
    println(result4)
    val result5 = str.also {
        str.length
    }
    println(result5)
    //a打头的都是返回了对象，其他的都返回了最后一行
    //只有also和let使用it代替
}