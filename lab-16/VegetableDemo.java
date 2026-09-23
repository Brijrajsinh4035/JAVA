public class VegetableDemo{
    public static void main(String[] args){
        Potato p1 = new Potato("skin");
        System.out.println(p1.toString());
        Tomato t1 = new Tomato("red");
        System.out.println(t1.toString());

    }
}

abstract class Vegetable{
    String color;

    public Vegetable(String color) {
        this.color = color;
    }

    public abstract String toString();
}

class Potato extends Vegetable{

    public Potato(String color) {
        super(color);
    }
    
    public String toString(){
        String str = "this is potato " + color;
        return str;
    }
}

class Brinjal extends Vegetable{
    public Brinjal(String color) {
        super(color);
    }
    
    public String toString(){
        //String str = "this is brinjal " + color;
        String str = p + " " + color;
        return str;
    }
}

class Tomato extends Vegetable{
    public Tomato(String color){
        super(color);
    }
    
    public String toString(){
         String str = "this is tomato " + color;
        // String str = p + color;
        return str;
    }
}

// public class VegetableDemo {
//     public static void main(String[] args) {
//         Potato p1 = new Potato("skin");
//         System.out.println(p1);

//         Tomato t1 = new Tomato("red");
//         System.out.println(t1);

//         Brinjal b1 = new Brinjal("green");
//         System.out.println(b1);
//     }
// }

// abstract class Vegetable {
//     String color;

//     public Vegetable(String color) {
//         this.color = color;
//     }

//     @Override
//     public abstract String toString();
// }

// class Potato extends Vegetable {
//     public Potato(String color) {
//         super(color);
//     }

//     @Override
//     public String toString() {
//         return "Potato: " + color;
//     }
// }

// class Brinjal extends Vegetable {
//     public Brinjal(String color) {
//         super(color);
//     }

//     @Override
//     public String toString() {
//         return "Brinjal: " + color;
//     }
// }

// class Tomato extends Vegetable {
//     public Tomato(String color) {
//         super(color);
//     }

//     @Override
//     public String toString() {
//         return "Tomato: " + color;
//     }
// }