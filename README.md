# DSA-JAVA

A collection of **Data Structures and Algorithms (DSA)** implementations and learning notes written in **Java**.

This repository is a personal learning project focused on understanding how common data structures and algorithms work, how they are implemented, and their time/space complexity.

## 📚 Topics Covered

### Data Structures

* Dynamic Array
* Linked List concepts
* Queue
* Stack concepts
* Priority Queue concepts
* Hash Table
* Graph

  * Adjacency List
  * Adjacency Matrix concepts
  * Nodes
  * Edges

### Searching Algorithms

* Linear Search
* Binary Search
* Interpolation Search

### Sorting Algorithms

* Bubble Sort
* Selection Sort
* Insertion Sort
* Merge Sort
* Quick Sort

### Recursion

* Factorial
* Power / Exponentiation
* Merge Sort
* Quick Sort
* Recursive graph traversal

### Graph Algorithms

* Graph representation using an Adjacency List
* Edge checking
* Graph traversal
* Depth-First Search (DFS)
* Breadth-First Search (BFS)

---

## 📁 Project Structure

```text
DSA-JAVA/
│
├── java/
│   ├── DynamicArray.java
│   ├── Graph.java
│   ├── Main.java
│   └── Node.java
│
└── README.md
```

### `DynamicArray.java`

A simple implementation of a dynamic array using Java's `Object[]`.

Implemented operations include:

```text
add()
insert()
delete()
search()
isEmpty()
grow()
shrink()
toString()
```

The array automatically expands when its capacity is reached and can shrink when the number of elements becomes sufficiently small.

---

### `Graph.java`

Graph implementation using an **Adjacency List**.

The class supports:

```text
addNode()
addEdge()
checkEdge()
print()
depthFirstSearch()
breadthFirstSearch()
```

Example graph:

```text
A → B
B → C
B → E
C → D
C → E
E → A
E → C
```

DFS and BFS can then be performed from a selected starting node.

---

### `Node.java`

Basic graph node representation.

```java
public class Node {
    char data;
    boolean visited;

    Node(char data) {
        this.data = data;
    }
}
```

---

### `Main.java`

Contains examples and implementations of several algorithms, including:

* Searching
* Sorting
* Recursion
* Hashing concepts
* Graph traversal

It also contains the `main()` method used to demonstrate the graph implementation.

---

# 🔎 Searching Algorithms

| Algorithm            | Best Case | Average Case | Worst Case | Requirement                     |
| -------------------- | --------: | -----------: | ---------: | ------------------------------- |
| Linear Search        |      O(1) |         O(n) |       O(n) | None                            |
| Binary Search        |      O(1) |     O(log n) |   O(log n) | Sorted data                     |
| Interpolation Search |      O(1) | O(log log n) |       O(n) | Sorted, relatively uniform data |

### Linear Search

Searches through elements sequentially.

```text
Array:
[10, 20, 30, 40, 50]

Search:
30

10 → 20 → 30 ✓
```

Time complexity:

```text
O(n)
```

---

### Binary Search

Repeatedly divides a sorted array into two parts.

```text
[10, 20, 30, 40, 50, 60, 70]
             ↑
           middle
```

Time complexity:

```text
O(log n)
```

---

### Interpolation Search

Estimates the position of the target based on the values at the boundaries.

Average complexity for uniformly distributed data:

```text
O(log log n)
```

Worst case:

```text
O(n)
```

---

# 🔃 Sorting Algorithms

| Algorithm      |       Best |    Average |      Worst |     Space |
| -------------- | ---------: | ---------: | ---------: | --------: |
| Bubble Sort    |       O(n) |      O(n²) |      O(n²) |      O(1) |
| Selection Sort |      O(n²) |      O(n²) |      O(n²) |      O(1) |
| Insertion Sort |       O(n) |      O(n²) |      O(n²) |      O(1) |
| Merge Sort     | O(n log n) | O(n log n) | O(n log n) |      O(n) |
| Quick Sort     | O(n log n) | O(n log n) |      O(n²) | O(log n)* |

`*` Space complexity depends on the recursion depth and implementation.

---

## 🫧 Bubble Sort

Compares adjacent elements and swaps them when they are in the wrong order.

```text
[5, 3, 8, 1]

5 > 3 → swap
[3, 5, 8, 1]

8 > 1 → swap
[3, 5, 1, 8]
```

Worst-case complexity:

```text
O(n²)
```

---

## 🎯 Selection Sort

Finds the minimum element and places it at the correct position.

```text
[5, 3, 8, 1]

minimum = 1

[1, 3, 8, 5]
```

Complexity:

```text
O(n²)
```

---

## 🃏 Insertion Sort

Builds the sorted portion of the array one element at a time.

```text
[5 | 3 8 1]

3 is inserted before 5

[3, 5 | 8 1]
```

Best case:

```text
O(n)
```

Worst case:

```text
O(n²)
```

---

## 🔀 Merge Sort

Uses the **Divide and Conquer** strategy.

```text
              [8 3 5 1]
                 / \
              [8 3] [5 1]
              / \   / \
             [8][3][5][1]
              \ /   \ /
             [3 8] [1 5]
                 \ /
              [1 3 5 8]
```

Complexity:

```text
Time:  O(n log n)
Space: O(n)
```

---

## ⚡ Quick Sort

Uses a pivot to divide the array into partitions.

```text
[8, 3, 5, 1, 7]

pivot = 7

smaller than 7 | pivot | larger than 7

[3, 5, 1]      | 7 | [8]
```

Average complexity:

```text
O(n log n)
```

Worst case:

```text
O(n²)
```

---

# ♻️ Recursion

The project also explores recursive problem solving.

### Factorial

```java
factorial(5)
```

Conceptually:

```text
5 × 4 × 3 × 2 × 1
```

Result:

```text
120
```

---

### Power

```java
powers(2, 4)
```

Conceptually:

```text
2 × 2 × 2 × 2
```

Result:

```text
16
```

Recursion is also used in:

* Merge Sort
* Quick Sort
* DFS
* Tree/graph traversal concepts

---

# 🕸️ Graph

The graph implementation uses an **Adjacency List**.

For example:

```text
A → B
B → C → E
C → D → E
E → A → C
```

Internally:

```text
nodes
  ↓
[A, B, C, D, E]

alist
  ↓
A → [B]
B → [C, E]
C → [D, E]
D → []
E → [A, C]
```

This representation is useful when a graph does not contain edges between every possible pair of vertices.

---

# 🔍 DFS vs BFS

## Depth-First Search

DFS explores one branch as deeply as possible before backtracking.

```text
Start
  ↓
A
  ↓
B
  ↓
C
  ↓
D
```

The implementation uses recursion.

Conceptually:

```text
DFS
 ├── Visit current node
 ├── Mark as visited
 └── Recursively visit neighbors
```

---

## 🌊 Breadth-First Search

BFS explores a graph level by level.

It uses a queue:

```text
Queue

[ A ]
  ↓
poll A
  ↓
[ B, C ]
  ↓
poll B
  ↓
[ C, D, E ]
```

Conceptually:

```text
BFS
 ├── Create Queue
 ├── Add starting node
 ├── Mark it visited
 ├── Remove node from Queue
 └── Add unvisited neighbors
```

---

# 📊 Graph Complexity

For an adjacency-list representation:

| Operation     | Complexity |
| ------------- | ---------: |
| Add Node      |       O(1) |
| Add Edge      |       O(1) |
| DFS           |   O(V + E) |
| BFS           |   O(V + E) |
| Graph Storage |   O(V + E) |

Where:

* `V` = number of vertices/nodes
* `E` = number of edges

---

# 🚀 Getting Started

## 1. Clone the repository

```bash
git clone https://github.com/Zackik/DSA-JAVA.git
```

## 2. Enter the project

```bash
cd DSA-JAVA
```

## 3. Compile

```bash
javac java/*.java
```

## 4. Run

```bash
java -cp java Main
```

---

# 🧪 Example Output

The graph demonstration prints the adjacency list and performs DFS/BFS traversal.

Example structure:

```text
A -> B
B -> C E
C -> D E
D ->
E -> A C
```

DFS/BFS then print visited nodes:

```text
B = visited
C = visited
D = visited
E = visited
A = visited
```

The exact traversal order depends on the graph structure and starting node.

---

# 🎯 Learning Goals

This repository is intended to build a strong foundation in:

* Data Structures
* Algorithms
* Big-O Analysis
* Recursion
* Searching
* Sorting
* Graph Theory
* Graph Traversal
* Java programming fundamentals
* Problem-solving

The main goal is not only to memorize algorithms, but to understand **how and why they work**.

---

# 🗺️ Roadmap

Planned topics for future development:

* [ ] Singly Linked List implementation
* [ ] Doubly Linked List implementation
* [ ] Stack implementation
* [ ] Queue implementation
* [ ] Circular Queue
* [ ] Binary Search Tree
* [ ] AVL Tree
* [ ] Heap / Priority Queue
* [ ] Trie
* [ ] Hash Map implementation
* [ ] Dijkstra's Algorithm
* [ ] A* Search
* [ ] Topological Sort
* [ ] Minimum Spanning Tree
* [ ] Union-Find / Disjoint Set
* [ ] Dynamic Programming
* [ ] Backtracking
* [ ] More algorithm complexity analysis
* [ ] Unit tests

---

# 🧠 Complexity Cheat Sheet

```text
O(1)          Constant
O(log n)      Logarithmic
O(n)          Linear
O(n log n)    Linearithmic
O(n²)         Quadratic
O(2ⁿ)         Exponential
O(n!)         Factorial
```

A useful general rule:

```text
O(1)
 ↓
O(log n)
 ↓
O(n)
 ↓
O(n log n)
 ↓
O(n²)
 ↓
O(2ⁿ)
 ↓
O(n!)
```

---

# 🛠️ Technologies

* **Language:** Java
* **Paradigm:** Object-Oriented Programming
* **Data Structures:** Arrays, Lists, Queues, Hash Tables, Graphs
* **Algorithms:** Searching, Sorting, Recursion, Graph Traversal
* **Version Control:** Git / GitHub

---

# 📖 Purpose

This repository serves as a practical DSA notebook and implementation project while learning Java.

Each implementation is intended to make the underlying algorithm easier to understand by connecting:

```text
Theory
   ↓
Implementation
   ↓
Example
   ↓
Time Complexity
   ↓
Space Complexity
   ↓
Practice
```

---

## 👤 Author

**Zackik**

GitHub: [@Zackik](https://github.com/Zackik)

---

## ⭐ Contributing

This is primarily a personal learning repository, but suggestions, improvements, and discussions are welcome.

If you find an issue or have an idea for improving an implementation, feel free to open an issue or pull request.

---

## 📄 License

This project currently does not specify a license.
