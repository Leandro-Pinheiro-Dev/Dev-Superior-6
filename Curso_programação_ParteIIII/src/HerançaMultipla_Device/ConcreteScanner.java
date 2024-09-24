// CLASSE QUE REPRESENTA UM ESCANEADOR CONCRETO
package HerançaMultipla_Device;
//A CLASSE CONCRETESCANNER HERDA DA CLASSE ABSTRATA DEVICE E IMPLEMENTA A INTERFACE SCANNER
public class ConcreteScanner extends Device implements Scanner {

    // CONSTRUTOR QUE INICIALIZA O NÚMERO DE SÉRIE DO ESCANEADOR
    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    // IMPLEMENTAÇÃO DO MÉTODO processDoc() QUE PROCESSA O DOCUMENTO
    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    // IMPLEMENTAÇÃO DO MÉTODO scan() QUE RETORNA O CONTEÚDO ESCANEADO
    @Override
    public String scan() {
        return "Scanned content";
    }
}
