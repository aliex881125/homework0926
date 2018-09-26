import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt(),
            v2 = scn.nextInt(),
            v3 = scn.nextInt(),
            v4 = scn.nextInt();
        int r = v1-(v2*15+v3*20+v4*30);
        if(r<0){
            System.out.println("0");
        }else {
            System.out.println(r/50);
            r = r%50;
            System.out.println(r/5);
            System.out.println(r%5);
        }




//        Scanner scn = new Scanner(System.in);
//        int x = scn.nextInt(),
//            y = scn.nextInt();
//        double d = Math.sqrt(x*x+y*y);
//        if(d>100){
//            System.out.println("outside");
//        }else {
//            System.out.println("inside");
//        }




//        Scanner scn = new Scanner(System.in);
//        int h = scn.nextInt();
//        int t = scn.nextInt();
//        if(t == 1){
//            System.out.println((h-80) * 0.7f);
//        }
//        else{
//        System.out.println((h-70) * 0.6f);}


//        Scanner scn = new Scanner(System.in);
//        String str = scn.next();
//        int v1 = Integer.parseInt(str,16);
//        System.out.println((char)v1);

//          char ch = scn.next().charAt(0);
//        System.out.println(Integer.toHexString((int)ch));
//        System.out.println((int)ch);
    }
}