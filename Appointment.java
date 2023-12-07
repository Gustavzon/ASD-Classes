
import java.util.*;

public class Appointment<UserProfile> {
    private int id;
    private Date timeCalendar;
    private AppointmentStatus status;
    private MedicalProf medicalProf;
    private UserProfile userProfile;

    public void book() {
        // implementation code
    }

    public void cancel() {
        // implementation code
    }

    // Enumeration for AppointmentStatus
    public enum AppointmentStatus {
        Booked,
        Cancelled,
        Finished
    }
}