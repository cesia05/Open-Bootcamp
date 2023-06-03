// Ejercicios tema 4

public class EstructurasDeControl {

    public static void main(String[] args) {
        int numero = 22;
        System.out.println("Ejecutando if");

        if(numero > 0) {
            System.out.println("El numero es positivo");
        }else if (numero < 0) {
            System.out.println("El numero es negativo");
        }else {
            System.out.println("El número es 0");
        }


        System.out.println("Ejecutando while");
        int numeroWhile =-2;

        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }


        System.out.println("Ejecutando do-while");
        do{
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);



        System.out.println("Ejecutando for");
        for( int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }


        System.out.println("Ejecutando switch");
        String estacion = "verano";

        switch (estacion){
            case "primavera":
                System.out.println("la estacion es primavera ");
                break;
            case "verano":
                System.out.println("la estacion es verano ");
                break;
            case "otoño":
                System.out.println("la estacion es otoño ");
                break;
            case "invierno":
                System.out.println("la estacion es invierno ");
                break;
            default:
                System.out.println("Ingresa una estacion valida");
        }





    }


}
