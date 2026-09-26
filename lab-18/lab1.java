public class lab1 {
    public static void main(String[] args) {
        B B1 = new B();
        B1.a12();
        B1.a1();
        B1.a2();
        B1.a(); 
    }    
}

interface A{
    int a = 10;
    void a();
}

interface A1 extends A{
    int a1 = 20;
    void a1();
}

interface A2 extends A{
    int a2 = 30;
    void a2();
}

interface A12 extends A1,A2{
    int a1 = 40;
    void a12();
}

class B implements A12{
    public void a12(){
        System.out.println("this a12"+a);
        
    }
    public void a1(){
        System.out.println("this a1"+a1);
    }
    public void a2(){
        System.out.println("this is a2"+a2);
    }
    public void a(){
        System.out.println("this is a "+a);
    }
}