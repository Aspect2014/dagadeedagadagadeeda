class hillstaion{
    void location(){
        System.out.println("Location is ");

    }
    void famousfor(){
        System.out.println("Famous for ");

    }
}
class NiagraFalls extends hillstaion{
    void location(){
        System.out.println("Location is Ontario");

    }
    void famousfor(){
        System.out.println("Famous for its beautiful Niagra river and waterfall");
        
    }
}
class WestEdmontonMall extends hillstaion{
    void location(){
        System.out.println("Location is Edmonton");

    }
    void famousfor(){
        System.out.println("It is famous for being on of the biggest malls in the world.");
        
    }
}
class BurjKhalifa extends hillstaion{
    void location(){
        System.out.println("Location is Dubai");

    }
    void famousfor(){
        System.out.println("Famous for being the tallest buiding on earth");
        
    }
}
public class Main{
    public static void main(String[] args){
        hillstaion h=new hillstaion();
        hillstaion n=new NiagraFalls();
        hillstaion w=new WestEdmontonMall();
        hillstaion b=new BurjKhalifa();

        h.location();
        h.famousfor();

        n.location();
        n.famousfor();

        w.famousfor();
        w.location();

        b.location();
        b.famousfor();
    }

}