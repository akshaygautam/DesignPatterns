# Facade Pattern
## Facade provides a unified interface to a set of interfaces in a subsystem, facade defines a higher level interface that makes the subsystem easier to use.
> A facade not only simplifies an interface, it decouples client from a subsystem of component

## Design principle
	- Principle of least knowledge/ Law of demeter : talk only to your immediate friends.
> It means when you are designing a system, for any object, be careful of the number of classes it interacts with and also how it comes to interact with those classes
## Guide lines to follow 
### The principle tells how we should invoke methods that belongs to:
- The object itself.
- Object passed as an parameter to the method.
- Any object that method creates.
- Any component of the object (HAS-A Components of that object)

### Disadvantages
More wrapper class are created, this result in more complex structure and decreased runtime performance.
