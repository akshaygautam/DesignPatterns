# Command Pattern
## The command pattern encapsulates a request as an object, thereby letting you parameterize other objects with different request, queue or log requests, and support undoable operations.

- The command pattern decouples an object making a request from the one that knows how to perform it.
	> Like messaging queues.	
- A command object is the center of this decoupling and encapsulates a receiver with an action.
- An invoker makes a request of a Command object by calling its execute() method, which invokes those action on the receiver.
- Invoker can be parameterized with Commands, even dynamically at run time.
- Commands may support undo by implementing an undo method that restores the object to its previous state before the execute() method was last called.
- Macro Commands are simple extension of Command that allow multiple commands to be invoked. Likewise, MacroCommands can easily support undo.
- Commands may also be used to implement logging and transactional systems.