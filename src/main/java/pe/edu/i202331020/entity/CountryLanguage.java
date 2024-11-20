package pe.edu.i202331020.entity;

import jakarta.persistence.*;
import pe.edu.i202331020.enums.IsOfficialEnum;

@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {

    @Id
    private String codeCountry;
    private String language;
    @Enumerated(EnumType.STRING)
    private IsOfficialEnum isOfficial;
    private Double percentage;

    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private Country country;

    public CountryLanguage() {
    }

    public CountryLanguage(String codeCountry) {
        this.codeCountry = codeCountry;
    }

    public CountryLanguage(String codeCountry, String language, Enum isOfficial, Double percentage, Country country) {}

    public String getCodeCountry() {
        return codeCountry;
    }

    public void setCodeCountry(String codeCountry) {
        this.codeCountry = codeCountry;
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
                "codeCountry='" + codeCountry + '\'' +
                ", language='" + language + '\'' +
                ", isOfficial=" + isOfficial +
                ", percentage=" + percentage +
                ", country=" + country +
                '}';
    }
}
