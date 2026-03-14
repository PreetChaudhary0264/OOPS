public class Check {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int val = 0;
        int[] arr2 = dummy(arr,val);
        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr[0]);
        System.out.println(val);
    }
    static int[] dummy(int[] temp,int val){
        temp[0] = 1;
        val++;
        temp = new int[5];
        return temp;
    }
}
