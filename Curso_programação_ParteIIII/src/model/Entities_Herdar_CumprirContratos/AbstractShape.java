// CLASSE ABSTRATA ABSTRACTSHAPE QUE IMPLEMENTA A INTERFACE SHAPE E REPRESENTA UMA FORMA COM UMA COR
package model.Entities_Herdar_CumprirContratos;

import model.Enums_Herdar_CumprirContratos.Color;

public abstract class AbstractShape implements Shape {

    private Color color; // COR DA FORMA

    // CONSTRUTOR QUE INICIALIZA A COR DA FORMA
    public AbstractShape(Color color) {
        this.color = color;
    }

    // MÉTODOS GETTER E SETTER PARA A COR DA FORMA
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
