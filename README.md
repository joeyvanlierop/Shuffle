<h1 align=center>Shuffle Algorithm</h1>

## About The Project

This small program was designed to produce a shuffled array of integers. It accomplishes this by implementing the modern version of the [Fisher–Yates shuffle](https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle). 

## Project Structure
There are two classes in this project:
 - Shuffle:
    - Contains a single static method named shuffle. The method takes in an integer "n" and produces an array with the integers 1 to "n" in a random order. 
 - ShuffleTest:
    - Contains the tests that are responsible for testing the shuffle method.

## Things I have noticed
 - Instantiating a new Random object each time shuffle is called is a waste. Instantiating a static class variable was a viable solution.
 - Trying to generate and shuffle the array at the same time (the "inside-out" variant of Fisher–Yates) does not provide any substantial performance increase, and in many cases actually decreased performance by a minuscule amount. 

## Task list
 - [x] Comments
 - [x] General Optimizations
 - [ ] Performance analysis
 - [ ] Number distribution analysis

