package LevelTwoHomeWorkLessonTwo;

public class MyArray {

    private static final int Array_Size = 4;
    private static final String[][] array = new String[][]{
            {"58", "29", "13", "42"},
            {"2", "37", "2h", "94"},
            {"60", "84", "55"},
            {"11", "48", "25", "92"},
    };

    public static void main(String[] args) {
       try{
           int result = sumArray(array);
           System.out.println("Array sum:" + result);
        }catch (MyArraySizeException e){
           System.out.println("Недопустимый размер массива");
           System.out.println(e.getMessage());
       }catch (MyArrayDataException e){
           System.out.println("Некорректные данные в массиве");
           System.out.println(e.getMessage());
       }

    }



    private static int sumArray(String[][] data) {
        checkArraySize(data);
        int sumResult = 0;
        for (int i = 0; i < data.length; i++) {
            String[] g = data[i];
            for (int j = 0; j < g.length; j++) {
                String value = g[j];

            }
        }
        return sumResult;
    }
    private static void checkArraySize(String[][] data){
        if(data.length != Array_Size){
            throw new MyArraySizeException();
        }
        for (String[] g: data) {
            if(g.length != Array_Size){
                throw new MyArraySizeException();
            }
        }
    }
}
