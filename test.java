class Stackarr{
    int a[];
    public Stackarr(int arr[]){
        int len = arr.length;
        System.out.println(len);
    }
}


class Main{

    public static void main(String args[]){
        int arr[] = new int[5];
        Stackarr sa= new Stackarr(arr);
        System.out.println(arr[4]);
    }
}