package modules;

import java.math.BigDecimal;

public class main {

    public static void main(String[] args) {

        Corrida corrida1 = new Corrida(5, 3000, "Marrocos", (Integer) 3);

        corrida1.addCarro(300.0,10, 2.0, "AXC1111");
        corrida1.addCarro(200.0, 10, 2.0, "AXC2222");
        corrida1.addCarro(100.0, 10, 2.0, "AXC23333");

        // Socorrendo um carro
        corrida1.socorrerCarro("AXC1111");

        // Deletando segundo veículo com placa
        corrida1.deleteVeiculoComPlaca("AXC23333");

        // Deletando terceiro veículo com Objeto
        Veiculo paraDeletar = corrida1.getListaVeiculos().get(1);
        corrida1.deleteVeiculo(paraDeletar);

        corrida1.addCarro(200.0, 10, 2.0, "AXC555");
        corrida1.addCarro(100.0, 10, 2.0, "AXC444");

        System.out.println(corrida1.toString());

        // Quem venceu a corrida?
        System.out.println("  --->  VENCEU!   --->  " + corrida1.calculaVencedor().toString());
    }
}
