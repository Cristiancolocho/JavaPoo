public class ComprarAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Perro", "Carnivoro", "4");
        Animal animal2 = new Animal("Conejo", "Herbivoro", "4");
        Animal animal3 = new Animal("Pez", "Carnivoro", "3");
        
        System.out.println("Nombre: " + animal1.getNombre());
        System.out.println("Orden: " + animal1.getOrden());
        System.out.println("Extremidades: " + animal1.getExtremidades());
        
        System.out.println("Nombre: " + animal2.getNombre());
        System.out.println("Orden: " + animal2.getOrden());
        System.out.println("Extremidades: " + animal2.getExtremidades());
        
        System.out.println("Nombre: " + animal3.getNombre());
        System.out.println("Orden: " + animal3.getOrden());
        System.out.println("Extremidades: " + animal3.getExtremidades());
    }
    
}
