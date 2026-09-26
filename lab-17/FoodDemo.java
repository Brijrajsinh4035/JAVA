import java.util.Scanner;

public class FoodDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Food f;
        System.out.println("enter food categories");
        String str = sc.next().toLowerCase();
        switch (str) {
            case "fastfood":
                f=new FastFood();
                f.prepareOrder();
                break;
            case "southindian":
                f=new SouthIndian();
                f.prepareOrder();
                break;
            case "chinese":
                f=new ChineseRestaurant();
                f.prepareOrder();
                break;
            default:
                System.out.println("enter valid food categorie");
                break;
        }
    }
}

class Food {
    void prepareOrder() {

    }
}

class FastFood extends Food {
    void prepareOrder() {
        System.out.println("this is fastfood");
    }
}

class SouthIndian extends Food {
    void prepareOrder() {
        System.out.println("this is southindian");
        
    }
}

class ChineseRestaurant extends Food {
    void prepareOrder() {
        System.out.println("this is chineseRestarurant");
    }
}
