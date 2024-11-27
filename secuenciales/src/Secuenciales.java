import java.util.Scanner;

public class Secuenciales {

    public static void main(String[] args) {

        System.out.println("Ejercicio 1: Generador de Horóscopo");
        generarHoroscopo();

        System.out.println("\nEjercicio 2: Calculadora de Calorías Quemadas");
        calcularCalorias();

        System.out.println("\nEjercicio 3: Generador de Rutinas de Ejercicio");
        generarRutina();

        System.out.println("\nEjercicio 4: Generador de Listas de Reproducción");
        generarPlaylist();

        System.out.println("\nEjercicio 5: Calculadora de Costo de Viaje");
        calcularCostoViaje();

        System.out.println("\nEjercicio 6: Generador de Planes de Estudio");
        generarPlanEstudio();

        System.out.println("\nEjercicio 7: Calculadora de Índice de Felicidad");
        calcularFelicidad();
    }

    // Ejercicio 1: Generador de Horóscopo
    public static void generarHoroscopo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu fecha de nacimiento (DD/MM/AAAA): ");
        String fecha = scanner.nextLine();
        int mes = Integer.parseInt(fecha.split("/")[1]);
        int dia = Integer.parseInt(fecha.split("/")[0]);

        String signo = "";

        // Aries: 21 Marzo - 19 Abril
        if (mes == 3 && dia >= 21 || mes == 4 && dia <= 19) {
            signo = "Aries";
        }
        // Tauro: 20 Abril - 20 Mayo
        else if (mes == 4 && dia >= 20 || mes == 5 && dia <= 20) {
            signo = "Tauro";
        }
        // Géminis: 21 Mayo - 20 Junio
        else if (mes == 5 && dia >= 21 || mes == 6 && dia <= 20) {
            signo = "Géminis";
        }
        // Cáncer: 21 Junio - 22 Julio
        else if (mes == 6 && dia >= 21 || mes == 7 && dia <= 22) {
            signo = "Cáncer";
        }
        // Leo: 23 Julio - 22 Agosto
        else if (mes == 7 && dia >= 23 || mes == 8 && dia <= 22) {
            signo = "Leo";
        }
        // Virgo: 23 Agosto - 22 Septiembre
        else if (mes == 8 && dia >= 23 || mes == 9 && dia <= 22) {
            signo = "Virgo";
        }
        // Libra: 23 Septiembre - 22 Octubre
        else if (mes == 9 && dia >= 23 || mes == 10 && dia <= 22) {
            signo = "Libra";
        }
        // Escorpio: 23 Octubre - 21 Noviembre
        else if (mes == 10 && dia >= 23 || mes == 11 && dia <= 21) {
            signo = "Escorpio";
        }
        // Sagitario: 22 Noviembre - 21 Diciembre
        else if (mes == 11 && dia >= 22 || mes == 12 && dia <= 21) {
            signo = "Sagitario";
        }
        // Capricornio: 22 Diciembre - 19 Enero
        else if (mes == 12 && dia >= 22 || mes == 1 && dia <= 19) {
            signo = "Capricornio";
        }
        // Acuario: 20 Enero - 18 Febrero
        else if (mes == 1 && dia >= 20 || mes == 2 && dia <= 18) {
            signo = "Acuario";
        }
        // Piscis: 19 Febrero - 20 Marzo
        else if (mes == 2 && dia >= 19 || mes == 3 && dia <= 20) {
            signo = "Piscis";
        }

        System.out.println("Tu signo es: " + signo);
        System.out.println("¡Hoy será un gran día para ti!");
    }

    // Ejercicio 2: Calculadora de Calorías Quemadas
    public static void calcularCalorias() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = scanner.nextDouble();
        System.out.print("Introduce la duración del ejercicio en minutos: ");
        int duracion = scanner.nextInt();
        System.out.print("Introduce el tipo de ejercicio (correr, nadar, bicicleta): ");
        String ejercicio = scanner.next();
        double caloriasQuemadas = 0;

        switch (ejercicio.toLowerCase()) {
            case "correr":
                caloriasQuemadas = peso * 0.063 * duracion;
                break;
            case "nadar":
                caloriasQuemadas = peso * 0.050 * duracion;
                break;
            case "bicicleta":
                caloriasQuemadas = peso * 0.045 * duracion;
                break;
            default:
                System.out.println("Tipo de ejercicio no válido.");
                return;
        }
        System.out.println("Calorías quemadas: " + caloriasQuemadas);
    }

    // Ejercicio 3: Generador de Rutinas de Ejercicio
    public static void generarRutina() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nivel de condición física (principiante, intermedio, avanzado): ");
        String nivel = scanner.next().toLowerCase();
        switch (nivel) {
            case "principiante":
                System.out.println("Rutina semanal:");
                System.out.println("Lunes: 30 minutos de caminata");
                System.out.println("Miércoles: 30 minutos de bicicleta");
                System.out.println("Viernes: 20 minutos de natación");
                break;
            case "intermedio":
                System.out.println("Rutina semanal:");
                System.out.println("Lunes: 45 minutos de correr");
                System.out.println("Miércoles: 45 minutos de bicicleta");
                System.out.println("Viernes: 40 minutos de natación");
                break;
            case "avanzado":
                System.out.println("Rutina semanal:");
                System.out.println("Lunes: 60 minutos de correr");
                System.out.println("Miércoles: 60 minutos de bicicleta");
                System.out.println("Viernes: 50 minutos de natación");
                break;
            default:
                System.out.println("Nivel no válido.");
                break;
        }
    }

    // Ejercicio 4: Generador de Listas de Reproducción
    public static void generarPlaylist() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu estado de ánimo (feliz, triste, enérgico, relajado): ");
        String estado = scanner.next().toLowerCase();
        switch (estado) {
            case "feliz":
                System.out.println("Lista de reproducción: ¡Vamos a celebrar!");
                System.out.println("1. Happy - Pharrell Williams");
                System.out.println("2. Uptown Funk - Mark Ronson");
                break;
            case "triste":
                System.out.println("Lista de reproducción: Relájate y reflexiona.");
                System.out.println("1. Someone Like You - Adele");
                System.out.println("2. The Night We Met - Lord Huron");
                break;
            case "enérgico":
                System.out.println("Lista de reproducción: ¡A moverse!");
                System.out.println("1. Eye of the Tiger - Survivor");
                System.out.println("2. Can't Stop the Feeling - Justin Timberlake");
                break;
            case "relajado":
                System.out.println("Lista de reproducción: Relájate y disfruta.");
                System.out.println("1. Weightless - Marconi Union");
                System.out.println("2. Sunflower - Post Malone & Swae Lee");
                break;
            default:
                System.out.println("Estado no válido.");
                break;
        }
    }

    // Ejercicio 5: Calculadora de Costo de Viaje
    public static void calcularCostoViaje() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();
        System.out.print("Introduce el consumo de combustible en litros por kilómetro: ");
        double consumo = scanner.nextDouble();
        System.out.print("Introduce el precio del combustible por litro: ");
        double precio = scanner.nextDouble();
        double costoTotal = distancia * consumo * precio;
        System.out.println("El costo total del viaje es: " + costoTotal);
    }

    // Ejercicio 6: Generador de Planes de Estudio
    public static void generarPlanEstudio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas horas al día puedes estudiar? ");
        int horasPorDia = scanner.nextInt();
        int horasTotales = horasPorDia * 7; // Total horas por semana
        System.out.println("Plan de estudio semanal:");
        System.out.println("Lunes: " + (horasTotales / 7) + " horas de Matemáticas");
        System.out.println("Martes: " + (horasTotales / 7) + " horas de Ciencias");
        System.out.println("Miércoles: " + (horasTotales / 7) + " horas de Historia");
        System.out.println("Jueves: " + (horasTotales / 7) + " horas de Lengua");
        System.out.println("Viernes: " + (horasTotales / 7) + " horas de Inglés");
    }

    // Ejercicio 7: Calculadora de Índice de Felicidad
    public static void calcularFelicidad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nivel de satisfacción con la vida (1-10): ");
        int satisfaccion = scanner.nextInt();
        System.out.print("Introduce tu nivel de estrés (1-10): ");
        int estres = scanner.nextInt();
        int felicidad = satisfaccion - estres;
        System.out.println("Tu índice de felicidad es: " + felicidad);
    }
}
