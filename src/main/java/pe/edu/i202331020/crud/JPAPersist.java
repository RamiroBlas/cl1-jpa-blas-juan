package pe.edu.i202331020.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202331020.entity.City;
import pe.edu.i202331020.entity.Country;
import pe.edu.i202331020.entity.CountryLanguage;
import pe.edu.i202331020.enums.ContinentEnum;
import pe.edu.i202331020.enums.IsOfficialEnum;

import java.util.ArrayList;
import java.util.List;

public class JPAPersist {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");

    public void saveCountry(Country country) {
        EntityManager em = emf.createEntityManager();

        for (City city : country.getCities()) {
            city.setCountry(country);
        }
        for (CountryLanguage language : country.getLanguages()) {
            language.setCountry(country);
        }

        em.getTransaction().begin();
        em.persist(country);
        em.getTransaction().commit();
    }

    public static void main(String[] args) {
        JPAPersist jpaPersist = new JPAPersist();

        List<City> cities = new ArrayList<>();
        cities.add(new City("City1", "District1", 100000, null));
        cities.add(new City("City2", "District2", 200000, null));
        cities.add(new City("City3", "District2", 200000, null));

        List<CountryLanguage> languages = new ArrayList<>();
        languages.add(new CountryLanguage("English", IsOfficialEnum.T, 90.0, null));
        languages.add(new CountryLanguage("Spanish", IsOfficialEnum.F, 10.0, null));

        Country country = new Country("AEA", "Disneylandia", ContinentEnum.NORTH_AMERICA, "Region1",
                123456.78, 1945, 1000000, 75.5, 1234.56,
                1000.00, "LocalName", "Government", "HeadOfState",
                1, "C2", cities, languages);

        jpaPersist.saveCountry(country);
    }

}
