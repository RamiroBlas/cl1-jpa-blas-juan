package pe.edu.i202331020.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202331020.entity.City;

import java.util.Date;

public class JPAPersist {

    public static void main(String[] args) {

        // referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        // crear un libro
//        City city = new City()

        // persist
        em.getTransaction().begin();
//        em.persist(city);
        em.getTransaction().commit();

    }

}
