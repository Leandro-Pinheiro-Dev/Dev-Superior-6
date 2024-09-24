// CLASSE ABSTRATA QUE REPRESENTA UM DISPOSITIVO GENÉRICO
package HerançaMultipla_Device;

public abstract class Device {

    public String serialNumber; // NÚMERO DE SÉRIE DO DISPOSITIVO

    // CONSTRUTOR QUE INICIALIZA O NÚMERO DE SÉRIE
    public Device(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    // MÉTODO QUE RETORNA O NÚMERO DE SÉRIE DO DISPOSITIVO
    public String getSerialNumber() {
        return serialNumber;
    }

    // MÉTODO QUE DEFINE O NÚMERO DE SÉRIE DO DISPOSITIVO
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    // MÉTODO ABSTRATO QUE DEVE SER IMPLEMENTADO POR CLASSES FILHAS PARA PROCESSAR DOCUMENTOS
    public abstract void processDoc(String doc);
}
