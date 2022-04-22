package ru.netology

fun main() {
    val itemCount = 12
    val itemPrice = 100
    val discount = 100
    var isMeloman = false
    val totalPrice = itemPrice * itemCount

    val result = if (totalPrice in 1001..10000|| isMeloman === true)  {
        (totalPrice - discount) - (totalPrice * 1 /100)
    } else if (totalPrice > 10000 || isMeloman === true) {
        totalPrice - (totalPrice * 6 / 100)
    } else totalPrice
    println("Сумма ваших покупок:  $result ")
}