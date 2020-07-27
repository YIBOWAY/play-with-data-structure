package array;

import java.util.Arrays;

public class move_zero {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,4};
        int j = 0;
        for (int i = 0;i<arr.length;++i){
            if(arr[i]!=0){
                arr[j] = arr[i];
                if (i!=j){
                    arr[i] = 0;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
//根据for循环的语法定义:代码语句三要等内部代码执行完毕后再执行
// ++i 和 i++的结果是一样的，都要等代码块执行完毕才能执行语句3，但是性能是不同的。在大量数据的时候++i的性能要比i++的性能好
//原因：i++由于是在使用当前值之后再+1，所以需要一个临时的变量来转存；而++i则是在直接+1，省去了对内存的操作的环节，相对而言能够提高性能
