package Forca;

//classe Forca_Principal
import javax.swing.JOptionPane;
public class Forca
{
private static Boneco boneco = new Boneco();
private static Palavra palavra = new Palavra();
private static Jogador jogador = new Jogador();
public static void main(String args[])
{
char letra;
String tela= " ";
palavra.escolheSecreta();
do{
tela=boneco.desenha() + "\n" + palavra.desenha() + "\n" +

jogador.getLetrasChutadas();

letra = JOptionPane.showInputDialog(tela).toCharArray()[0];
jogador.chutaLetra(letra,palavra,boneco);
}while(!(jogador.ganhar(palavra)||jogador.perder(boneco)));
if (jogador.ganhar(palavra))
{
tela = tela + "\n Parabens! acertou a palavra! "+ "\n"+

palavra.desenha() ;

};
if (jogador.perder(boneco))
{
tela = tela + "\n Que pena! Errou!";

};

JOptionPane.showMessageDialog(null,tela,"Jogo da Forca",

JOptionPane.INFORMATION_MESSAGE);
}}