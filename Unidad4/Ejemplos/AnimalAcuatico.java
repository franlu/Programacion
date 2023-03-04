public interface Animal {
    void mover();
}

public interface AnimalAcuatico extends Animal {
    void nadar();
}

public class Fish implements AquaticAnimal {
    public void mover() {
        System.out.println("El pez se esta moviendo.");
    }
    public void nadar() {
        System.out.println("El pez esta nadando hacia fondo del mar.");
    }
}
