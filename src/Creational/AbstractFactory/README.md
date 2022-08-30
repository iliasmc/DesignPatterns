# [Abstract Factory pattern](https://en.wikipedia.org/wiki/Abstract_factory_pattern)

![alt text](https://imgs.developpaper.com/imgs/2457577-20210717150236824-517985254.jpg)

## Description

>Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

## When to use

- A system should be independent of how its products are created, composed and represented.
- A system should be configured with one of multiple families of products.
- A family of related products is designed to be used together, and you need to enforce that constraint.

## Example

In this example, an abstract account class hierarchy is making use of a transfer implementation hierarchy.

1. *AbstractFactory* -> AbstractFactory
2. *ConcreteFactory* -> LinuxFactory, MacOsFactory, WindowsFactory
3. *AbstractProduct* -> Window, Button
4. *ConcreteProduct* -> LinuxWindow, MacOsWindow, WindowsWindow, LinuxButton, MacOsButton, WindowsButton
