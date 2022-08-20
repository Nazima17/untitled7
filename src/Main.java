public class Main {
    public static void main(String[] args) {

        Magic gender= new Magic( 380,30," madical");
        Warrior wr=new Warrior(430,40," berserk");
        Medic medic=new Medic( 335,12,"health");
        Hero[] heroes={gender,wr,medic};
        for (Hero i : heroes) {
            i.applySuperAbility();

        }
    }
}