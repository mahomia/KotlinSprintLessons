package org.example.String

/*
Дана строка val filename = "report_2025_final.pdf". С помощью substring выдели:

имя без расширения (report_2025_final);

расширение файла (pdf).
Выведи оба результата на экран
 */

fun main() {
    val fileName = "report_2025_final.pdf"
    val dotIndex = fileName.lastIndexOf('.')
    val name = fileName.substring(0, endIndex = dotIndex)
    val fileType = fileName.substring(startIndex = dotIndex + 1)

    println("Имя файла без расширения: $name")
    println("Расширение файла: $fileType")
}