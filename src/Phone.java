public abstract class Phone {
    protected abstract void display(String typeName);
    protected abstract void insertPhone(Contact contact);
    protected abstract void removePhone(String name);
    protected abstract void updatePhone(String name, String newPhone);
}
