# Java Important Points 🚀🚀

## When was java created?
Java was created by James Gosling. Sun Microsystems officially launched java in the year 1995. (Now sun is a part of Oracle .Inc)

## How does Java Code Run?
There are two steps in executing a java program
1. Compilation
2. Execution

In compilation step, our source code which we wrote will be converted into a byte code by the JDK. In execution step, byte code is converted into Machine understandable code (Native code) by JVM (java vitual machine).

## What is difference between bytecode and native code?
Native code is also known as the machine code, as the name suggest the code is readable by machine. Bytecode is like the intermediate code between Source code and machine code. Bytecode is executed by Virtual machine and then by the CPU, but machine code is not executed by virtual machine, it is directly executed by CPU.

## What are Variables?
Variables are the user-defined memory locations which can be used to store data. Updating of variables can be possible at any level.
Java is a typed language which means the type of variable is predefined before the name of the variable, but Languages like javascript is not a typed language.

## What are types of data types in Java?
There are two types of data types one is primitive and another is non-primitive.
Byte, short, char, int, float, double, long, boolean are known as primitive data types and String, Array, Class, Object, Interface are non-primitive data types. non-primitive data types are formed by combining primitive data types.

## What are Identifiers?
Identifiers are user defined names to functions or classes or interfaces or variables.

## what is the difference between identifiers and variables?
All Variables are identifiers but all identifiers are not variables.

## what is literal?
If we consider a variable a which is defined as `int a = 15` then a is known as identifier and 15 is known as the literal.

## what is type conversion?
As the name suggest type conversion means converting the data type of variables.
When we assign a value of one variable to another variable with different data type. they two might be compatible if they are compatible then java will automatically perform type coversion, if not then they need to be cast or converted explicitly.

`byte -> short -> int -> long -> float -> double`

Above order indicates, a data type is compatable with all the data types which are before it.

## what is type casting?
As I said `long` cannot be converted into `int` by automatic conversion, since `int` is not compatible with `long`, so we need to convert it explicitly this explicit conversion is known as type casting.

```java
int num = (int)(67.57f);
/**
* float value of 67.57 is casted into integer value of 67, so num will be 67
*/
```

## what is type promotion?
While evaluating an expression, the intermediate values may exceed the range of operands and hence expression value will be promoted.

1. Java automatically promotes each byte, short, char operand to int when evaluating an expression.
2. If one operand is long, float, double then the whole expression will be promoted to long, float, double respectively.

## what is difference between while loop and do while loop?
In while loop the statements inside the loop will run only if the codition is satisfied and in do while loop no matter whether the condition is satisfied or not the statements will run atleast once.

## what are functions in java?
functions in java are also known as methods, functions are basically the reusable portion of a program. This portion of code will only run when it is called.

## what is scoping in java?
In java, scoping defines where can a variable or method is accessible in a program.
1. Block scope
2. Function scope
3. Loop scope

## what is shadowing in java?
shadowing in java is the practice of overlapping the scopes with the same name where the variable in low-level scope overrides the variable of high-level scope.

## what are varargs (variable arguments)?
Sometimes we may don't know how many arguments to pass into a method or a function then we use this `varargs`. i.e. `method(int ...v)`, this method will take an array of inputs.

## what is function overriding?
Defining a function with same name of another function but with different data types of arguments or different number of arguments

Conditions for function overriding :
1. type of arguments should be different
2. no of arguments should be different.

## what is brian kernighan's algorithm?
subtracting 1 from a decimal number flips all the bits after the rightmost set bit including the rightmost set bit.
```
10 -> 1010
10-1 -> 9 -> 1001
```

brian kernighan's algorithm is used to find the number of set bits in a decimal number
for example : number of set bits in 10
steps :
1. Initialize count variable to 1
2. If n > 0
    1. do 'and' operation of n and n-1 and assign the value to n
    2. increase count by 1
    3. go to step 2
3. return count