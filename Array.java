package Demo01;
/*
定义一个数组，用来存储3个Person对象
 */
public class Array {
    public static void main(String[] args) {
        Person[] array= new Person[3];
        Person one=new Person("一号",20);
        Person two=new Person("二号",21);
        Person three=new Person("三号",22);
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[1].getName());
    }
}
