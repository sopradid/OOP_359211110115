package ooplab9;

public class Enging {
    private String size;
    private String type;

    public Enging (String size, String type) {
        this.size = size;
        this.type = type;
    }


    //toString()

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';

    }
}//class