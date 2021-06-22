# Composite 

Complexity : 2/3

Popularity : 2/3
***
A composite is a structural pattern that allows you to create an object tree and work with it in the same way as a single object.

> The composite has long since become synonymous with all the tasks associated with constructing an object tree. All linker operations are based on recursion and «summation» of results on branches of the tree.
***
## Example of the above code
**Task**: Simple and composite graphic figures

This example shows how it is possible to work with complex geometric figures composed of primes as if they were simple.

The [CompoundGraphic](https://github.com/kogutenko-alex/patterns/blob/master/src/structurePatterns/compositePattern/shapes/CompoundShape.java) class can contain any number of sub-shapes, including the same containers as itself. The container implements the same methods as simple shapes. But instead of acting directly, it transmits calls to all embedded components using recursion. Then it sort of «sums up» the results of all the embedded figures.

The client code works with all the pieces through the common interface of the pieces and does not know that in front of it - simple figure or composite figure. This allows the client code to work with trees of any complexity without being tied to the specific classes of objects forming a tree.
***
![diagram of our example](https://github.com/kogutenko-alex/patterns/blob/master/img/composite.png)
