package SetInterface;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String name, int inviteCode){
        convidadoSet.add(new Convidado(name, inviteCode));
    }

    public void removerCandidato(int inviteCode){
        Convidado convidadoParaRemover = null;
        for(Convidado convidado : convidadoSet) {
            if(convidado.getInviteCode() == inviteCode){
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado convidados = new ConjuntoConvidado();
        convidados.adicionarConvidado("Hiago", 123);
        convidados.adicionarConvidado("Leo", 124);
        convidados.adicionarConvidado("Willyan", 125);
        convidados.adicionarConvidado("William", 126);
        convidados.adicionarConvidado("João", 127);

        convidados.exibirConvidados();
        System.out.println("Existem " + convidados.contarConvidados() + " convidados confirmados");

        convidados.removerCandidato(127);
        convidados.exibirConvidados();

        System.out.println("Existem " + convidados.contarConvidados() + " convidados confirmados");
    }

}
