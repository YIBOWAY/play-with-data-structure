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
}
