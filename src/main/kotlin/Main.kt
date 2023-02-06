fun main(args: Array<String>) {
    val myTime = Time(23,59,59)
    println(myTime.isValid())
    println(myTime.isAm())
    println("${myTime.printTime()}")
    println("${myTime.printTime(isTwelveHours = true)}")
}

// A class Time class that stores the hours, minutes, and seconds
// properties should be read(and write only upon initialization)
// print the string representation of a time 24hr format or 24hr format
// check if the time is valid
// throw an exception if the time is not valid

// time class
class Time (hours: Int, minutes: Int, seconds: Int) {
    private val hours: Int
    private val minutes: Int
    private val seconds: Int

    init {
        this.hours = hours
        this.minutes = minutes
        this.seconds = seconds
    }

    fun isValid(): Boolean {
        return (hours in 0..23) && (minutes in 0..59) && (seconds in 0..59)
    }

    fun isAm(): Boolean {
        return hours < 12
    }

    fun twelveHourFormat(): String {
        val twelveHourString = if (hours > 11){
            val newHour = if (hours % 12 > 0) hours % 12 else 12
            "$newHour:$minutes:$seconds PM"

        } else {
            "$hours:$minutes:$seconds AM"
        }
        return twelveHourString
    }

    fun printTime(isTwelveHours: Boolean = false) {
        if (isTwelveHours) {
            println(this.twelveHourFormat())
        } else {
            print("$hours:$minutes:$seconds")
        }
    }

    // not need for getters and setter for time properties



}

