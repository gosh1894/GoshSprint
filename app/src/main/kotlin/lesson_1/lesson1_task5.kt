package lesson_1
fun main() {
    val totalSeconds = 6480

    val hours = totalSeconds / 3600
    val remainingAfterHours = totalSeconds / 3600
    val minutes = remainingAfterHours / 60
    val seconds = remainingAfterHours % 60
    println(hours)
    println(minutes)
    println(seconds)
}