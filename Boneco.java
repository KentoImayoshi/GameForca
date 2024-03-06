package Forca;

public class Boneco
{
private int parte=0;
private String[][] Dforca = new String[4][4];
private void limpaForca()
{
parte = 0;
Dforca[1][1] = " "; Dforca[1][2] = " "; Dforca[1][3] = " ";
Dforca[2][1] = " "; Dforca[2][2] = " "; Dforca[2][3] = " ";
Dforca[3][1] = " "; Dforca[3][2] = " "; Dforca[3][3] = " ";
}
public void addParte()
{
parte = parte + 1;
if (parte==1) Dforca[1][2]=" O";// cabeca
if (parte==2) Dforca[2][1]=" /";// bracoE
if (parte==3) Dforca[2][2]=" |";//corpo
if (parte==4) Dforca[2][3]=" \\";//bracoD
if (parte==5) Dforca[3][1]=" /";//pernaE
if (parte==6) Dforca[3][3]=" \\";//pernaD
}
public String desenha()
{
String linha = "\n /===|";
linha = linha + "\n ||"+Dforca[1][1]+Dforca[1][2]+Dforca[1][3];
linha = linha + "\n ||"+Dforca[2][1]+Dforca[2][2]+Dforca[2][3];
linha = linha + "\n ||"+Dforca[3][1]+Dforca[3][2]+Dforca[3][3];
linha = linha + "\n ||\\ ";
linha = linha + "\n ||_\\__________";
return(linha);
}
public boolean isCompleto()
{
if (parte==6)
{
return(true);
} else {
return(false);
}}
public Boneco()
{
limpaForca();
}}