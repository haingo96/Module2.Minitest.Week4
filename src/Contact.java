import java.util.Arrays;
import java.util.Scanner;

public class Contact {
    private String name;
    private String phoneNumber;
    private Type type;

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void setType() {
        System.out.println("Existed types listed below, you can choose from those or create a new one");
        System.out.println(Arrays.toString(Type.typeList.toArray()));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your type:");
        String inputTypeName = scanner.nextLine();

        if (Type.typeList.contains(inputTypeName)){
            this.type.setName(inputTypeName);
        }else {
            this.type = new Type(inputTypeName);
        }
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", type=" + type +
                '}';
    }
}
