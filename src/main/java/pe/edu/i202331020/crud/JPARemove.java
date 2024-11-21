package pe.edu.i202331020.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202331020.entity.Country;

public class JPARemove {

    public static void main(String[] args) {

        // referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        // obtener country
        Country countryToRemove = em.find(Country.class, "AEA");

        // remove
        em.getTransaction().begin();
        em.remove(countryToRemove);
        em.getTransaction().commit();


    }

}
