package Smart

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class RangeRegulator(
        initialValue: Int,
        private val minValue: Int,
        private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    var fielData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fielData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fielData = value
        }
    }
}

fun main() {
    val smartHome = SmartHome(
            SmartTvDevice(deviceName = "Android", deviceCategory = "Entertainment"),
            SmartLightDevice(deviceName = "Google light", deviceCategory = "Utility")
    )

    smartHome.turnOnTv()
    smartHome.turnOnLight()
    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}")
    println()

    smartHome.increaseTvVolume()
    smartHome.changeTvChannelToNext()
    smartHome.increaseLightBrightness()
    println()

    smartHome.turnOffAllDevice()
    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}")
}