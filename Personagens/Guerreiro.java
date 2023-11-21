package Personagens;

public class Guerreiro extends Personagem{

    private int armaduraPesada;

    public Guerreiro (String nome, int forca, int destreza, int constituicao, int sabedoria, int inteligencia){
        super(nome, forca, destreza, constituicao, sabedoria, inteligencia);
        this.armaduraPesada = 3;
    }

    @Override
    public int calcularHP() {
        return 12 + getModcons();
    }

    @Override
    public int calcularArmadura() {
        return 10 + getModdes();
    }

    @Override
    public void habilidades() {

    }

    @Override
    public void exibirFicha() {
        System.out.println("====== Ficha de Personagem =====");
        System.out.println(" ");
        System.out.println("Nome: " + getNome());
        System.out.println("Classe: Guerreiro");
        System.out.println(" ");
        System.out.println("** Atributos: **");
        System.out.println("Força: " + getForca());
        System.out.println("Destreza: " + getDestreza());
        System.out.println("Constituição: " + getConstituicao());
        System.out.println("Sabedoria: " + getSabedoria());
        System.out.println("Inteligencia: " + getInteligencia());
        System.out.println(" ");
        System.out.println("Vida Total: " + calcularHP());

    }
}
