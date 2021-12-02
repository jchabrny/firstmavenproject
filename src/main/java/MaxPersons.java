import java.util.Locale;

public class MaxPersons {

    public static String Alarm(int anzahlPersonen) {
        if (anzahlPersonen > 30) {
            return "Zu viele Personen";
        } else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }

    public static String AlarmFarbe(Alert farbe) {
      String ausgabe = "";
        switch (farbe){
            case rot -> ausgabe = "Keine Personen erlaubt";
            case gelb -> ausgabe = "Max 30 Personen erlaubt";
            case grün -> ausgabe = "Max 60 Personen erlaubt";
        }
        return ausgabe;
    }
}

/*
  if (farbe.equals(Alert.rot)) {
          return "Keine Personen erlaubt";
          }
          if (farbe.equals(Alert.gelb)) {
          return "Max 30 Personen erlaubt";
          }
          if (farbe.equals(Alert.grün)) {
          return "Max 60 Personen erlaubt";
          }
          return "No Alarm";*/
