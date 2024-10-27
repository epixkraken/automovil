public class Automovil {
    //Atributos - Propiedades -Estados

    private String marca;
    private String modelo;
    private String color = "Verde";
    private int cilindraje;

    // Constructores: tiene el mismo nombre de la clase y comienza con mayúscula, solo reserva espacio de memoria asi
    // que no debe responder nada, si existe ya el void pero no se pone

    public Automovil(){

    }

    //polimorfismo y sobre carga de constructores
    public Automovil(String marca) {
        this.marca = marca;
    }

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    //Métodos Set y Get

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    //Métodos propios y de Cálculo

    public String verDetalle(){
        String dv = "Marca -> " + this.marca + "\n" + "Modelo -> " + getModelo() + "\n" + "Color -> " + this.color + "\n" +
                "Cilindraje -> " + getCilindraje();
        return dv;
    }


    // Modificación de métodos nativos

    //Clase *object* es la clase principal sobre la cual se basa toda la programacion orientada a objetos

    //Bi code no es programa fuente, intermedio entre fuente y objeto
}
