package Demo01;

import java.util.ArrayList;
import java.util.Random;

/*
用一个大集合存放20个随机数字，然后筛选其中的偶数元素，放到小集合中
要求使用自定义的方法实现筛选

1.创建一个大集合，存放20个int数据<Integer>
2.随机数Random
3.循环20次，把随机数放入大集合
4.定义一个方法，用来筛选
 */
public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer>bigList=new ArrayList<>();
        Random r=new Random();

        for (int i = 0; i < 20; i++) {
            int num=r.nextInt(100)+1;
            bigList.add(num);
        }
        System.out.println(bigList);
        System.out.println(getArray(bigList));
    }

    public static ArrayList<Integer> getArray(ArrayList<Integer> bigList) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            if(bigList.get(i)%2==0){
                smallList.add(i);
            }
        }
        return smallList;
    }
}
