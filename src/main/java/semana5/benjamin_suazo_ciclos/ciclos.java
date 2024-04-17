/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5.benjamin_suazo_ciclos;

import java.util.Scanner;

/**
 *
 * @author benja
 */
public class ciclos {

    public void Ciclo1() {
        Scanner Leer = new Scanner(System.in);
        int n = 1;
        int medida, km = 0, m = 0, cm;
        while (n == 1) {
            System.out.println("Ingrese la medida en centimetros: ");
            medida = Leer.nextInt();
            while (medida >= 100000) {
                medida -= 100000;
                km++;
            }
            while (medida >= 100) {
                medida -= 100;
                m++;
            }
            cm = medida;
            System.out.println("La cantidad de kilometros es: " + km);
            System.out.println("La cantidad de metros es: " + m);
            System.out.println("La cantidad de centimetros es: " + cm);
            System.out.println("Ingrese [1] si quiere calcular la medida. Si desea salir presione otro numero ");
            n = Leer.nextInt();
        }
    }

    public void Ciclo2() {
        int n = 1;
        while (n <= 10) {
            System.out.println("Numero: " + (n));
            n++;
        }
    }

    public void Ciclo3() {
        int n = 1, suma = 0;
        while (n <= 10) {
            suma = suma + n;
            n++;
        }
        System.out.println("La suma de los diez numeros es: " + suma);
    }

    public void Ciclo4() {
        String n = "";
        int num;
        Scanner Leer = new Scanner(System.in);
        while (!n.equals("N") && !n.equals("No")) {
            System.out.println("Ingrese numero a verificar: ");
            num = Leer.nextInt();
            if (num % 2 == 0) {
                System.out.println("El numero " + num + " es par");
            } else {
                System.out.println("El numero " + num + " es impar");
            }
            System.out.println("Si no desea comprobar otro numero porfavor ingrese N o No. De lo contrario presione cualquier tecla");
            n = Leer.next();
        }
    }

    public void Ciclo5() {
        int n, acum = 0;
        double num, sum = 0, prom;
        Scanner Leer = new Scanner(System.in);
        for (n = 1; n <= 30; n++) {
            System.out.println("Ingrese numero para calcular el promedio");
            num = Leer.nextInt();
            sum = num + sum;
            acum++;
        }
        prom = sum / acum;
        System.out.println("El promedio de los 30 numeros es: " + prom);
    }

    public void Ciclo6() {
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println("El numero " + i + " es par");
            }
            i++;
        }
    }

    public void Ciclo7() {
        int i = 1, sum = 0;
        while (i <= 400) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("La suma de los numeros impares del 1 al 400 es: " + sum);
    }

    public void Ciclo8() {
        int i = 1;
        Scanner Leer = new Scanner(System.in);
        while (i == 1) {
            double area, r;
            System.out.println("Ingrese el radio del circulo: ");
            r = Double.parseDouble(Leer.nextLine());
            if (r <= 0) {
                System.out.println("Ingrese un numero positivo!!!");
                continue;
            }
            area = Math.PI * r * r;
            System.out.println("El area del circulo de radio " + r + " es: " + area);
            System.out.println("Para calcular otra area ingrese [1]. De lo contrario presione cualquie tecla");
            i = Leer.nextInt();
        }
    }

    public void Ciclo9() {
        Scanner Leer = new Scanner(System.in);
        int i = 1;
        while (i == 1) {
            double d, per;
            System.out.println("Ingrese el diametro del circulo: ");
            d = Double.parseDouble(Leer.nextLine());
            if (d <= 0) {
                System.out.println("Ingrese un numero positivo!!!");
                continue;
            }
            per = Math.PI * d;
            System.out.println("El area del circulo de diametro" + d + " es: " + per);
            System.out.println("Para calcular otra area ingrese [1]. De lo contrario presione cualquie tecla");
            i = Leer.nextInt();
        }
    }

    public void Ciclo10() {
        Scanner Leer = new Scanner(System.in);
        int i = 1;
        while (i == 1) {
            double L, A, area;
            System.out.println("Ingrese largo del rectangulo");
            L = Double.parseDouble(Leer.nextLine());
            if (L <= 0) {
                System.out.println("Ingrese un numero positivo");
                continue;
            }
            System.out.println("Ingrese ancho del rectangulo");
            A = Double.parseDouble(Leer.nextLine());
            if (A <= 0) {
                System.out.println("Ingrese un numero positivo");
                continue;
            }
            area = L * A;
            System.out.println("El area del rectangulo de largo " + L + " y ancho " + A + " es: " + area);
            System.out.println("Si desea calcular otra area ingrese [1]. De lo contrario presione otra tecla");
            i = Leer.nextInt();
        }
    }

    public void Ciclo11() {
        Scanner Leer = new Scanner(System.in);
        int i = 1;
        while (i == 1) {
            double volumen, r;
            System.out.println("Ingrese valor del radio de la esfera");
            r = Double.parseDouble(Leer.nextLine());
            if (r <= 0) {
                System.out.println("Ingrese un valor positivo");
                continue;
            }
            volumen = (4 / 3 * Math.PI * r * r * r);
            System.out.println("El volumen de la esfera de radio " + r + " es: " + volumen);
            System.out.println("Si desea calcular otro volumen ingrese [1]. De lo contrario presione otra tecla");
            i = Leer.nextInt();
        }
    }

    public void Ciclo12() {
        Scanner Leer = new Scanner(System.in);
        int i = 1;
        while (i == 1) {
            double lado, area, peri;
            System.out.println("Ingrese el valor del lado del cubo");
            lado = Double.parseDouble(Leer.nextLine());
            if (lado <= 0) {
                System.out.println("Ingrese un valor positivo");
                continue;
            }
            area = lado * lado * lado;
            peri = 12 * lado;
            System.out.println("El perimetro del cubo de lado " + lado + " es: " + peri);
            System.out.println("EL area del cubo de lado " + lado + " es: " + area);
            System.out.println("Si desea calcular otra area y perimetro ingrese [1]. De lo contrario presione otra tecla");
            i = Leer.nextInt();
        }

    }

    public void Ciclo13() {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                System.out.println("El numero " + i + " no es multiplo de 3");
            }
        }
    }

    public void Ciclo14() {
        int i = 1;
        while (i <= 100) {
            if (i % 5 != 0) {
                System.out.println("El numero " + i + " no es multiplo de 5");
            }
            i++;
        }
    }

    public void Ciclo15() {
        int i = 1;
        while (i <= 100) {
            if (i % 5 != 0 && i % 3 != 0) {
                System.out.println("El numero " + i + " no es multiplo de 3 ni de 5");
            }
            i++;
        }
    }

    public void Ciclo16() {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("cuek");
            } else {
                System.out.println("Numero: " + i);
            }
        }
    }

    public void Ciclo17() {
        Scanner Leer = new Scanner(System.in);
        int factorial = 1, num, i = 1;
        while (i == 1) {
            System.out.println("Ingrese el factorial que quiere calcular");
            num = Leer.nextInt();
            for (int a = 1; a <= num; a++) {
                factorial *= a;
            }
            System.out.println("EL resultado del factorial de " + num + " es: " + factorial);
            System.out.println("Si desea calcular otro factorial presione [1]. De lo contrario presione otra tecla");
            i = Leer.nextInt();
        }
    }

    public void Ciclo18() {
        Scanner Leer = new Scanner(System.in);
        int i = 1, num;
        while (i == 1) {
            int c = 0;
            System.out.println("Ingrese numero para contar sus digitos");
            num = Leer.nextInt();
            while (num != 0) {
                num /= 10;
                c++;
            }
            System.out.println("La cantidad de digitos que tiene el numero es: " + c);
            System.out.println("Si desea contar los digitos de otro numero presione [1]. De lo contrario presione otra tecla");
            i = Leer.nextInt();
        }
    }

    public void Ciclo19() {
        Scanner Leer = new Scanner(System.in);
        int i = 1;
        double lado, area, peri;
        while (i == 1) {
            System.out.println("Ingrese el valor del lado del cubo");
            lado = Double.parseDouble(Leer.nextLine());
            if (lado <= 0) {
                System.out.println("Ingrese un valor positivo");
                continue;
            }
            area = lado * lado;
            peri = 4 * lado;
            System.out.println("El perimetro del cubo de lado " + lado + " es: " + peri);
            System.out.println("EL area del cubo de lado " + lado + " es: " + area);
            System.out.println("Si desea calcular otra area y perimetro ingrese [1]. De lo contrario presione otra tecla");
            i = Leer.nextInt();
        }
    }

    public void Ciclo20() {
        Scanner Leer = new Scanner(System.in);
        int i = 1;
        while (i == 1) {
            int resultado = 1;
            int contador = 0;
            System.out.print("Ingrese la base: ");
            int base = Leer.nextInt();
            System.out.print("Ingrese el exponente: ");
            int exponente = Leer.nextInt();

            if (base <= 0 || exponente < 0) {
                System.out.println("Ambos valores deben ser positivos.");
                continue;
            }
            while (contador < exponente) {
                resultado *= base;
                contador++;
                System.out.println(base + " elevado a " + exponente + " es: " + resultado);
            }
            System.out.println("Si desea realizar otra potencia presione [1]. De lo contrario presione otra tecla");
            i = Leer.nextInt();
        }
    }
}
