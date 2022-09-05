# Simple Factory
	The simple factory isn't actually a design pattern, it's more of a programming idiom.
  - We moved whatever is varying in this case object creation and moved it to Simple factory class.
  - Simple factory is not flexible, because pizza store is tied to pizza factory.
  
# Factory Method Pattern
	For factory method pattern we'll create a abstract factory method and let subclass decide what objects to create.
- Parallel hierarchies can be noticed.

#### Factory method pattern defines an interface for creating an object,  but lets subclass decide which class to instantiate, factory method lets a class defer instantiation to subclass.

# Design principle
 - Dependency Inversion: Depend upon abstraction, Do not depend upon concrete class.
 	-- In our case Pizza store is now dependent only on pizza and concrete pizza are also dependent on Pizza abstraction as well.
 	-- Inversion is in way dependency is working, low level component is dependent on high level abstraction and high level component are also 	dependent on same abstraction
 	 
# Abstract Factory
	Abstract factory provides an interface for creating families of related or dependent objects without specifying there 	concrete classes
	