class DynamicArray {
    private int[] dArr;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.dArr = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {
        return dArr[i];
    }

    public void set(int i, int n) {
        this.dArr[i] = n;
    }

    public void pushback(int n) {
        if(this.size == this.capacity){
            resize();
            this.dArr[size] = n;
            this.size++;
        }else{
            this.dArr[size] = n;
            this.size++;
            
        }
        
    }

    public int popback() {
        int lastEle = this.dArr[size - 1];
        this.dArr[size - 1] = 0;
        this.size --;
        return lastEle;
    }

    private void resize() {
        this.dArr = Arrays.copyOf(dArr, this.capacity * 2);
        this.capacity = this.capacity * 2;
    }   

    public int getSize() {
        return this.size ;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
