package pe.edu.i202331020.entity;

import jakarta.persistence.*;
import pe.edu.i202331020.enums.IsOfficialEnum;

@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {

    @Id
    private String country;
    @Id
    private String language;
    @Enumerated(EnumType.STRING)
    private IsOfficialEnum isOfficial;
    private Double percentage;

    public CountryLanguage() {
    }

    public CountryLanguage(String country) {
        this.country = country;
    }

    public CountryLanguage(String country, String language, Enum isOfficial, Double percentage) {}

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Enum getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(Enum isOfficial) {
        this.isOfficial = isOfficial;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                "country='" + country + '\'' +
                ", language='" + language + '\'' +
                ", isOfficial=" + isOfficial +
                ", percentage=" + percentage +
                '}';
    }
}
