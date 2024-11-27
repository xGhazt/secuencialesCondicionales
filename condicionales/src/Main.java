import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ejercicio 1: Sistema de Recomendación de Películas");
        recomendarPelicula();

        System.out.println("\nEjercicio 2: Calculadora de Descuentos");
        calcularDescuento();

        System.out.println("\nEjercicio 3: Sistema de Recomendación de Libros");
        recomendarLibro();

        System.out.println("\nEjercicio 4: Calculadora de IMC con Recomendaciones");
        calcularIMC();

        System.out.println("\nEjercicio 5: Juego de Piedra, Papel o Tijera");
        jugarPiedraPapelTijera();

        System.out.println("\nEjercicio 6: Evaluador de Hábitos Saludables");
        evaluarHabitos();

        System.out.println("\nEjercicio 7: Sistema de Recomendación de Actividades");
        recomendarActividad();
    }

    // Ejercicio 1: Sistema de Recomendación de Películas
    public static void recomendarPelicula() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuál es tu género de película favorito? (acción, comedia, drama, ciencia ficción): ");
        String genero = scanner.next().toLowerCase();
        switch (genero) {
            case "acción":
                System.out.println("Te recomendamos ver: 'Mad Max: Fury Road'");
                break;
            case "comedia":
                System.out.println("Te recomendamos ver: 'The Hangover'");
                break;
            case "drama":
                System.out.println("Te recomendamos ver: 'The Shawshank Redemption'");
                break;
            case "ciencia ficción":
                System.out.println("Te recomendamos ver: 'Inception'");
                break;
            default:
                System.out.println("Género no válido.");
                break;
        }
    }

    // Ejercicio 2: Calculadora de Descuentos
    public static void calcularDescuento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Introduce la categoría del cliente (estudiante, adulto, jubilado): ");
        String categoria = scanner.next().toLowerCase();
        double descuento = 0;

        switch (categoria) {
            case "estudiante":
                descuento = 0.10;
                break;
            case "adulto":
                descuento = 0.05;
                break;
            case "jubilado":
                descuento = 0.15;
                break;
            default:
                System.out.println("Categoría no válida.");
                return;
        }

        double precioFinal = precio - (precio * descuento);
        System.out.println("El precio final después del descuento es: " + precioFinal);
    }

    // Ejercicio 3: Sistema de Recomendación de Libros
    public static void recomendarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuál es tu género de libro favorito? (fantasía, misterio, romance, ciencia ficción): ");
        String genero = scanner.next().toLowerCase();
        switch (genero) {
            case "fantasía":
                System.out.println("Te recomendamos leer: 'El Señor de los Anillos'");
                break;
            case "misterio":
                System.out.println("Te recomendamos leer: 'Sherlock Holmes'");
                break;
            case "romance":
                System.out.println("Te recomendamos leer: 'Orgullo y prejuicio'");
                break;
            case "ciencia ficción":
                System.out.println("Te recomendamos leer: 'Dune'");
                break;
            default:
                System.out.println("Género no válido.");
                break;
        }
    }

    // Ejercicio 4: Calculadora de IMC con Recomendaciones
    public static void calcularIMC() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = scanner.nextDouble();
        System.out.print("Introduce tu altura en metros: ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);

        System.out.println("Tu IMC es: " + imc);
        if (imc < 18.5) {
            System.out.println("Recomendación: Tienes bajo peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Recomendación: Tienes un peso normal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Recomendación: Tienes sobrepeso.");
        } else {
            System.out.println("Recomendación: Tienes obesidad.");
        }
    }

    // Ejercicio 5: Juego de Piedra, Papel o Tijera
    public static void jugarPiedraPapelTijera() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elige entre piedra, papel o tijera: ");
        String eleccionUsuario = scanner.next().toLowerCase();
        String[] opciones = {"piedra", "papel", "tijera"};
        String eleccionComputadora = opciones[(int) (Math.random() * 3)];
        System.out.println("La computadora eligió: " + eleccionComputadora);

        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("¡Es un empate!");
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }
    }

    // Ejercicio 6: Evaluador de Hábitos Saludables
    public static void evaluarHabitos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas horas al día duermes? ");
        int horasSueño = scanner.nextInt();
        System.out.print("¿Cuántas horas al día haces ejercicio? ");
        int horasEjercicio = scanner.nextInt();
        System.out.print("¿Cuántas comidas saludables consumes al día? ");
        int comidasSaludables = scanner.nextInt();

        if (horasSueño >= 7 && horasEjercicio >= 1 && comidasSaludables >= 3) {
            System.out.println("¡Tus hábitos son muy saludables!");
        } else if (horasSueño < 7 || horasEjercicio < 1 || comidasSaludables < 3) {
            System.out.println("Tus hábitos pueden mejorar. ¡Intenta dormir más, hacer ejercicio y comer más saludablemente!");
        }
    }

    // Ejercicio 7: Sistema de Recomendación de Actividades
    public static void recomendarActividad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cómo te sientes? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.next().toLowerCase();
        switch (estadoAnimo) {
            case "feliz":
                System.out.println("Te recomendamos salir a caminar por el parque.");
                break;
            case "triste":
                System.out.println("Te recomendamos ver una película de comedia.");
                break;
            case "enérgico":
                System.out.println("Te recomendamos hacer ejercicio intenso.");
                break;
            case "relajado":
                System.out.println("Te recomendamos leer un libro tranquilo.");
                break;
            default:
                System.out.println("Estado no válido.");
                break;
        }
    }
}
