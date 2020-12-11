package ise308.kucuksonmez.aleyna.notetoaleynakucuksonmez

class SomeRegularClass {
    var someRegularProperty = 1
    fun someRegularFunction(){
    }
    class SomeRegularClass{
        var someRegularProperty = 1
        fun someRegularFunction(){
            val someVariable = myInnerInstance.myInnerProperty
            myInnerInstance.myInnerFunction()
        }
        inner class MyInnerClass {
            val myInnerProperty = 1
            fun myInnerFunction() {
            }
        }
    }
    var someRegularProperty = 1
    val myInnerInstance = MyInnerClass()
    
    inner class MyInnerClass {
        val myInnerProperty = 1
        fun myInnerFunction() {
            fun myInnerFunction() {
                someRegularProperty ++
            }

        }
    }

}


}