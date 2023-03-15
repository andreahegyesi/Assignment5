package tema5;
/**
 * An interface that defines the methods that all phones must have
 */
public interface Device {
    public void addContact(String nr, String phoneNumber, String firstName, String lastName);
    public void sendMessage(String phoneNumber, String messageContent);
    public void call(String phoneNumber);
    public void viewHistory();
}
