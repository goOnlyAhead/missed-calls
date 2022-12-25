import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MissedCalls {

    private Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void addMissedCall(String missedCall) {
        missedCalls.put(LocalDateTime.now(), missedCall);
    }

    public void missedCallList(Contacts contacts) {
        for (Map.Entry entry : missedCalls.entrySet()) {
            LocalDateTime dt = (LocalDateTime) entry.getKey();
            System.out.println(dt.format(DateTimeFormatter.ofPattern("HH:mm:ss yyyy-MM-dd")) +
                    " " + entry.getValue() +
                    contacts.getContactByNumber(entry.getValue().toString()));
        }
    }
}
