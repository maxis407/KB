public class Main   {
    public static void main(String[] args) {

         //Not create
        //Sword<Plastic> plasticSword = new Sword<>(new Plastic());

// can create
        Sword<Steel> steelSword = new Sword<>(new Steel());
        System.out.println(steelSword.checkEndurance());


    }
}


