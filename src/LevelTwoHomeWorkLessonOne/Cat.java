package LevelTwoHomeWorkLessonOne;

public class Cat {
    String name;

    public Cat(String name){
        this.name = name;
            }

    public void jump(){
        System.out.println(name + " прыгнул");
    }

    public void run(){
        System.out.println(name +" бежит");
    }

    public static void main(String[] args){
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Барсик");

        cat1.jump();
        cat1.run();
        cat2.jump();
        cat2.run();
    }

}
