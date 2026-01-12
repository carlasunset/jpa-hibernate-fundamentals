package application;

import domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {

        Person person1 = new Person(null, "John Smith", "john@gmail.com");
        Person person2 = new Person(null, "Anne Marie", "anne@gmail.com");
        Person person3 = new Person(null, "Alex Brown", "alex@gmail.com");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example-jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(person1);
        entityManager.persist(person2);
        entityManager.persist(person3);
        entityManager.getTransaction().commit();

        System.out.println("Done!");

    }
}
