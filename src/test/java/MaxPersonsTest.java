import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxPersonsTest {

    @Test
    void TestAlarm35() {
        String rückgabeWert = MaxPersons.Alarm(35);
        assertEquals("Zu viele Personen", rückgabeWert);
    }


    @Test
    void TestAlarm28() {
        String rückgabeWert = MaxPersons.Alarm(28);
        assertEquals("Maximale Personenzahl nicht überschritten", rückgabeWert);
    }

    @Test
    void AlarmRot() {
        String rückgabeWert = MaxPersons.AlarmFarbe(Alert.rot);
        assertEquals("Keine Personen erlaubt", rückgabeWert);
    }

    @Test
    void AlarmGelb() {
        String rückgabeWert = MaxPersons.AlarmFarbe(Alert.gelb);
        assertEquals("Max 30 Personen erlaubt", rückgabeWert);
    }

    @Test
    void AlarmGrün() {
        String rückgabeWert = MaxPersons.AlarmFarbe(Alert.grün);
        assertEquals("Max 60 Personen erlaubt", rückgabeWert);
    }
}