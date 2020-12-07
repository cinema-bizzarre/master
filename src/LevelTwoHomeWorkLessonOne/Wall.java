package LevelTwoHomeWorkLessonOne;

public class Wall {

    int height;

    public Wall(int height){
        this.height = height;

    }


   public static void main(String[] args){

        Wall cat = new Wall(20);
       Wall human = new Wall(150);
       Wall robot = new Wall(180);
       Wall wall = new Wall(145);

       if(cat.height < wall.height){
           System.out.println("Кот не может перепрыгнуть стену");
       }
       if(cat.height > wall.height){
           System.out.println("Кот успешно перепрыгнул стену");
       }
       if(human.height < wall.height){
           System.out.println("Человек не может перепрыгнуть стену");
       }
       if(human.height > wall.height){
           System.out.println(" Человек уcпешно перепрыгнул стену");
       }
       if (robot.height < wall.height){
           System.out.println("Робот не может перепрыгнуть стену");
       }
        if (robot.height > wall.height){
            System.out.println("Робот успешно перепрыгнул стену");
        }
    }





}
