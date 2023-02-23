package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    
    private int cargaHoraria;


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Título:" + getTitulo() + " Descrição:" + getTitulo() + " Carga horária:" + cargaHoraria + " horas";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    
}
