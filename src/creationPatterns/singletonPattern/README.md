# Singleton

Complexity : 1/3

Popularity : 3/3
***
The factory method is a design pattern that solves the problem of creating different products without specifying specific product classes.

> The factory method specifies the method to use instead of calling the operator "new" to create product objects. Sub-classes may override this method to change the type of products being created.
***
## Example of the above code
**Task**: Production of cross-platform GUI elements

In this example, the products are the [buttons](https://github.com/kogutenko-alex/patterns/tree/master/src/creationPatterns/factoryMethod/button) and the creator is the [dialog](https://github.com/kogutenko-alex/patterns/tree/master/src/creationPatterns/factoryMethod/factory).

Different types of dialogue correspond to their own types of elements. So for each type of dialogue, we create our own subclass and redefine the factory method.

Each particular dialog will generate the buttons that match it. The basic code of dialogs will not be broken, as it works with products only through their common interface.
***
![diagram of our example](https://github.com/kogutenko-alex/patterns/blob/master/img/factory_method.png)
