import java.util.ArrayList;

public class OArr<T> {
   private T[] arr;
   private String name;

    public OArr(String name, T... arr) {
        this.arr = arr;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void swapElementArr(int i, int j){
        T b;
        if (i <= arr.length&&j <= arr.length){
            b = arr[i];
            arr[i] = arr[j];
            arr[j] = b;
        }else {
            System.out.println("Не допустимые индексы массива");
        }



    }
    public void printArr(){
        System.out.println("Массив: " + getName());
        for (int i = 0; i < arr.length; i++) {
            System.out.printf( "[%s]" ,arr[i]);
        }
        System.out.println();
    }
    public void arrToList(){
        ArrayList<T> list = new ArrayList<>(arr.length);
        System.out.println("ArrayList: ");
        for (int i = 0; i < arr.length; i++) {

            list.add(i,arr[i]);
            System.out.printf( "[%s]" ,list.get(i));

        }
        System.out.println();
    }

}
