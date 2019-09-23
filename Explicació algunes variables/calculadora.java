public class calculadora {
    public static void main(String[] args) {
        float v1;
        float v2;

        System.out.println("Introdueix el primer numero!");
        //PER DEMANAR COSES PER CONSOLA HO FAREM AMB:   System.console().readLine()   
        //FEM SERVIR UN parseFloat DEGUT A QUE LES VARIABLES QUE ÉS DEMANEN PER CONSOLA AL PRINCIPI SON STRINGS
        v1 = Float.parseFloat(System.console().readLine());
        System.out.println("Introdueix el segon numero!");
        v2 = Float.parseFloat(System.console().readLine());

        System.out.println("La divisió del numero " + v1 + " i el numero " + v2 + " és " + (v1 / v2));

        System.out.println("La multiplicació del numero " + v1 + " i el numero " + v2 + " és " + (v1 * v2));

        System.out.println("La resta del numero " + v1 + " i el numero " + v2 + " és " + (v1 - v2));

        System.out.println("La suma del numero " + v1 + " i el numero " + v2 + " és " + (v1 + v2));
    }
}