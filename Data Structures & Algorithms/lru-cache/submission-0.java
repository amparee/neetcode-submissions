class LRUCache {

       class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private Map<Integer, Node> map;

    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        remove(node);
        addToFront(node);

        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node oldNode = map.get(key);
            remove(oldNode);
        }

        Node newNode = new Node(key, value);
        map.put(key, newNode);
        addToFront(newNode);

        if (map.size() > capacity) {
            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }
    }

    private void addToFront(Node node) {
        Node currentFirst = head.next;

        head.next = node;
        node.prev = head;

        node.next = currentFirst;
        currentFirst.prev = node;
    }

    private void remove(Node node) {
        Node previous = node.prev;
        Node nextNode = node.next;

        previous.next = nextNode;
        nextNode.prev = previous;
    }
}
