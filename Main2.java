                            abstract class objects{
    abstract void shape();
                                                                 

    

}
                class sphere extends objects{
void shape(){
                                              System.out.println("This is a sphere");

    }
    
}
          class cuboid extends objects{
                      void shape(){
                                                                                                           System.out.println("this is a cuboid");

    }
}
class prism extends objects{
    void shape(){
        System.out.println("This is a prism");
    }
}
class Main2{
    public static void main(String[] args) {
        objects o=new sphere();
        o.shape();
        o=new cuboid();
        o.shape();
        o=new prism();
        o.shape();
    }
}