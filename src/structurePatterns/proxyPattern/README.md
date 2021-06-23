# Proxy

Complexity : 2/3

Popularity : 1/3
***
A proxy is an object that acts as an interlayer between a client and a real service object. The Deputy receives calls from the client, performs its function (access control, caching, query modification, etc.) and then transmits the call to the service object.

> The deputy has the same interface as the real object, so there is no difference for the client - work through a deputy or directly.
***
## Example of the above code
**Task**: Caching proxy

This example shows how with the help of the proxy it is possible to make more effective communication over a network with an external video service by caching repeated requests.

The Deputy is especially useful if you do not have access to the service class code that you want to improve. It allows you to change the behavior of a real object, transparently for client code. In this example, the alternate object and the real object are interchangeable.

The original object started booting online, even if the user requested the same video. The alternate uploads the video only once, using the service object, but otherwise returns the cached file.
***
![diagram of our example](https://github.com/kogutenko-alex/patterns/blob/master/img/proxy.png)
