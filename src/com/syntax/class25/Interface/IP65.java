package com.syntax.class25.Interface;
//provide String make="LG"; interfaces can only have fields
//all fields by default public static final
public interface IP65 {
    String make="LG";
     void wash();
}
interface FiveG{
    void speed();
}
interface FastChargeAble{
    void charging();
}
class S21Ultra implements IP65,FastChargeAble,FiveG{


    @Override
    public void wash() {
        System.out.println("You guys can wash me ez pz no issue");

    }


    @Override
    public void charging() {
        System.out.println("I support Fast charging");

    }

    @Override
    public void speed() {
        System.out.println("Very fast");

    }
}
