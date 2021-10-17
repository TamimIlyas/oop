public class FeuerWerk {


    static public void main(String[] args){
        Artikel vulkan = new Artikel();
        vulkan.bezeichnung = "Vulkan Magic Light";
        vulkan.preis = 5.50;
        vulkan.dauer = 60;

        System.out.println("Bezeichnung:    ");
        System.out.println(vulkan.bezeichnung);
        System.out.println("Preis:    ");
        System.out.println(vulkan.preis);
        System.out.println("Dauer:    ");
        System.out.println(vulkan.dauer);
    }
}
