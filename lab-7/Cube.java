
import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CubeVolume cv1 = new CubeVolume();
        double height, width, depth;

        System.out.println("Enter Height");
        height = sc.nextDouble();
        System.out.println("Enter Width");
        width = sc.nextDouble();
        System.out.println("Enter Depth");
        depth = sc.nextDouble();
        cv1.setter(height, width, depth);
        cv1.getter();
        cv1.volume();
        CubeVolume cv2 = new CubeVolume();
        System.out.println("Enter Height");
        height = sc.nextDouble();
        System.out.println("Enter Width");
        width = sc.nextDouble();
        System.out.println("Enter Depth");
        depth = sc.nextDouble();
        cv2.setter(height, width, depth);
        cv2.getter();
        cv2.volume();
    }    
}

class CubeVolume{
    double height,width,depth;
    
    void setter(double  height,double width,double  depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void getter(){
        System.out.println("Height "+height);
        System.out.println("Width "+width);
        System.out.println("Depth "+depth);
    }

    void volume(){
        System.out.println("Volume "+(height*width*depth) );
    }
}