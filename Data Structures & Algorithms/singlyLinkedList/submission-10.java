class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        Node reqNode = this.head;
        while (index > 0){
            if(reqNode == this.tail){
                return -1;
            }
            reqNode = reqNode.next;
            index --;
        }
        if(reqNode != null){
            return reqNode.data;
        }else{
            return -1;
        }
        
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = this.head;
        this.head = newNode;
        if(this.tail == null){
            this.tail = newNode;
        }
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if(this.tail == null){
            this.tail = newNode;
        }else{
            this.tail.next = newNode;
            this.tail = newNode;
        }

        if(this.head == null){
            this.head = newNode;
        }
    }

    public boolean remove(int index) {
        Node beforeNode = this.head;
        Node afterNode;
        int i = 0;
        while(i < index - 1){
            if(beforeNode.next == null){
                return false;
            }
            beforeNode = beforeNode.next;
            i ++;
        }
        if(this.head == null || index < 0){
            return false;
        }
        if(index == 0){
            if(this.head == this.tail){
                this.head = this.head.next;
                this.tail = this.tail.next;
                return true;
            }
            this.head = this.head.next;
            return true;
        }

        if(beforeNode.next == null){
            return false;
            
        }
        
        if(beforeNode.next == this.tail){
                beforeNode = this.tail;
                return true;
            }
            
        if(beforeNode == null){
            return false;
        }
        afterNode = beforeNode.next.next;
        beforeNode.next = afterNode;
        return true;
    }

    public ArrayList<Integer> getValues() {
        Node current  = this.head;
        ArrayList<Integer> values = new ArrayList<Integer>();
        while(current != this.tail){
            values.add(current.data);
            current = current.next;
        }
        if(current != null){
            values.add(current.data);
        }
        
        return values;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
