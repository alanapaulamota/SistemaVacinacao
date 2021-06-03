package com.grad.sistemaVacinacao.model.enumeration;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

public enum Sexo {

    MALE( 'M' ),
    FEMALE( 'F' );

    private final char code;

    Sexo(char code) {
        this.code = code;
    }

	public static Sexo fromCode(char code) {
        if ( code == 'M' || code == 'm' ) {
            return MALE;
        }
        if ( code == 'F' || code == 'f' ) {
            return FEMALE;
        }
        throw new UnsupportedOperationException(
            "The code " + code + " is not supported!"
        );
    }

    public char getCode() {
        return code;
    }
    
    
	@Converter
	public static class SexoConverter implements AttributeConverter<Sexo, Character> {

		public Character convertToDatabaseColumn(Sexo value) {
			if (value == null) {
				return null;
			}

			return value.getCode();
		}

		public Sexo convertToEntityAttribute(Character value) {
			if (value == null) {
				return null;
			}

			return Sexo.fromCode(value);
		}
	}
}