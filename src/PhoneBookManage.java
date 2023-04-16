import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneBookManage extends Phone implements IPhone {
    public List<Contact> contacts = new ArrayList<>();

    public void insertPhone(Contact contact) {
        contact.setType();

        if (contacts.stream()
                .map(Contact::getName)
                .toList()
                .contains(contact.getName())) {
            Contact holder = contacts.stream()
                    .filter(contact1 -> contact1.getName().equals(contact.getName()))
                    .findFirst().get();
            holder.setPhoneNumber(contact.getPhoneNumber());
        } else {
            contacts.add(contact);
        }
    }

    @Override
    public void removePhone(String name) {
        contacts.remove(contacts.stream()
                        .filter(contact -> contact.getName().equals(name))
                        .findFirst());
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        contacts.stream()
                .filter(contact -> contact.getName().equals(name))
                .findFirst().get()
                .setPhoneNumber(newPhone);
    }

    public String searchPhone(String name) {
        if (contacts.stream().map(Contact::getName).toList().contains(name)) {
            return contacts.stream()
                    .filter(contact -> contact.getName().equals(name))
                    .findFirst().get()
                    .getPhoneNumber();
        }else {
            return "No matched name!";
        }
    }

    @Override
    public void sort() {
        contacts.stream().sorted((c1, c2) -> c1.getName().compareTo(c2.getName()));
    }

    public void display(String typeName) {
        System.out.println(contacts.stream()
                .filter(contact -> contact.getType().getName().equals(typeName)));
    }
}
