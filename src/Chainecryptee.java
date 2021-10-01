public class Chainecryptee {
    
    String chainecryptee;
    int decalage;

    public static Chainecryptee deCryptee(String yo, int aye) {
        return new Chainecryptee (yo, aye);
    }
    public static Chainecryptee deEnClair(String oy, int eya) {
        return new Chainecryptee (crypte(oy, eya), eya);
    }
    private Chainecryptee(String yo, int aye) {
        chainecryptee = yo;
        decalage = aye;
    }

    /**
     * Donne la chaine en clair.
     *
     * @return un String la chaine en clair
     */
    String decrypte() {
        StringBuilder temp = new StringBuilder(chainecryptee);
        for (int i=0; i<chainecryptee.length(); i++)
            temp.setCharAt(i, decaleCaractere(chainecryptee.charAt(i), decalage*-1));
        return temp.toString();
    }

    /**
     * Décale un caractère majuscule.
     * Les lettres en majuscule ('A' - 'Z') sont décalées de <code>decalage</code>
     * caractères de façon circulaire. Les autres caractères ne sont pas modifiés.
     *
     * @param c le caractère à décaler
     * @param decalage le décalage à appliquer
     * @return le caractère décalé
     */
    private static char decaleCaractere(char c, int decalage) {
        return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
    }

    /**
     * Donne la chaine cryptee à l'aide du decalage.
     *
     * @param chaineacrypter la chaine en clair a crypter
     * @param decal le décalage à appliquer
     * @return un String de la chaine cryptee
     */
    private static String crypte(String chaineacrypter, int decal) {
        StringBuilder temp = new StringBuilder(chaineacrypter);
        for (int i=0; i<chaineacrypter.length(); i++)
            temp.setCharAt(i, decaleCaractere(chaineacrypter.charAt(i), decal));
        return temp.toString();
    }
}