public class lab3 {
    public static void main(String[] args) {
        Animal a1[] = new Animal[4];
        a1[0] = new Tiger();
        a1[1] = new Camel();
        a1[2] = new Deer();
        a1[3] = new Donkey();

        for(int i = 0;i<a1.length;i++){
            a1[i].getAnimal();
            if(a1[i] instanceof Transport){
                ((Transport)a1[i]).deliver();
            }
        }
    }
}

interface Transport{
    void deliver();
}
abstract class Animal {
    public abstract void getAnimal();
}
class Tiger extends Animal{
    public void getAnimal(){
        System.out.println("this is tiger");
    }
}
class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("delived camels");
    }
    public void getAnimal(){
        System.out.println("this is camel");
    }
}
class Deer extends Animal{
    public void getAnimal(){
        System.out.println("this is deer");
    }
}
class Donkey extends Animal implements Transport{
    public void getAnimal(){
        System.out.println("this is donkey");
    }
    public void deliver(){
        System.out.println("delived Donkey");
    }
}