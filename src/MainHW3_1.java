import java.util.ArrayList;

public class MainHW3_1 {
    public static void main(String[] args) {

//        //Задание 1
//        OArr<String> arr = new OArr<>("StringArr","0","1","2","3");
//        OArr<Integer> arr1 = new OArr<>("IntegerArr",1,2,3,4);
//
//        arr.printArr();
//        arr.swapElementArr(1,2);
//        arr.printArr();
//
//        arr1.printArr();
//        arr1.swapElementArr(0,2);
//        arr1.printArr();
//
//        //Ошибочные индексы
//        // arr.swapElementArr(5,7);
//
//        arr.arrToList();
//        arr1.arrToList();

        Box<Fruit> box1 = new Box<>();
        Box<Fruit> box2 = new Box<>();
        Box<Fruit> box3 = new Box<>();
        Orange orange1 = new Orange("Orange1");
        Orange orange2 =       new Orange("Orange2");
        Orange orange3 =        new Orange("Orange3");
        Orange orange4 =       new Orange("Orange4");


        Apple apple1 =  new Apple("Apple1");
        Apple apple2 =        new Apple("Apple2");
        Apple apple3 =        new Apple("Apple3");
        Apple apple4 =       new Apple("Apple4");


            box1.addBox(orange1);
        //box1.printBox();
        box1.addBox(apple1);












    }
}
