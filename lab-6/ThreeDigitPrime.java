public class ThreeDigitPrime {
    public static void main(String[] args) {
        int flag = 1;
        for(int i = 100; i < 999; i++){
            flag = 1;
            for(int j = 2; j < i/2; j++){
                if(i%j==0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                System.out.println(i+ " Prime number");
            }
        }   
    }
}
