package Lab07;

public class Ex04 {
    public static class SuperClassTest {
        public char symbol;
        public SuperClassTest(char symbol) {
            this.symbol = symbol;
        }
        public SuperClassTest(SuperClassTest copySuper) {
            this.symbol = 'c';
        }
        public void set(char symbol) {
            this.symbol = symbol;
        }
        @Override
        public String toString() {
            String SubClassNameAndFieldValue;
            SubClassNameAndFieldValue = "Super \n ClassName: " +
                    this.getClass().getSimpleName() +
                    "Fields: " + symbol;
            return SubClassNameAndFieldValue;
        }
    }
    public static class subClass extends SuperClassTest {
        public String str;
        public void set(char symbol, String str) {
            this.symbol = symbol;
            this.str = str;
        }
        public subClass(char symbol, String str) {
            super(symbol);
            this.str = str;
        }
        public subClass(subClass copySub) {
            super(copySub);
            this.str = "copySub";
        }
        @Override
        public String toString() {
            String SubClassNameAndFieldValue;
            SubClassNameAndFieldValue = "Sub \n ClassName: " +
                    this.getClass().getSimpleName() +
                    "Fields: " + symbol + "," + str;
            return SubClassNameAndFieldValue;
        }
    }
    public static class subSubClass extends subClass {
        public int num;
        public void set(String str, char symbol, int num) {
            this.str = str;
            this.symbol = symbol;
            this.num = num;
        }
        public subSubClass(String str, char symbol, int num) {
            super(symbol, str);
            this.num = num;
        }
        public subSubClass(subSubClass copySubSub) {
            super(copySubSub);
            this.num = 1;
        }
        @Override
        public String toString() {
            String SubClassNameAndFieldValue;
            SubClassNameAndFieldValue = "SubSub \n ClassName: " +
                    this.getClass().getSimpleName() + "Fields: " +
                    num + "," + symbol + "," + str;
            return SubClassNameAndFieldValue;
        }
    }
    public static void main(String[] args) {
        SuperClassTest superClassTestObj = new SuperClassTest('c');
        System.out.println(superClassTestObj.toString());
        subClass subClassObj = new subClass('c', "string");
        System.out.println(subClassObj.toString());
        subSubClass subSubClassObj = new subSubClass("tt", 'w', 4);
        System.out.println(subSubClassObj.toString());
        SuperClassTest copySuper = new SuperClassTest(superClassTestObj);
        System.out.println(copySuper.toString());
        subClass copySub = new subClass(subClassObj);
        System.out.println(copySub.toString());
        subSubClass copySubSub = new subSubClass(subSubClassObj);
        System.out.println(copySubSub.toString());
    }
}
