package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Qualifier("dog") //c помощью аннотации внедряем dog
    @Autowired
    private Animal animal; //связывание происходит через поле
    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }
    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}
