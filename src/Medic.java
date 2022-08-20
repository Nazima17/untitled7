
public class Medic extends Hero{

    public Medic (int health,int damage,String superpower ){
        super(health,damage,superpower);


        }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic , лечит ");

    }
}