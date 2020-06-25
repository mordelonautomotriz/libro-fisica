package caracteristicas_libro;

class Libro_Fisica{
    private int codigo;
    private String titulo;
    private String autor;
    private int anio_edicion;

    public Libro_Fisica(int codigo, String titulo, String autor, int anio_edicion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anio_edicion = anio_edicion;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getAutor(){
        return autor;
    }
    public void setAnio_edicion(int anio_edicion){
        this.anio_edicion=anio_edicion;
    }
    public int getAnio_edicion(){
        return anio_edicion;
    }
    @Override
    public String toString(){
        return "el presente documento conocicod como libro de fisica con codigo "+
                +codigo+" lleva por titulo "+titulo+" escrito por el autor"+autor+
                "que fue escrita en"+anio_edicion+" que hoy en dia es muy util para el "
                + "conocimiento general";
    }
}
public class Caracteristicas_Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro_Fisica libro1 = new Libro_Fisica(583600039,"PROBLEMAS RESUELTOS DE FISICA GENERAL","A.N. Matvieev, V.K. Petersón y A.S. Zhúkariev ", 2000);
        Libro_Fisica libro2 = new Libro_Fisica(849544782,"FISICA GENERAL","Carlos Gracia Muñoz, Enrique Burbano García, Santiago Burbano de Ercilla ", 1984);

        System.out.println(libro1);
        System.out.println(libro2);
   
    }
    
}
