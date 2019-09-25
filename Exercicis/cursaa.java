public class cursaa {
    public static void main(String[] args) {
        String categoria;
        System.out.println("Nom");
        String nom = System.console().readLine();
        System.out.println("Edat");
        int edat = Integer.parseInt(System.console().readLine());
        System.out.println("Sexe");
        String sexe = System.console().readLine();
        
        if (edat < 16) {
            if(sexe.equalsIgnoreCase("Home")){
                categoria = "Juvenils Masculi";
            } else {
                categoria = "Juvenil Femeni";
            }
        }else if (edat < 66) {
            if(sexe.equalsIgnoreCase("H")){
                categoria = "Senior Masculi";
            } else {
                categoria = "Senior Femeni";
            }
        }
        else {
            if(sexe.equalsIgnoreCase("H")){
                categoria = "Veterà Masculi";
            } else {
                categoria = "Veterà Femeni";
            }
        }
        System.out.println(categoria);
    }
}