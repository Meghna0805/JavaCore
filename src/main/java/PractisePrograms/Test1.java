package PractisePrograms;

public class Test1 {
    public static void main(String[] args){
        newThreadUsingThreadClass world = new  newThreadUsingThreadClass();
        world.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}
