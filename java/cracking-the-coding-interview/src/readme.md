#[cracking the coding interview](https://my.mindnode.com/q56HqUGVibyi8s7MyfVye2cesSoyDndHTpoXEigv)

![](http://i.imgur.com/PKQs7Id.png)

#mindmap index 🗄️

# ch 1


## hash tables

### hash table is a data structure that maps keys to values for highly efficient lookup. ✨

- In a very simple implementation of a hash table, the hash table has an underlying array and a hash function.

- When you want to insert an object and its key, the hash function maps the key to an integer, which indicates the index in the array. The object is then stored at that index. ✨

### we can implement the hash table with a binary search tree.

- We can then guarantee an 0(log n) lookup time, since we can keep the tree balanced.

- Additionally, we may use less space, since a large array no longer needs to be allocated in the very beginning.

## ArrayList (dynamical resizing array)

### An ArrayList, or a dynamically resizing array, is an array that resizes itself as needed while still providing 0(1) access. ✨

### A typical implementation is that when the array is full, the array doubles in size.

- Each doubling takes 0(n) time, but happens so rarely that its amortized time is still O(1).

## StringBuffer

### StringBuffer simply creates an array of all the strings, copying them back to a string only when necessary.

## exercises

### 1.1

- 

	- create an array of false values, and map a char unicode representation to some index

	- if something gets mapped to same location in the array, then the string is not of unique chars

### 1.2

- [what is permutation](http://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/)

- 

	- create a char array of both strings

	- sort the char arrays numerically

		- by the char unicode values, i.e. ‘a’ is < ‘d’ and so on

	- check if the arrays are of different size

		- if not, they can’t be permutation of each other

	- check the two char arrays, character by character, if at least one char is different

		- it’s not a permutation

### 1.3

- 

	- create an array of words from a string using “ ” as separator

	- create a StringBuilder object from first word in that array

		- you can append to StringBuilder, arrays are immutable in Java

	- then just append %20 and the contents of the array you got here



