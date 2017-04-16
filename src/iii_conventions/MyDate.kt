package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

operator fun MyDate.rangeTo(other: MyDate): DateRange = todoTask27()

operator fun MyDate.compareTo(other: MyDate): Int {
    val yearCompareResult = this.year.compareTo(other.year)
    if (yearCompareResult != 0) return yearCompareResult
    val monthCompareResult = this.month.compareTo(other.month)
    if (monthCompareResult != 0) return monthCompareResult
    return this.dayOfMonth.compareTo(other.dayOfMonth)
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate)

operator fun DateRange.contains(other: MyDate): Boolean {
    //比较年份
    val yearContains = this.start.year < other.year && this.endInclusive.year > other.year
    if (yearContains) {
        return yearContains
    }
    val monthContains = this.start.month <= other.month && this.endInclusive.month >= other.month
    if (!monthContains) {
        return monthContains
    }
    val dayContains = this.start.dayOfMonth <= other.dayOfMonth && this.endInclusive.dayOfMonth > other.dayOfMonth
    return dayContains
}