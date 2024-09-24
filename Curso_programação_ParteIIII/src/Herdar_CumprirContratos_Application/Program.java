// ESTE PROGRAMA DEMONSTRA A UTILIZAÇÃO DE CLASSES ABSTRATAS, INTERFACES, ENUMERAÇÕES E HERANÇA EM JAVA. 
// A IDEIA CENTRAL É DEFINIR UMA ESTRUTURA DE FORMAS GEOMÉTRICAS QUE POSSUEM CORES E ÁREAS CALCULADAS DE FORMA DIFERENTE, 
// DEPENDENDO SE A FORMA É UM CÍRCULO OU UM RETÂNGULO. O PROGRAMA UTILIZA UMA CLASSE ABSTRATA PARA GERENCIAR A COR E INTERFACES PARA CÁLCULO DE ÁREA.

// CLASSE PRINCIPAL QUE INICIA A EXECUÇÃO DO PROGRAMA
package Herdar_CumprirContratos_Application;

import model.Entities_Herdar_CumprirContratos.AbstractShape;
import model.Entities_Herdar_CumprirContratos.Circle;
import model.Entities_Herdar_CumprirContratos.Rectangle;
import model.Enums_Herdar_CumprirContratos.Color;

public class Program { 

    public static void main(String[] args) {

        // CRIAÇÃO DE UM OBJETO CÍRCULO (CIRCLE) COM COR PRETA E RAIO 2.0
        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        // CRIAÇÃO DE UM OBJETO RETÂNGULO (RECTANGLE) COM COR BRANCA E DIMENSÕES 3.0 E 4.0
        AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
        
        // EXIBE A COR DO CÍRCULO E CALCULA SUA ÁREA USANDO O MÉTODO IMPLEMENTADO NA CLASSE CIRCLE
        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        // EXIBE A COR DO RETÂNGULO E CALCULA SUA ÁREA USANDO O MÉTODO IMPLEMENTADO NA CLASSE RECTANGLE
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area())); 
    }
}
