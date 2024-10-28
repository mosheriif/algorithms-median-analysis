# Median Computation Performance Analysis

This project is part of the (CSE321) Analysis and Design of Algorithms course. It implements and analyzes the performance of three methods for computing the median of an unsorted array. These methods are:

1. **Randomized Divide-and-Conquer Approach**: Based on CLRS 9.2, this method utilizes randomization in selecting pivot points, providing an average-case linear-time complexity.
2. **Deterministic Linear-Time Selection Algorithm (Median-of-Medians)**: Based on CLRS 9.3, this method guarantees linear-time complexity by using a deterministic pivot selection method.
3. **Naive Method Using Sorting**: Utilizes native sorting to sort the array and returns the median. While simple, this approach has a time complexity of \(O(n \log n)\).

This project compares the performance of these three algorithms across various input sizes up to \(10^7\) elements.

## Project Overview

The purpose of this project is to study the time complexity and performance of different median-finding algorithms on large datasets. Understanding the differences in execution time between these methods is crucial in selecting an appropriate algorithm for use cases involving large-scale data processing.