import Objetos.Aluno;

import java.util.ArrayList;

public class BuscaBinaria {

    public static int binario(ArrayList<Aluno> turma, int rgm)
    {
        int meio;
        int inicio, fim;

        inicio = 0;
        fim = turma.size() - 1;

        while (inicio <= fim)
        {
            meio = ((int) (inicio + fim) / 2);
            if(turma.get(meio).getRgm() == rgm) return meio;
            else if(turma.get(meio).getRgm() < rgm) inicio = meio + 1;
            else if(turma.get(meio).getRgm() > rgm) inicio = meio - 1;
        }
        return -1;
    }

}
