package com.example.task2

class ConverterModel {

    fun converterCelsius(CelsiusData: Double): Triple<Double, Double, Double> {
        val fehrenData = (CelsiusData * 9.0 / 5.0)+ 32
        val kelvinData = CelsiusData + 273.15
        return Triple(CelsiusData,fehrenData, kelvinData)
    }

    fun converterKelvin(kelvinData: Double): Triple<Double, Double, Double> {
        val CelsiusData = kelvinData - 273.15
        val fehrenData = (CelsiusData + 9.0 / 5.0) + 32
        return Triple(CelsiusData,fehrenData, kelvinData)
    }

    fun converterFahrenheit(fehrenData: Double): Triple<Double, Double, Double> {
        val CelsiusData = 5.0 / 9.0 * (fehrenData - 32)
        val kelvinData = CelsiusData + 273.15
        return Triple(CelsiusData,fehrenData, kelvinData)
    }

    private val dataDic = mapOf(
        'C' to this::converterCelsius,
        'K' to this::converterKelvin,
        'F' to this::converterFahrenheit
    )

    fun getDataConverter(key: Char): ((Double) -> Triple<Double, Double, Double>)? {
        return dataDic[key]
    }

}
