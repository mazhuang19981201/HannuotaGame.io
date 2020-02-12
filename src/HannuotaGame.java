import java.util.Scanner;

/**
 * 实现诺汗塔小游戏
 */
public class HannuotaGame {

    public static int times; // 记录移动的总次数
    public static String a = "a";   // 表示第一个柱子
    public static String b = "b";   // 表示第二个柱子
    public static String c = "c";   // 表示第三个柱子


    /**
     * 移动盘子的方法
     * @param count
     * @param m
     * @param n
     */
    public static void move(int count,String m,String n){
        System.out.println("第"+(++times)+"次移动，将"+count+"盘子，从"+m+"移动到"+n);
    }

    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("开始汉诺塔....");
        System.out.println("请输入盘子数量....");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        shixian(count,a,b,c);

    }

    /**
     * 实现汉诺塔的方法
     * @param n
     * @param a
     * @param b
     * @param c
     */
    public static void shixian(int n,String a,String b,String c){
        // 如果盘子数为1
        if (n == 1){
            // 直接将盘子从a移动到c
            move(n,a,c);
        }else{
            // 重复上一步骤，把n-1个盘子从a移动到b
            shixian(n-1,a,c,b);
            // 将第n个盘子从a移动到c
            move(n,a,c);
            // 将n-1个盘子从b移动c
            shixian(n-1,b,a,c);
        }
    }

}
