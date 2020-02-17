1. Git main or sub branch forking
2. Higher order life cycle of project
     Type of testing
	 Junit
	 Integration
	 Unit
	 
	 SDLC water fall vs agile
	 
	 
2. Jenkins use
3. TDD
4. Juint 
5. What is functional programming lang
	Data is normally immutable and mutability is discouraged in functional programming.
	
	Pure functions are easier to understand because they don’t change any states and depend only on the input given to them. Whatever output they produce is the return value they give.Implement concurrency/parallelism because pure functions don’t change variables or any other data outside of it.It is needed where concurrency or parallelism is required.
	sum(x, y)           // sum is function taking x and y as arguments
     return x + y    // sum is returning sum of x and y without changing them
	 
	The code’s definitely easier to test. We don’t need to mock anything as given input always produces same output. 
	
	Lazy evaluation : It adopts lazy evaluation which avoids repeated evaluation because the value is evaluated and stored only when it is needed.
	
	Recursion: There are no “for” or “while” loop in functional languages. Iteration in functional languages is implemented through recursion. Recursive functions repeatedly call themselves, until it reaches the base case.
	
	Function composition over imperative flow control
	
	we commonly use the for loop. For each iteration, we are changing the i and the sumOfValue state. But how do we handle mutability in iteration? Recursion.We can use "reduce" to implement this behaviour of recursion. 
	
	
	
	Functions are First-Class and can be Higher-Order: A programming language is said to have First-class functions when functions in that language are treated like any other variable. For example, in such a language,
		a function can be passed as an argument to other functions, 
		can be returned by another function 
		and can be assigned as a value to a variable.
	A higher-order function is a function that does at least one of the following:
		takes one or more functions as arguments (i.e. procedural parameters),
		returns a function as its result.
	
	Also :
	It is built on the concept of mathematical functions which uses conditional expressions and recursion to do perform the calculation
	It does not support iteration like loop statements and conditional statements like If-Else 
	
	Disadvantages:
	writing pure functions can reduce the readability of code.
	Writing programs in recursive style instead of using loops can be bit intimidating.
	Immutable values and recursion can lead to decrease in performance.
differe between imperative and functional

6. What is pros and cons

    Abstract vs Trait
    1. A class can inherit from multiple traits but only one abstract class.
    2. Abstract classes can have constructor parameters as well as type parameters. Traits can have only type parameters. For example, you can’t say trait t(i: Int) { }; the i parameter is illegal.
    3. Abstract classes are fully interoperable with Java. You can call them from Java code without any wrappers. Traits are fully interoperable only if they do not contain any implementation code.

	Conceptually, a trait is a component of a class, not a class by itself. As such, it typically does not have constructors, and it is not meant to "stand by itself".

	I suggest using an abstract class when it has an independent meaning, and traits when you just want to add functionality in an object-oriented manner. If you're not sure between the two, you might find that if all your methods revolve around doing a single thing, you probably want a trait.

	For a (non-language-specific) example, if your Employee should extend both "Person" and "Cloneable", make Person a base class and Cloneable a trait.


  
	Auxilarry
	
	Scala has two types of constructors:

	1. primary constructor

	2. auxiliary constructor (secondary constructor)
	We define Auxiliary Constructors in Class Body with “def” and “this” keywords, but not in Class Definition. We use Class Definition to declare Primary Constructor.
	NOTE:-
		- Each Auxiliary Constructor should call one of the previous defined constructor. An Auxiliary Constructor can call either Primary Constructor or another Auxiliary constructors by using “this” name.
		- Like Method Overloading, All Auxiliary Constructors should use same name: “this”.
	
	Scala Final :
	Final is a keyword, which is used to prevent inheritance of super class members into derived class. You can declare final variables, methods and classes also.
   
   Monad 
   Static and Dynamic Type casting
   
    pure functions, function composition, currying and partial application, recursive data structures, algebraic data types, monadic composition, type classes, lenses, monad transformers
   
 Compare Java Script vs Scala
         Python vs Scala

	Staticmethods in Scala are handled via "companion objects" for classes, which are named the same as the class itself. Objects are an entire topic of study for the Scala language
	
7. How functional programming is better for data structure

9. Spark application life cycle
10. Employee age count by group by & How stages got generated
14. how many different types this can be writter
11. Difference between on premise vs on cloud
12. how will you achieve concurrency in scala?
Scala does not provide any separate library for creating thread. If you are familiar with multithreading concept of Java, you will come to know that it is similar except the syntax of Scala language itself.You can create thread either by extending Thread class or Runnable interface. Both provide a run method to provide specific implementation.


13. RDD DF DS


HDP 2.6
Spark 2.2
Hive
Kafka
Nifi
Oozie
Jenkins 
Maven
Scala
