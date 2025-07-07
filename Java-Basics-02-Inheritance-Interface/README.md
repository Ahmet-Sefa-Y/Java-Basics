
# Java-Basics – Inheritance & Interface Example

This Java project demonstrates the use of **inheritance**, **abstract classes**, and **interfaces** through a basic vehicle system simulation.

## 🚗 Project Overview

The program simulates a car object that:
- Inherits base properties and methods from an abstract `Vehicle` class
- Implements the `Drivable` interface
- Overrides abstract methods and provides its own behavior

## 📁 Files

- `Vehicle.java`:  
  An abstract class containing common fields (`brand`, `year`) and a concrete `start()` method.  
  It also defines an abstract `displayInfo()` method that must be implemented by subclasses.

- `Drivable.java`:  
  An interface representing drivable behavior. It defines a method `drive()` to be implemented by any drivable class.

- `Car.java`:  
  A concrete class that **extends `Vehicle`** and **implements `Drivable`**. It adds a new field `seatCount` and provides implementations for `displayInfo()` and `drive()`.

- `Main.java`:  
  The entry point. Creates a `Car` object and calls its methods: `start()`, `displayInfo()`, and `drive()`.

## ✅ Sample Output

```
Vehicle is starting ...
Brand: Toyota, Year: 2022, Seats: 5
Driving the car...
```

## 📘 Concepts Covered

- Abstract classes and methods
- Constructor chaining using `super()`
- Interface implementation with `implements`
- Method overriding
