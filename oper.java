import java.util.*;
public class oper {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int operations=scan.nextInt();
        for(int i=1;i<=operations;i++){
            String op=scan.next();
            int val=scan.nextInt();
            switch(op){
                case "add":
                    num+=val;
                    break;
                case "sub":
                    num-=val;
                    break;
                case "mul":
                    num*=val;
                    break;
                case "div":
                    num/=val;
                    break;
            }
        }
            System.out.println(num);
            scan.close();
        
    }
}
