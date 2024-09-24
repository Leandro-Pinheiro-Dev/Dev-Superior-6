// CLASSE QUE REPRESENTA UM DISPOSITIVO COMBINADO, QUE IMPLEMENTA AS FUNCIONALIDADES DE IMPRESSORA E ESCANEADOR
package HerançaMultipla_Device;

public class ComboDevice extends Device implements Scanner, Printer {

    // CONSTRUTOR DA CLASSE ComboDevice, QUE CHAMA O CONSTRUTOR DA CLASSE MÃE Device PASSANDO O NÚMERO DE SÉRIE
    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    // MÉTODO QUE IMPLEMENTA A IMPRESSÃO (print) PARA O DISPOSITIVO COMBINADO
    @Override
    public void print(String doc) {
        System.out.println("Combo printing: " + doc);
    }

    // MÉTODO QUE IMPLEMENTA O ESCANEAMENTO (scan) PARA O DISPOSITIVO COMBINADO
    @Override
    public String scan() {
        return "Combo scan result";
    }

    // MÉTODO QUE PROCESSA O DOCUMENTO, INDEPENDENTE DE SER IMPRESSÃO OU ESCANEAMENTO
    @Override
    public void processDoc(String doc) {
        System.out.println("Combo processing: " + doc);
    }
}
