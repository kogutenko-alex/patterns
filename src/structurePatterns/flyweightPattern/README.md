# Flyweight

Complexity : 3/3

Popularity : 1/3
***
Lightweight is a structural pattern that saves memory by splitting a general state drawn into a single object between multiple objects.

> Lightweight saves memory by caching the same data used in different objects.
***
## Example of the above code
**Task**: Drawing forest

In this example we will create and draw a forest (1.000.000 trees)! Each tree corresponds to its own object having some state (coordinates, textures, etc.). This program works, but it eats too much memory.

Many trees have the same properties (name, texture, color). So we can apply the Lightweight pattern and paste these properties in individual [TreeType](https://github.com/kogutenko-alex/patterns/blob/master/src/structurePatterns/flyweightPattern/trees/TreeType.java) objects. Now, instead of storing this data in millions of [Tree](https://github.com/kogutenko-alex/patterns/blob/master/src/structurePatterns/flyweightPattern/trees/Tree.java) objects, we’re going to refer to one of several lightweight objects.

The client doesn’t even have to know about all this. The TreeType lightweight factory will take care of creating a new type of tree if a tree with some unique parameters is requested.
***
![diagram of our example](https://github.com/kogutenko-alex/patterns/blob/master/img/flyweight.png)
