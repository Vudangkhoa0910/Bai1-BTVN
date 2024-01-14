
package Bai1;

/**
 *
 * @author vudangkhoa
 */

class Chair extends Furniture {
    private int numOfLegs;

    public Chair(String material, double price, int numOfLegs) {
        super(material, price);
        this.numOfLegs = numOfLegs;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }
}

