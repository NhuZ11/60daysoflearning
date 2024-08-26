package mypack;
import java.io.Serializable;

public class CarBean implements Serializable {
    public String name;
    public CarBean(){

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
