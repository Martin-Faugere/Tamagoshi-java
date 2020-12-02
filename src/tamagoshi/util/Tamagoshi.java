package tamagoshi.util;

import java.util.Random;

public class Tamagoshi {
    private int age;
    private int maxEnergy;
    private int energy;
    private String name;
    private Random random;
    private int fun;
    private int maxFun;

    private static int lifeTime = 10;

    public Tamagoshi(String name) {
        this.age = 0;
        this.maxEnergy = (int)(Math.random()*(9-5)+5);
        setEnergy((int)(Math.random()*(7-3)+3));
        this.maxFun=(int)(Math.random()*(9-5)+5);
        setFun((int)(Math.random()*(7-3)+3));
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public int getMaxFun(){ return maxFun;}

    public int getEnergy() {
        return energy;
    }

    public void addEnergy(int energy) {
        if(this.maxEnergy>=this.energy+energy)
            this.energy += energy;
        else this.energy = this.maxEnergy;
    }

    public void addFun(int fun){
        this.fun+=fun;
    }

    public int getFun() {
        return fun;
    }

    public void setFun(int fun){
        if(this.maxFun>=fun)
            this.fun = fun;
        else this.fun = this.maxFun;
    }

    public void setEnergy(int energy) {
        if(this.maxEnergy>=energy)
            this.energy = energy;
        else this.energy = this.maxEnergy;
    }

    public boolean parle(){
        boolean heureux = false;
        System.out.print(this.getName()+" est ");
        if(this.getEnergy()>4){
            System.out.println("heureux!");
            heureux = true;
        }
        else
            System.out.println("affamé!");
        return heureux;
    }

    public boolean mange(){
        boolean mange = true;
        if(this.getEnergy()<this.getMaxEnergy()) {
            this.addEnergy((int) (Math.random() * (4 - 2)+2));
            System.out.println(this.getName()+" a bien mangé!!!");
        }
        else {
            mange = false;
            System.out.println(this.getName()+" n'a pas faim!!!");
        }
        return mange;
    }

    public boolean joue(){
        boolean joue = true;
        if(this.getFun()<this.getMaxFun()) {
            this.addFun((int) (Math.random() * (4 - 2)+2));
            System.out.println(this.getName()+" a bien joué!!!");
        }
        else {
            joue = false;
            System.out.println(this.getName()+" fait autre chose!!!");
        }
        return joue;
    }

    public boolean consommeEnergie(){
        if(this.getEnergy()<1){
            System.out.println(this.getName()+" est KO");
            return false;
        }
        else{
            this.addEnergy(-1);
            return true;
        }
    }

    public boolean consommeFun(){
        if(this.getFun()<1){
            System.out.println(this.getName()+" est dépressif");
            return false;
        }
        else{
            this.addFun(-1);
            return true;
        }
    }

    public static void main(String args[]){
        Tamagoshi t1  = new Tamagoshi("clementine");
        System.out.println("energie actuelle est "+t1.getEnergy());
        System.out.println("max energie est "+t1.getMaxEnergy());
        System.out.println(t1.parle());
        System.out.println(t1.mange());
        System.out.println(t1.consommeEnergie());
    }
}


