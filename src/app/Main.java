package app;

import model.*;
import util.RutInvalidoException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws RutInvalidoException {

        Guias guia = crearGuia();
        Empleados empleado = crearEmpleado();
        Clientes cliente = crearCliente();
        mostrarTitulo();
        System.out.println(guia);
        System.out.println(empleado);
        System.out.println(cliente);
    }

    private static void mostrarTitulo() {
        System.out.println("""
                ╔══════════════════════════════════════════╗
                ║           LLANQUIHUE TOUR                ║
                ║  Aventura entre volcanes y lagos del Sur ║
                ╚══════════════════════════════════════════╝
                """);
    }

    private static Guias crearGuia() throws RutInvalidoException {

        try {
            Direccion direccion = new Direccion("Cerro Navia", "salvador Gutierrez", "Metropolitana", 1234);

            Rut rut = new Rut("19.994.040-4");

            List<String> idiomas = new ArrayList<>();
            idiomas.add("Ingles");
            idiomas.add("Español");
            idiomas.add("Portugues");

            List<String> especialidades = new ArrayList<>();
            especialidades.add("Patrimonio Cultural");
            especialidades.add("Tours de aventura");
            especialidades.add("Montañismo");

            //   Guias guia = new Guias("Juanito", "");
            Guias guia = new Guias();
            guia.setNombre("Juanito");
            guia.setApellido("Perez");
            guia.setDireccion(direccion);
            guia.setRut(rut);
            guia.setEmail("juanito@hotmail.cl");
            guia.setTelefono("95678943");
            guia.setIdiomas(idiomas);
            guia.setAniosExperiencia(10);
            guia.setEspecialidades(especialidades);

            return guia;

        }catch (Exception e) {

            System.out.println("Ocurrio un error al momento de crear al guia");
            return null;
        }
    }

    private static Empleados crearEmpleado() throws RutInvalidoException {

    try {
        Direccion direccion = new Direccion("Pudahuel", "Corral", "Metropolitana", 1725);

        Rut rut = new Rut("21.337.233-5");

        Empleados empleado = new Empleados();
        empleado.setNombre("Patricia");
        empleado.setApellido("Saldivia");
        empleado.setDireccion(direccion);
        empleado.setRut(rut);
        empleado.setEmail("Patricia@hotmail.cl");
        empleado.setTelefono("956585202");
        empleado.setCargo("Jefa de cocina");
        empleado.setSueldo(999555);
        empleado.setArea("Cocina");
        empleado.setAniosServicio(8);

        return empleado;

    }catch (Exception e){

            System.out.println("Ocurrio un error al momento de crear al Empleado");
            return null;
        }

    }
    private static Clientes crearCliente() throws RutInvalidoException {

        try {
            Direccion direccion = new Direccion("Renca", "Rio de janeiro", "Metropolitana", 1015);

            Rut rut = new Rut("21.869.545-5");


            Clientes cliente = new Clientes();
            cliente.setNombre("Noa");
            cliente.setApellido("Rosales");
            cliente.setDireccion(direccion);
            cliente.setRut(rut);
            cliente.setEmail("Noa@hotmail.cl");
            cliente.setTelefono("978334431");
            cliente.setTipoCliente("PREMIUM");
            cliente.setReserva("Tour Patagonia");

        return cliente;

        } catch (Exception e) {

            System.out.println("Ocurrio un error al momento de crear al Cliente");
            return null;

        }
    }
}