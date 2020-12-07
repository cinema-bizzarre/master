package LevelTwoHomeWorkLessonOne;

public class Robot {
    String name;

    public Robot(String name){
        this.name = name;
    }

    public void jump(){
        System.out.println(name + " прыгнул");
    }

    public void run(){
        System.out.println(name + " бежит");
    }

    public static void main(String[] args){
        Robot robot1 = new Robot("Майкл");
        Robot robot2 = new Robot("Джек");
        robot1.jump();
        robot1.run();
        robot2.jump();
        robot2.run();

    }



}
