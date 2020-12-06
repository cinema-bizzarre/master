package Work.obstacle;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String cellValue, int i, int j) {
        super(String.format("Invalid value '%s' in array cell[%d][%d], required integer",
                cellValue, i, j));
    }
}