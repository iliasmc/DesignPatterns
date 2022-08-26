# [Composite pattern](https://en.wikipedia.org/wiki/Composite_pattern)

>![alt text](https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Composite_UML_class_diagram_%28fixed%29.svg/600px-Composite_UML_class_diagram_%28fixed%29.svg.png)

## Description

>Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat
> individual objects and compositions of objects uniformly.

## When to use

- To add responsibilities to individual objects dynamically and transparently without affecting other objects.
- For responsibilities that can be withdrawn.
- When a large number of independent extensions are possible and would produce an explosion in subclasses to support
  every combination.

## Example

This example shows how a typical GUI library might use this pattern

1. *Component* -> Component
2. *Leaf* -> TextNode, ImageNode
3. *Composite* -> SubWindow