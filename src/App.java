import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Fundamentos de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Javascript Fundamentos");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Programador Java");
        mentoria.setDescricao("Preparando para o mercado de trabalho");
        mentoria.setData(LocalDate.of(2023, 3, 5));

        // System.out.println(curso1.toString());
        // System.out.println(mentoria.toString());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCleo = new Dev();
        devCleo.setNome("Cleo");
        devCleo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Cleo: " + devCleo.getConteudosInscritos());
        devCleo.progredir();
        System.out.println("Conteúdos concluídos Cleo: " + devCleo.getConteudoConcluidos());


        Dev devJose = new Dev();
        devJose.setNome("José Lucas");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos José: " + devJose.getConteudosInscritos());
        devJose.progredir();
        System.out.println("Conteúdos concluídos José: " + devJose.getConteudoConcluidos());




    }
}
