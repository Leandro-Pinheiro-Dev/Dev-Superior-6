// CLASSE QUE REPRESENTA UMA IMPRESSORA CONCRETA (ConcretePrinter), IMPLEMENTA A INTERFACE Printer
package HerançaMultipla_Device;

public class ConcretePrinter extends Device implements Printer {

    // CONSTRUTOR DA CLASSE ConcretePrinter, QUE CHAMA O CONSTRUTOR DA CLASSE MÃE Device
    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    // MÉTODO QUE PROCESSA O DOCUMENTO A SER IMPRESSO
    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }

    // MÉTODO QUE IMPLEMENTA A IMPRESSÃO (print) DO DOCUMENTO
    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}
