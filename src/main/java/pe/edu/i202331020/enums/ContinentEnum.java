package pe.edu.i202331020.enums;

import java.util.Arrays;

public enum ContinentEnum {
    ASIA("Asia"),
    EUROPE("Europe"),
    NORTH_AMERICA("North America"),
    AFRICA("Africa"),
    OCEANIA("Oceania"),
    ANTARCTICA("Antarctica"),
    SOUTH_AMERICA("South America");

    private final String name;

    ContinentEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static ContinentEnum fromName(String name) {
        return Arrays.stream(ContinentEnum.values())
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid continent name: " + name));
    }
}
