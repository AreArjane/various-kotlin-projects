# various-kotlin-projects
various Kotlin Project with android studio
Kotlin Projects

This repository contains two separate Kotlin projects: a Temperature Converter and a Grocery List App. Each project is designed to demonstrate different aspects of Kotlin programming and Android development.

Project 1: Temperature Converter

The Temperature Converter is a simple Kotlin class that provides functions to convert temperatures between Celsius, Fahrenheit, and Kelvin.

Features
Convert temperature from Celsius to Fahrenheit and Kelvin.
Convert temperature from Kelvin to Celsius and Fahrenheit.
Convert temperature from Fahrenheit to Celsius and Kelvin.
Requirements
Kotlin SDK
Any IDE that supports Kotlin (e.g., IntelliJ IDEA, Android Studio)
Usage
To use the Temperature Converter, instantiate the ConverterModel class and call the appropriate method based on the conversion you need:

val converter = ConverterModel()
val celsiusToFahrenheit = converter.converterCelsius(100.0)  // Convert 100°C
println("Celsius: ${celsiusToFahrenheit.first}, Fahrenheit: ${celsiusToFahrenheit.second}, Kelvin: ${celsiusToFahrenheit.third}")


Project 2: Grocery List App

The Grocery List App is an Android application that allows users to add, delete, and clear items from a grocery list.

Features
Add items to a grocery list.
Select and delete specific items.
Clear the entire list.
Requirements
Android SDK
Android Studio
Installation
Clone this repository to your local machine.
Open Android Studio and select "Open an existing Android Studio project".
Navigate to the directory where you cloned the repository and select the "Grocery List App" project.
Build the project in Android Studio and run it on an emulator or a physical device.
Usage
Adding an Item: Enter the item name in the input field and click the "Add" button.
Deleting Items: Tap on items to select them and press the "Delete" button to remove them from the list.
Clearing the List: Click the "Clear" button to remove all items from the list.
