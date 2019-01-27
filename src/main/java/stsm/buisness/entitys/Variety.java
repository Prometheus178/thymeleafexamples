package stsm.buisness.entitys;

public class Variety {

    private int id;
    private String name;

    public Variety() {
      super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Variety{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
