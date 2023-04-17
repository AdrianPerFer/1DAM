import java.sql.*;
import alumnos.Alumno;
import alumnos.AlumnosService;
import alumnos.Grupo;
import alumnos.GruposService;
import alumnos.MatriculacionService;
import connection.ConnectionPool;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Configuración de la conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/alumnos";
        String usuario = "adrian";
        String clave = "Gachapon13.";
        int id = 0;
        String name = "";
        String surname = "";
        String profesor = "";
        int grupo_id = 0;
        int opcion = 0;
        ConnectionPool pool = new ConnectionPool(url, usuario, clave);
        try {
            // Conexión a la base de datos
            AlumnosService service_alumnos = new AlumnosService(pool.getConnection());
            GruposService service_grupos = new GruposService(pool.getConnection());
            MatriculacionService service_matriculacion = new MatriculacionService(pool.getConnection());
            do {
                System.out.println();
                System.out.println("******************************");
                System.out.println("PARA LOS ALUMNOS");
                System.out.println("1. SELECT");
                System.out.println("2. CREATE");
                System.out.println("3. UPDATE");
                System.out.println("4. DELETE");
                System.out.println("******************************");
                System.out.println("PARA LOS GRUPOS");
                System.out.println("5. SELECT");
                System.out.println("6. CREATE");
                System.out.println("7. UPDATE");
                System.out.println("8. DELETE");
                System.out.println("******************************");
                System.out.println("MATRICULACION");
                System.out.println("9. MATRICULACION ALUMNADO");
                System.out.println("******************************");
                System.out.println("0. SALIR");
                System.out.println("******************************");

                System.out.print("Introduzca una opción: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                    for (Alumno al : service_alumnos.requestAll()) {
                        System.out.println(al);
                    }
                    break;
                    case 2:
                        System.out.print("Introduzca el nombre del alumno: ");
                        name = sc.nextLine();
                        System.out.print("Introduzca el apellido del alumno: ");
                        surname = sc.nextLine();
                        for (Grupo gr : service_grupos.requestAll()) {
                            System.out.println(gr);
                        }
                        System.out.println("ID: 0, sin asignacion");
                        System.out.print("Grupo (ID): ");
                        grupo_id = Integer.parseInt(sc.nextLine());
                        service_alumnos.create(name, surname, grupo_id);
                    break;
                    case 3:
                        for (Alumno al : service_alumnos.requestAll()) {
                            System.out.println(al);
                        }
                        System.out.print("Introduzca la ID del alumno que quiere actualizar: ");
                        id = Integer.parseInt(sc.nextLine());
                        /*System.out.print("ID nuevo: ");
                        id_nuevo = Integer.parseInt(sc.nextLine());*/
                        System.out.print("Nombre: ");
                        name = sc.nextLine();
                        System.out.print("Apellido: ");
                        surname = sc.nextLine();
                        service_alumnos.update(id ,name, surname);
                    break;
                    case 4:
                        for (Alumno al : service_alumnos.requestAll()) {
                            System.out.println(al);
                        }
                        System.out.print("Introduzca la id del alumno que quiera borrar: ");
                        id = Integer.parseInt(sc.nextLine());
                        service_alumnos.delete(id);
                    break;  
                    case 5:
                    for (Grupo gr : service_grupos.requestAll()) {
                        System.out.println(gr);
                    }
                    break;
                    case 6:
                        for (Grupo gr : service_grupos.requestAll()) {
                            System.out.println(gr);
                        }
                        System.out.print("Introduzca el nombre del grupo: ");
                        name = sc.nextLine();
                        System.out.print("Introduzca el profesor del grupo: ");
                        profesor = sc.nextLine();
                        service_grupos.create(id, name, profesor);
                    break;
                    case 7:
                        for (Grupo gr : service_grupos.requestAll()) {
                            System.out.println(gr);
                        }
                        System.out.print("Introduzca la ID del grupo a actualizar: ");
                        id = Integer.parseInt(sc.nextLine());
                        System.out.print("Nombre: ");
                        name = sc.nextLine();
                        System.out.print("Profesor: ");
                        profesor = sc.nextLine();
                        service_grupos.update(id, name, profesor);
                    break;
                    case 8:
                        for (Grupo gr : service_grupos.requestAll()) {
                            System.out.println(gr);
                        }
                        System.out.print("Introduzca la id del grupo que quiera borrar: ");
                        id = Integer.parseInt(sc.nextLine());
                        service_grupos.delete(id);
                    break;  
                    case 9:
                        for (Alumno al : service_alumnos.requestAll()) {
                            System.out.println(al);
                        }
                        System.out.print("Introduzca la id del alumno que desea cambiar: ");
                        id = Integer.parseInt(sc.nextLine());
                        for (Grupo gr : service_grupos.requestAll()) {
                            System.out.println(gr);
                        }
                        System.out.print("Introduzca la id del grupo que desea establecer (0 para no asignar): ");
                        grupo_id = Integer.parseInt(sc.nextLine());
                        service_matriculacion.update(id, grupo_id);
                    break;  
                    default:
                        break;
                }
            } while (opcion != 0 );
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Hasta luego crack");
            sc.close();
            pool.closeAll();
        }
    }
}


