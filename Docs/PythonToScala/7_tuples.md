Tuples
------

In Scala, tuples can be of mixed types, like Python tuples. Tuples are also a good way to destructure vals/vars in Scala, as well as the result of many operations like `zip`:

##### Python:
```python
>>> foo = (1, 2.5, "three")
>>> a, b, c = foo
>>> a
1
>>> b
2.5
>>> c
'three'
>>> bar = (4, 5.5, "six")
>>> foobar = ((x, y) for x, y in zip(foo, bar))
>>> foobar
<generator object <genexpr> at 0x10ac21f50>
>>> foobar = tuple(((x, y) for x, y in zip(foo, bar)))
>>> foobar
((1, 4), (2.5, 5.5), ('three', 'six'))
```

##### Scala:
```scala
scala> val foo = (1, 2.5, "three")
foo: (Int, Double, String) = (1,2.5,three)

// Accessors are named by position
scala> foo._1
res17: Int = 1

scala> foo._2
res18: Double = 2.5

// Destructuring

scala> val (a, b, c) = foo
a: Int = 1
b: Double = 2.5
c: String = three

scala> val bar = (4, 5.5, "six")
bar: (Int, Double, String) = (4,5.5,six)

// We saw the zip function earlier - it produces a tuple
scala> val pairs = Array(1, 2, 3).zip(Array("four", "five", "six"))
pairs: Array[(Int, String)] = Array((1,four), (2,five), (3,six))

scala> for ((k, v) <- pairs) yield k.toString + v
res243: Array[String] = Array(1four, 2five, 3six)
```
