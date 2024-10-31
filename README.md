# Median Computation Performance Analysis

This project is part of the (CSE321) Analysis and Design of Algorithms course. It implements and analyzes the performance of three methods for computing the median of an unsorted array. These methods are:

This project compares the performance of these three algorithms across various input sizes up to \(10^7\) elements.

## Project Overview

The purpose of this project is to study the time complexity and performance of different median-finding algorithms on large datasets. Understanding the differences in execution time between these methods is crucial in selecting an appropriate algorithm for use cases involving large-scale data processing.

## Directory Structure

The repository contains the following files:

```plaintext
├── src
│   ├── RandomisedSelect.java       # Randomized Divide-and-Conquer implementation
│   ├── MedianOfMedians.java        # Deterministic Median-of-Medians implementation
│   ├── NaiveMedianFinder.java      # Sorting-based median finding (using native sort)
│   ├── RandomArrayGenerator.java   # Utility for generating random test arrays
│   ├── Partitioners.java           # Common partitioning logic for the algorithms
│   ├── MedianAnalysisTest.java     # JUnit tests for all algorithms
│   └── Main.java                   # Driver program for performance analysis
├── README.md                       # Project documentation
└── pom.xml                         # Maven build configuration
```

## Implementation Details

### Algorithms

- **Randomized Divide-and-Conquer**: This method leverages random partitioning and has an average time complexity of \(O(n)\). The algorithm selects a pivot at random and recursively reduces the search space.
- **Deterministic Linear-Time Selection (Median-of-Medians)**: This method ensures a guaranteed \(O(n)\) runtime by using the median-of-medians technique, which helps avoid poor performance on adversarial inputs.
- **Naive Median (Sorting)**: This approach sorts the array and retrieves the median as the k-th smallest element. It serves as a simple baseline for performance comparison with \(O(n \log n)\) complexity.

### Performance Analysis

The analysis measures each algorithm’s execution time as the input array size increases. Performance data is recorded at different input sizes up to 10 million elements, with multiple runs averaged to stabilize the measurements.

## Usage

To compile and run the code with Maven, follow these steps:

1. **Compile the Project**:
    ```bash
    mvn compile
    ```

2. **Run the Main Program** (to perform performance analysis):
    ```bash
    mvn exec:java -Dexec.mainClass="Main"
    ```

## Results

The performance results, observations, and code snippets are compiled in the project report. This includes data visualizations and insights on the scalability of each algorithm as the input array size grows.

## Submission

The following items are prepared for submission:

- A JAR file containing all source files.
- A report containing the code, performance data, and analysis results.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.