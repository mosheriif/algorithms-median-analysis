# Median Computation Performance Analysis

This project is part of the (CSE321) Analysis and Design of Algorithms course. It implements and analyzes the performance of three methods for computing the median of an unsorted array. These methods are:

This project compares the performance of these three algorithms across various input sizes up to 10^7 elements.

## Project Overview

The purpose of this project is to study the time complexity and performance of different median-finding algorithms on large datasets. Understanding the differences in execution time between these methods is crucial in selecting an appropriate algorithm for use cases involving large-scale data processing.

## Directory Structure

The repository contains the following files:

```plaintext
algorithms-median-analysis
├── median-analysis
│   └── src
│       ├── RandomisedSelect.java       # Randomized Divide-and-Conquer implementation 
│       ├── MedianOfMedians.java        # Deterministic Median-of-Medians implementation
│       ├── NaiveMedianFinder.java      # Sorting-based median finding (using native sort)
│       ├── RandomArrayGenerator.java   # Utility for generating random test arrays
│       ├── Partitioners.java           # Common partitioning logic for the algorithms
│       ├── MedianAnalysisTest.java     # Performance test for all algorithms
│       └── Main.java                   # Driver program for analysis
├── results-and-deliverables
│   ├── Report.pdf                      # Final report with analysis results
│   ├── Output.xlsx                     # Output data from the analysis
│   └── Raw Terminal Output.txt         # Raw output from terminal execution
└── README.md                           # Project documentation

```

## Implementation Details

### Algorithms

- **Randomized Divide-and-Conquer**: This method leverages random partitioning and has an average time complexity of O(n). The algorithm selects a pivot at random and recursively reduces the search space.
- **Deterministic Linear-Time Selection (Median-of-Medians)**: This method ensures a guaranteed O(n) runtime by using the median-of-medians technique, which helps avoid poor performance on adversarial inputs.
- **Naive Median (Sorting)**: This approach sorts the array and retrieves the median as the k-th smallest element. It serves as a simple baseline for performance comparison with O(n log n) complexity.

### Performance Analysis

The analysis measures each algorithm’s execution time as the input array size increases. Performance data is recorded at different input sizes up to 10 million elements, with multiple runs averaged to stabilize the measurements.


## Assumptions

All arrays generated by the random array generator have distinct positive elements, ranging from 1 to 1,000,000,000.

## Results

The performance results, observations, and code snippets are compiled in the project report. This includes data visualizations and insights on the scalability of each algorithm as the input array size grows.

## Submission

The following items are prepared for submission:

- A JAR file containing all source files.
- A report containing the code, performance data, and analysis results.

## References

- Cormen, T. H., Leiserson, C. E., Rivest, R. L., & Stein, C. (2009). *Introduction to Algorithms* (3rd ed.). MIT Press.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.
