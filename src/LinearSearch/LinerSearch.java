package LinearSearch;

/**
 *关于线性查找法
 * @version 1.0
 * @author yibosun
 */
public class LinerSearch {
    private LinerSearch(){}
    public static <E> int search(E[] data,E target){//一个静态的方法，只希望使用方法
        //使用泛型修改方法以支持不同的数据类型；目的：减少重新性代码的书写
        for (int i = 0;i< data.length;i++){
            if (data[i].equals(target)){
                //对于类对象之间的判断，应使用equals方法
                return i;
            }
        }return -1;
    }

    public static void main(String[] args) {
        int[] dataSize = {1000000,10000000};//不同数据量之间的比较，以此也能侧面证明时间复杂度为O(n)
        for (int n : dataSize) {
            Integer[] data = ArrayGenerator.generateOrderArray(n);
            //泛型只能接收类对象，不接收基本数据类型
            long startTime = System.nanoTime();//获取当前纳秒级别的时间
            for (int k = 0; k < 100; k++) {
                LinerSearch.search(data, n);
            }
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1000000000.0;//最终结果时间
            System.out.println("n: " + n + ", 100runs :" + time + " s");
        }
//        LinerSearch ls = new LinerSearch(); 动态的对象，有些奇怪
//        int res = LinerSearch.search(data,n); //直接调用静态方法

        /*
        //Java内部带有自动转换，将16转换为类对象
        System.out.println(res);

        int res2 = LinerSearch.search(data,44);
        System.out.println(res2);

        Student[] students = {new Student("Alice"),
                                new Student("Bobo"),
                                new Student("Charles")
        };
        Student bobo = new Student("Bobo");
        int res3 = LinerSearch.search(students,bobo);
        //直接进行比较，会返回-1,即没有查找到，因为在equals方法中，默认比较的是地址，而我们此时需要的是比较字符串的值，所以我们需要进入到类中，自定义equals方法
        System.out.println(res3);
        for (int i =1;i++<4;) {
            System.out.println(i);
            }
         */

    }
}
