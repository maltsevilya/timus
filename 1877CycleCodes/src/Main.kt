fun main(args : Array<String>) {
    var read = System.`in`.read()
    read = System.`in`.read()
    read = System.`in`.read()
    read = System.`in`.read()
    if (read == 48 || read == 50 || read == 52 || read == 54 || read == 56) {
        print("yes")
        return
    }
    read = System.`in`.read()
    read = System.`in`.read()
    read = System.`in`.read()
    read = System.`in`.read()
    read = System.`in`.read()
    read = System.`in`.read()
    if (read == 49 || read == 51 || read == 53 || read == 55 || read == 57) {
        print("yes")
    } else print("no")
}

fun byReadBytes() {
    val ba = ByteArray(11)
    val count = System.`in`.read(ba)
    val first = ba[3].toInt()
    if (first == 48 || first == 50 || first == 52 || first == 54 || first == 56) {
        print("yes")
        return
    }
    if (count < 8) {
        System.`in`.read(ba, count, ba.size - count)
    }
    val second = ba[9].toInt()
    if (second == 49 || second == 51 || second == 53 || second == 55 || second == 57) {
        print("yes")
    } else {
        print("no")
    }
}

fun byBytes() {
    var read = System.`in`.read()
    read = System.`in`.read()
    read = System.`in`.read()
    read = System.`in`.read()
    if (read == 48 || read == 50 || read == 52 || read == 54 || read == 56) {
        print("yes")
        return
    }
    read = System.`in`.read()
    read = System.`in`.read()
    read = System.`in`.read()
    read = System.`in`.read()
    read = System.`in`.read()
    read = System.`in`.read()
    if (read == 49 || read == 51 || read == 53 || read == 55 || read == 57) {
        print("yes")
    } else print("no")
}
