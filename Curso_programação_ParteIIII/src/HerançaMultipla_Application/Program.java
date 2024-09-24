// PROGRAMA PRINCIPAL QUE DEMONSTRA A UTILIZAÇÃO DE HERANÇA MÚLTIPLA EM DISPOSITIVOS (IMPRESSORA, ESCANEADOR, E DISPOSITIVO COMBINADO)
// CADA DISPOSITIVO TEM UM NÚMERO DE SÉRIE E PODE REALIZAR TAREFAS COMO PROCESSAR DOCUMENTOS, IMPRIMIR E ESCANEAR
package HerançaMultipla_Application;

import HerançaMultipla_Device.ComboDevice;
import HerançaMultipla_Device.ConcretePrinter;
import HerançaMultipla_Device.ConcreteScanner;

public class Program {

    public static void main(String[] args) {

        // CRIA UM OBJETO IMPRESSORA CONCRETA (ConcretePrinter) COM O NÚMERO DE SÉRIE "1080"
        ConcretePrinter p = new ConcretePrinter("1080");
        // CHAMA O MÉTODO processDoc PARA PROCESSAR UM DOCUMENTO CHAMADO "My Letter"
        p.processDoc("My Letter");
        // CHAMA O MÉTODO print PARA IMPRIMIR O DOCUMENTO
        p.print("My Letter");

        System.out.println();

        // CRIA UM OBJETO ESCANEADOR CONCRETO (ConcreteScanner) COM O NÚMERO DE SÉRIE "2003"
        ConcreteScanner s = new ConcreteScanner("2003");
        // CHAMA O MÉTODO processDoc PARA PROCESSAR UM DOCUMENTO CHAMADO "My Email"
        s.processDoc("My Email");
        // CHAMA O MÉTODO scan E EXIBE O RESULTADO DO ESCANEAMENTO
        System.out.println("Scan result: " + s.scan());

        System.out.println();

        // CRIA UM OBJETO COMBODEVICE, QUE É UM DISPOSITIVO QUE FUNCIONA COMO IMPRESSORA E ESCANEADOR AO MESMO TEMPO
        ComboDevice c = new ComboDevice("2081");
        // CHAMA O MÉTODO processDoc PARA PROCESSAR UM DOCUMENTO CHAMADO "My dissertation"
        c.processDoc("My dissertation");
        // CHAMA O MÉTODO print PARA IMPRIMIR O DOCUMENTO
        c.print("My dissertation");
        // CHAMA O MÉTODO scan E EXIBE O RESULTADO DO ESCANEAMENTO
        System.out.println("Scan result: " + c.scan());
    }
}
