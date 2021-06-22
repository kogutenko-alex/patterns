# Facade

Complexity : 1/3

Popularity : 2/3
***
A facade is a structural pattern that provides a simple (but reduced) interface to a complex system of objects, a library or a framework.

> In addition to reducing the overall complexity of the program, the facade also helps to move the code dependent on the external system to a single location.
***
## Example of the above code
**Task**: Simple interface to complex video conversion library

In this example, Fasad simplifies the work of a client with a complex video conversion library.

The [facade](https://github.com/kogutenko-alex/patterns/blob/master/src/structurePatterns/facadePattern/facade/VideoConversionFacade.java) provides the user with only one simple method, concealing an entire system with video codec, audio mixers and other equally complex objects.

Instead of working directly with a dozen classes, the facade provides the application code with a single method for video conversion, which is responsible for correctly configuring the framework objects and obtaining the desired result.
***
![diagram of our example](https://github.com/kogutenko-alex/patterns/blob/master/img/facade.png)
