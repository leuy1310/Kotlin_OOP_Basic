package Smart

class SmartLightDevice(deviceName: String, deviceCategory: String):
        SmartDevice(name = deviceName, category = deviceCategory) {

    var brightnessLevel by RangeRegulator (initialValue = 0, minValue = 0, maxValue = 100)

    override fun turnOn() {
        deviceStatus = "On"
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel")
    }

    override fun turnOff() {
        deviceStatus = "Off"
        brightnessLevel = 0
        println("Smart Light turned off")
    }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel")
    }
}