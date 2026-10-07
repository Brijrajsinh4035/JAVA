public class DeviceDemo {
    public static void main(String[] args) {
        Smartdevice s1 = new SmartPhone();
        s1.powerOn();
        s1.connectInternet();        
    }    
}
interface Device{
    void powerOn();
}
interface Smartdevice extends Device{
    void connectInternet();
}
class SmartPhone implements Smartdevice{
    @Override 
    public void powerOn(){
        System.out.println("power on");
    }
    @Override 
    public void connectInternet(){
        System.out.println("connect internet");
    }
}
