# Design Pattern
## A Pattern is a solution to a problem in context.
	> The Context is the situation in which the pattern applies. This should be a recurring situation.
	> The Problem refers to the goal you are trying to achieve in this context, but it also refers to any constraints that occur in the context.
	> The solution is what you're after: A general design that anyone can apply which resolves the goal and set of constraints.
	
###  If you find yourself in a context with a problem that has a goal that is effected by a set of constraints, then you can apply a design that resolves the goal and constraints and lead to a solution. 

# The design patterns are classified into 3 categories.
- Creational Pattern: Involves object instantiation and all provide a way to decouple a client from the object it needs to instantiate.
	> Singleton, Builder, Prototype, Abstract factory, Factory method.
	
- Behavioral Pattern: Any pattern that is behavioral pattern is concerned with how classes and objects interact and distribute responsibility.
	> Mediator, Visitor, Template method, Command, Iterator, Memento, Observer, Interpreter, State, Strategy, chain of responsibility
	
- Structural Pattern: Lets you compose classes or objects into larger structures.
	> Decorator, Composite, Facade, Proxy, Adapter, Flyweight, Bridge.
	
## Another classification is based on whether the pattern deals with classes or objects
- Class Patterns: Describes how relationships between classes are defined via inheritance. Relationships in class patterns are established at compile time.
	> Template Method, Adapter, Factory method, Interpreter.

- Object Patterns: Describe relationships between objects and are primarily defined by composition. Relationships in object patterns are typically created at runtime and are more dynamic and flexible.
	> Composite, Decorator, Proxy, Strategy, Bridge, Flyweight, Abstract factory, Singleton, Builder, Prototype, Mediator, Chain of responsibility, Facde, Command, Visitor, Iterator, Memento, Obeserver, State.
	

# Briefing Design Patterns.
- Decorator: Wraps an object to provide new behavior.
- State: Encapsulates state-based behaviors and uses delegation to switch between behaviors.
- Iterator: Provides a way to traverse a collection of objects without exposing its implementation.
- Facade: Simplifies the interface of a set of classes.
- Strategy: Encapsulates interchangeable behaviors and uses delegation to decide which one to use.
- Proxy: Wraps an object to controll access to it.
- Factory method: Subclasses decide which concrete classes to create.
- Adapter: Wraps an object and provides a different interface to it.
- Observer: Allows object to be notified when state changes.
- Template Method: Subclasses decide how to implement steps in algorithm.
- Composite: Clients treats collection of objects and individual objects uniformly.
- Singleton: Ensures one and only one object is created.
- Abstract factory: Allows client to create families of objects without specifying there concrete classes.
- Command: Encapsulates a request as an object.
- Bridge: Use the bridge pattern to vary not only your implementation, but also your abstraction.
- Builder: Use the builder pattern to encapsulate the construction of a product and allow it to be constructed in steps.
- Chain of responsibility: Use when you want to give more than one object a chance to handle a request.
- Flyweight: Use when one instance of class can be used to provide many "Virtual Instances".
- Interpreter: Use to build an interpreter for a language.
- Mediator: Use to centralize complex communications and control between related objects.
- Memento: Use when you need ti be able to return an object one of its previous states, for instance an "UNDO".
- Prototype: Use when creating an instance of a given class is either expensive or complicated.
- Visitor: Use when you want to add capabilities to a composite of objects and encapsulation is not important. 

 
