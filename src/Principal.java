import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();
        System.out.println("Ingrese valor");
        double valor = sc.nextDouble();
        sc.nextLine();
        while(true){
            System.out.println("*******************");
            System.out.println("Ingrese la opción que desee");
            System.out.println("1. USD to COP");
            System.out.println("2. COP to USD");
            System.out.println("3. USD to ARS");
            System.out.println("4. ARS to USD");
            System.out.println("5. USD to BRL");
            System.out.println("6. BRL to USD");
            System.out.println("0. Salir");
            System.out.println("*******************");
            String option = sc.nextLine();
            switch (option){
                case "1":
                    try{
                        MonedaAPI moneda = consulta.buscaMoneda("USD");
                        String rate = moneda.calcularConversion(valor, "COP");
                        System.out.println(rate);

                    }catch(Exception e){
                        System.out.println("Error al buscar moneda. "+ e.getMessage());
                    }
                    break;
                case "2":
                    try{
                        MonedaAPI moneda = consulta.buscaMoneda("COP");
                        String rate = moneda.calcularConversion(valor, "USD");
                        System.out.println(rate);

                    }catch(Exception e){
                        System.out.println("Error al buscar moneda. "+ e.getMessage());
                    }
                    break;
                case "3":
                    try{
                        MonedaAPI moneda = consulta.buscaMoneda("USD");
                        String rate = moneda.calcularConversion(valor, "ARS");
                        System.out.println(rate);

                    }catch(Exception e){
                        System.out.println("Error al buscar moneda. "+ e.getMessage());
                    }
                    break;
                case "4":
                    try{
                        MonedaAPI moneda = consulta.buscaMoneda("ARS");
                        String rate = moneda.calcularConversion(valor, "USD");
                        System.out.println(rate);

                    }catch(Exception e){
                        System.out.println("Error al buscar moneda. "+ e.getMessage());
                    }
                    break;
                case "5":
                    try{
                        MonedaAPI moneda = consulta.buscaMoneda("USD");
                        String rate = moneda.calcularConversion(valor, "BRL");
                        System.out.println(rate);

                    }catch(Exception e){
                        System.out.println("Error al buscar moneda. "+ e.getMessage());
                    }
                    break;
                case "6":
                    try{
                        MonedaAPI moneda = consulta.buscaMoneda("BRL");
                        String rate = moneda.calcularConversion(valor, "USD");
                        System.out.println(rate);

                    }catch(Exception e){
                        System.out.println("Error al buscar moneda. "+ e.getMessage());
                    }
                    break;
                case "0":
                    System.out.println("Saliendo del sistema, presione enter");
                    return;
                default:
                    System.out.println("Opción no valida, presione enter");
                    new java.util.Scanner(System.in).nextLine();
            }
        }

    }
}
