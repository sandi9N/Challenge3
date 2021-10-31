
val lists:List<String> = listOf("gunting", "batu", "kertas")
abstract class Player {
    abstract fun choice(): String
}

class Human: Player(){

    override fun choice(): String {
        return readLine()?:""

    }
}

class Computer: Player(){

    override fun choice(): String {
        return lists.random()
    }
}