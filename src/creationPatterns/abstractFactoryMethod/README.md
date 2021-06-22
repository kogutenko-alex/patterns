# Abstract factory method

Complexity : 2/3

Popularity : 3/3
***
An abstract factory is a design pattern that solves the problem of creating whole families of connected products without specifying specific product classes.

> An abstract factory provides an interface for the creation of all available product types, and each specific implementation of the factory generates products of one variation. The client code calls the methods of the factory to obtain products, instead of being created by the operator "new". At the same time, the factory takes care to create the product of the desired variation.
***
## Example of the above code
**Task**: Production of GUI cross-platform element families

In this example, the two product families are [buttons](https://github.com/kogutenko-alex/patterns/tree/master/src/creationPatterns/abstractFactoryMethod/buttons) and [checkboxes](https://github.com/kogutenko-alex/patterns/tree/master/src/creationPatterns/abstractFactoryMethod/checkboxes). Both product families have the same variation: for work under Unix and Windows.

[An abstract factory](https://github.com/kogutenko-alex/patterns/blob/master/src/creationPatterns/abstractFactoryMethod/factories/GUIFactory.java) provides an interface for creating products from all families. Specific factories create different products of the same variation (Unix or Windows).

The customers of the factory work both with the factory and with products only through abstract interfaces. Thanks to this, the same client code can work with different factories and products.
***
![diagram of our example](https://github.com/kogutenko-alex/patterns/blob/master/img/abstract_factory_method.png)
