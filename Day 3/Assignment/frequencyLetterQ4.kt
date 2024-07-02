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