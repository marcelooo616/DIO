package candidatura;

import java.util.concurrent.ThreadLocalRandom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ProcessoSeletivo {
    public static void main(String[] args) {


selecaoCandidatos();
    }


    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","ALGUSTO","MONICA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato =  candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("o candidato " + candidato + " Solicitou este valor de salario  " + salarioPretendido);
            if(salarioPretendido >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analizarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA!");
        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS!");
        }
    }





}