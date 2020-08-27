fun main(){
    var healthPoints = 100
    val PlayerName = "Madrigal"
    var isBlessed = true

    when(healthPoints){
        100       -> "${PlayerName} is in excellent condition!"
        in 90..99 -> "${PlayerName} has a few scratches"
        in 75..89 -> if (isBlessed){ "has some minor wounds but is healing quite quickly!"}
                        else "${PlayerName} has some minor wounds"
        in 15..74 -> "${PlayerName} looks pretty hurt"
        in 0..14  -> "${PlayerName} is in awful condition!"
    }


     println(PlayerName)
     print(healthPoints)
}