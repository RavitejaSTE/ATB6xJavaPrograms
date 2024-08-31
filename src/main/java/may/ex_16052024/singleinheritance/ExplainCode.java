package may.ex_16052024.singleinheritance;

public class ExplainCode {

    public static void main(String[] args) {
        GrandFather g  = new Son();
        g.home(); // What will be the output
    }
}


class GrandFather{
    void home(){
        System.out.println("1BHK");
    }
}

class Father extends GrandFather {
    void home(){
        System.out.println("2BHK");
    }
}

class Son extends Father{
    void home(){
        System.out.println("3BHK");
    }
}