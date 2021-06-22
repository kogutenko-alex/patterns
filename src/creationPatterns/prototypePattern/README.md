# Prototype

Complexity : 1/3

Popularity : 2/3
***
A prototype is a generative pattern that allows copying objects of any complexity without being bound to their specific classes.

> All Prototype classes share a common interface. Therefore you can copy objects without paying attention to their specific types and always be sure that you get an exact copy. Cloning is performed by the prototype object itself, allowing it to copy the values of all fields, even private ones.
***
## Example of the above code
**Task**: Copying Graphic Figures

Consider an example of implementing a Prototype without using a Cloneable interface.

In this example, the Prototype makes it possible to make accurate copies of geometric [shapes](https://github.com/kogutenko-alex/patterns/tree/master/src/creationPatterns/prototypePattern/shapes) without attaching to their classes.

All figures implement the [cloning interface](https://github.com/kogutenko-alex/patterns/blob/master/src/creationPatterns/prototypePattern/shapes/Shape.java) and provide a method to reproduce themselves. Subclasses use the cloning method of the parent and then copy their own fields to the resulting object.
***
![diagram of our example](https://github.com/kogutenko-alex/patterns/blob/master/img/prototype.png)
