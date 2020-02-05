# Adapter Pattern
## The adapter pattern converts the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 
## Here is how client uses the adapter.
	- The client makes a request to the adapter by calling a method on it using the target interface.
	- The adapter translates the request into one or more calls on the adaptee using the adaptee interface.
	- The client receives the results of the call and never knows there is an adapter doing the translation.
