package HomeWorkLessonSeven;


public class CatFood {

    public static void main(String[] args) {
        Cat[] arrCats = new Cat[5];
        arrCats[0] = new Cat("Барсик", 15);
        arrCats[1] = new Cat("Мурка", 20);
        arrCats[2] = new Cat("Дося", 25);
        arrCats[3] = new Cat("Кузя", 20);
        arrCats[4] = new Cat("Тоша", 30);

        Plate p = new Plate(100);

        for (Cat cat : arrCats) {
            cat.eat(p);
            cat.info();
        }
        p.info();
        p.addFood(100);
        p.info();
    }
    }













