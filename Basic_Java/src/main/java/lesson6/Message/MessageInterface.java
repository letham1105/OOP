package lesson6.Message;

public interface MessageInterface {
    public static void main(String[] args) {
        TextMessage msg1 = new
                TextMessage("time2021:organizerVKU:createrHCPhap", "This is an text message created by HCPhap-VKU");
                 BinaryMessage msg2 = new BinaryMessage("time2021:organizerVKU:createrHCPhap", "101010101010101011110101");
               msg1.printMessage();
               msg2.printMessage();
    }
}
