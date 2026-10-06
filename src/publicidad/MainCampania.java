package publicidad;

public class MainCampania {
    static void main() {
        Campania c1 = new Campania();
        Campania c2 = new Campania();
        Campania c3 = new Campania();

        c1.nombre = "Promoción de ropa";
        c1.presupuesto = 150;
        c1.plataforma = "Instagram";
        c1.activa = false;

        c2.nombre = "Lanzamiento de producto";
        c2.presupuesto = 250;
        c2.plataforma = "TikTok";
        c2.activa = true;

        c3.nombre = "Ofertas de temporada";
        c3.presupuesto = 100;
        c3.plataforma = "Facebook";
        c3.activa = false;

        System.out.println("Campaña 1");
        c1.MostrarInformacion();

        System.out.println("\nCampaña 2");
        c2.MostrarInformacion();

        System.out.println("\nCampaña 3");
        c3.MostrarInformacion();

        System.out.println("-------------------------------------");

        System.out.println("\nPrsupuesto de la campaña 1");
        c1.MostrarPresupuesto();

        System.out.println("\nPrsupuesto de la campaña 2");
        c2.MostrarPresupuesto();

        System.out.println("\nPrsupuesto de la campaña 3");
        c3.MostrarPresupuesto();

        System.out.println("-------------------------------------");

        System.out.println("Activando la campaña 1");

        c1.activar();

        System.out.println("\nCampaña 1");
        c1.MostrarInformacion();
    }
}