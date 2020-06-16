package array;

public class Atest {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<>();//因为使用了泛型，所以需要明确数组中包含的对象类；因为不能使用八种基本数据类型，所以需要使用整型包装类
        //包装类与对应的基本数据类型能自动进行转换
        for (int i =0;i<10;i++){
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1,100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);
        //[-1,0,100,1,2,3,4,5,6,7,8,9]
        arr.remove(2);
        System.out.println(arr);

        arr.removeElement(4);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);
    }
}
