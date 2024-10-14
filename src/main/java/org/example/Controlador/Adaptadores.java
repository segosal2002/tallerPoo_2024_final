package org.example.Controlador;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Adaptadores {

    public static class LocalTimeAdapter extends TypeAdapter<LocalTime> {
        private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        @Override
        public void write(JsonWriter jsonWriter, LocalTime localTime) throws IOException {
            jsonWriter.value(localTime.format(formatter));
        }

        @Override
        public LocalTime read(JsonReader jsonReader) throws IOException {
            return LocalTime.parse(jsonReader.nextString(), formatter);
        }
    }

    public static class LocalDateAdapter extends TypeAdapter<LocalDate> {
        private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        @Override
        public void write(JsonWriter jsonWriter, LocalDate localDate) throws IOException {
            jsonWriter.value(localDate.format(formatter));
        }

        @Override
        public LocalDate read(JsonReader jsonReader) throws IOException {
            return LocalDate.parse(jsonReader.nextString(), formatter);
        }
    }
}
