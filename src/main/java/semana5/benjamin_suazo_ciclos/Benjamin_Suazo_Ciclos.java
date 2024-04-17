package semana5.benjamin_suazo_ciclos;

import java.util.Scanner;

public class Benjamin_Suazo_Ciclos {

    public static void main(String[] args) {
        int opcion;
        boolean salir = false;
        Scanner Leer = new Scanner(System.in);
        ciclos c = new ciclos();
        while (!salir) {
            System.out.println("1.- calcular la cantidad de metros kilometros y centimetros que hay en una medida dada en CM");
            System.out.println("2.- imprimir los numeros del 1 al 10");
            System.out.println("3.- La suma de los numeros de 1 a 10");
            System.out.println("4.- Verificar si un numero es par o impar");
            System.out.println("5.- El promedio de 30 numeros");
            System.out.println("6.- Numeros del 1 al 20 que son pares");
            System.out.println("7.- Suma de numeros impares del 1 al 400");
            System.out.println("8.- Area de un circulo");
            System.out.println("9.- Perimetro de un circulo");
            System.out.println("10.- Area de un rectangulo");
            System.out.println("11.- Volumen de una esfera");
            System.out.println("12.- Area y perimetro de un cubo");
            System.out.println("13.- Numeros de 1 al 100, saltando los multiplos de 3");
            System.out.println("14.- Numeros de 1 al 100, saltando los multiplos de 5");
            System.out.println("15.- Numeros de 1 al 100, saltando los multiplos de 3 y 5");
            System.out.println("16.- Numeros de 1 al 100, cambiando por cuek los multiplos de 3");
            System.out.println("17.- Calcular factorial");
            System.out.println("18.- contar digitos");
            System.out.println("19.- Area y perimetro de un cuadrado");
            System.out.println("20.- potencia");
            System.out.println("21.- Salir");
            System.out.println("Ingrese la opcion que desea ejecutar: ");
            opcion = Leer.nextInt();
            switch (opcion) {
                case 1:
                    c.Ciclo1();
                    break;
                case 2:
                    c.Ciclo2();
                    break;
                case 3:
                    c.Ciclo3();
                    break;
                case 4:
                    c.Ciclo4();
                    break;
                case 5:
                    c.Ciclo5();
                case 6:
                    c.Ciclo6();
                    break;
                case 7:
                    c.Ciclo7();
                case 8:
                    c.Ciclo8();
                    break;
                case 9:
                    c.Ciclo9();
                    break;
                case 10:
                    c.Ciclo10();
                    break;
                case 11:
                    c.Ciclo11();
                    break;
                case 12:
                    c.Ciclo12();
                    break;
                case 13:
                    c.Ciclo13();
                    break;
                case 14:
                    c.Ciclo14();
                    break;
                case 15:
                    c.Ciclo15();
                    break;
                case 16:
                    c.Ciclo16();
                    break;
                case 17:
                    c.Ciclo17();
                    break;
                case 18:
                    c.Ciclo18();
                    break;
                case 19:
                    c.Ciclo19();
                    break;
                case 20:
                    c.Ciclo20();
                    break;
                case 21:
                    salir=true;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }
}
