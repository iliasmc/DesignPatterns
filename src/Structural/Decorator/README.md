# [Decorator pattern](https://en.wikipedia.org/wiki/Decorator_pattern)

![alt text](https://miro.medium.com/max/1194/1*nM0JRjh_gGvkqBZJCOInGg.png)

## Description

>Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing
>for extending functionality.

## When to use

- To add responsibilities to individual objects dynamically and transparently without affecting other objects.
- For responsibilities that can be withdrawn.
- When a large number of independent extensions are possible and would produce an explosion in subclasses to support
every combination.

## Example

The example provided decorates an abstract Coffee object with two different decorators. In this case:

1. *Component* -> Coffee
2. *ConcreteComponent* -> SimpleCoffee
3. *Decorator* -> Decorator
4. *ConcreteDecorator* -> MilkCoffeeDecorator, CoffeeLimitDecorator
