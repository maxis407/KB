public class Sword <T extends  Metal>{

private T metal;

Sword(T metal){
    this.metal = metal;
}

boolean checkEndurance(){
    return metal.getEndurance() > 49;
}

}
