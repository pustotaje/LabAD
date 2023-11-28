package Lab06;

public class ex01t {
    public static void main(String[] args) {
        ex01 obj = new ex01();

        obj.setField('A');
        obj.setField("dwdw");

        System.out.println("Значения полей объекта:");
        obj.displayFieldValues();

        char[] charArray = {'c', 'h', 'e', 't', 'i', 'r', 'e'};
        obj.setField(charArray);

        System.out.println("\nНовые значения полей объекта:");
        obj.displayFieldValues();
    }
}