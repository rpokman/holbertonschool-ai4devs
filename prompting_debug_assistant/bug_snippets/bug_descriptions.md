# Bug Descriptions

## Summary
This document outlines the bugs identified in the provided code snippets (bugs 1 through 6). Each section details the intended behavior, the type of issue encountered, and notes on why the bug occurs.
- **bug1.py**: Mutable default argument causing state persistence.
- **bug2.c**: Buffer overflow vulnerability due to unchecked string copy.
- **bug3.js**: Variable hoisting and closure scope issue in a loop.
- **bug4.java**: Incorrect string equality check using reference comparison.
- **bug5.cpp**: Memory leak from dynamic allocation without deallocation.
- **bug6.sh**: Syntax error in variable assignment.

## Bug 1 - bug1.py
**Intended Behavior**: The function `add_task` is intended to append a new task to a provided list task_list. If no list is provided, it should create a new, empty list, add the task to it, and return that new list containing only the current task.
**Issue Type**: Mutable Default Argument.
**Notes**: In Python, default parameter values are evaluated only once when the function is defined, not called. The list `[]` used as a default argument is effectively a static object shared across all calls that use the default. This causes tasks to accumulate in the shared list instead of starting with a fresh empty list each time.

## Bug 2 - bug2.c
**Intended Behavior**: The program should accept a command-line argument or a string, copy it safely into a local buffer, and then print the received command. It is intended to handle strings that fit within the buffer size.
**Issue Type**: Buffer Overflow.
**Notes**: The code uses `strcpy` to copy `user_input` into `buffer` without checking if the source string length exceeds the destination buffer size (10 bytes). If the input is longer than 9 characters (plus null terminator), it writes past the end of the array, causing a buffer overflow which can crash the program or corrupt memory.

## Bug 3 - bug3.js
**Intended Behavior**: The script is intended to iterate through a list of filenames and print a "Download complete" message for each file index (0 to 4) sequentially, with a delay increasing by 1 second for each iteration.
**Issue Type**: Variable Scope / Closure.
**Notes**: The loop variable `i` is declared with `var`, making it function-scoped (or global if not in a function). The `setTimeout` callbacks are executed after the loop has finished. Since they all share the same reference to `i`, and the loop completes before the timers fire, they all access `i` when it has already reached the value 5.

## Bug 4 - bug4.java
**Intended Behavior**: The `checkPassword` method should compare the input string provided by the user against the stored secret string "12345" and return `true` only if the text content of both strings is identical.
**Issue Type**: Incorrect String Comparison.
**Notes**: The code uses the `==` operator to compare the strings `input` and `secret`. In Java, `==` checks for reference equality (whether they are the same object in memory), not value equality. Even if the strings contain the same characters, they are different objects, so `==` results in `false`. The `.equals()` method should be used instead.

## Bug 5 - bug5.cpp
**Intended Behavior**: The class `GameWorld` should manage game entities. The `createEnemy` method is intended to allocate memory for an enemy's health, initialize it, and then clean up or manage that resource as part of the game lifecycle.
**Issue Type**: Memory Leak.
**Notes**: The function `createEnemy` allocates an integer on the heap using `new int(100)` and assigns it to the pointer `enemy_health`. However, the function returns without calling `delete` on this pointer. The pointer is a local variable and is lost when the function returns, leaving the allocated memory on the heap unreachable and un-freable (a memory leak).

## Bug 6 - bug6.sh
**Intended Behavior**: The script should initialize a counter variable named `count` to the value 0, and then verify that the variable has been correctly set to 0.
**Issue Type**: Syntax Error (Shell Variable Assignment).
**Notes**: The assignment `count = 0` contains spaces around the equal sign. In Bash, this is parsed as trying to execute a command named `count` with arguments `=` and `0`. To assign a variable in Bash, there must be no spaces: `count=0`. This causes the subsequent check `[ "$count" -eq 0 ]` to fail or behave unexpectedly.
