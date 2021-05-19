package primitivos;

public class PrincipalTiposPrimitivos {
    public static void main(String[] args) {
        /* Tipos primitivos en Java

        Para declarar un tipo primitivo la sintaxis es la siguiente:
        [tipo primitivo] + [nombre];

        Para inicializarlo le asignamos un valor:
        [nombre] = [valor];

        También podemos declarar e inicializar en un solo paso:
        [tipo primitivo] + [nombre] = [valor];

        */

        // byte
        byte b = -122;
        System.out.println(b);

        // short
        short cantidadDePueblosDeCordoba = 13764;
        System.out.println(cantidadDePueblosDeCordoba);

        // int
        int cantidadDeArticulos; // declaración de variable
        cantidadDeArticulos = 13465; // inicialización una variable

        int cantidadDeArticulosVendidos = 45; // declaración e inicialización en un solo paso

        System.out.println(cantidadDeArticulos);
        System.out.println(cantidadDeArticulosVendidos);

        // long
        long cantidadDeHabitantesEnArgentina = 47000000;
        System.out.println(cantidadDeHabitantesEnArgentina);

        // float
        float distanciaEntreBuenosAiresYCordobaEnKilometros = 699.45f;
        System.out.println(distanciaEntreBuenosAiresYCordobaEnKilometros);

        // double
        double pesoDeUnAutomovilPromedio = 2987.4765;
        System.out.println(pesoDeUnAutomovilPromedio);

        // char
        char primeraLetraDelAlfabetoEnMayúscula = 'A';
        System.out.println(primeraLetraDelAlfabetoEnMayúscula);

        // boolean
        boolean esCovidPositivo = true;
        System.out.println(esCovidPositivo);
    }
}
