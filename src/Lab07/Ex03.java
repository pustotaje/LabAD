package Lab07;

public class Ex03 {
    public static class SuperClassTest{
        public int num;
        public SuperClassTest(int num) {
            this.num = num;
        }
        public void set(int num) {
            this.num = num;
        }
        @Override
        public String toString(){
            String SubClassNameAndFieldValue;
            SubClassNameAndFieldValue = "Super \n ClassName: " + this.getClass().getSimpleName() + "Fields: " + num;
            return SubClassNameAndFieldValue;
        }
    }
    public static class subClass extends SuperClassTest{
        public char symbol;
        public void set(char symbol, int num) {
            this.symbol = symbol;
            this.num = num;
        }
        public subClass(char symbol, int num) {
            super(num);
            this.symbol = symbol;
        }
        @Override
        public String toString(){
            String SubClassNameAndFieldValue;
            SubClassNameAndFieldValue = "Sub \n ClassName: " +
                    this.getClass().getSimpleName() +
                    "Fields: " + num + "," + symbol;
            return SubClassNameAndFieldValue;
        }
    }
    public static class subSubClass extends subClass{
        public String str;
        public void set(String str, char symbol, int num) {
            this.str = str;
            this.symbol = symbol;
            this.num = num;
        }

        public subSubClass(String str, char symbol, int num) {
            super(symbol, num);
            this.str = str;
        }
        @Override
        public String toString(){
            String SubClassNameAndFieldValue;
            SubClassNameAndFieldValue = "SubSub \n ClassName: " +
                    this.getClass().getSimpleName() +
                    "Fields: " + num + "," + symbol +
                    "," + str;
            return SubClassNameAndFieldValue;
        }
    }
    public static void main(String[] args) {
        SuperClassTest superClassTestObj = new SuperClassTest(44);
        System.out.println(superClassTestObj.toString());
        subClass subClassObj = new subClass('c', 444);
        System.out.println(subClassObj.toString());
        subSubClass subSubClassObj = new subSubClass("tt", 'w', 4);
        System.out.println(subSubClassObj.toString());
    }
}
