import java.util.*;
class concat{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i]=scan.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr2[i]=scan.nextInt();
        }
        int result[]=new int[n1+n2];
        System.arraycopy(arr1, 0, result, 0, n1);
        System.arraycopy(arr2, 0, result, n1, n2);
        System.out.println(Arrays.toString(result));
        scan.close();
        
        //System.out.println(Arrays.toString(arr1));
        //System.out.println(Arrays.toString(arr2));
        
    }
}