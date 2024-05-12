## Why use AtomicInteger?

The primary use of AtomicInteger is when we are in a multi-threaded context and need to perform atomic operations on an int value without using the synchronized keyword.

### Advantage

Using the AtomicInteger is equally faster and more readable than performing the same using synchronization.


## References

1. https://docs.oracle.com/javase/tutorial/essential/concurrency/atomicvars.html
1. http://tutorials.jenkov.com/java-util-concurrent/atomicinteger.html
1. https://howtodoinjava.com/java/multi-threading/atomicinteger-example/
1. https://www.javatpoint.com/java-atomicinteger-compareandset-method

## List of Assembly Languages

The name of an assembly language is typically associated with the type of processor or architecture it is designed for. Here are some of the names of commonly used assembly languages based on their respective processor architectures:

1. x86 Assembly - Used for Intel and AMD processors, which include variations for 16-bit, 32-bit (IA-32), and 64-bit (x86-64) architectures.
1. ARM Assembly - Used for ARM processors, prevalent in mobile devices, embedded systems, and some desktops and servers.
1. MIPS Assembly - Used for MIPS processors, commonly found in embedded systems and some older computers.
1. PowerPC Assembly - Used for PowerPC processors, formerly used in older Apple Macintosh computers, game consoles, and various types of embedded systems.
1. 6502 Assembly - Used for the MOS Technology 6502 processor found in early home computers and gaming consoles.
1. Z80 Assembly - Used for the Zilog Z80 processor, popular in many home computers and embedded devices.
1. SPARC Assembly - Used for SPARC processors, developed by Sun Microsystems for use in their servers and workstations.
1. IBM BAL (Basic Assembly Language) - Used on IBM mainframe computers.
1. Motorola 68000 Assembly - Used on Motorola 68000 processors, found in early personal computers like the Amiga and Atari systems.
1. AVR Assembly - Used for AVR microcontrollers, common in hobbyist electronics projects.

## Example x86 architecture operation `x = x + 3` 

```
section .data
    x dd 5           ; Define variable x with initial value 5

section .text
global _start

_start:
    mov eax, [x]     ; Move the value of x into the register eax
    add eax, 3       ; Add 3 to the value in eax
    mov [x], eax     ; Move the updated value back into x

    ; Exit the program (typically required in standalone assembly programs)
    mov eax, 1       ; syscall number for exit
    xor ebx, ebx     ; status 0
    int 0x80         ; interrupt to invoke syscall

```

## Explanation
1. Data Section: We define a variable x in the data section and initialize it with a value of 5.
2. Text Section: This is where the executable code goes.
   - mov eax, [x]: Load the value of x into the eax register.
   - add eax, 3: Add 3 to the value stored in eax.
   - mov [x], eax: Store the result back in x.
3. Exit: Assembly programs that run on their own (not as part of another program) typically require code to properly exit. This part sets up the exit system call and executes it.
