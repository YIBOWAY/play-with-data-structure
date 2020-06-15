package array;

public class Array {

    private int[] data;
    private int size;

    public Array(int capacity){//构造函数，传入数组的容量capacity构造Array
        data = new int[capacity];
        size = 0;
    }
    public Array(){//无参数的构造函数，默认数组的容量capacity=10
        this(10);
    }

    public int getSize(){//获取数组中的元素个数
        return size;
    }
    public int getCapacity(){//获取数组的容量
        return data.length;
    }
    public boolean isEmpty(){//返回数组是否为空
        return size ==0;
    }

    public void addLast(int e){//向所有元素后添加一个新元素
//        if (size == data.length) {
//            throw new IllegalArgumentException("AddLast is failed,Array is full");
//        }
//        data[size] = e;
//        size++;
        add(size,e);
    }
    public void addFirst(int e){//在所有元素前添加一个新元素
        add(0,e);
    }
    // 在第index个位置插入一个新元素e
    public void add(int index,int e){
        if (size == data.length) {
            throw new IllegalArgumentException("AddLast is failed,Array is full");
        }
        if (index<0 || index > size){
            throw new IllegalArgumentException("Add failed.Require index>=0 and index<= size.");
        }
        for (int i = size - 1; i>=index;i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;

    }

    //获取index索引位置的元素
    int get(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed.Index is illegal.");}
        return data[index];
    }
    //修改index索引位置的元素为e
    void set(int index,int e){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed.Index is illegal.");}
        data[index] = e;
    }

    //查找数据中是否有元素e
    public boolean contains(int e){
        for (int i =0;i<size;i++){
            if (data[i]==e){
                return true;
            }
        }return false;

    }
    //查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(int e){
        for (int i =0;i<size;i++){
            if (data[i]==e){
                return i;
            }
        }return -1;
    }

    //从数组中删除index位置的元素，返回删除的元素
    public int remove(int index){
        if (index<0||index>=size){
            throw new IllegalArgumentException("Remove failed,index is illegal.");
        }
        int ret = data[index];
        for (int i=index+1;i<size;i++){
            data[i-1]=data[i];
        }
        size --;
        return ret;
    }
    //从数组中删除第一个元素，返回删除的元素
    public int removeFirst(){
        return remove(0);
    }
    //从数组中删除最后一个元素，返回删除的元素
    public int removeLast(){
        return remove(size-1);
    }

    public void removeElement(int e){
        int index = find(e);
        if (index!=-1){
            remove(index);
        }
    }
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size=%d,capacity = %d\n",size,data.length));
        res.append('[');
        for (int i = 0;i<size;i++){
            res.append(data[i]);
            if (i!=size-1){
                res.append(",");}
        }
        res.append(']');
        return res.toString();
    }
}
