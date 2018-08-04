/**
 * Created by 1612143222 on 2018/8/4.
 */
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        System.out.println("请输入工资：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        double tax = 0;
        if(money<=1500 && money >0){
            tax = money*0.03;
        }else if(money>1500 && money<=4500){
            tax = 1500*0.03 + (money-1500)*0.1;
        }else if(money >4500 &&money<=9000){
            tax = 1500*0.03 + 3000*0.1 +(money-4500)*0.2;
        }else if(money > 9000 && money<=35000){
            tax = 1500*0.03 + 3000*0.1 + 4500*0.25 +(money-9000)*0.25;
        }else if(money >35000 && money <=55000){
            tax = 1500*0.03 + 3000*0.1 + 4500*0.25 +26000*0.25+(money-35000)*0.3;
        }else if(money >55000 && money<=80000){
            tax = 1500*0.03 + 3000*0.1 + 4500*0.25 +26000*0.25+20000*0.3+(money-55000)*0.35;
        }else{
            tax = 1500*0.03 + 3000*0.1 + 4500*0.25 +26000*0.25+20000*0.3+25000*0.35+(money-80000)*0.45;
        }
        System.out.println("所需要缴纳的税费为:"+tax);
    }
}