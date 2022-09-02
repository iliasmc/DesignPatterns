# [Memento pattern](https://en.wikipedia.org/wiki/Memento_pattern)

![alt text](https://i.stack.imgur.com/NxGIn.png)

## Description

>Without violating encapsulation, capture and externalize  and object's internal state so that the object can be
restored to this state later.

## When to use

- A snapshot of an object's state must be saved so that it can be restored to that state later.
- A direct interface to obtaining the state would expose implementation details and break the object's encapsulation.

## Example

This example illustrates how a game saves some state that can be restored later while maintaining encapsulation.

1. *Originator* -> Game
2. *Memento* -> Memento
3. *Caretaker* -> MementoMain
