# Decorator

Complexity : 2/3

Popularity : 2/3
***
A decorator is a structural pattern that allows objects to add new behaviors on the fly by placing them in wrappers.

> The decorator allows to wrap objects countless times due to the fact that both wrappers and real wrapped objects share a common interface.
***
## Example of the above code
**Task**: Encryption and data compression

This example shows how you can add new functionality to an object without changing its class.

At first, the business logic class could read and write only pure data directly from/to the files. By applying the Decorator pattern, we created small wrapping classes that add new behaviors before or after the main work of the embedded business logic object.

The first wrapper [encrypts and decrypts](https://github.com/kogutenko-alex/patterns/blob/master/src/structurePatterns/decoratorPattern/decorators/EncryptionDecorator.java) the data, and the second wrap [compresses and unpacks](https://github.com/kogutenko-alex/patterns/blob/master/src/structurePatterns/decoratorPattern/decorators/CompressionDecorator.java) it.

We can use the wrappers separately from each other and together, wrapping one decorator in different pieces.
***
![diagram of our example](https://github.com/kogutenko-alex/patterns/blob/master/img/decorator.png)
