## Bug 1 – bug1.py
**Intended Behavior**: Add a task to a fresh list unless a specific list is provided to append to.
**Issue Type**: Mutable Default Argument.
**Notes**: The default list argument is created once at definition time and shared across calls, causing data to persist between function calls unexpectedly.

## Bug 2 – bug2.c
**Intended Behavior**: Safely copy the user input string into a buffer and display it.
**Issue Type**: Buffer Overflow.
**Notes**: The `strcpy` function copies without bounds checking, allowing data exceeding the buffer size to overwrite adjacent memory.

## Bug 3 – bug3.js
**Intended Behavior**: Print the specific index (0, 1, 2, 3, 4) corresponding to each file after a delay.
**Issue Type**: Variable Scope (Closure).
**Notes**: The variable `i` is declared with `var` (function scope), so all `setTimeout` callbacks share the same reference. When they execute, the loop has finished and `i` is 5.

## Bug 4 – bug4.java
**Intended Behavior**: Validate that the user input text matches the secret password text.
**Issue Type**: Incorrect String Comparison.
**Notes**: Using `==` in Java compares object references, not string content. Valid strings fail validation if they are different objects in memory.

## Bug 5 – bug5.cpp
**Intended Behavior**: Allocate memory for a game entity, use it, and properly clean it up.
**Issue Type**: Memory Leak.
**Notes**: Memory allocated with `new` is never released with `delete`, causing the application to consume more memory with each call until it crashes.

## Bug 6 – bug6.sh
**Intended Behavior**: Initialize the variable `count` to the value 0.
**Issue Type**: Syntax Error.
**Notes**: Bash does not allow spaces around the assignment operator (`=`). `count = 0` tries to run a command instead of assigning a variable.

