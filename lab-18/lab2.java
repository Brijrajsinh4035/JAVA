import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EventDemo e = new EventDemo();
        System.out.println("enter mouse or key event");
        String str = sc.next().toLowerCase();
        e.performEvent(str);
    }    
}

interface EventListener{
    void performEvent(String event);
}
interface MouseListener extends EventListener{
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}
interface KeyListener extends EventListener{
    void keyPressed();
    void keyReleased();
}

class EventDemo implements MouseListener,KeyListener{
    public void mouseClicked(){
        System.out.println("mouse clicked");
    }
    public void mouseReleased(){
        System.out.println("mouse released");
    }
    public void mouseMoved(){
        System.out.println("mouse moved");
    }
    public void mousePressed(){
        System.out.println("mouse pressed");
    }
    public void mouseDragged(){
        System.out.println("mouse dragged");
    }
    public void keyPressed(){
        System.out.println("key pressed");
    }
    public void keyReleased(){
        System.out.println("key released");
    }
    public void performEvent(String event){
        if(event.equals("mouseclick")){
            mouseClicked();
        }
        else if(event.equals("mousepressed")){
            mousePressed();
        }
        else if(event.equals("mousereleased")){
            mouseReleased();;
        }
        else if(event.equals("mousemoved")){
            mouseMoved();;
        }
        else if(event.equals("mousedragged")){
            mouseDragged();
        }
        else if(event.equals("keypressed")){
            keyPressed();
        }
        else if(event.equals("keyreleased")){
            keyReleased();;
        }else{
            System.out.println("invalid event");
        }
    }
}