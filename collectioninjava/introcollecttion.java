/*
Collection framework: it provides a set of interfaces and classes that help in managing groups of objects.
before this framework java used to rely on a variety of classes like vector,stack,hashtable and arrays to store and manipulate groups of objects.
what happened after collection framework was introduced:
- unified architecture
- inter-operabilty
-reusabilty
-efficiency

collection framework is basically a collection of interfaces in javasome important one are
-Collection: the root interface for all other collection types
-List: an ordered collection that can contain duplicate elements()
-set: A collection that canot contain duplicate elements
-Queue: A collection designed for fifo implemantation
-deque: A double ended queue taht allows insertion and deletion from both end
Map: an interface that represents a collection of key-value pairs
                                iterable
                                    |
        ----------------------------|----------------------------
        |                           |                           |
      List                          Set                         Queue
    ArrayList                   HashSet                         LikedList
    LinkedList                  LikedHashSet                    PriorityQueue
    Vector                      TreeSet                         ConcurrentLinkedQueue
    Stack                       EnumSet                         Deque
    CopyOnWriteArrayList        CopyOnWriteArraySet             |-ArrayDeque
                                ConcurrentSkipListSet           |-LinkedList
                                SortedSet                       |-ConcurrentLinkedDeque


Collection: it is the root interface of the java Collection Framework. it is the most basic interface that defines a group of objects know as elements. the collection interface is a part of the java.util.package, and it is the parent interface that is implemented by other collection framework like list set and queue.

*/