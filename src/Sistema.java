import Objetos.Aluno;
import Objetos.Disciplina;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {

        //INSTANCIAS DE OBJETOS
        ArrayList<Aluno> turma = new ArrayList<>(60);
        Scanner input = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        BuscaBinaria buscaBinaria = new BuscaBinaria();

        //ATRIBUTOS
        int menu = 99;
        String menuCadastro = "s";

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

                    while(menuCadastro.equals("s") || turma.size() <= 60) {

                        //INSTANCIANDO OBJETOS

                        Aluno aluno = new Aluno();

                        //ATRIBUTOS
                        String maisDisciplinas = "s";

                        //ENTRADA NOME ALUNO E SALVANDO O INPUT DO TIPO STRING
                        System.out.println("Digite o nome do aluno e aperte enter: ");
                        aluno.nomeAluno = entradaString.nextLine();

                        //ENTRADA DO RGM E SALVANDO O INPUT DO TIPO INT
                        System.out.println("Digite o RGM do aluno e aperte enter: ");
                        aluno.rgm = input.nextInt();

                        //ENTRADAS DAS DISCIPLINAS
                        while (maisDisciplinas.equals("s")) {

                            //Instanciando uma nova disciplina
                            Disciplina disciplina = new Disciplina();

                            //ENTRADA DA DISCIPLINA E SALVANDO O INPUT DO TIPO STRING
                            System.out.println("Digite uma disciplina: ");
                            disciplina.nomeDisciplina = entradaString.nextLine();

                            //ENTRADA NOTA E SALVANDO O INPUT DO TIPO DOUBLE
                            System.out.println("Digite a nota dessa disciplina: ");
                            disciplina.notaDisciplina = input.nextInt();

                            //PERGUNTANDO SE O USUARIO DESEJA ADICIONAR MAIS DISCIPLINAS
                            System.out.println("Mais disciplinas? (Digite 's' para sim ou 'n' para não)");
                            maisDisciplinas = entradaString.nextLine();

                            //ADICIONANDO A DISCIPLINA A LISTA DE DISCIPLINAS
                            aluno.disciplinas.add(disciplina);

                        }

                        //Adicionando luno a turma e ordenando a turma por RGM, do menor para o maior
                        turma.add(aluno);
                        Collections.sort(turma);

                        //CONTINUAR CADASTRO DE MAIS ALUNOS OU NAO
                        System.out.println("Deseja cadastrar outro aluno? (Digite 's' para sim ou 'n' para não)");
                        menuCadastro = entradaString.nextLine();

                        if(menuCadastro.equals("n")) { break; }

                    }

                break;

                //BUSCA DE USUARIO
                case 2:

                    System.out.println("Qual aluno deseja pesquisar? \n");
                    int rgm = input.nextInt();
                    int posicaoBuscada = buscaBinaria.binario(turma, rgm);
                    if(posicaoBuscada >= 0){
                        System.out.println("Nome do aluno: " + turma.get(posicaoBuscada).getNomeAluno());
                        System.out.println("RGM do aluno: " + turma.get(posicaoBuscada).getRgm());
                        turma.get(posicaoBuscada).getDisciplinas();
                        System.out.println("\n");
                    }else{
                        System.out.println("Não existe");
                    }

                    break;

                //DELETAR UM USUARIO
                case 3:

                    System.out.println("Qual aluno deseja deletar, favor digitar o RGM \n");
                    int rg = input.nextInt();
                    int posicaoBuscadaDeletar = buscaBinaria.binario(turma, rg);
                    if(posicaoBuscadaDeletar >= 0){
                        turma.remove(posicaoBuscadaDeletar);
                        System.out.println("O(A) aluno(a) foi excluído com sucesso");
                        System.out.println("\n");
                    } else {
                        System.out.println("Não existe");
                    }

                    break;

                //VISUALIZAR TURMA
                case 4:
                    for(int cont = 0; cont < turma.size(); cont++){
                        System.out.print("Nome: " + turma.get(cont).getNomeAluno() + "\t" + "RGM: " + turma.get(cont).getRgm() + "\t");
                        turma.get(cont).getDisciplinas();
                        System.out.println("\n");
                    }

                    System.out.println("\n");
                    break;

            }

        }

        //ENCERRANDO Os OBJETOs SCANNER
        entradaString.close();
        input.close();

        System.out.println("Programa encerrado");

    }

}
