package stack;

class ArrayS {
    static class Stack{
        int arr[];
        int size ;
        public Stack(int a){
            arr = new int[a];
            size = a;
        }
        public void prints(){
            System.out.println(arr[0]);
        }
    
    }
    public static void main(String args[]){
       Stack a = new Stack(5);
        a.prints();

    }
}
