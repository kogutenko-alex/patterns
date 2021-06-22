# Bridge

Complexity : 3/3

Popularity : 1/3
***
A bridge is a structural pattern that divides business logic or a large class into several separate hierarchies that can then be developed separately.

> One of these hierarchies (abstraction) will get a reference to the objects of the other hierarchy (implementation) and will delegate to them the main work. Because all implementations follow a common interface, they can be interchangeably replaced within the abstract.
***
## Example of the above code
**Task**: Bridge between instruments and remote controls

This example shows the separation of the code of [remote controls](https://github.com/kogutenko-alex/patterns/tree/master/src/structurePatterns/bridgePattern/remotes) and [household appliances](https://github.com/kogutenko-alex/patterns/tree/master/src/structurePatterns/bridgePattern/devices).

The consoles act as «abstraction», and the devices are «realization». The same devices can operate with different remote controls, and the remote controls can control different devices.

Using the Most pattern, we can change the classes of consoles and devices independently of each other.
***
![diagram of our example](https://github.com/kogutenko-alex/patterns/blob/master/img/bridge.png)
