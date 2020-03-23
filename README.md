<h1 align=center>Shuffle Algorithm</h1>

## About The Project

This small program was designed to produce a shuffled array of integers. It accomplishes this by implementing the modern version of the [Fisher–Yates shuffle](https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle). 

## Project Structure
There are two classes in this project:
 - Shuffle:
    - Contains a single static method named shuffle. The method takes in an integer "n" and produces an array with the integers 1 to "n" in a random order. 
 - ShuffleTest:
    - Contains the tests that are responsible for testing the shuffle method.
    
## Number distribution analysis
To graphically analyze that the numbers have a truly random distribution, I simulated the shuffle 1000000 times and recorded the data. The result shows that each number does in fact have an even chance to appear in any position.  

![Distribution](/img/distribution.png)


## Notes
 - Ideally this would have been done in a more performant language than Java, however it was very convenient to setup and test the project. 
 - Instantiating a new Random object each time the shuffle method is called is a waste. Instantiating a static class variable was a viable solution.
 - Trying to generate and shuffle the array at the same time (the "inside-out" variant of Fisher–Yates) does not provide any substantial performance increase, and in many cases actually decreased performance by a minuscule amount. 
 - The shuffle method requires an integer greater than or equal to one. This could be altered, however as I was optimizing for speed I chose to throw a runtime exception in the case that a value less than one was inputted. 

## Task list
 - [x] Comments
 - [x] General Optimizations
 - [x] Number distribution analysis
 - [ ] Performance analysis

