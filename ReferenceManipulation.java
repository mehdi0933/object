import java.lang.ref.Reference;

public class ReferenceManipulation {

    String name;
    int counter;

    public ReferenceManipulation(String name){
        this.name = name;
        this.counter= 0;
     }
    public void displayReferenceName(){
        System.out.println( "le nom de la marque " + name+ " le compteur kilometrique " + counter);
    }

    public static void updateCounter(ReferenceManipulation object){
        object.counter++;
    }
    
    public static void main(String[] args) {
        ReferenceManipulation reference1 = new ReferenceManipulation("porsche");
        ReferenceManipulation.updateCounter(reference1);
        reference1.displayReferenceName();

        ReferenceManipulation copy1 = new ReferenceManipulation("aston");
        ReferenceManipulation.updateCounter(copy1);
        ReferenceManipulation.updateCounter(copy1);
        copy1.displayReferenceName();

        copy1 = new ReferenceManipulation("reference2");
        reference1.displayReferenceName();
        copy1.displayReferenceName();

        reference1 = new ReferenceManipulation("reference1");
        reference1.displayReferenceName();


    }
}
