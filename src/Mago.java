import java.security.Permission;
import java.util.ArrayList;
import java.util.List;

public class Mago extends Personagem {

    List<String> Magia = new ArrayList<String>();

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    public List<String> getMagia() {
        return Magia;
    }

    public void setMagia(List<String> magia) {
        Magia = magia;
    }

    public void Attack(){

    }

    public void aprenderMagia(){

    }
    public void lvlUp(){
        this.getLevel();
    }
}
