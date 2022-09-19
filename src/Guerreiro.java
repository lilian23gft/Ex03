import java.util.ArrayList;
import java.util.List;

public class Guerreiro extends Personagem {

    List<String> Habilidade = new ArrayList<String>();

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    public List<String> getHabilidade() {
        return Habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        Habilidade = habilidade;
    }

    public void Attack(){

    }

    public void aprenderHabilidade(){

    }
    public void lvlUp(){
        this.getLevel();
    }
}
