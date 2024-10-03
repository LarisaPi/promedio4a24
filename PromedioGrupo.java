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
    public static void main(String[] args) throws IOException {
        int n; //tamaño del grupo
       
        // double[] calificaciones; //Calificaciones de cada alumno
        // double suma = 0; // para sumar calificaciones
        // double promedio; // el promedio del grupo

       

        System.out.println("Programa que calcula el promedio de un grupo");
        System.out.println("----------------------------------------------");
        //Recuperando el tamaño del grupo
        System.out.println("Escribe el numero de alumnos de un grupo: ");
        entrada = bufer.readLine(); //Lectura del teclado
        n = Integer.parseInt(entrada); //Conversion de string a int

        //Contruir el arreglo alumnos
        alumnos = new Alumnos[n];

        // calificaciones = new double[n]; //Construccion del arreglo
        // Pedir calificacion y acumularla
        // for( int i = 0;i < calificaciones.length;i++){
        // //     System.out.println("Escribe la calificacion del estudiante[ "+ (i+1)+ "]");
        // //     entrada = bufer.readLine();
        // //     calificaciones [i] = Double.parseDouble(entrada);
        // //     suma += calificaciones[i];
        // // }
        //Obtener el promedio
        // promedio = suma /n;
        // System.out.println("----------------------------------------");
        // System.out.println("Las calificaciones de cada alumno son: ");
        // for( double calif : calificaciones){
        //     System.out.println(calif);
        // System.out.println("----------------------------------------"); 
        // System.out.println("El promedio de grupo es: " + promedio); 
        // }
        
    }
}