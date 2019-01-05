class DateRange(val start: MyDate, val end: MyDate) : Iterator<MyDate> {
    var curr = start
    override fun hasNext(): Boolean {
        return curr <= end
    }

    override fun next(): MyDate {
        val result = curr
        curr = curr.nextDay()
        return result
    }

}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
