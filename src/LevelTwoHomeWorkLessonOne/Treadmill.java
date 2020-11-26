package LevelTwoHomeWorkLessonOne;

public class Treadmill {
    int length;

    public Treadmill(int length){
        this.length = length;
    }

    public static void main(String[] args){

        Treadmill cat = new Treadmill(30);
        Treadmill human = new Treadmill(100);
        Treadmill robot = new Treadmill(200);
        Treadmill treadmill = new Treadmill(150);


        if(cat.length < treadmill.length){
            System.out.println("Кот не смог пробежать");
        }
        if(cat.length > treadmill.length){
            System.out.println("Кот успешно пробежал");
        }
        if(human.length < treadmill.length){
            System.out.println("Человек не смог пробежать");
        }
        if(human.length > treadmill.length){
            System.out.println(" Человек уcпешно пробежал");
        }
        if (robot.length < treadmill.length){
            System.out.println("Робот не смог пробежать");
        }
        if (robot.length > treadmill.length){
            System.out.println("Робот успешно пробежал");
        }

    }
}
