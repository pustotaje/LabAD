package Lab07;

public class Ex05 {
    public static class SuperClassTest {
        private String str;
        public SuperClassTest(String strEx) {
            this.str = strEx;
        }
        public void Show() {
            String SubClassNameAndFieldValue = "Super\nClassName: " +
                    this.getClass().getSimpleName() +
                    "\nFields: " + str;
            System.out.println(SubClassNameAndFieldValue);
        }
    }
    public static class subClass1 extends SuperClassTest {
        private int num;
        public subClass1(String strEx, int numEx) {
            super(strEx);
            this.num = numEx;
        }
        @Override
        public void Show() {
            String SubClassNameAndFieldValue = "Sub\nClassName: " +
                    this.getClass().getSimpleName() +
                    "\nFields: " + num;
            System.out.println(SubClassNameAndFieldValue);
        }
    }
    public static class subClass2 extends SuperClassTest {
        private char symbol;
        public subClass2(String strEx, char symbolEx) {
            super(strEx);
            this.symbol = symbolEx;
        }
        @Override
        public void Show() {
            String SubClassNameAndFieldValue = "Sub\nClassName: " +
                    this.getClass().getSimpleName() +
                    "\nFields: " + symbol;
            System.out.println(SubClassNameAndFieldValue);
        }
    }
    public static void main(String[] args) {
        SuperClassTest superClassTestObj = new SuperClassTest("SuperClass");
        superClassTestObj.Show();
        subClass1 subClass1O = new subClass1("subclass1", 1);
        subClass1O.Show();
        subClass2 subClass2O = new subClass2("subclass2", '2');
        subClass2O.Show();
    }
}
