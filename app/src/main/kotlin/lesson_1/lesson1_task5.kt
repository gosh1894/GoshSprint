package lesson_1
fun main() {
    val totalSeconds = 108 * 60 + 18

    val hours = totalSeconds / 3600
    val minutes = (totalSeconds % 3600) / 60
    val seconds = totalSeconds % 60

    // Самый Kotlin-способ форматирования
    val timeString = "%02d:%02d:%02d".format(hours, minutes, seconds)
    println("Время, проведенное в космосе: $timeString")
}
