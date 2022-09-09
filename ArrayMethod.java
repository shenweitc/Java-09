package Demo01;

import java.util.ArrayList;

public class ArrayMethod {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        System.out.println(array);

        array.add("一号");
        array.add("二号");
        array.add("三号");
        array.add("四号");
        System.out.println(array);

        String name = array.get(2);
        System.out.println("第二号索引是："+name);

        String whoRemoved = array.remove(2);
        System.out.println("被删除的是："+whoRemoved);
        System.out.println(array);

        int size=array.size();
        System.out.println("数组长度是："+size);

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
