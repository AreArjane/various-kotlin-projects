# Kotlin Projects README

This repository contains two distinct projects developed in Kotlin: Temperature Converter and Grocery List App. These projects showcase different functionalities and are excellent for understanding basic operations in Kotlin and Android development.

## Temperature Converter

The Temperature Converter is a Kotlin class designed to perform temperature conversions between Celsius, Fahrenheit, and Kelvin.

### Features
Converts temperatures between Celsius, Fahrenheit, and Kelvin.
Requirements
### Kotlin compiler
IDE that supports Kotlin (IntelliJ IDEA, Android Studio)
### Usage
Below are examples of how to use the ConverterModel for various temperature conversions
```
val converter = ConverterModel()
Convert Celsius to Fahrenheit and Kelvin
val results = converter.converterCelsius(25.0)
println("Celsius: ${results.first}, Fahrenheit: ${results.second}, Kelvin: ${results.third}")
```


## Grocery List App

An Android application that allows users to manage a grocery list, including adding, deleting, and clearing items.

### Features
Add items to a grocery list.
Select and delete multiple items.
Clear all items from the list.
### Requirements
Android SDK
Android Studio
### Installation
Follow these steps to get the app running:

Clone the repository:


### Usage
Interact with the grocery list using the UI components:

Adding an Item:
kotlin
Copy code
```
addButton.setOnClickListener {
    val inputText = editText.text.toString()
    if (inputText.isNotEmpty()) {
        groceryFunction.addItems(inputText)
    }
}
```
Deleting an Item:
kotlin
Copy code
```
deleteButton.setOnClickListener {
    val itemsToRemove = selectListToggle.toList()
    itemsToRemove.forEach { item ->
        groceryFunction.deleteItem(item)
    }
}
```

Clearing the List:
kotlin
Copy code
```
clearButton.setOnClickListener {
    groceryFunction.clearList()
}
```

# License

Distributed under the MIT License. See LICENSE file for more information.