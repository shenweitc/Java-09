package Demo01;

import java.util.ArrayList;
import java.util.Random;

/*
生成6个1-33之间的随机数，添加到集合，并遍历集合
1.需要存储6个数字<Integer>
2.6个随机数Random
3.r.nextInt(); 0-32 整体加1
4.遍历
 */
public class ArrayRandom {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Random r=new Random();

        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(32)+1;
            list.add(num);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
