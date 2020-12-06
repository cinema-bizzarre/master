package LevelTwoHomeWorkLessonOne;

public class Human {
    String name;

    public Human(String name){
       this.name = name;

    }
    public void jump(){
        System.out.println(name + " прыгнул");
    }

    public void run(){
        System.out.println(name + " бежит");
    }

    public static void main(String[] args){
        Human human1 = new Human("Денис");
        Human human2 = new Human("Кирилл");
        human1.jump();
        human1.run();
        human2.jump();
        human2.run();
    }
}
