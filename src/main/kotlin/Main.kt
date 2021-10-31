fun main(args:Array<String>){
    do {
        println("===========================")
        println("Anda Masuk Dalam Game Suit")
        println("===========================")
        println("Kenalan dulu ya... Siapa nama kamu?")
        var namaPlayer = readLine()
        println("Hi, $namaPlayer !! Selamat datang...")
        println("Pilih dulu nomer satu atau dua. karena aku gamau di duain")
        println("1. Game In")
        println("2. Game Out")
        print("Pilihan Saya : ")
        val a: Int= readLine()!!.toInt()
        if(a==1)
        {
            playgame()
        }
        else if (a!=1)
        {
            println("\n Salah Pilih Broo !!!\n")
        }
    }
    while (a<2||a!=1)

}


fun playgame() {
    println("========================================")
    val pilihan = arrayOf("Gunting", "Batu", "Kertas")
    println("========================================")
    var komputer = pilihan.random()
    println("Masukan Antara (Gunting, Batu, Kertas) ")
    println("========================================")
    print("Input : ")

    var player = readLine()
    var status = false

//    Menentukan peraturan
    if (player!!.toLowerCase().equals(komputer.toLowerCase())) {
        println("Seri $komputer dengan $player")
    }
    else if (player.toLowerCase().equals("batu")) {
        if(komputer.toLowerCase().equals("gunting")){
            status = true
            hasil(status,player,komputer)
        }else{
            status = false
            hasil(status,player,komputer)
        }
    }
    else if (player.toLowerCase().equals("gunting")) {
        if (komputer.toLowerCase().equals("kertas")) {
            status = true
            hasil(status,player,komputer)
        } else {
            status = false
            hasil(status,player,komputer)
        }
    }
    else if (player.toLowerCase().equals("kertas")) {
        if (komputer.toLowerCase().equals("batu")) {
            status = true
            hasil(status,player,komputer)
        } else {
            status = false
            hasil(status,player,komputer)
        }
    }
}

fun hasil(status: Boolean, p1: String, p2: String) {
    if (status) {
        println("Kamu Menang!! $p1 mengalahkan $p2")
    } else {
        println("Yah.. Kamu Kalah!! $p2 mengalahkan $p1")

    }
}


