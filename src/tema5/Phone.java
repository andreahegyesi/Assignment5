package tema5;
import java.util.*;
/**
 * A phone can be of certain manufacturers and it can have a specific model
 * Properties which cannot change: battery life (in number of hours)
 * Properties that are configurable: color, material
 * Properties that are instance specific: IMEI
 * <p>
 * Tasks:
 * implement the classes, abstract classes and interfaces according to the given information
 * create at least 2 phone brand with 2 models for each
 * create 2 new contacts
 * send a message to the first contact
 * make a call to the second contact
 */
public abstract class Phone implements Device {
    private int batteryLife;
    private String color;
    private String material;
    private String IMEI;
    private String firstContact;
    private String secondContact;
    List<Contact> contacts = new ArrayList<>();
    List<Message> messages = new ArrayList<>();
    List<String> calls = new ArrayList<>();
    public Phone(int batteryLife, String color, String material, String IMEI) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
    }
    /**
     * Creating new contacts
     *
     * @param nr
     * @param phoneNumber
     * @param firstName
     * @param lastName
     */
    public void addContact(String nr, String phoneNumber, String firstName, String lastName) {
        contacts.add(new Contact(nr, phoneNumber, firstName, lastName));
    }
    public Contact getFirstContact() {
        //System.out.println(contacts.get(0));
        return contacts.get(0);
    }
    public Contact getLastContact() {
        //System.out.println(contacts.get(contacts.size()-1));
        return contacts.get(contacts.size() - 1);
    }
    /**
     * Listing existing contacts
     */
    public void listContacts() {
        System.out.println("Contact list: ");
        for (Contact contact : contacts) {
            System.out.println(" " + contact);
        }
    }
    /**
     * Sending a text message
     * Every time a message is sent an hour is taken from the battery life
     *
     * @param phoneNumber
     * @param content
     */
    public void sendMessage(String phoneNumber, String content) {
        messages.add(new Message(phoneNumber, content));
        System.out.println("The following message was sent to " + phoneNumber + ":\n " + messages.get(messages.size() - 1));
        batteryLife -= 1;
        System.out.println("Battery life = " + batteryLife);
    }
    public Message getFirstMessage(String phoneNumber) {
        //System.out.println("First message: " + messages.get(0));
        return messages.get(0);
    }
    public Message getSecondMessage(String phoneNumber) {
        //System.out.println("Second message: " + messages.get(1));
        return messages.get(1);
    }
    /**
     * Listing all messages for a given contact
     *
     * @param contact
     */
    public void listConversations(Contact contact) {
        System.out.println("Messages sent for " + contact.firstName + ": ");
        for (Message message : messages) {
            if (message.phoneNumber.equals(contact.phoneNumber)) {
                System.out.println(" " + message.content);
            }
        }
    }
    /**
     * Making a call
     * Every time a call is made two hours are taken from the battery life
     *
     * @param phoneNumber
     */
    public void call(String phoneNumber) {
        calls.add(phoneNumber);
        String name = this.findName(phoneNumber);
        if (name != "") {
            System.out.println(name + " was called");
        } else {
            System.out.println(phoneNumber + " was called");
        }
        batteryLife -= 2;
        System.out.println("Battery life = " + batteryLife);
    }
    /**
     * Verifying if a given phone number is in the Contacts list
     *
     * @param phoneNumber
     * @return
     */
    public String findName(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.phoneNumber.equals(phoneNumber)) {
                return contact.firstName;
            }
        }
        return "";
    }
    /**
     * Listing calls history
     */
    public void viewHistory() {
        System.out.println("Call History: ");
        for (String call : calls) {
            String name = this.findName(call);
            if (findName(call) != "") {
                System.out.println(name);
            } else {
                System.out.println(call);
            }
        }
    }
}
