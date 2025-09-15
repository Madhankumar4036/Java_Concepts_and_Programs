import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your choice: \nC - Coffee\nT - Tea\nS - Soups\nB - Beverages");
        char mainChoice = sc.next(). toLowerCase() .charAt(0);
        
        System.out.println("Enter sub-menu number: ");
        int subChoice = sc.nextInt();
        
        String result = "INVALID OUTPUT";
        
        switch (mainChoice) {
            case 'c':
                switch (subChoice) {
                    case 1: result = "Espresso Coffee"; 
                    break;
                    case 2: result = "Cappuccino Coffee"; 
                    break;
                    case 7: result = "Latte Coffee";
                    break;
                }
                break;
            case 't':
                switch (subChoice) {
                    case 1: result = "Plain Tea"; 
                    break;
                    case 2: result = "Assam Tea"; 
                    break;
                    case 3: result = "Ginger Tea";
                    break;
                    case 4: result = "Cardamom Tea"; 
                    break;
                    case 5: result = "Masala Tea"; 
                    break;
                    case 6: result = "Lemon Tea";
                    break;
                    case 7: result = "Green Tea";
                    break;
                    case 8: result = "Organic Darjeeling Tea"; 
                    break;
                }
                break;
            case 's':
                switch (subChoice) {
                    case 1: result = "Hot and Sour Soup"; 
                    break;
                    case 2: result = "Veg Corn Soup";
                    break;
                    case 3: result = "Tomato Soup"; 
                    break;
                    case 4: result = "Spicy Tomato Soup";
                    break;
                }
                break;
            case 'b':
                switch (subChoice) {
                    case 1: result = "Hot Chocolate Drink";
                    break;
                    case 2: result = "Badam Drink"; 
                    break;
                    case 3: result = "Badam-Pista Drink"; 
                    break;
                }
                break;
            default:
                result = "INVALID OUTPUT";
        }
        
        if (!result.equals("INVALID OUTPUT")) {
            System.out.println("Welcome to CCD");
            System.out.println("Enjoy your " + result);
        }else {
            System.out.println(result);
        
        }
    }
}



