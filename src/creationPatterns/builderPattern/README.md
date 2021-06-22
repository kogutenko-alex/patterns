# Builder

Complexity : 2/3

Popularity : 3/3
***
A builder is a generative design pattern that allows the creation of objects step by step.

> Unlike other generating patterns, the Builder allows the production of different products using the same construction process.
***
## Example of the above code
**Task**: Turn manufacturing

In this example, the Builder allows to construct various car configurations step by step.

In addition, it shows how a Builder can create another product based on the same construction steps. For this we have two specific builders - [CarBuilder](https://github.com/kogutenko-alex/patterns/blob/master/src/creationPatterns/builderPattern/builders/CarBuilder.java) and [CarManualBuilder](https://github.com/kogutenko-alex/patterns/blob/master/src/creationPatterns/builderPattern/builders/CarManualBuilder.java).

The order of construction of the products is enclosed in the [Director](https://github.com/kogutenko-alex/patterns/blob/master/src/creationPatterns/builderPattern/director/Director.java). He knows what steps builders need to call to get a certain configuration of the product. It works with builders only through a common interface, which allows to interchange objects of builders for different products.
***
![diagram of our example](https://github.com/kogutenko-alex/patterns/blob/master/img/builder.png)
