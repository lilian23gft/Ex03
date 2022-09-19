import java.util.Random;

public class Attack extends Personagem {


    public Attack(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    Random random = new Random();
    int Mago = (getInteligencia() * getLevel()) + random.nextInt(300);

    int Guerreiro = (getForca() * getLevel()) + random.nextInt(300);


}
