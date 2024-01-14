
package Bai1;

/**
 *
 * @author vudangkhoa
 */
public class Table extends Furniture {
    private final Shape shape;

    public Table(String material, double price, Shape shape) {
        super(material, price);
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }
}
