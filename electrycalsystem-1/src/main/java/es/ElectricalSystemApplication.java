package es;

import es.powerbutton.PowerButton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ElectricalSystemApplication {

    public static void main(String[] args) {

        ApplicationContext ctx=
                SpringApplication.run(ElectricalSystemApplication.class,args);
            ctx.getBean(PowerButton.class).click();


    }
}