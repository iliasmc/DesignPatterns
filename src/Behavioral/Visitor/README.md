# [Visitor pattern](https://en.wikipedia.org/wiki/Visitor_pattern)

![alt text](https://miro.medium.com/max/1182/1*DCp7meDQpozFhKQKSwyPmg.jpeg)

## Description

>Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation
> *without changing* the classes of the elements on which it operates.

>It is composed of two class hierarchies, one for the Elements and one for Visitors (which define operations on those 
> elements).

>It is a powerful pattern to add as much functionality as we want over an object structure without changing the object
> structure or the elements that are contained in it.
## When to use

- Many distinct and unrelated operations need to be performed on objects in an object structure, and you want to avoid
polluting their classes with these operations.
- The classes that define the object structure shouldn't (or rarely) change, but you want to define new operations over
the structure.
- An object structure contains many classes of objects with differing interfaces, and you want to perform operations
- on these objects that depend on their concrete classes.

## Example

In this example, two visitors add functionality over a Restaurant which has a few different equipments.

1. *Visitor* -> Visitor
2. *ConcreteVisitor* -> LoggerVisitor, BookEquipmentVisitor
3. *ObjectStructure* -> Restaurant
4. *Element* -> Element
5. *ConcreteElement* -> Chair, Sunbed, Table
