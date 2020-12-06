package Work.obstacle;

public class Obstacle {

    public static void main(String[] args) {
        try {
            int b = 0;
            int result = divide(10, b);
            System.out.println("result = " + result);

            int[] c = {1, 2, 3};
            System.out.println(c[42]);
        }catch (DivideByZeroException e){
            System.err.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
            System.out.println("Деление на ноль!");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid array index value!");
        }catch (Exception e){
            System.err.println("Упс! Что-то случилось!");
        }
            System.out.println("finish!");

    }

        private static int divide ( int a, int b){
            if (b == 0){
                throw new DivideByZeroException();
            }
            return a / b;
        }

}