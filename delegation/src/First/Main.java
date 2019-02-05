package First;
import java.util.Scanner;


/*
Эта программа представляет собой пример использования делегирования in Java с помощью интерфейса
 */

interface Cook{

    void cooking();
}

class Chicken implements Cook{

    @Override
    public void cooking() {
        System.out.println("Cooking Chicken!");
    }
}

class Eggs implements Cook{
    public void cooking(){
        System.out.println("Cooking Eggs!") ;
    }
}

class Main {


    Cook action;


    void run() {
        if (startCooking()) {
            action.cooking();
        }
    }


    /*
    Этот метод в данной программе не важен, он должен представлять
    собой какое-либо действие, в этом примере, что-то вроде, включить плиту, подготовить сковородку и тд.
     */

    private boolean startCooking() {
        return true;
    }




    public static void main(String[] args) {

        System.out.println("What do you want to eat today?");

        String sc = new Scanner(System.in).nextLine();



        Main cook = new Main();


        if (sc.equals("chicken")) {
            cook.action = new Chicken();
        } else if (sc.equals("eggs")) {
            cook.action = new Eggs();
        }


        cook.run();

    }
}
