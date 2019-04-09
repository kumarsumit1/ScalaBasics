# ScalaBasics

Scala is a statically typed, object-oriented programming language that blends imperative and functional programming styles. The main Scala compiler, scalac, generates Java class files that can be run on the JVM. However, another Scala compiler exists that generates binaries that can be run on the .NET CLR, as Scala is designed to integrate with both the Java and .NET worlds.



## Type inter-operatability
The type Int names the class Int in the package scala. Values of this class are implemented just like Java's int values. In fact, Scala treats int as an alias for scala.Int. More generally, all of Java's primitive types are defined as aliases for classes in the scala package. For example, if you type boolean in a Scala program, the type you'll actually get is scala.Boolean. Or if you type float, you'll get scala.Float. When you compile your Scala code to Java bytecodes, however, Scala will compile these types to Java's primitive types where possible to get the performance benefits of Java's primitive types. 

The type ***Unit***, which is Scala's analogue to ***void*** in Java. The main difference **between Scala's Unit and Java's void** is that Scala lets you write down a value of type Unit, namely (), whereas in Java there is no value of type void. (In other words, just as 1, 2, and 3, are potential values of type int in both Scala and Java, () is the one and only value of type Unit in Scala. By contrast, there are no values of type void in Java.) Except for this, Unit and void are equivalent. In particular, every void-returning method in Java is mapped to a Unit-returning method in Scala. 




NULL,Nil,null,None,Nothing

Any,Anyref 


## How to launch a Scala application 

There are two ways to create a launching point for your application: define an object that extends the App trait, or define an object with a properly defined main method.
For the first solution, define an object that extends the App trait. Using this approach, the following code creates a simple but complete Scala application:

object Hello extends App {\
    if (args.length == 1)\
        println(s"Hello, ${args(0)}")\
    else\
        println("I didn't get your name.")\
}

The code in the body of the object is automatically run, just as if it were inside a main method.When using this approach, any command-line arguments to your application are implicitly available through an args object, which is inherited from the App trait. The args object is an instance of Array[String], just as if you had declared a main method yourself. 


The second approach to launching an application is to manually implement a main method with the correct signature in an object, in a manner similar to Java:

object Hello2 {\
   def main(args: Array[String]): Unit = {\
    println("Hello, world!")\
  }\
}

***Note*** that in both cases, Scala applications are launched from an object, not a class. 

## Features

### Closure - A closure is a function, whose return value depends on the value of one or more variables declared outside this function.
val multiplier = (i:Int) => i * 10.

### Curring function
Currying is the technique of transforming a function with multiple arguments into a function with just one argument. 
The single argument is the value of the first argument from the original function and the function returns another 
single argument function uncurrying :
def add(x:int,y:int):int = {
x +y
}

As Scala supports curried functions, you can turn this into it’s curried version simply by separating out the arguments
currying

def add(x:int)(y:int):int = {
x +y
}


### Higher Order Function :
When output of one  method becomes the input to another method. Like callback

### Case class - 
Its a class used for pattern mathching in scala.
 
### Apply and unapply

### Extractor - 
Scala extractor is an object which has a method called unapply as one of its members. The unapply method matches a value and take it apart. The extractor also defines apply method for building values.

Consider an example of extracting first name and last name that uses space as separator.
object firstName {
  def main(args: Array[String]) {
 
    println("Apply method : " + apply("Steve", "Smith"));
    println("Unapply method : " + unapply("Steve Smith"));
    println("Unapply method : " + unapply("Rob"));
 
  }
 
  def apply(fname: String, lname: String) = {
    fname + " " + lname
  }
 
  def unapply(s: String): Option[(String, String)] = {
    val pts = s split " "
    if (pts.length == 2) {
      Some(pts(0), pts(1))
    } else {
      None
    }
  }
}
The object firstName defines two methods apply and unapply. The apply method turns into an object that accepts the arguments specified within the parenthesis and builds the value as specified in the method. The first and last name combined together with a space in between is returned.


The unapply method returns firstname object into an extractor and breaks the arguments as specified in the method. The unapply methods accepts a String argument and splits the String with space as separator and returns the option type over pair of strings. The result is a pair of strings if the first name and last name is passed as an argument else returns none.

### Monad

### Object and Class - 

### Traits - Traits in scala is like interface in java.  We can achieve multiple inheritance using traits in Scala.	


### Option in scala - It is used to check the return value of the function. It returns two value None and Some.


### Variable assignment


### Function definition



### loops




## Import Project ScalaIntro in intelli J

use mysql;
CREATE USER 'MNEG'@'localhost' IDENTIFIED BY 'mysql';
GRANT ALL ON *.* TO 'MNEG'@'localhost';
flush privileges;

SHOW GRANTS FOR 'MNEG'@'localhost';


http://ozukun.blogspot.com/2016/04/odi-12c-creating-mysql-master-repository.html




#Reference
1. [ First Steps to Scala ] ( https://www.artima.com/scalazine/articles/steps.html )
2. [ Another Tour of Scala ] ( https://www.naildrivin5.com/scalatour/wiki_pages/MainPage/ )
3. [ PythonToScala ] ( https://wrobstory.gitbooks.io/python-to-scala/content/index.html )

https://github.com/deanwampler/spark-scala-tutorial#use-ide



http://scala-labs.github.io/getting-started.html