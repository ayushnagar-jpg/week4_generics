package com.dateformatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    // ✅ Convert yyyy-MM-dd to dd-MM-yyyy format
    public static String formatDate(String inputDate) {
        try {
            // Define input and output date formats
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            // Parse the input date and format it to output style
            LocalDate date = LocalDate.parse(inputDate, inputFormatter);
            return date.format(outputFormatter);

        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Expected yyyy-MM-dd.");
        }
    }
}
