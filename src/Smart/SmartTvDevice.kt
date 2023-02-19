package Smart

class SmartTvDevice(deviceName: String, deviceCategory: String):
        SmartDevice(name = deviceName, category = deviceCategory) {

    var speakerVolume by RangeRegulator (initialValue = 2, minValue = 0, maxValue = 100)

    var channelNumber  by RangeRegulator (initialValue = 1, minValue = 0, maxValue = 100)

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber")
    }

    override fun turnOn() {
        super.turnOn()
        deviceStatus = "On"
        println("$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                "set to $channelNumber.")
    }

    override fun turnOff() {
        deviceStatus = "Off"
        println("$name turned off")
    }
}