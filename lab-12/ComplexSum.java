public class ComplexSum{
    public static void main(String[] args){
        ComplexNumber c1 = new ComplexNumber(10,20);
        ComplexNumber c2 = new ComplexNumber(20,50);
        c1 =  c1.Sum(c1, c2);
        System.out.println(c1.real+" "+c1.imagenery);
    }
}

class ComplexNumber{
    int real;
    int imagenery;

    public ComplexNumber() {
        real = 0;
        imagenery = 0;
    }

    public ComplexNumber(int real, int imagenery) {
        this.real = real;
        this.imagenery = imagenery;
    }
    
    public ComplexNumber Sum(ComplexNumber c1,ComplexNumber c2){
        ComplexNumber c3 = new ComplexNumber();
        c3.real = c1.real + c2.real;
        c3.imagenery = c1.imagenery + c2.imagenery;
        return c3;
    }
}
