# Proxy Pattern
## The Proxy pattern provides a surrogate or placeholder for another object to control access to it.

- A remote proxy controls the access to a remote object

- A virtual proxy controls access to create a resource that is expensive to create.

- A protection proxy controls access to a resource based on access rights.

- A firewall proxy controls access to a set of network resources protecting the subject from bad clients.

- A smart reference proxy  provides additional actions whenever a subject is referenced, such as counting 
the number of references to an object.

- A caching proxy provides temporary storage for results of operations that are expansive.
It can also allow multiple clients to share the results to reduce computation or network latency.

- A synchronization proxy provides safe access to a subject from multiple threads.

- A complexity hiding proxy hides complexity of and controls access to a complex set of classes.
This sometimes called the Facade proxy for obvious reasons. The complexity hiding proxy differs form the 
facade pattern in that the proxy controls the access, while the facade pattern just provides an alternative interface.

- A copy-on-write proxy controls the copying of an object by deferring the copy of an object until it is required
by a client. This is a variant of the virtual proxy.