package boletin17_1;

/**
 *
 * @author cromerofajar
 */
public class Boletin17_1 {

    public static void main(String[] args) {
        
        //No requiere la implementacion de todos los metodos ya que algunos los hereda de mamiferos.
        Gato obxG=new Gato();
        obxG.nadar();
        obxG.caminar();
        
        Mamiferos obxM=new Mamiferos();
        obxM.caminar();
        
        Papagaio obxP=new Papagaio();
        obxP.caminar();
    }
    
}
