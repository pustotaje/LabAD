package Lab05;

public class Ex04 {
        private char charField;
        private int intField;

        // Конструктор с двумя аргументами (целое число и символ)
        public Ex04(int intValue, char charValue) {
            intField = intValue;
            charField = charValue;
        }

        // Конструктор с одним аргументом типа double
        public Ex04(double value) {
            int intValue = (int) value;
            int decimalValue = (int) ((value - intValue) * 100); // учитываем только десятые и сотые
            intField = decimalValue;
            charField = (char) intValue;
        }

        public char getCharField() {
            return charField;
        }

        public void setCharField(char value) {
            charField = value;
        }

        public int getIntField() {
            return intField;
        }

        public void setIntField(int value) {
            intField = value;
        }
    }
