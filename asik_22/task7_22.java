package asik_22;
public class task7_22 {
    public static void signIn(String name) {
        if ("user".equals(name)) {
            return; 
        }
        System.out.println("Welcome " + name);
        System.out.println("Missed you very much, " + name);
    }
    public static void main(String[] args) {
        signIn("user");
        signIn("Kaisar"); 
    }

}

