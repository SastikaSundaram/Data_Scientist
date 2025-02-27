import java.util.*;
class fib{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int fib1=0;
        int fib2=1;
        int next;
        for (int i = 0; i <=n; i++) {
            for(int j=0;j<i;j++){
                System.out.print(fib1+" ");
                next=fib1+fib2;
                fib1=fib2;
                fib2=next;
            }
            System.out.println();
        }
        scan.close();
    }
}