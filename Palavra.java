package Forca;

import java.io.*;
public class Palavra
{
private char[] palavraEscolhida = new char[100];
private char[] palavraDescoberta = new char[100];
private int np = 0;
public void escolheSecreta()
{
String linha[] = new String[200];
try
{
FileInputStream ds = new FileInputStream("ListaPalavras.txt");
DataInputStream arquivo = new DataInputStream(ds);
int i=-1;
do{
i++;
linha[i] = arquivo.readLine();
}while (linha[i]!=null);
int lp =i-1;
int iescolhido = new Double(Math.random()*lp).intValue();
np = linha[iescolhido].length();
for(i=0;i<np;i++)
{
palavraEscolhida[i+1] = linha[iescolhido].toCharArray()[i];
palavraDescoberta[i+1] = '_';
}
} catch(IOException e)
{
System.out.println("Erro na leitura do arquivo de palavras");
System.out.println(e);
}}
public String desenha()
{
String linha = " ";
for(int i=1;i<=np;i++)
{
linha = linha + palavraDescoberta[i] + " ";
}
return(linha);
}
public boolean letraNaPalavra(char letra)
{
boolean achou = false;
for(int i=1;i<=np;i++)
{

if (letra==palavraEscolhida[i])
{
achou=true;
palavraDescoberta[i]=letra;
}}
return(achou);
}
public boolean isCompleta()
{
boolean ok = true;
for(int i=1;i<=np;i++)
{
if(palavraDescoberta[i]=='_')
{
ok = false;
}}
return(ok);
}
//public Palavra()
{
//construtor vazio;
}}