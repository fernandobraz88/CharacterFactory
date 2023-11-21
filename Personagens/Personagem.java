package Personagens;


/*Durante a criação do personagem os atributos for, dest, const e etc. serão gerados de forma
 randomica entre 10 e 18*/

public abstract class Personagem {
    private String nome;
    private int forca;
    private int destreza;
    private int constituicao;
    private int sabedoria;
    private int inteligencia;

    /*os modificadores de atributos são valores utilizados para fazer calculos de vida, dano, defesa, acerto
    e etc. baseados nos valores de cada atributo.
    * 10 - 11 = 0
    * 12 - 13 = 1
    * 14 - 15 = 2
    * 16 - 17 = 3
    * 18 = 4 */
    private int modfor;
    private int moddes;
    private int modcons;
    private int modsab;
    private int modint;

public Personagem (String nome, int forca, int destreza, int constituicao, int sabedoria, int inteligencia){
    this.nome = nome;

    this.forca = forca;
    if (this.forca == 10 || this.forca == 11) {
        this.modfor = 0;
    }else if (this.forca == 12 || this.forca == 13){
        this.modfor = 1;
    }else if (this.forca == 14 || this.forca == 15){
        this.modfor = 2;
    }else if (this.forca == 16 || this.forca == 17){
        this.modfor = 3;
    }else{
        this.modfor = 4;
    }

    this.destreza = destreza;
    if (this.destreza == 10 || this.destreza == 11) {
        this.moddes = 0;
    }else if (this.destreza == 12 || this.destreza == 13){
        this.moddes = 1;
    }else if (this.destreza == 14 || this.destreza == 15){
        this.moddes = 2;
    }else if (this.destreza == 16 || this.destreza == 17){
        this.moddes = 3;
    }else{
        this.moddes = 4;
    }

    this.constituicao = constituicao;
    if (this.constituicao == 10 || this.constituicao == 11) {
        this.modcons = 0;
    }else if (this.constituicao == 12 || this.constituicao == 13){
        this.modcons = 1;
    }else if (this.constituicao == 14 || this.constituicao == 15){
        this.modcons = 2;
    }else if (this.constituicao == 16 || this.constituicao == 17){
        this.modcons = 3;
    }else{
        this.modcons = 4;
    }

    this.sabedoria = sabedoria;
    if (this.sabedoria == 10 || this.sabedoria == 11) {
        this.modsab = 0;
    }else if (this.sabedoria == 12 || this.sabedoria == 13){
        this.modsab = 1;
    }else if (this.sabedoria == 14 || this.sabedoria == 15){
        this.modsab = 2;
    }else if (this.sabedoria == 16 || this.sabedoria == 17){
        this.modsab = 3;
    }else{
        this.modsab = 4;
    }

    this.inteligencia = inteligencia;
    if (this.inteligencia == 10 || this.inteligencia == 11) {
        this.modint = 0;
    }else if (this.inteligencia == 12 || this.inteligencia == 13){
        this.modint = 1;
    }else if (this.inteligencia == 14 || this.inteligencia == 15){
        this.modint = 2;
    }else if (this.inteligencia == 16 || this.inteligencia == 17){
        this.modint = 3;
    }else{
        this.modint = 4;
    }

}
public abstract int calcularHP();

public abstract int calcularArmadura();

public abstract void habilidades();

public abstract void exibirFicha();




    public String getNome() {
        return nome;
    }

    public int getForca() {
        return forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getModfor() {
        return modfor;
    }

    public int getModdes() {
        return moddes;
    }

    public int getModcons() {
        return modcons;
    }

    public int getModsab() {
        return modsab;
    }

    public int getModint() {
        return modint;
    }
}
