# [Bridge pattern](https://en.wikipedia.org/wiki/Bridge_pattern)

![alt text](https://miro.medium.com/max/1400/1*UmKKDvmeIUGY3gbPLvYYQQ.png)

## Description

>Decouple an abstraction from its implementation so that the two can vary independently. 

>The abstraction and implementation hierarchies are connected by object composition over inheritance which is a 
> better practice than subclassing. Using the bridge pattern allows for several implementation hierarchies that can all
> be accessed by one abstraction hierarchy.

> Note: ***Abstraction*** and ***Implementor*** are both abstractions but typically ***Abstraction*** methods make use
> of ***Implementor*** methods and at least as abstract as them. This is useful for the implementation separation of concerns.

## When to use

- You want to avoid permanent binding between abstractions and their implementations.
- Both the abstractions and the implementations should be extensible by subclassing.
- Changes in the implementation of an abstraction should have no impact on clients, their code should not have to be 
recompiled.

## Example

In this example, an abstract account class hierarchy is making use of a transfer implementation hierarchy.

1. *Abstraction* -> BankAccount
2. *RefinedAbstraction* -> SimpleAccount
3. *Implementor* -> Transaction
4. *ConcreteImplementor* -> TransactionValidator
