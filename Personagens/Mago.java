package Personagens;

public class Mago extends Personagem{
    private int vestimenta;

    public Mago(String nome, int forca, int destreza, int constituicao, int sabedoria, int inteligencia){
        super(nome, forca, destreza, constituicao, sabedoria, inteligencia);
        this.vestimenta = 1;

    }
    @Override
    public int calcularHP() {
        return 4 + getModcons();
    }

    @Override
    public int calcularArmadura() {
        return 10 + getVestimenta() + getModdes();
    }

    @Override
    public void habilidades() {
        System.out.println("Misseis Mágicos: 3d4 + "+ getModint());
        System.out.println("Clarão de Luz: Cega o adversario por "+getModint()+" turnos");
        System.out.println("Escudo Arcano: +" + (getModint()+getModcons()) + " de vida extra temporaria");
    }

    @Override
    public void exibirFicha() {
        System.out.println("====== Ficha de Personagem =====");
        System.out.println(" ");
        System.out.println("Nome: " + getNome());
        System.out.println("Classe: Mago");
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
        System.out.println("Habilidades: ");
        habilidades();

    }

    public int getVestimenta() {
        return vestimenta;
    }

    public void setVestimenta(int vestimenta) {
        this.vestimenta = vestimenta;
    }
}
