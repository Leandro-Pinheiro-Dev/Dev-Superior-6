// CLASSE CONCRETA CIRCLE QUE HERDA A CLASSE ABSTRATA ABSTRACTSHAPE E IMPLEMENTA O CÁLCULO DA ÁREA DO CÍRCULO
package model.Entities_Herdar_CumprirContratos;

import model.Enums_Herdar_CumprirContratos.Color;

public class Circle extends AbstractShape {

    private Double radius; // RAIO DO CÍRCULO

    // CONSTRUTOR QUE INICIALIZA A COR E O RAIO DO CÍRCULO
    public Circle(Color color, Double radius) {
        super(color); // CHAMA O CONSTRUTOR DA CLASSE ABSTRATA ABSTRACTSHAPE
        this.radius = radius;
    }

    // MÉTODOS GETTER E SETTER PARA O RAIO DO CÍRCULO
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    // IMPLEMENTAÇÃO DO MÉTODO area(), QUE CALCULA A ÁREA DO CÍRCULO (PI * RAIO^2)
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
