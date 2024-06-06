class Phone {
    public void displayTime() {
        System.out.println("The time is 9am");
    }
}

class SmartPhone extends Phone{

    public void playVideo(){
        System.out.println("Playing video....");
    }

}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj= new SmartPhone();

        obj.displayTime();
        //obj.playVideo(); Not allowed here

    }
}
