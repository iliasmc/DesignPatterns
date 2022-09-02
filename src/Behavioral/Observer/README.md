# [Observer pattern](https://en.wikipedia.org/wiki/Observer_pattern)

![alt text](https://miro.medium.com/max/1144/1*2KgKOfU3hNeF9VjoXhaXzQ.png)

## Description

>Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified
> and updated automatically.

>A typical application of this pattern is to update UI related objects with internal system state.

## When to use

- When a change in one objects requires changing others, and you don't know how many objects need to be changed.
- When an object should be able to notify other objects without making assumptions about whom those objects are (put
  them behind an abstraction) to decrease coupling.

## Example

This example demonstrates a news app using the observer pattern to notify all users interested about new articles.

1. *Subject* -> NewsAgency
2. *ConcreteSubject* -> BBCNews
3. *Observer* -> Observer
4. *ConcreteObserver* -> AndroidObserver, IOSObserver


