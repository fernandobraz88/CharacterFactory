package Personagens;


public class Factory {
    public static void criar (String classe, String nome, int forca, int destreza, int constituicao, int sabedoria, int inteligencia ){
        switch (classe.toLowerCase()){
            case "mago":{
                Mago mago = new Mago(nome, forca, destreza, constituicao, sabedoria, inteligencia);
                mago.exibirFicha();
                break;
            } case "ladino":{
                Ladino ladino = new Ladino(nome, forca, destreza, constituicao, sabedoria, inteligencia);
                ladino.exibirFicha();
                break;
            } case "guerreiro":{
                Guerreiro guerreiro = new Guerreiro(nome, forca, destreza, constituicao, sabedoria, inteligencia);
                guerreiro.exibirFicha();
                break;
            } case "arqueiro":{
                Arqueiro arqueiro = new Arqueiro(nome, forca, destreza, constituicao, sabedoria, inteligencia);
                arqueiro.exibirFicha();
                break;
            } case "clerigo":{
                Clerigo clerigo = new Clerigo(nome, forca, destreza, constituicao, sabedoria, inteligencia);
                clerigo.exibirFicha();
                break;
            }default:
                throw new IllegalArgumentException("Tipo de personagem desconhecido.");
        }
    }
}
