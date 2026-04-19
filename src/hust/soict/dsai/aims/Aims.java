package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Aims {
    public static void main(String[] args) {

        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "John Musker", 90, 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println("Total cost is: " + anOrder.totalCost());

      

        System.out.println("Total cost after removal: " + anOrder.totalCost());
        System.out.println("DVD1 ID: " + dvd1.getId());
        System.out.println("DVD2 ID: " + dvd2.getId());
        System.out.println("DVD3 ID: " + dvd3.getId());
    }
}