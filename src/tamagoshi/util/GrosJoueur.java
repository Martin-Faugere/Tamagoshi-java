package tamagoshi.util;

public class GrosJoueur extends Tamagoshi {

    public GrosJoueur(String name) {
        super(name);
    }

    @Override
    public boolean consommeFun(){
        if(this.getFun()<1){
            System.out.println(this.getName()+" est dépressif");
            return false;
        }
        else{
            this.addFun(-2);
            return true;
        }
    }
}
