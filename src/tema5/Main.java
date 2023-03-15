package tema5;
/**
 * This is the Phone Application Programming Interface
 */
public class Main {
    public static void main(String[] args) {
        //Phone phone= new Samsung(); // shouldn't compile
        Phone phone = new SamsungGalaxy6();
        phone.addContact("1", "+40743481808", "Andrea", "Hegyesi");
        phone.addContact("2", "+40751289231", "Catalin", "Stan");
        phone.getFirstContact();
        phone.getLastContact();
        phone.listContacts();
        // send a message to the first contact from the previously listed
        // max number of characters - 100
        phone.sendMessage("+40743481808", "Hello! What are you doing?");
        phone.sendMessage("+40743481808", "You can call me if you want.");
        phone.getFirstMessage("+40743481808");
        phone.getSecondMessage("+40743481808");
        phone.listConversations(phone.getFirstContact());
        // make a call to the second contact from the previously listed
        phone.call("+40751289231");
        phone.viewHistory();
    }
}