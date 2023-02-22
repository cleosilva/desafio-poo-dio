import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Fundamentos de Java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Programador Java");
        mentoria.setDescricao("Preparando para o mercado de trabalho");
        mentoria.setData(LocalDate.of(2023, 3, 5));

        System.out.println(curso1.toString());
        System.out.println(mentoria.toString());
    }
}
