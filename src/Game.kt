fun main(){
    var healthPoints = 100
    val PlayerName = "Madrigal"
    var isBlessed = true
    val Karma= (Math.pow(Math.random(), (110 - healthPoints)/100.0)*20).toInt()

    when(healthPoints){
        100       -> println("${PlayerName} is in excellent condition!")
        in 90..99 -> println("${PlayerName} has a few scratches")
        in 75..89 -> if (isBlessed){ println("has some minor wounds but is healing quite quickly!")}
                        else println("${PlayerName} has some minor wounds")
        in 15..74 -> println("${PlayerName} looks pretty hurt")
        in 0..14  -> println("${PlayerName} is in awful condition!")
    }// تم نسيان أمر الطباعه في المشروع الأول وتم رفعه للجت هب ،  فقمنا بإضافته الان

     println(PlayerName)
     println(healthPoints)

    when(Karma){
        in 0..5   -> println("red")
        in 6..10  -> println("orange")
        in 11..15 -> println("purple")
        in 16..20 -> println("green")
    }


}