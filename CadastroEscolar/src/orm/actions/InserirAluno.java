package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;


import orm.modelo.Escola;
public class InserirAluno {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nome: ");
        String nome = sc.nextLine();

        System.out.printf("Email: ");
        String email = sc.nextLine();

        System.out.printf("Cpf: ");
        String cpf = sc.nextLine();

        System.out.printf("Data de nascimento: ");
        String dataNascimento = sc.nextLine();

        System.out.printf("Naturalidade: ");
        String naturalidade = sc.nextLine();

        System.out.printf("Endereço: ");
        String endereco = sc.nextLine();

        Escola escola = new Escola();
        escola.setNome(nome);
        escola.setEmail(email);
        escola.setCpf(cpf);
        escola.setDataNascimento(dataNascimento);
        escola.setNaturalidade(naturalidade);
        escola.setEndereco(endereco);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunosinfo");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin(); //inicializar a transação
        manager.persist(escola); //linha que faz o hibernate inserir um objeto no banco
        manager.getTransaction().commit(); //Encerramento da transação

        manager.close();
        factory.close();
        sc.close();
    }
}
