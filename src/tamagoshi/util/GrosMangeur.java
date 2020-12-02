package tamagoshi.util;

public class GrosMangeur extends Tamagoshi {

    public GrosMangeur(String name) {
        super(name);
    }

    @Override
    public boolean consommeEnergie(){
        if(this.getEnergy()<2){
            System.out.println(this.getName()+" est KO");
            return false;
        }
        else{
            this.addEnergy(-2);
            return true;
        }
    }
}
