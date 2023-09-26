import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
    
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
    } 
}
