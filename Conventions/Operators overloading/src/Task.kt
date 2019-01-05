import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

data class MyTimeInterval(val timeInterval: TimeInterval, val number: Int)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate {
    return this.addTimeIntervals(timeInterval, 1)
}
operator fun MyDate.plus(myTimeInterval: MyTimeInterval): MyDate {
    return this.addTimeIntervals(myTimeInterval.timeInterval, myTimeInterval.number)
}

operator fun TimeInterval.times(number: Int): MyTimeInterval {
    return MyTimeInterval(this, number)
}

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
