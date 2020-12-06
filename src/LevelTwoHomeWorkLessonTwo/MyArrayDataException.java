package LevelTwoHomeWorkLessonTwo;

public class MyArrayDataException extends RuntimeException{
    public  MyArrayDataException(String value, int i, int j) {
        super("Некорректные данные в массиве!");
    }
}
