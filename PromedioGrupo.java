import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class PromedioGrupo{

    //Declarando variables globales
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada; 
    //Declaración de un arreglo de tipo TDA
     public static Alumnos[] alumnos;

     public static void leerAlumnos() throws IOException{
        String matricula, nombre;
        System.out.println("Solicitud de información de cada estudiante");
        for ( int i = 0; i < alumnos.length; i ++){
            System.out.println("-----------------------");
            System.out.println("Escribe la matricula");
            entrada = bufer.readLine();
            matricula = entrada;
            System.out.println("Escribe el nombre: ");
            entrada = bufer.readLine();
            nombre = entrada;
            //Creación de un objeto Alumno (POJO)
            Alumnos a = new Alumnos(matricula, nombre);
            System.out.println("Escribe calificación de estructuras: ");
            entrada = bufer.readLine();
            a.setEstructura(Double.parseDouble(entrada));
            System.out.println("Escribe calificación de inglés: ");
            entrada = bufer.readLine();
            a.setIngles(Double.parseDouble(entrada));
            System.out.println("Escribe calificación de iot: ");
            entrada = bufer.readLine();
            a.setIot(Double.parseDouble(entrada));
            a.setPromedio();
            //Agregando un alumno al arreglo
            alumnos[i] = a;
        }
     }
     public static void imprimirAlumnos(){
        System.out.println("Contenido del arreglo alumnos: ");
        for(Alumnos a : alumnos){
            System.out.println("---------------------------------");
            System.out.println("Información del alumnos: ");
            System.out.println(a.toString());
    }
     }
     public static double calculadoraPromedioGrupo(){
        double suma = 0;
        for(Alumnos a : alumnos){
            suma +=a.getPromedio();
        }
        return (suma / alumnos.length );
     }

    // Método para calcular el promedio de estructuras
    public static double calcularPromedioEstructuras() {
        double suma = 0;
        for (Alumnos a : alumnos) {
            suma += a.getEstructura();
        }
        return (suma / alumnos.length);
    }

    // Método para calcular el promedio de inglés
    public static double calcularPromedioIngles() {
        double suma = 0;
        for (Alumnos a : alumnos) {
            suma += a.getIngles();
        }
        return (suma / alumnos.length);
    }

    // Método para calcular el promedio de IoT
    public static double calcularPromedioIot() {
        double suma = 0;
        for (Alumnos a : alumnos) {
            suma += a.getIot();
        }
        return (suma / alumnos.length);
    }
    public static void main(String[] args) throws IOException {
        int n;
        double promedioEstructuras, promedioIngles, promedioIot;

        System.out.println("Programa que calcula el promedio de un grupo");
        System.out.println("----------------------------------------------");
        System.out.println("Escribe el número de alumnos de un grupo: ");
        entrada = bufer.readLine();
        n = Integer.parseInt(entrada);

        alumnos = new Alumnos[n];
        leerAlumnos();
        imprimirAlumnos();

        // Calcula y muestra los promedios por materia
        promedioEstructuras = calcularPromedioEstructuras();
        promedioIngles = calcularPromedioIngles();
        promedioIot = calcularPromedioIot();

        System.out.println("----------------------------------------");
        System.out.println("El promedio de estructuras es: " + promedioEstructuras);
        System.out.println("El promedio de inglés es: " + promedioIngles);
        System.out.println("El promedio de IoT es: " + promedioIot);
    }
}
