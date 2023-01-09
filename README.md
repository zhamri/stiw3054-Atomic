## Why use AtomicInteger?

The primary use of AtomicInteger is when we are in multi-threaded context and we need to perform atomic operations on an int value without using synchronized keyword.

### Advantage

Using the AtomicInteger is equally faster and more readable than performing the same using synchronization.


## References

1. https://docs.oracle.com/javase/tutorial/essential/concurrency/atomicvars.html
1. http://tutorials.jenkov.com/java-util-concurrent/atomicinteger.html
1. https://howtodoinjava.com/java/multi-threading/atomicinteger-example/
1. https://www.javatpoint.com/java-atomicinteger-compareandset-method