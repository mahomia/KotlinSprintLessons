package org.example.String

/*
Пусть есть строка val text = "Kotlin is awesome".
Напиши код, который с помощью indexOf находит позицию подстроки "awesome" и выводит либо её индекс,
либо сообщение, что подстрока не найдена (если индекс равен -1)
 */

fun main() {
    val text = "Kotlin is awesome"
    val substring = "awesome"
    val index = text.indexOf(substring)

    if(index != -1){
        println("Позиция подстроки \"$substring\": $index")
    } else {
        println("Подстрока \"$substring\" не найдена")
    }
}