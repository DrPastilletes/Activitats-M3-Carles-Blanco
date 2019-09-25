public class massa {
    public static void main(String[] args) {
        System.out.println("Introdueix la teva alçada");
        float alt = Float.parseFloat(System.console().readLine());
        System.out.println("Introdueix el teu pes");
        int dos = 2;
        float altQuadrat = (float) Math.pow(alt, dos);
        float pes = Float.parseFloat(System.console().readLine());
        float imc = pes / altQuadrat;
        System.out.println("El teu index de massa corporal és " + imc + ".");
       
        if (imc <= 18.5) {
            System.out.println("Ep! Estas molt prim");
        } else if (imc <= 24.9) {
            System.out.println("El teu pes és saludable, segueix així :D");
        } else if (imc <= 29.9) {
            System.out.println("Ep! Tens sobrepes, hauries de vigilar la teva dieta");
        } else {
            System.out.println("Tens obesitat, hauries de anar al metge i començar a fer exercici");
        }
    }
}