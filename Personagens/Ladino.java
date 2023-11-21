package Personagens;

public class Ladino extends Personagem{

    private int armaduraCouro;

    public Ladino(String nome, int forca, int destreza, int constituicao, int sabedoria, int inteligencia) {
        super(nome, forca, destreza, constituicao, sabedoria, inteligencia);
        this.armaduraCouro = 2;
    }
    @Override
    public int calcularHP() {
        return 6 + getModcons();
    }

    @Override
    public int calcularArmadura() {
        return 10 + getArmaduraCouro()+ getModdes();
    }

    @Override
    public void habilidades() {

    }

    @Override
    public void exibirFicha() {
        System.out.println("====== Ficha de Personagem =====");
        System.out.println(" ");
        System.out.println("Nome: " + getNome());
        System.out.println("Classe: Ladino");
        System.out.println(" ");
        System.out.println("** Atributos: **");
        System.out.println("Força: " + getForca());
        System.out.println("Destreza: " + getDestreza());
        System.out.println("Constituição: " + getConstituicao());
        System.out.println("Sabedoria: " + getSabedoria());
        System.out.println("Inteligencia: " + getInteligencia());
        System.out.println(" ");
        System.out.println("Vida Total: " + calcularHP());
        System.out.println("Armadura Total: " + calcularArmadura());

    }

    public int getArmaduraCouro() {
        return armaduraCouro;
    }

    public void setArmaduraCouro(int armaduraCouro) {
        this.armaduraCouro = armaduraCouro;
    }
}
