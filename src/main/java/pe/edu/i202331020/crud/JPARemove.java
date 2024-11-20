package pe.edu.i202331020.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202331020.entity.City;

public class JPARemove {

    public static void main(String[] args) {

        // referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        // obtener libro
        City city = em.find(City.class, "A2");

        // remove
        em.getTransaction().begin();
        em.remove(city);
        em.getTransaction().commit();


    }

}
