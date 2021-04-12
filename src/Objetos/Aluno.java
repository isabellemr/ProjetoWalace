package Objetos;

import java.util.ArrayList;

public class Aluno implements Comparable<Aluno>{

    //ATRIBUTOS
    public String nomeAluno;
    public int rgm;
    public ArrayList<Disciplina> disciplinas = new ArrayList();

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

    public void getDisciplinas() {
        for(int i = 0; i < disciplinas.size(); i++) {
            System.out.print("Disciplina: " + disciplinas.get(i).nomeDisciplina + "\t Nota: " + disciplinas.get(i).notaDisciplina + "\t");
        }
    }

    public void mostrarUmaDisciplina(int posicao) {
        System.out.println("Disciplina: " + disciplinas.get(posicao).nomeDisciplina + "\t Nota: " + disciplinas.get(posicao).notaDisciplina);
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public int compareTo(Aluno oAluno) {
        return (this.rgm - oAluno.getRgm());
    }
}
