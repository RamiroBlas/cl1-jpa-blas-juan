package pe.edu.i202331020.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202331020.entity.Country;

public class JPAFind {

    public static void main(String[] args) {

        // referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        // obtener libro
        Country country = em.find(Country.class, "PER");
        country.getCities().stream().filter(
                city -> city.getPopulation() > 700.000
        ).forEach(System.out::println);

    }

}
