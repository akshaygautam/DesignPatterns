# Joining multiple patterns to work in conjunction.
	> We Started with Simple inheritance,
		(1) then added adapter,
		(2) then added decorator,
		(3) then added Abstract factory,
		(4) then added Composite,
		(5) then added Iterator,
		(6) and finally added Observer
## What did we do?
- We started with bunch of Quackables....

- A goose came along and wanted to act like a Quackable too.
	> So we used Adapter Pattern to adapt goose to a Quackable.
	Now you can call quack() on a goose wrapped in the adpter and it will honk.

- Then, the Quackologists decided they wanted to count quacks.
	> So we used Decorator Pattern to add a QuackCounter decorator that keeps track
	of the number of times quack() is called, and then delegates the quack to the Quackable
	it's wrapping.

- But the Quackologist were worried they'd forget to add the QuackCounter decorator.
	> So we used Abstract Factory Pattern to create ducks for them. Now whenever they wan a
	duck, they ask the factory for one, and it hands back a decorated duck.

- We had management problems keeping track of all those ducks and geese and quackables.
	> So we used the Composite Pattern to group Quackbles into Flocks. The pattern also allows
	the Quackologist to create sub-flocks to manage duck families. We used Iterator Pattern in
	our implementation by using java.util's iterator in ArrayList.

- The Quackologists also wanted to be notified when any Quackable quacked.
	> So we used the Observer Pattern to let the Quackologists register as Quackble Observers.
	Now they're notified every time any Quackable quacks. We used iterator again in this implementation.
	The Quackologists can even use the Observer pattern with their composites.