public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        try {
            System.out.println(main.sumArray(
                    new String[][]{
                            {"1", "2", "3", "4"},
                            {"1", "2", "3", "4"},
                            {"1", "2", "3", "4"},
                            {"1", "2", "3", "4"}}));
            System.out.println(main.sumArray(
                    new String[][]{
                            {"1", "2", "3", "4"},
                            {"1", "2", "3", "4"},
                            {"1", "2", "3v", "4"},
                            {"1", "2", "3", "4"}}));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public int sumArray(String[][] array) throws MyArraySizeException {
        if (array.length != 4 || array[0].length != 4) throw new MyArraySizeException();
        int sum = 0;

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                try {
                    sum += Integer.parseInt(array[row][column]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(row, column);
                }
            }
        }
        return sum;

    }

    class MyArraySizeException extends Exception {
        public MyArraySizeException() {
            super("array size error");
        }
    }

    class MyArrayDataException extends NumberFormatException {
        public MyArrayDataException(int row, int column) {
            super("yourArray[" + row + "][" + column + "] is not int");
        }
    }


}
