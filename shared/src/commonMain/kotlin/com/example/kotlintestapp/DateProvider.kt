package com.example.kotlintestapp
import kotlinx.datetime.*

fun daysUntilNewYear(): Int {
    val today = Clock.System.todayAt(TimeZone.currentSystemDefault())
    val closestNewYear = LocalDate(today.year + 1, 1, 1)
    return today.daysUntil(closestNewYear)
}