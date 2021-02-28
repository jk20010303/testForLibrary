package com.jkamoliddinov.jk20010303

import java.lang.IllegalArgumentException

class Hisoblash {
companion object{
    fun qoshish(a:Int,b:Int):Int{
        return a+b
    }
    fun ayirish(a:Int,b:Int):Int{
        return a-b
    }
    fun kopaytirish(a:Int,b:Int):Int{
        return a*b
    }
    fun bolish(a:Int,b:Int):Int{
        if (b==0){throw IllegalArgumentException("Raqam nolga bo'linmaydi")}
        return a/b
    }
}
}