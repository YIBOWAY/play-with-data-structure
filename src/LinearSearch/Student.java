package LinearSearch;

public class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object student){
        if (this == student){
            return true;
        }
        if (student == null){
            return false;
        }
        if (this.getClass() != student.getClass()){//判断类对象所属的类是否一致
            return false;
        }
//进行一系列的判断，确保传入的对象可以进行强制转换
        Student another = (Student) student;
        //声明传入的对象为another
        return this.name.equals(another.name);
//        return this.name.toLowerCase().equals(another.name.toLowerCase());
        //将传入对象与当前对象的name作比较，此时因为声明的name是String类型，所以此时的equals方法就调用的String的equals方法
        //例：如果要在判断英文字符时忽略大小写，可以加 toLowerCase() 方法 ； 具体的equals依据，可以根据需求进行修改
    }
}
