# Command

Complexity : 2/3

Popularity : 1/3
***
A command is a behavioral pattern that allows wrapping queries or simple operations into individual objects.

> This allows you to delay execution of commands, queue them, and store history and cancel.
***
## Example of the above code
**Task**: Text Editor Commands and Cancellations

By reacting to the user’s actions, the text editor creates command objects. Each command performs some action, and then falls into the stack of history.

Now, in order to perform the cancellation, we take the last command from the list and either reverse the action or restore the editor state saved in this command.

The commands that change the status of the editor (for example, the text insertion command from the clipboard) save a copy of the status of the editor before executing the action. Copies of the completed commands are placed in the history of the commands, from where they can be obtained if you want to cancel the operation.

The classes of the interface elements, the history of the commands and others do not depend on the specific classes of commands, as they work with them through a common interface. This allows you to add new commands to the application without changing the existing code.
***
![diagram](https://github.com/kogutenko-alex/patterns/blob/master/img/command.png)
