package Forca;

public class Jogador
{
private int iLetra=0;
private char[] letrasChutadas = new char[50];
public String getLetrasChutadas()
{
String linha = "Letras usadas: ";
for(int i=1;i<=iLetra;i++)
{
linha = linha + letrasChutadas[i];
}
return(linha);
}
public void addLetrasChutadas(char letra)
{
iLetra = iLetra +1;
letrasChutadas[iLetra]=letra;
}
public void chutaLetra(char letra, Palavra palavra, Boneco boneco)
{
addLetrasChutadas(letra);
if(!palavra.letraNaPalavra(letra))
{
boneco.addParte();
}}
public boolean ganhar(Palavra palavra)
{
return(palavra.isCompleta());
}
public boolean perder(Boneco boneco)
{
return(boneco.isCompleto());
}
public Jogador()
{
//construtor vazio;
}}