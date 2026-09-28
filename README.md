# DSA-JAVA

A practical **Data Structures and Algorithms (DSA)** learning repository written in **Java**.

This project focuses on understanding DSA through implementation, code comments, examples, and complexity analysis rather than only memorizing algorithms.

---

## 📚 Contents

- Dynamic Array
- Searching Algorithms
- Sorting Algorithms
- Recursion
- Hashing concepts
- Graph representation
- Depth-First Search (DFS)
- Breadth-First Search (BFS)
- Big-O complexity

> **Note:** Some topics such as Stack, Queue, Linked List, Priority Queue, Hash Table, and Adjacency Matrix are currently explored through learning notes and examples in `Main.java`. Dedicated implementations can be added as the project grows.

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

### DynamicArray.java

A custom dynamic array built with Java's `Object[]`.

Implemented operations:

- `add()`
- `insert()`
- `delete()`
- `search()`
- `isEmpty()`
- Automatic growth
- Automatic shrinking
- `toString()`

The array starts with a configurable capacity, grows when full, and can shrink when the number of stored elements becomes small.

### Graph.java

Graph implementation using an **Adjacency List**.

Implemented operations:

- `addNode()`
- `addEdge()`
- `checkEdge()`
- `print()`
- Recursive DFS
- Queue-based BFS

The graph currently uses directed edges.

### Node.java

Basic graph node representation:

```java
public class Node {
    char data;
    boolean visited;

    Node(char data) {
        this.data = data;
    }
}
```

### Main.java

The main learning and demonstration file.

It contains examples and implementations for:

- Linear Search
- Binary Search
- Interpolation Search
- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort
- Quick Sort
- Factorial
- Recursive power calculation
- Hashing concepts
- Adjacency Matrix concepts
- Adjacency List concepts
- DFS
- BFS

---

# 🔎 Searching Algorithms

| Algorithm | Best | Average | Worst | Requirement |
|---|---:|---:|---:|---|
| Linear Search | O(1) | O(n) | O(n) | None |
| Binary Search | O(1) | O(log n) | O(log n) | Sorted data |
| Interpolation Search | O(1) | O(log log n)* | O(n) | Sorted, relatively uniform data |

`*` Average-case interpolation search assumes approximately uniform data distribution.

### Linear Search

Checks elements one by one until the target is found.

```text
[10, 20, 30, 40, 50]

Search: 30

10 → 20 → 30 ✓
```

Time complexity:

```text
O(n)
```

### Binary Search

Repeatedly divides a **sorted** search range in half.

```text
[10, 20, 30, 40, 50, 60, 70]
             ↑
           middle
```

Time complexity:

```text
O(log n)
```

### Interpolation Search

Estimates the target position using the values at the low and high boundaries.

It can perform very well on uniformly distributed sorted data.

```text
Average: O(log log n)
Worst:   O(n)
```

---

# 🔃 Sorting Algorithms

| Algorithm | Best | Average | Worst | Extra Space |
|---|---:|---:|---:|---:|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n)* |

`*` Quick Sort's auxiliary space depends on recursion depth and pivot behavior.

## Bubble Sort

Compares adjacent elements and swaps them when they are out of order.

```text
[5, 3, 8, 1]

5 > 3 → swap
[3, 5, 8, 1]
```

Worst case: **O(n²)**

## Selection Sort

Finds the minimum element in the unsorted portion and places it in the correct position.

```text
[5, 3, 8, 1]

minimum = 1

[1, 3, 8, 5]
```

Time complexity: **O(n²)**

## Insertion Sort

Builds the sorted portion one element at a time.

```text
[5 | 3 8 1]

Insert 3:

[3, 5 | 8 1]
```

- Best: **O(n)**
- Average: **O(n²)**
- Worst: **O(n²)**

## Merge Sort

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

- Time: **O(n log n)**
- Extra space: **O(n)**

## Quick Sort

Selects a pivot and partitions the array around it.

```text
[8, 3, 5, 1, 7]

pivot = 7

smaller       pivot       larger
[3, 5, 1]      7           [8]
```

- Best/Average: **O(n log n)**
- Worst: **O(n²)**

---

# ♻️ Recursion

Recursion occurs when a method calls itself to solve smaller versions of the same problem.

The repository demonstrates recursion with:

### Factorial

```text
factorial(5)

5 × 4 × 3 × 2 × 1 = 120
```

### Power

```text
powers(2, 4)

2 × 2 × 2 × 2 = 16
```

Recursion is also used by:

- Merge Sort
- Quick Sort
- DFS

---

# 🕸️ Graph

The current graph implementation uses an **Adjacency List**.

Example:

```text
A → B
B → C, E
C → D, E
D → 
E → A, C
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

The project also contains comments explaining the alternative **Adjacency Matrix** representation.

---

# 🔍 DFS vs BFS

## Depth-First Search

DFS explores a branch as deeply as possible before backtracking.

Conceptually:

```text
DFS
 │
 ├── Visit current node
 ├── Mark it visited
 └── Recursively visit neighbors
```

The current implementation uses recursion and a `boolean[]` visited array.

Time complexity with an adjacency list:

```text
O(V + E)
```

## Breadth-First Search

BFS explores the graph level by level.

It uses a queue:

```text
Queue

[A]
 ↓
poll A
 ↓
[B, C]
 ↓
poll B
 ↓
[C, D, E]
```

Conceptually:

```text
BFS
 │
 ├── Create Queue
 ├── Add starting node
 ├── Mark it visited
 ├── Poll a node
 └── Add unvisited neighbors
```

Time complexity with an adjacency list:

```text
O(V + E)
```

Where:

- `V` = number of vertices
- `E` = number of edges

---

# 📊 Graph Complexity

For the current adjacency-list approach:

| Operation | Complexity |
|---|---:|
| Add Node | O(1) |
| Add Edge | O(1) |
| DFS | O(V + E) |
| BFS | O(V + E) |
| Storage | O(V + E) |

> The current DFS/BFS implementation converts neighboring `Node` objects back to indices using `ArrayList.indexOf()`. The theoretical graph traversal is O(V + E), but this implementation can introduce additional lookup overhead.

---

# 🧪 Example Graph

The current `Main.java` creates five nodes:

```text
A
B
C
D
E
```

And adds directed edges:

```text
A → B
B → C
B → E
C → D
C → E
E → A
E → C
```

The program then prints the graph and runs:

```java
graph.depthFirstSearch(1);
graph.breadthFirstSearch(0);
```

---

# 🚀 Getting Started

## 1. Clone

```bash
git clone https://github.com/Zackik/DSA-JAVA.git
cd DSA-JAVA
```

## 2. Compile

Requires a Java Development Kit (JDK).

```bash
javac java/*.java
```

## 3. Run

```bash
java -cp java Main
```

---

# 🎯 Learning Goals

This repository is designed to build a foundation in:

- Data Structures
- Algorithms
- Java programming
- Object-Oriented Programming
- Recursion
- Searching
- Sorting
- Graph Theory
- Graph Traversal
- Big-O analysis
- Problem solving

The learning cycle is:

```text
Theory
  ↓
Implementation
  ↓
Example
  ↓
Complexity Analysis
  ↓
Practice
  ↓
Improve the Implementation
```

---

# 🗺️ Roadmap

Future topics planned for the repository:

- [ ] Singly Linked List
- [ ] Doubly Linked List
- [ ] Stack implementation
- [ ] Queue implementation
- [ ] Circular Queue
- [ ] Priority Queue / Heap
- [ ] Binary Search Tree
- [ ] AVL Tree
- [ ] Trie
- [ ] Hash Map implementation
- [ ] Dijkstra's Algorithm
- [ ] A* Search
- [ ] Topological Sort
- [ ] Minimum Spanning Tree
- [ ] Union-Find / Disjoint Set
- [ ] Dynamic Programming
- [ ] Backtracking
- [ ] Unit tests
- [ ] More complexity analysis

---

# 🧠 Big-O Cheat Sheet

```text
O(1)          Constant
O(log n)      Logarithmic
O(n)          Linear
O(n log n)    Linearithmic
O(n²)         Quadratic
O(2ⁿ)         Exponential
O(n!)         Factorial
```

General growth:

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

- **Language:** Java
- **Paradigm:** Object-Oriented Programming
- **Core topics:** Data Structures & Algorithms
- **Version Control:** Git / GitHub

---

# 📖 Project Purpose

This is a personal learning repository for practicing DSA with Java.

The goal is to connect theoretical concepts with actual code:

```text
Concept
   ↓
Code
   ↓
Execution
   ↓
Complexity
   ↓
Debugging
   ↓
Understanding
```

The repository is intentionally kept simple so that each algorithm can be studied and modified easily.

---

## 👤 Author

**Zackik**

GitHub: [@Zackik](https://github.com/Zackik)

---

## ⭐ Contributing

This is primarily a personal learning project.

Suggestions, corrections, and improvements are welcome through GitHub issues or pull requests.

---

## 📄 License

No license has currently been specified for this repository.
