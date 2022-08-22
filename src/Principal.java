public class Principal {

    public static void main(String[] args) {
        Sueldos sueldo = new Sueldos();

        System.out.println("Sueldo basico: "+sueldo.getSuedlo());
        sueldo.setSueldo(425);
        System.out.println("Sueldo Ingeniero: "+sueldo.getSuedlo());

    }
}
