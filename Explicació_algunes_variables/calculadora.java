public class calculadora{
    public static void main(String[] args) {
        double numero1 = 4;
        double numero2 = 12;
        double resDiv = numero1/numero2;
        double resSuma = numero1+numero2;
        double resRes = numero1-numero2;
        double resMul = numero1*numero2;


        if(numero1 % 1 == 0) {
            Integer.parseInt(numero1);
        }
        else {
            numero1=double;
        }

        if(numero2 % 1 == 0) {
            Integer.parseInt(numero2);
        }
        else {
            numero2=(double)numero2;
        }

        if(resDiv % 1 == 0){
            System.out.println("La divisió del numero "+numero1+" i el numero "+numero2+" és "+(int)resDiv);
        }
        else {
            System.out.println("La divisió del numero "+numero1+" i el numero "+numero2+" és "+resDiv);
        }

        if(resMul % 1 == 0) {
            System.out.println("La multiplicació del numero "+numero1+" i el numero "+numero2+" és "+(int)resMul);
        }
        else {
            System.out.println("La multiplicació del numero "+numero1+" i el numero "+numero2+" és "+resMul);
        }
        if(resRes % 1 == 0) {
            System.out.println("La resta del numero "+numero1+" i el numero "+numero2+" és "+(int)resRes);
        }
        else {
            System.out.println("La resta del numero "+numero1+" i el numero "+numero2+" és "+resRes);
        }
        if(resSuma % 1 == 0) {
            System.out.println("La suma del numero "+numero1+" i el numero "+numero2+" és "+(int)resSuma);
        }
        else{
            System.out.println("La suma del numero "+numero1+" i el numero "+numero2+" és "+resSuma);
        }
    }
}
