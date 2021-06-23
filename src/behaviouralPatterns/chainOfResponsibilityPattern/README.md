# Chain of Responsibility

Complexity : 2/3

Popularity : 1/3
***
A chain of responsibilities is a behavioral pattern that allows a query to be transmitted over a chain of potential handlers until one of them processes the request.

> Removes the hard binding of the sender to the receiver, allowing the chain to be built from different processors dynamically.
***
## Example of the above code
**Task**: User Authorization and Authentication Layers

This example shows how user data passes through serial authentication in a multitude of handlers connected into a single chain.

This example differs from the canonical version in that verification is terminated if the next handler cannot process the request. 
In the classical variant, the chain ends as soon as an element of a chain is found that can handle a query. 
Just know that the Conceptual Example does not change from this, and the code is only different in terms of getting out of the chain.

***
