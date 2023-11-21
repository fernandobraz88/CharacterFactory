package Personagens;

public class Clerigo extends Personagem{

    private int armaduraPesada;

    public Clerigo(String nome, int forca, int destreza, int constituicao, int sabedoria, int inteligencia) {
        super(nome, forca, destreza, constituicao, sabedoria, inteligencia);
        this.armaduraPesada = 3;
    }

    @Override
    public int calcularHP() {
        return 10 + getModcons();
    }

    @Override
    public int calcularArmadura() {
        return 10 + getArmaduraPesada()+getModdes();
    }

    @Override
    public void habilidades() {
        System.out.println("Ataque Contundente: 1d6 + " + getModfor());
        System.out.println("Curar Ferimentos: Cura 1d6 + " + getModsab() + " da sua vida ou de um aliado");
        System.out.println("Vitalidade do Touro: +" + (getModsab()+getModcons()) + " de vida extra temporaria para você ou um aliado");

    }

    @Override
    public void exibirFicha() {
        System.out.println("====== Ficha de Personagem =====");
        System.out.println(' ');
        System.out.println("Nome: " + getNome());
        System.out.println("Classe: Clerigo");
        System.out.println(' ');
        System.out.println("** Atributos: **");
        System.out.println("Força: " + getForca());
        System.out.println("Destreza: " + getDestreza());
        System.out.println("Constituição: " + getConstituicao());
        System.out.println("Sabedoria: " + getSabedoria());
        System.out.println("Inteligencia: " + getInteligencia());
        System.out.println(' ');
        System.out.println("Vida Total: " + calcularHP());
        System.out.println("Armadura Total: " + calcularArmadura());
        System.out.println(' ');
        System.out.println("** Habilidades: **");
        habilidades();

    }

    public int getArmaduraPesada() {
        return armaduraPesada;
    }

    public void setArmaduraPesada(int armaduraPesada) {
        this.armaduraPesada = armaduraPesada;
    }
}
