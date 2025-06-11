class LRUCache {
    class Node{
    int key,value;
    Node prev,next;
    Node(int key,int value){
        this.key=key;
        this.value=value;
    }
}
    int capacity;
    Map<Integer,Node>map;
    Node head, tail;
    
    public LRUCache(int cap) {
        this.capacity=cap;
        map=new HashMap<>();
        head=new Node(0,0);
        tail= new Node(0,0);
        head.next=tail;
        tail.prev=head;
        
    }

    public  int get(int key) {
    if(!map.containsKey(key))
        return -1;
    
    Node node=map.get(key);
    remove(node);
    insertToHead(node);
    return node.value;
        
    }

        
    public  void put(int key, int value) {
       if(map.containsKey(key)){
           Node node= map.get(key);
           node.value=value;
           remove(node);
           insertToHead(node);
       }else{
           if(map.size()==capacity){
               map.remove(tail.prev.key);
               remove(tail.prev);
           }
           Node newNode= new Node(key ,value);
           map.put(key,newNode);
           insertToHead(newNode);
       }
    }
       private void remove(Node node){
    node.prev.next=node.next;
    node.next.prev= node.prev;
    }

    private void insertToHead(Node node){
        node.next= head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }
}

