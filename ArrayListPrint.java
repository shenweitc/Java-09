package Demo01;

import java.util.ArrayList;

/*
定义指定格式打印集合的方法（ArrayList类型作为参数）。使用{}括起集合，使用@分隔每个元素
{元素@元素@元素}


 */
public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("一号");
        list.add("二号");
        list.add("三号");
        list.add("四号");
        System.out.println(list);
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name=list.get(i);
            if(i==list.size()-1){
                System.out.print(name+"}");
            }else{
                System.out.print(name+"@");
            }
        }
    }
}
