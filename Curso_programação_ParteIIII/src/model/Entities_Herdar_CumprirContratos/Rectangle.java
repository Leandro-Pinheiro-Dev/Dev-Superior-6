// CLASSE CONCRETA RECTANGLE QUE HERDA A CLASSE ABSTRATA ABSTRACTSHAPE E IMPLEMENTA O CÁLCULO DA ÁREA
package model.Entities_Herdar_CumprirContratos;

import model.Enums_Herdar_CumprirContratos.Color;

public class Rectangle extends AbstractShape {

    private Double width;  // LARGURA DO RETÂNGULO
    private Double height; // ALTURA DO RETÂNGULO

    // CONSTRUTOR QUE INICIALIZA A COR, LARGURA E ALTURA DO RETÂNGULO
    public Rectangle(Color color, Double width, Double height) {
        super(color); // CHAMA O CONSTRUTOR DA CLASSE ABSTRATA ABSTRACTSHAPE
        this.width = width;
        this.height = height;
    }

    // MÉTODOS GETTERS E SETTERS PARA ALTURA E LARGURA
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    // IMPLEMENTAÇÃO DO MÉTODO area(), QUE CALCULA A ÁREA DO RETÂNGULO (LARGURA * ALTURA)
    @Override
    public double area() {
        return width * height;
    }
}
