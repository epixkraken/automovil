//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Automovil bmw = new Automovil("BMW");

        //bmw.setMarca("BMW");
        bmw.setModelo("i340");
        bmw.setColor("Rojo");
        bmw.setCilindraje(3000);

        System.out.println("BMW  \n" + bmw.verDetalle());
        System.out.println();
        Automovil mercedes = new Automovil("Mercedes", "G6");
        mercedes.setColor("Blanco");
        mercedes.setCilindraje(4000);
        System.out.println("MERCEDES" + mercedes.verDetalle());
    }
}

//cada objeto puede tener sus propias caracteristicas
//aunque un objeto tenga lo mismo no es igual

//bmw.equals(bmw2)