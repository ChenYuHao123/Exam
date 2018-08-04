/**
 * Created by 1612143222 on 2018/8/4.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Exam3 {
    public static void main(String[] args) {
        int max = 100;
        int[] nums = new int[50];
        for (int i = 0; i < 50; i++) {
            int num = (int)(Math.random()*(max + 1));
            nums[i] = num;
        }
        //打印生成的数
        System.out.print("随机生成50个小于100的数,分别为:");
        for (int a : nums) {
            System.out.print(a + ",");
        }
        System.out.println();

        //创建map，存放10个数组
        Map map = new HashMap<Integer, Arrays>();
        for(int i=0;i<=10;i++){
            map.put(i, new int[50]);
        }

        //将生成的随机数按分类存进去map
        for (int i = 0;i<nums.length;i++) {
            int flag = nums[i]/10;
            int[] b = (int[])map.get(flag);
            b[i] = nums[i];
        }

        //打印排序前的map中数据
        System.out.println("这里是map中初始数据：");
        for(int i = 0;i<10;i++){
            int[] c = (int[])map.get(i);
            System.out.print(i+"=>[");
            for(int j=0;j<c.length;j++){
                if(c[j]!=0){
                    if(j==c.length-1){
                        System.out.print(c[j]);
                    }else{
                        System.out.print(c[j]+",");
                    }
                }
            }
            System.out.println("],");
        }
        System.out.println("------------分割线--------------");

        //排序
        System.out.println("这里是map中排列好的数据：");
        for(int k=0;k<10;k++){
            int[] d = (int[])map.get(k);
            Arrays.sort(d);
            System.out.print(k+"=>[");
            for(int i = 0 ;i<d.length;i++){
                if(d[i] != 0)
                    System.out.print(d[i]+",");
            }
            System.out.println("],");
        }


        //排序222

        //222


//		//打印排序后的数据
//		System.out.println("这里是map中排序后的数据：");
//		for(int i = 0;i<10;i++){
//			int[] c = (int[])map.get(i);
//			System.out.print(i+"=>[");
//			for(int j=0;j<c.length;j++){
//				if(c[j]!=0){
//					if(j==c.length-1){
//						System.out.print(c[j]);
//					}else{
//						System.out.print(c[j]+",");
//					}
//				}
//			}
//			System.out.println("],");
//		}

//		System.out.println(Arrays.toString(nums));
    }
}
