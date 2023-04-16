import java.util.ArrayList;
import java.util.List;

public class Type {
    private int id;
    private String name;

    public static List<String> typeList = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Type(String name) {
        this.name = name;

        if (!typeList.contains(name)){
            typeList.add(name);
        }
    }

    @Override
    public String toString() {
        return "Type{" +
                "name='" + name + '\'' +
                '}';
    }
}
