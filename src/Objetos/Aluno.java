package Objetos;

import java.util.ArrayList;

public class Aluno implements Comparable<Aluno>{

    //CONSTRUTOR
    public Aluno() {

        this.nomeAluno = nomeAluno;
        this.rgm = rgm;
        this.disciplinas = disciplinas;

    }

    //ATRIBUTOS
    public String nomeAluno;
    public int rgm;
    public ArrayList<String> disciplinas = new ArrayList();

    //GETTERS E SETTERS
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getRgm() {
        return rgm;
    }

    public void setRgm(int rgm) {
        this.rgm = rgm;
    }

    public ArrayList<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public int compareTo(Aluno oAluno) {
        return (this.rgm - oAluno.getRgm());
    }
}
