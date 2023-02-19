package Smart

open class SmartDevice(val name:String, val category: String) {

    var deviceStatus = "online"
        protected set

    open val deviceType: String = "unknown"

    open fun turnOn() {
        println("Smart device is turned on.")
    }

    open fun turnOff() {
        println("Smart device is turn off.")
    }
}