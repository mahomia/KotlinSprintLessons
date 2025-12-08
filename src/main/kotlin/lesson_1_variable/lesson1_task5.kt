package org.example.lesson_1_variable

/*
Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
 */

fun main() {
    val secondsInSpace: Int = 6480
    val secondsInMinute = 60
    val minutesInHour = 60
    val hours: Int = secondsInSpace / (secondsInMinute * minutesInHour)
    val minutes: Int = (secondsInSpace - hours * secondsInMinute * minutesInHour) / secondsInMinute
    val seconds: Int = secondsInSpace - hours * secondsInMinute * minutesInHour - minutes * secondsInMinute

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}