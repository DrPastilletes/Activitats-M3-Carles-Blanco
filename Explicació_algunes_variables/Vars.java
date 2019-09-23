public class Vars{
    //Escrivint main ens escriu directament la linia de abaix
    public static void main(String[] args) {
        final int DIES_SETMANA = 7;
        //Si la variable que definim és un INT vol dir que és un numero enter, i qualsevol resultat que ens doni sera un numero enter(no importa si el resultat es unº float)
        int primerValor1 = 4;
        int segonValor1 = 6;
        int resultat1;
        resultat=primerValor1/segonValor1;
        System.out.println("El resultat és: "+resultat1);
        System.out.println("El resultat és: "+(primerValor1+segonValor1));

        //Si la variable que definim és un float vol dir que el numero que definim a dintre podra ser un numero no exacte
        float primerValor = 4;
        float segonValor = 6;
        float resultat;
        resultat=primerValor/segonValor;
        //Si fem sysout ens escriu la linia d'abaix automaticament
        System.out.println("El resultat és: "+resultat);
        System.out.println("El resultat és: "+(primerValor+segonValor));
    }
    public static void main(String[] args) {
        int edat = 18;
        //Un boolean és simplement una variable que només treballa amb cert o fals
        boolean major = false;
        String salutacio = "Hauras d'esperar!";
        if(edat>=18) {
            major=true;
            salutacio="Felicitats! Ja pots conduir";
        }
    }
    public static void main(String[] args) {
        char lletra1 = "h";
        char lletra2 = "o";
        char lletra3 = "l";
        char lletra4 = "a";
        System.out.println(lletra1+lletra2+lletra3+lletra4);
    }
}