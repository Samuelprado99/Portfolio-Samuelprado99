public class LeitordeIDade {
    // variaveis 
    private int ano;
    private int mes;
    private int dias;
public LeitordeIDade(int ano,int mes, int dias){
this.ano = ano;
this.mes = mes;
this.dias =dias;}
public void setAno(int ano){
    this.ano=ano;}
    public int calcular(){
        return(ano*365+mes*30+dias);
    }
    public static void main(String[]args){
        LeitordeIDade c4;
        c4 = new LeitordeIDade(21,1,12);
        System.out.println(c4.calcular());
    }
}