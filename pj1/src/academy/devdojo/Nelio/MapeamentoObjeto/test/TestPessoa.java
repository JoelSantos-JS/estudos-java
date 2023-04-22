package academy.devdojo.Nelio.MapeamentoObjeto.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import academy.devdojo.Nelio.MapeamentoObjeto.Pessoa;

public class TestPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null,"Joel", 25);
        Pessoa p2 = new Pessoa(null,"Joel 1", 25);
        Pessoa p3 = new Pessoa(null, "Joel 3", 25);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banco_j");
        EntityManager em = emf.createEntityManager();

       
            em.getTransaction().begin();
            em.persist(p1);
            em.persist(p2);
            em.persist(p3);
            em.getTransaction().commit();
        

        System.out.println("Pronto");
    }
}
