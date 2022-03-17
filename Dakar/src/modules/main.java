package modules;

import java.math.BigDecimal;

public class main {

    public static void main(String[] args){

        Corrida corrida1 = new Corrida(5, 3000, "Marrocos", (Integer) 3);

        corrida1.addCarro(BigDecimal.valueOf(100.0), BigDecimal.valueOf(10), 2.0, "AXC2323");
        corrida1.addCarro(BigDecimal.valueOf(100.0), BigDecimal.valueOf(10), 2.0, "AXC2323");
        corrida1.addCarro(BigDecimal.valueOf(100.0), BigDecimal.valueOf(10), 2.0, "AXC2323");

        System.out.println(corrida1.toString());
    }
}
