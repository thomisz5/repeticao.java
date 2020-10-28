import javax.swing.JOptionPane;

public class Repet4 {
    public static void main(String[] args){
        int media,num,soma=0;
        int totVal=0;
        int nPar=0;
        int nImpar=0;
        int acimaDeCem=0;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Digite um numero: <br><em><(0 interrompe)</em></html>"));
            soma += num;
            if (num%2==0){
                nPar++;
            }else{
                nImpar++;
            }
            if(num>100){
                acimaDeCem++;
            }
            if (num !=0){
                totVal++;
            }
        }while (num != 0);
        media=soma/totVal;


        JOptionPane.showMessageDialog(null, "<html>-------------"
                +"<br>Resultado<br>----------"
                +"<br>Soma dos val: " +soma +"<br>"
                +"<br>Total dos valores: " +totVal + "<br>"
                +"<br> Numero pares: " +nPar + "<br>"
                +"<br> Numero impares: " +nImpar + "<br>"
                +"<br> Acima de 100: " +acimaDeCem + "<br>"
                +"média dos valores"+media+"<br>"
                +"------------</html>");

    }
}
 