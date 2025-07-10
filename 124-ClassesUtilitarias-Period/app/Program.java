package app;

import java.time.LocalDate;
import java.time.Period;

public class Program {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        LocalDate proximoAniversario = LocalDate.of(2025, 8, 12);

        // Calculando o período entre duas datas
        Period periodoAteAniversario = Period.between(agora, proximoAniversario);

        System.out.println("Período até o próximo aniversário: " + periodoAteAniversario);
        System.out.println("Anos: " + periodoAteAniversario.getYears());
        System.out.println("Meses: " + periodoAteAniversario.getMonths());
        System.out.println("Dias: " + periodoAteAniversario.getDays());

        Period p1 = Period.ofYears(2);
        Period p2 = Period.ofMonths(5);
        Period p3 = Period.ofWeeks(3); // Cria um período de 21 dias
        Period p4 = Period.of(1, 6, 15); // 1 ano, 6 meses e 15 dias

        System.out.println("Período de 2 anos: " + p1);
        System.out.println("Período de 5 meses: " + p2);
        System.out.println("Período de 3 semanas: " + p3);
        System.out.println("Período combinado: " + p4);


        LocalDate hoje = LocalDate.now();
        System.out.println("Data de hoje: " + hoje);

        // Criando um período de 2 anos e 3 meses
        Period periodoDeAssinatura = Period.of(2, 3, 0);

        // Adicionando o período à data de hoje para saber quando a assinatura expira
        LocalDate dataExpiracao = hoje.plus(periodoDeAssinatura);
        System.out.println("A assinatura expira em: " + dataExpiracao);

        // Verificando se uma data está normalizada
        Period periodoNaoNormalizado = Period.ofMonths(15);
        System.out.println("Período não normalizado: " + periodoNaoNormalizado); // P15M
        System.out.println("Período normalizado: " + periodoNaoNormalizado.normalized()); // P1Y3M
    }
}
