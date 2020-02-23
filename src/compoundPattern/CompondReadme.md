# Compound pattern
## Patterns often used together and combined within the same design solution.
## A compound pattern combines two or more patterns into a solution that solves a recurring or general problem

# Model-View-Controller (MVC) is classic example of compound pattern.
- The View gives presentation of the model. The view usually gets the state and data it needs to display
directly from the Model.

- The Controller takes user inputs and figures out what it meant to the Model.
	
- The Model holds all the data, state and business logic. The model is obvious to 
the view and controller, although it provides an interface to manipulate and retrieve its
state and it can send notifications of state changes to the observers.

## Work flow of MVC
-  You are the user you interact with the view.
	> The view is your window to the Model. When you do something to the view, then the view tells
	the Controller what you did. It's the Controller's job to handle that.

- The Controller asks the Model to change its state.
	> The controller takes your action and interprets them. (If you click on a button) it's Controller's
	job to figure out what that means and how the Model should be manipulated based on that action.
	
- The Controller may also ask the view to change.
	> When the controller receives an action from the view, it may need to tell the view to change as a
	result. For eg, the Controller could enable or disable certain buttons on View.

- The Model notifies the view when its state has changed.
	> When something changes in the Model, based either on some action you took on View or some other
	internal change, the Model notifies the view that its state has changed.

- The view asks the model for state.
	> The view gets the state it displays directly from the Model. The View might also ask the model for
	state as the result of the Controller requesting some change in the View.
	
## Looking at MVC through design patterns.
### The View : Composite Pattern
>	The display consists of a nested set of windows, panels, buttons etc. Each display component is a Composite,
or a leaf. When the Controller tells the view to update, it only has to tell the top View component,
and Composite take care of the rest.

### The Controller: Strategy Pattern
>	The View and the Controller implements the classic strategy pattern: the View is an object that is configured
with a Strategy. The Controller provides the Strategy. The View is concerned only with the visual aspects of the
application, and delegates to the controller for any decisions about the interface behavior. Using the Strategy
pattern also keeps view decoupled form the Model because it is controller that is responsible for the interacting
with the model to carry out user requests. The View knows nothing about how this gets done.

### The Model: Observer Pattern
>	The Model implements the Observer pattern to keep interested objects updated when states changes occur.
Using the observer pattern keeps the model completely independent of the views and the controllers. It allows
us to use different views with the same Model, or even use multiple views at once. 