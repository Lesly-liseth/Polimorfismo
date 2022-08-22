public class Principal {

<<<<<<< HEAD
=======

    public static void main(String[] args) {
        Sueldos sueldo = new Sueldos();
>>>>>>> 04cb010fa1bae61cb8859c5ff228e367db8d16f6

    public static void main(String[] args) {
        Sueldo sueldo = new Sueldo();
        sueldo.setSueldo();
        System.out.println("Sueldo basico: "+sueldo.getSueldo());
        sueldo.setSueldo(1);
        System.out.println("Sueldo Ingeniero: "+sueldo.getSueldo());

    }

}
