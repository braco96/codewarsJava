# Duplicate Encoder:

## 🎯 My Objective
I intend to solve the "Duplicate Encoder" problem by treating string transformation as a mathematical mapping function rather than a procedural loop. My goal is to convert a string into a sequence of parentheses based on the frequency of each character.

## 📐 The Problem Definition
Given an input string $W$, I need to construct a result string $R$ where every character $c$ is replaced according to the following logic:

* **If I find** that the character $c$ appears **once** in the string: I replace it with `(`.
* **If I find** that the character $c$ appears **more than once**: I replace it with `)`.

**Constraint:** I must ignore capitalization. For my algorithm, `'A'` is identical to `'a'`.

## 🧪 Examples of my expected output
* `"din"`      $\rightarrow$  `"((("`
* `"recede"`   $\rightarrow$  `"()()()"`
* `"Success"`  $\rightarrow$  `")())())"` (Note: 'S' is a duplicate of 's')
* `"(( @"`     $\rightarrow$  `"))(("`
