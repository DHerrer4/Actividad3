import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {

        //Datos
        String NombredelEstudiante;
        String ApellidodelEstudiante;
        int Edad;
        String CeduladelEstudiante;
        char sexo;
        int PisodelEdificio;
        int NumerodelApartamento;
        double peso;
        boolean EsVistante;

        //Captura de Datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        NombredelEstudiante = sc.nextLine();

        System.out.println("Ingrese el apellido del estudiante: ");
        ApellidodelEstudiante = sc.nextLine();

        System.out.println("Ingrese la cedula del estudiante: ");
        CeduladelEstudiante = sc.nextLine();

        System.out.println("Ingrese edad del estudiante: ");
        Edad = sc.nextInt();

        System.out.println("Ingrese el sexo del estudiante: ");
        sexo = sc.next().charAt(0);

        System.out.println("Ingrese el peso del estudiante (kg): ");
        peso = sc.nextDouble();

        System.out.println("Ingrese el numero de apartamento del estudiante: ");
        NumerodelApartamento = sc.nextInt();

        System.out.println("Ingrese el piso del estudiante: ");
        PisodelEdificio = sc.nextInt();

        System.out.println("Es Vistante: ");
        EsVistante = sc.nextBoolean();

        //Salida de Datos
        System.out.println("Nombre del Estudiante: " + NombredelEstudiante);
        System.out.println("Apellido del Estudiante: " + ApellidodelEstudiante);
        System.out.println("Edad del Estudiante: " + Edad);
        System.out.println("Cédula del Estudiante: " + CeduladelEstudiante);
        System.out.println("Sexo del Estudiante: " + sexo);
        System.out.println("Piso del Edificio: " + PisodelEdificio);
        System.out.println("Número del Apartamento: " + NumerodelApartamento);
        System.out.println("Peso del Estudiante: " + peso);
        System.out.println("¿Es Visitante?: " + EsVistante);

    }
}

