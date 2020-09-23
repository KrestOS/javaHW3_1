public class Orange extends Fruit{
    Float weight = 1.5f;
    String name;

    public Float getWeight() {
        return weight;
    }

    public Orange(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
