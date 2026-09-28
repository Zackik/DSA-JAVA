import java.util.Hashtable;

public class Main{
    public static void main(String[] args){
        //stack = LIFO data structure. Last In First Out stores objects into a sort of vertical tower
        //push() to add to the top
        //pop() to remove from the top

        //Queue = FIFO data structure First In First Out
        //A collection designed for holding elements prior to processing Linear data structure
        //add = enqueue, offer()
        //remove = dequeue, poll()
        /*
        * where are queues useful?
        * 1.keyboard buffer (letters should appear on the screen in the order they're pressed)
        * 2.printer queue(print jobs should be completed in order)
        * 3.used in linkedlist, priorityqueues,breadth-first search
        *
        * */

        //Priority Queue = A FIFO data structure that serves elements with the highest priorities first before elements with lower priority
        //LinkedList = stores nodes in 2 parts (data + address) Nodes are in non-consecutive memory locations elements are linked using pointers

        // Singly linked list
        //Node[data | address] -> node[data | address] -> node[data | address]
        //double linked list
        //node[address | data | address] <-> [address | data | address]
        //advantages
        //1.dynamic data structure (allocates needed memory while running)
        //2.Insertion and deletion of nodes is easy. O(1)
        //3.No/Low memory waste

        //disadvantages?
        //1.Greater memory usage (additional pointer)
        //2.No random access of elements (no index [i])
        //3.Accessing/searching elements is more time consuming. O(n)
        //Uses?
        //implement stacks/queues
        //2.GPS navigation
        //3.music playlist

        //Dynamic Array
        //Advantages:
        //1.Random access of elements O(1)
        //2.Good locality of reference and data cache utilization
        //3.Easy to insert/delete at the end
        //Disadvantages
        //1.Wastes more memory
        //2.Shifting elements is time consuming O(n)
        //3.Expanding/Shifting the array is time consuming O(n)

        /*linear search = Iterate through a collection one element at a time
        runtime complexity: O(n)
        disadvantages: Slow for large data sets
        advantages: fast for searches og small to medium data sets
        Does not need to sorted
        Useful for data structures that do not have random access (linkedlist)
        * */

        /*binary search = search algorithm that finds the position of a target value within a sorted array.
        Half of the array is eliminated during each "step";
        * */

        /*Interpolation search = improvement over binary search best used for "uniformly" distributed data "guesses" where a value might be based on calculated probe results
        if probe is incorrect, search area is narrowed, and a new probe us calculated
        average case: O(log(log(n)))
        worst case: O(n) [values increase exponentially]
        * */

        /*bubble sort = pairs of adjacent elements are compared, and the elements swapped if they are not in order.
        Quadratic time O(n^2)
        small data set = okay - ish
        large data set = BAD (plz don't)
        * */

        /*selection sort = search through an array and keep track of the minimum value during each iteration. At the end of each iteration, we swap variables.
        Quadratic time O(n^2)
        small data set = okay
        large data set = BAD
        * */

        /*Insertion sort = after comparing elements to the left shift elements to the right to make room to insert a value
        Quadratic time O(n^2)
        small data set = decent
        large data set = BAD
        less steps than bubble sort
        best case is O(n) compared to selection sort O(n^2)
        * */

        /*recursion = when a thing is defined in terms of itself.
        Apply the result of a procedure, to a procedure.
        A  recursive method calls itself. Can be a substitute for iteration.
        Divide a problem into sub-problems of the same type as the original.
        Commonly used with advanced sorting algorithms and navigating trees
        Advantages:
        easier to read/write
        easier to debug
        Disadvantages:
        sometimes slower
        uses more memory
        * */
        /*Call stack: In computer science, a call stack is a stack data structure that stores information about the active subroutines of a computer program. This kind of stack is also know as a execution stack, program stack, control stack, run-time stack, or machine stack, and is often shortened to just "the stack"
        * */
        //Recently refreshed sourdough, bubbling through fermentation: the recipe calls for some sourdough left over from the last time the same recipe was made
        /*merge sort = recursively divide array in 2, sort, re-combine
        run-time complexity = O(n log n)
        space complexity = O(n)
        * */
        /*quicksort = moves smaller elements to left of a pivot.
        recursively divide array in 2 partitions
        run-time complexity = best case O(n log(n))
        average case O(n log(n))
        worst case O(n^2) if already sorted
        space complexity = O(log(n)) due to recursion
        * */
        /*
        Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
        Each key/value pair is know as an Emtry
        Fast insertion, look up, deletion of key/value pairs
        Not ideal for small data sets, great with large data sets

        Hashing = takes a key and computes an integer (formula will vary based on key & data type)
        In a Hashtable, we use the hash % capacity to calculate an index number
        Key.hashCode() % capacity = index

        bucket = an indexed storage location for one or more Entries can store multiple Entries in case of a collision (linked similarly a LinkedList)
        Collision = hash function generates the same index for more than one key less collision = more efficiency
        Runtime complexity: Best Case O(1)
                            Worst Case O(n)
        *
        */

        /*Adjacency Matrix = A 2D array to store 1's/0's to represent edges
        #of rows = # of unique nodes
        #of columns = #of unique nodes
        runtime complexity to check an edge: O(1)
        SPACE complexity: O(v^2)
        *
        */

        /*Adjacency List = An array/arrayList of linkedlists.
        Each Linkedlist has a unique node at the head
        All adjacency neighbors to that node are added to that node's linklist
        Runtime complexity to check an Edge: O(v)
        space complexity: O(v + e)
        * */
        /*Depth First Search = Pick a route, keep going.
        If you reach a dead end, or an already visited node, backtrack to a previous node with unvisited adjacent neighbors
        * */
        /*Breadth FS = Traverse a graph level by level
        Utilizes a Queue
        Better if destination is on average close to start
        Siblings are visited before children

        Depth FS= Traverse a graph branch by branch
        Utilizes a stack
        Better if destination is on average far from the start
        Children are visited before sibilings
        More popular for games/puzzles
        * */
        /*Binary search tree = A tree data structure \, where each node is greater than it's left child, but less than it's right.
        Bennefit: easy to locate a node when they avre in this order
        time complexity = best case O(log n)
        worst case O(n)
        space complexity: O(n)
        * */


        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new Node1(5));
        tree.insert(new Node1(1));
        tree.insert(new Node1(9));
        tree.insert(new Node1(2));
        tree.insert(new Node1(7));
        tree.insert(new Node1(3));
        tree.insert(new Node1(6));
        tree.insert(new Node1(4));
        tree.insert(new Node1(8));

        tree.display();
        System.out.println(tree.search(8));
        tree.remove(7);












//        Hashtable<String, String> table = new Hashtable<>(10);
//        table.put("100", "Spongebob");
//        table.put("123", "Patrick");
//        table.put("321", "Sandy");
//        table.put("555", "Squidward");
//        table.put("777", "Gary");
//
//        for(String key : table.keySet() ) {
//            System.out.println(key.hashCode()+ "\t" + key + "\t" + table.get(key));
//        }

    }
    private static void quicksort(int[] array, int start, int end){
        if(end <= start) return; //base case
        int pivot = partition(array, start, end);
        quicksort(array, start, pivot - 1);
        quicksort(array, pivot + 1, end);
    }
    private static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start - 1;
        for(int j = start; j <= end -1; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
    private static void mergesort(int[] array){
        int length = array.length;
        if(length <= 1) return; //base case
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int i =0; //left array
        int j =0; //right array
        for(;i< length; i++){
            if(i < middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergesort(leftArray);
        mergesort(rightArray);
        merge(leftArray, rightArray,array);
    }
    private static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i =0, l= 0, r=0;
        //check the conditions for merging
        while(l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    private static int powers(int base, int exponent) {
        if (exponent == 0) return 1; // base case

        return base * powers(base, exponent - 1); // recursive case
    }
    private static int factorial(int num){
        if(num < 1) return 1; //base case
        return num * factorial(num - 1);
    }

    private static void insertionSort(int array[]){
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i -1;
            while(j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j --;
            }
            array[j + 1] = temp;
        }
    }

    private static void selectionSort(int array[]){
        for(int i = 0; i < array.length-1 ; i++){
            int min = i;
            for(int j =i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min =j;
                }

            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    public static void bubbleSort(int array[]){
        for(int i=0; i< array.length - 1; i++){
            for(int j =0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+ 1]= temp;
                }

            }
        }
    }

    private static int linearSeach(int[] array, int value){
        for(int i =0; i< array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
    private static int binarySearch(int array[],int target){
        int low = 0;
        int high = array.length -1;

        while (low <= high){
            int middle = low + (high - low)/2;
            int value = array[middle];

            System.out.println("Middle: "+value);
            if(value < target) low = middle + 1;
            else if(value > target) high = middle -1;
            else return middle;
        }
        return -1;
    }
    private static int interpolationSearch(int[] array, int value){
        int high = array.length -1;
        int low = 0;
        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("probe: "+probe);

            if(array[high] == array[low]){
                if(array[low] == value){
                    return -1;
                }
            }
            if(array[probe] == value){
                return probe;
            }
            else if(array[probe] < value){
                low = probe + 1;
            }
            else{
                high = probe -1;
            }

        }

        return -1;
    }

}
