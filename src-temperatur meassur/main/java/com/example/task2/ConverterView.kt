package com.example.task2

class ConverterView {
    private val TemperaturModel = ConverterModel()

    fun toCelsius(CelData: Double): Triple<Double, Double, Double> {
        return TemperaturModel.converterCelsius(CelData)
    }

    fun toKelvin(kelvData: Double): Triple<Double, Double, Double> {
        return TemperaturModel.converterKelvin(kelvData)
    }

    fun toFahrenheit(fehrenData: Double): Triple<Double, Double, Double> {
        return TemperaturModel.converterFahrenheit(fehrenData)
    }


    private val dataDic = mapOf(
        'C' to this::toCelsius,
        'K' to this::toKelvin,
        'F' to this::toFahrenheit
    )

    fun getResult(key: Char, value: Double): Triple<Double, Double, Double>? {
        val resultV = TemperaturModel.getDataConverter(key)
        return resultV?.invoke(value)
    }
}