package org.example.lesson_1_variable

/*
Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
 */

fun main() {
    var secondsInSpace: Int = 6480
    val hours: Int = secondsInSpace / 3600
    val minutes: Int = (secondsInSpace - hours * 3600) / 60
    val seconds: Int = secondsInSpace - hours * 3600 - minutes * 60

    println(
        "${hours.toString().padStart(2, '0')}" +
                ":${minutes.toString().padStart(2, '0')}" +
                ":${seconds.toString().padStart(2, '0')}"
    )
}