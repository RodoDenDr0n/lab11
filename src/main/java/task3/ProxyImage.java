package task3;

public class ProxyImage implements MyImage{
    private String file;

    public ProxyImage(String s) {
    }

    @Override
    public void display(){
        new RealImage(file).display();
    }

}