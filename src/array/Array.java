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
}
