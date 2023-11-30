package orm.actions;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import orm.modelo.Escola;

public class ListarAlunos {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunosinfo");
        EntityManager manager = factory.createEntityManager();

        // Query em JPQL para selecionar todos os registros da tabela
        Query query = manager.createQuery("select e from Escola e");

        List<Escola> lista = query.getResultList();

        for (Escola escola : lista) {
            System.out.println("ID: " + escola.getId());
            System.out.println("Nome: " + escola.getNome());
            System.out.println("Email: " + escola.getEmail());
            System.out.println("CPF: " + escola.getCpf());
            System.out.println("Data de Nascimento: " + escola.getDataNascimento());
            System.out.println("Naturalidade: " + escola.getNaturalidade());
            System.out.println("Endereço: " + escola.getEndereco());
            System.out.println("------------------------");
        }

        manager.close();
        factory.close();
    }
}

