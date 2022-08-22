public class Principal {


    public static void main(String[] args) {
        Sueldo sueldo = new Sueldo();
        sueldo.setSueldo();
        System.out.println("Sueldo basico: "+sueldo.getSueldo());
        sueldo.setSueldo(1);
        System.out.println("Sueldo Ingeniero: "+sueldo.getSueldo());

    }

}
