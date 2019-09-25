public class descompte {
    public static void main(String[] args) {
        System.out.println("Introdueix el nom de l'article");
        String article = System.console().readLine();
        System.out.println("Introdueix el preu original (€):");
        float preu = Float.parseFloat(System.console().readLine());
        System.out.println("Introdueix el descompte a aplicar (%):");
        float des = Float.parseFloat(System.console().readLine());
        float res = preu-((des / 100)*preu);

        System.out.println(res);
    }
}