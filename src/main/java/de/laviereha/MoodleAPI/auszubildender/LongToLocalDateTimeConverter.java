package de.laviereha.MoodleAPI.auszubildender;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

@Converter
public class LongToLocalDateTimeConverter implements AttributeConverter<LocalDateTime, Long> {

    @Override
    public Long convertToDatabaseColumn(LocalDateTime localDateTime) {
        return null;
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Long aLong) {
        LocalDateTime triggerTime =
                LocalDateTime.ofInstant(Instant.ofEpochSecond(aLong),
                        TimeZone.getDefault().toZoneId());
        return triggerTime;
    }
}
