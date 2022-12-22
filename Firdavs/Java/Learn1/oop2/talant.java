public class talant{
    public static void main(String[] args) {
        Human man = new Human();
        Animal tiger = new Animal();
        man.getMyTalant();
        tiger.getMyTalant();
    }
}

class Human extends polymorphism {
    public static String[] myTalant = {
            "create",
            "think",
            "intellect",
            "strong"
    };
    public void getMyTalant(){
        talants(myTalant);
    }
}

class Animal extends polymorphism{
    public static String[] myTalant = {
            "hunt",
            "strong",
            "instinct"
    };
    public void getMyTalant(){
        talants(myTalant);
    }
}