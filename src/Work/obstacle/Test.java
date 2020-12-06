package Work.obstacle;

public class Test {
    private static final int ARRAY_SIZE = 4;

    private static final String[][] array = new String[][]{
            {"21", "45", "93", "65"},
            {"12", "64", "8t", "54"},
            {"16", "74", "99"},
            {"83", "5", "79", "16"},
    };


    public static void main(String[] args) {
        try {
           int result = sumArray(array);
            System.out.println("Array sum: " + result);
        } catch (MyArraySizeException e ) {
            System.out.println("Некорректный размер массива");
            System.out.println(e.getMessage());

        } catch (MyArrayDataException e) {
            System.out.println("Некорректные данные в массиве");
            System.out.println(e.getMessage());

        }
    }

    private static int sumArray(String[][] data) {
        checkArraySize(data);

        int sumResult = 0;

        for (int i = 0; i < data.length; i++) {
            String[] row = data[i];
            for (int j = 0; j < row.length; j++) {
                String value = row[j];
                try {
                    sumResult += Integer.parseInt(value);

                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(value, i, j);
                }
            }
        }

        return sumResult;
    }

    private static void checkArraySize(String[][] data) {
        if (data.length != ARRAY_SIZE) {
            throw new MyArraySizeException();
        }

        for (String[] row : data) {
            if (row.length != ARRAY_SIZE) {
                throw new MyArraySizeException();
            }
        }
    }
}



