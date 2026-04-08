import java.time.LocalTime;

class Aluno {
    private String nome;
    private String dt_nascimento;
    private String telefone;
    private String nome_responsavel;

    public Aluno(String nome, String dt_nascimento, String telefone, String nome_responsavel) {
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;
        this.telefone = telefone;
        this.nome_responsavel = nome_responsavel;
    }

    public void apresentacao() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nascimento: " + this.dt_nascimento);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Responsável: " + this.nome_responsavel);
    }

    public void saudacao() {
        int hora = LocalTime.now().getHour();
        String saudacao;

        if (hora >= 6 && hora < 12) {
            saudacao = "Bom dia";
        } else if (hora >= 12 && hora < 18) {
            saudacao = "Boa tarde";
        } else {
            saudacao = "Boa noite";
        }

        System.out.println(saudacao + ", " + this.nome + "!");
    }
}

public class Main9 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(
            "Viturino",
            "12/12/2007",
            "(85) 98888-7777",
            "bebezona linda demais"
        );

        aluno.saudacao();
        aluno.apresentacao();
    }
}