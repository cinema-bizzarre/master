package HomeWorkLessonSeven;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        int d = food - amount;
        if (d < 0) return false;
        food -= amount;
        return true;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int food) {
        System.out.println("Добавляем еду: " + food);
        this.food += food;
    }
}


