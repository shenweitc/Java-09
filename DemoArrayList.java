package Demo01;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
//        创建一个ArrayList集合，集合的名称的是list，里面是String字符串类型的数据
        ArrayList<String>list=new ArrayList<>();
        System.out.println(list);
        list.add("宝贝");
        System.out.println(list);
    }
}
