fun main() {
    val num = 153
    var org: Int
    var rem: Int
    var res = 0

    org = num

    while (org != 0) {
        rem = org % 10
        res = res + Math.pow(rem.toDouble(), 3.0).toInt()
        org = org / 10
    }

    if (res == num)
        println("$num is an Armstrong number.")
    else
        println("$num is not an Armstrong number.")
}