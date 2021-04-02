import Objetos.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {

        ArrayList<Aluno> turma = new ArrayList<>(60);
        Scanner input = new Scanner(System.in);


        int menu = 99;
        String menuCadastro = null;

        while(menu != 0) {

            System.out.println("Digite 1 e aperte enter para cadastrar um novo usuário. \n" +
                    "Digite 2 e aperte enter para buscar um usuário. \n" +
                    "Digite 3 e aperte enter para deletar um usuário. \n" +
                    "Digite 4 e aperte enter para visualizar todos os alunos da turma. \n" +
                    "Digite 0 e aperte enter para finalizar o programa. \n");
            menu = input.nextInt();

            switch (menu) {

                case 1:

                    while(menuCadastro != "N" || turma.size() <= 60) {

                        Scanner entradaAluno = new Scanner(System.in);
                        Aluno aluno = new Aluno();

                        String maisDisciplinas = "S";

                        System.out.println("Digite o nome do aluno e aperte enter: ");
                        aluno.nomeAluno = entradaAluno.nextLine();

                        System.out.println("Digite o RGM do aluno e aperte enter: ");
                        aluno.rgm = entradaAluno.nextInt();

                        while (maisDisciplinas == "S") {

                            System.out.println("Digite uma disciplina: ");
                            aluno.disciplinas.add(entradaAluno.nextLine());

                            System.out.println("Mais disciplinas? ");
                            maisDisciplinas = entradaAluno.nextLine();
                        }

                        System.out.println("Deseja cadastrar outro aluno? ");
                        menuCadastro = entradaAluno.nextLine();

                        entradaAluno.close();

                    }

                case 2:
                    System.out.println("Case 2 \n");
                    break;

                case 3:
                    System.out.println("Case 3 \n");
                    break;

                case 4:
                    System.out.println("Case 4 \n");
                    break;
            }

        }

        System.out.println("Programa encerrado");

    }

}
