package pe.edu.i202331020.utils;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import pe.edu.i202331020.enums.ContinentEnum;

@Converter(autoApply = true)
public class ContinentEnumConverter implements AttributeConverter<ContinentEnum, String> {

    @Override
    public String convertToDatabaseColumn(ContinentEnum attribute) {
        if (attribute == null) {
            return null;
        }
        return attribute.getName();
    }

    @Override
    public ContinentEnum convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty()) {
            return null;
        }
        return ContinentEnum.fromName(dbData);
    }
}
