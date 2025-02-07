# Sorting Algorithms

## Assignment 2 – Sorting Algorithms

**Deadline:** Thursday, February 06, 2025, 9:59 PM

### Objectives:

- Familiarize yourself with basic sorting algorithms (implementation and performance).
- Implement and compare the performance of different sorting algorithms.

### Implemented Sorting Algorithms:

The following sorting algorithms are implemented in Java:

1. **Bubble Sort** - A simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
2. **Insertion Sort** - Builds the sorted array one item at a time by inserting each element into its correct position.
3. **Selection Sort** - Finds the smallest element in the array and swaps it with the first element, then repeats for the remaining elements.
4. **Shell Sort** - A generalization of insertion sort that allows the exchange of items that are far apart.
5. **Quicksort** - A divide-and-conquer algorithm that selects a pivot and partitions the array around the pivot.
6. **Merge Sort** - A divide-and-conquer algorithm that splits the array into halves, sorts each half, and merges them.

---

## Installation & Usage

### Prerequisites:

- Java 8 or later
- A Java compiler (e.g., `javac`)

### Running the Program:

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/sorting-algorithms.git
   cd sorting-algorithms
   ```
2. Compile the Java files:
   ```bash
   javac SortingAlgorithms.java
   ```
3. Run the program:
   ```bash
   java SortingAlgorithms
   ```

---

## Performance Comparison

Each sorting algorithm is tested with different input sizes, and execution time is measured. The performance results are displayed in the console after execution.

| Algorithm      | Best Case  | Average Case | Worst Case |
| -------------- | ---------- | ------------ | ---------- |
| Bubble Sort    | O(n)       | O(n²)        | O(n²)      |
| Insertion Sort | O(n)       | O(n²)        | O(n²)      |
| Selection Sort | O(n²)      | O(n²)        | O(n²)      |
| Shell Sort     | O(n log n) | O(n log n)   | O(n²)      |
| Quicksort      | O(n log n) | O(n log n)   | O(n²)      |
| Merge Sort     | O(n log n) | O(n log n)   | O(n log n) |

---

## Author

**Peter Hoang**\
Course: [Data Structures and Algorithms CSC-3130-02]\

Feel free to contribute or suggest improvements!


