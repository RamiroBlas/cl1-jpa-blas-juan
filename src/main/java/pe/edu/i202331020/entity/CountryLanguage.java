package pe.edu.i202331020.entity;

import jakarta.persistence.*;
import pe.edu.i202331020.enums.IsOfficialEnum;

@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {

    @Id
    private String language;
    @Enumerated(EnumType.STRING)
    private IsOfficialEnum isOfficial;
    private Double percentage;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "CountryCode")
    @Id
    private Country country;

    public CountryLanguage() {
    }

    public CountryLanguage(String language, Country country) {
        this.language = language;
        this.country = country;
    }

    public CountryLanguage(String language, IsOfficialEnum isOfficial, Double percentage, Country country) {
        this.language = language;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public IsOfficialEnum getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(IsOfficialEnum isOfficial) {
        this.isOfficial = isOfficial;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                "language='" + language + '\'' +
                ", isOfficial=" + isOfficial +
                ", percentage=" + percentage +
                ", country=" + country +
                '}';
    }
}
