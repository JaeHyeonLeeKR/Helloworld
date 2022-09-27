
/*
fun main() {
    var count : Int = 85
    if(count >= 90){
        println("if문: 합격(장학생)")
    }
    else if(count >= 60){
        println("if문: 합격")
    }
    else{
        println("if문: 불합격")
    }

    var jumsu : Int = (count / 10) * 10
    when (jumsu) {
        in 90..100 -> println("when문: 합격(장학생)")
        in 60..89 -> println("when문: 합격")
        else -> println("when문: 불합격")
    }



    //var ary1 = Array<IntArray>(2,{IntArray(2)})
    //var ary2 = Array<IntArray>(3,{IntArray(4)})

    var three : IntArray = intArrayOf(1,2,3)

    println(three[0])
    println(three[1])
    println(three[2])

    var arr = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6))
    for (row in arr){
        println(row.contentToString())
    }

    var one = ArrayList<Int>(4)
    one.add(10)
    one.add(20)
    var hap = one.get(0) + one.get(1)
    println(hap)


    var one2 : IntArray = intArrayOf(10,20,30,40)
    for (i in one2.indices){
        println(one2[i])
    }

    var two :  Array<String> = arrayOf("하나", "둘", "셋")
    for (i in 0..10 step 1){
        println(i)
    }

    var myVar : Int = 0
    println(myVar)

    fun addFunction(num1:Int, num2:Int) : Int{
        var hap : Int
        hap = num1 + num2 + myVar
        return hap
    }

    var sum : Int = addFunction(10, 20)
    println(sum)

}*/

class Car{
    var color : String = ""
    var speed : Int = 0

    constructor(color: String, speed: Int){
        this.color = color
        this.speed = speed
    }

    fun upspeed(value: Int){
        if(speed+value>=200){
            speed=200
        }
        else
            speed=speed+value
    }
    fun downSpeed(value: Int){
        if(speed-value<=0){
            speed=0
        }
        else
            speed=speed-value
    }
}

fun main(){
    var myCar1 : Car = Car("빨강", 0)
    //myCar1.color = "빨강"
    //myCar1.speed=0


    var myCar2 : Car = Car("파랑", 0)
    //myCar2.color = "파랑"
    //myCar2.speed=0

    var myCar3 : Car = Car("초록", 0)
    //myCar3.color = "초록"
    //myCar3.speed=0

    myCar1.upspeed(50)
    myCar2.upspeed(20)
    myCar3.upspeed(250)

    println("카1의 색깔 "+myCar1.color+"  카1의 속도"+myCar1.speed)
    println("카2의 색깔 "+myCar2.color+"  카2의 속도"+myCar2.speed)
    println("카3의 색깔 "+myCar3.color+"  카3의 속도"+myCar3.speed)
}