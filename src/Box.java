import java.util.ArrayList;

public class Box<T> {

    ArrayList<T> list = new ArrayList<>();

    public void addBox(T e) {

    if (list.size()<1){
        list.add(e);
    }
    if (list.get(0).getClass().equals(e.getClass())){
        list.add(e);
    }else{
        System.out.println("В этой коробке другие фрукты");
    }
    System.out.println();


    }

    public void printBox(){
        T f;
        for (int i = 0; i < list.size(); i++) {
            f = list.get(i);

           // System.out.println(f.getName());
        }
    }
}
