# Template method pattern
## The template method pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm structure.

- Hooks are methods that do nothing or default behavior in the abstract class, but may be overriden in the subclass.
- The strategy and template method patterns both encapsulate algorithms, one by inheritance and one by composition.
- The Factory method is a specialization of template method. 

# Design Principle
	> The Hollywood Principle: Don't call us, we'll call you

- The hollywood principle gives us a way to prevent dependency rot.
- Dependency rot happens when high-level component become dependent on low level component.
- With this principle we allow low-level components to hook themselves into a system, but the high level component determine when they're needed, and how.
- The high level component give the low level component a "don't call me, we'll call you" treatment. 

