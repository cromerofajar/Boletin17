
package boletin17_2;

/**
 *
 * @author cromerofajar
 */
public class Boletin17_2 {

    public static void main(String[] args) {
        Gato obxG=new Gato();
        Papagaio obxP=new Papagaio();
        Tigre obxT=new Tigre();
        Avestruz obxA=new Avestruz();
        Morcego obxM=new Morcego();
        System.out.println("Gato");
        obxG.caminar();
        obxG.nadar();
        System.out.println("Papagaio");
        obxP.caminar();
        obxP.voar();
        System.out.println("Tigre");
        obxT.caminar();
        obxT.nadar();
        System.out.println("Avestruz");
        obxA.caminar();
        obxA.voar();
        System.out.println("Morcego");
        obxM.caminar();
        obxM.voar();
    }
    
}
