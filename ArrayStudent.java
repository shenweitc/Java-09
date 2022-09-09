package Demo01;

import java.util.ArrayList;

/*
自定义4个学生对象，添加到集合，并遍历
1.自定义Student学生类，四个
2.创建一个集合，泛型<Student>
3.根据类，创建4个对象
4.add
5.遍历
 */
public class ArrayStudent {
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();

        Student one=new Student("一号",20);
        Student two=new Student("二号",21);
        Student three=new Student("三号",22);
        Student four=new Student("四号",23);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println("姓名："+stu.getName()+"    年龄："+stu.getAge());
        }
    }
}
