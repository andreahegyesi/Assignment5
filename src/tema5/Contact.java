package tema5;
/**
 * This class represents a contact with its name and phone number in the phone
 */
public class Contact {
    String nr;
    String phoneNumber;
    String firstName;
    String lastName;
    public Contact(String nr, String phoneNumber, String firstName, String lastName) {
        this.nr = nr;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString() {
        return "Contact " + nr + ": " + this.firstName + " " + this.lastName + " " + this.phoneNumber;
    }
}
