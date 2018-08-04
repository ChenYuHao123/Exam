/**
 * Created by 1612143222 on 2018/8/4.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Exam2 {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入日期: ");
            String input = sc.next();
            String[] check = input.split("-");
            //检查
            boolean flag = true;
            int year = Integer.parseInt(check[0]);
            int month = Integer.parseInt(check[1]);
            int day = Integer.parseInt(check[2]);
            if(month>12 ||day<1){
                flag = false;
            }else if(month == 1 || month == 3 ||month == 5 ||month == 7 ||month == 8||month == 10||month == 12){
                if(day >31 || day <1){
                    flag = false;
                }
            }else if(month == 2){
                if(day >29 ||day<1){
                    flag = false;
                }else if(day == 29){
                    if (!(year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                        flag = false;
                }
            }else{
                if(day<1 || day>30){
                    flag = false;
                }
            }

            //日期正确
            if(flag == true){
                //判断下一天是哪一天
                if(day == 31 || day == 30){
                    if(month==12){
                        year++;
                        month = 1;
                        day = 1;
                    }else{
                        month++;
                        day=1;
                    }
                }else if(month == 2){
                    if(day == 28 || day ==29){
                        month++;
                        day=1;
                    }
                }else{
                    day++;
                }
                System.out.print("下一天为:");
                String next_day=null;
                if(month<10 || day <10){
                    if(month<10 && day<10){
                        next_day = year+"-0"+month+"-0"+day;
                    }else if(month<10){
                        next_day = year+"-0"+month+"-"+day;
                    }else{
                        next_day = year+"-"+month+"-0"+day;
                    }
                }else{
                    next_day = year+"-"+month+"-"+day;
                }
                System.out.println(next_day);
            }else{
                System.out.println("您输入的日期不存在");
            }
        }

    }
}
