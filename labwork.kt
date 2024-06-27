fun main() {
    val n = 5 
    for (i in 1..n) {
        for (j in 1..(n - i)) {
            print(" ")
        }
        for (j in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }

    for (i in (n - 1) downTo 1) {
        for (j in 1..(n - i)) {
            print(" ")
        }
        for (j in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }
}

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

fun main() {
   var n1 = 24
   var n2 = 6
   var res = 1

   var i = 1
   while (i <= n1 && i <= n2) {
      if (n1 % i == 0 && n2 % i == 0)
         res = i
      ++i
   }
println("The GCD of $n1 and $n2 is $res")
}

fun main() {
    val string = "abcgfsuigdsufuwagusuew"
    val letter = 'u'
    var f = 0

    for (i in 0..string.length - 1) {
        if (letter == string[i]) {
            ++f
        }
    }

    println("Frequency of '$letter' in '$string' is $f")
}

fun main() {
    val num = 105

    if (num != null && num > 0) {
        val inputString = num.toString()
        if (inputString.first() != '0' && inputString.contains('0')) {
            println("$num is a Duck number.")
        } else {
            println("$num is not a Duck number.")
        }
    }
}

fun main() {
    val input = 106

    if (input != null && input > 0) {
        var num = input
        var hasZero = false

        while (num > 0) {
            val digit = num % 10
            if (digit == 0) {
                hasZero = true
                break
            }
            num /= 10
        }

        if (hasZero) {
            println("$input is a Duck number.")
        } else {
            println("$input is not a Duck number.")
        }
    }
}

