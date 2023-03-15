package tema5;
/**
 * A message can have maximum 500 chars
 */
public class Message {
    String phoneNumber;
    String content;
    public Message(String phoneNumber, String content) {
        this.phoneNumber = phoneNumber;
        if (content.length() > 500) {
            content = content.substring(0, 500);
        }
        this.content = content;
    }
    public String toString() {
        return this.content;
    }
}
