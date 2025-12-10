package org.example

/*
Задача 2 к Уроку 2

В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров,
которым назначили зарплату в 20000 рублей каждому.
Пишем часть гипотетического софта для бухгалтерии, который будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.
 */

fun main() {
    val numberOfConstEmployees = 50
    val salaryOfConstEmployee = 30_000
    val numberOfInterns = 20
    val salaryOfIntern = 20_000
    val salaryOfAllConstEmployees = salaryOfConstEmployee * numberOfConstEmployees
    val salaryOfAllInterns = salaryOfIntern * numberOfInterns
    val salaryOfAllEmpoloyees = salaryOfAllInterns + salaryOfAllConstEmployees
    val averageSalaryOfAllEmpoloyees = salaryOfAllEmpoloyees / (numberOfInterns + numberOfConstEmployees)

    println("Расходы на выплату зарплаты постоянных сотрудников $salaryOfAllConstEmployees")
    println("Общие расходы по ЗП после прихода стажеров $salaryOfAllEmpoloyees")
    println("Средняя ЗП одного сотрудника после устройства стажеров $averageSalaryOfAllEmpoloyees")



}