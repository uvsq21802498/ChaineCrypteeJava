public class main {

    public static void main(String[] args) {
            Chainecryptee street1 = Chainecryptee.deCryptee("MCCTKU",2);
            Chainecryptee street2 = Chainecryptee.deEnClair("KAARIS",2);
            System.out.println("Chaine cryptee 1 : " + street1.chainecryptee);
            System.out.println("Decalage chaine 1 : " + street1.decalage);
            System.out.println("Chaine cryptee 2 : " + street2.chainecryptee);
            System.out.println("Decalage chaine 2 : " + street2.decalage);
        }
    
}
