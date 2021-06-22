# Singleton

Complexity : 1/3

Popularity : 2/3
***
A Singleton is a generative pattern that guarantees the existence of only one object of a particular class, and that it can be accessed from anywhere in the program.

> A loner has the same advantages and disadvantages as global variables. It’s incredibly convenient to use, but it breaks the modularity of your code.

> You can’t just use a class that depends on a single person in another program. You have to emulate the presence of a single person there. This problem is most often present in unit tests.
***
## Example of the above code
**Task**: Multithreaded Singleton

[Singleton](https://github.com/kogutenko-alex/patterns/blob/master/src/creationPatterns/singletonPattern/Singleton.java) does not have a public constructor, so the only way to get its object is to call the getInstance method. This method saves the first object created and will return it at all subsequent calls.
***
![diagram of our example](https://github.com/kogutenko-alex/patterns/blob/master/img/singleton.png)
