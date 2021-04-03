import Objetos.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {

        //INSTANCIAS DE OBJETOS
        ArrayList<Aluno> turma = new ArrayList<>(60);
        Scanner input = new Scanner(System.in);

        //ATRIBUTOS
        int menu = 99;
        String menuCadastro = null;

        //PROGRAMA
        while(menu != 0) {

            //MENSAGEM PARA ENTRAR NO MENU PRINCIPAL
            System.out.println("Digite 1 e aperte enter para cadastrar um novo usuário. \n" +
                    "Digite 2 e aperte enter para buscar um usuário. \n" +
                    "Digite 3 e aperte enter para deletar um usuário. \n" +
                    "Digite 4 e aperte enter para visualizar todos os alunos da turma. \n" +
                    "Digite 0 e aperte enter para finalizar o programa. \n");
            menu = input.nextInt();

            //MENU PRINCIPAL
            switch (menu) {

                //CADASTRO
                case 1:

                    while(menuCadastro != "N" || turma.size() <= 60) {

                        //INSTANCIANDO OBJETOS
                        Scanner entradaAluno = new Scanner(System.in);
                        Aluno aluno = new Aluno();

                        //ATRIBUTOS
                        String maisDisciplinas = "S";

                        //ENTRADA NOME ALUNO E SALVANDO O INPUT DO TIPO STRING
                        System.out.println("Digite o nome do aluno e aperte enter: ");
                        aluno.nomeAluno = entradaAluno.nextLine();

                        //ENTRADA DO RGM E SALVANDO O INPUT DO TIPO INT
                        System.out.println("Digite o RGM do aluno e aperte enter: ");
                        aluno.rgm = entradaAluno.nextInt();

                        //ENTRADAS DAS DISCIPLINAS
                        while (maisDisciplinas == "S") {

                            //ENTRADA DA DISCIPLINA E SALVANDO O INPUT DO TIPO STRING
                            System.out.println("Digite uma disciplina: ");
                            aluno.disciplinas.add(entradaAluno.nextLine());
                            entradaAluno.nextLine();

                            //PERGUNTANDO SE O USUARIO DESEJA ADICIONAR MAIS DISCIPLINAS
                            System.out.println("Mais disciplinas? ");
                            maisDisciplinas = entradaAluno.nextLine();
                        }

                        //CONTINUAR CADASTRO DE MAIS ALUNOS OU NAO
                        System.out.println("Deseja cadastrar outro aluno? ");
                        menuCadastro = entradaAluno.nextLine();

                        //ENCERRANDO O OBJETO SCANNER
                        entradaAluno.close();

                    }

                //BUSCA DE USUARIO
                case 2:
                    System.out.println("Case 2 \n");
                    break;

                //DELETAR UM USUARIO
                case 3:
                    System.out.println("Case 3 \n");
                    break;

                //VISUALIZAR TURMA
                case 4:
                    System.out.println("Case 4 \n");
                    break;
            }

        }

        System.out.println("Programa encerrado");

    }

}
