package publicidad;

public class Campania {
    public String nombre;
    public double presupuesto;
    String plataforma;
    boolean activa;

    public void MostrarInformacion(){
        System.out.println("Nombre: " +nombre+ "\nPresupuesto: " +presupuesto+ "\nPlataforma: " +plataforma);

        String estado = activa ? "Estado: Activo" : "Estado: Inactivo";
        System.out.println(estado);
    }

    public void activar(){
        activa = true;
    }

    void desactivar(){
        activa = false;
    }

    void MostrarPresupuesto(){
        System.out.println("Presupuesto: " +presupuesto);
    }
}