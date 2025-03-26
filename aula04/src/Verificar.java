public class Verificar {
    private double nota;
    private String resultado;

    public Verificar(int nota){
        this.nota = nota;
    }

    public String verificarNota(int nota){

        if(nota >=6){
            resultado = "Aprovado! :)";
        } else if (nota >= 5 && nota <= 5.9) {
            resultado = "Recuperação :| ";
        } else {
            resultado = "Reprovado :(";
        }

        return resultado;
    }
}
