package br.com.crudjpa.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.crudjpa.entidades.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRUD_JPA");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p1 = new Pessoa(null, "João", "joao@gmail.com");
		
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
		
		System.out.println("Inserido com sucesso!");
		em.close();
		emf.close();

	}

}
