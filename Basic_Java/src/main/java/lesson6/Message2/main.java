package Message;

public class main {
    public static void main(String[] args) throws IllegalAccessException {
        MessageProducer producer = new MessageProducer();
        MessageConsumer consumer = new MessageConsumer();

        // Creating and sending messages
        Message textMessage = producer.createMessage("time2023: organizerVKU: createrHCPhap", "This is a text message created by HCPhap-VKU", "text");
        producer.sendMessage(textMessage);

        Message binaryMessage = producer.createMessage("time2023: organizerVKU: createrHCPhap", "1010101010101010111101", "binary");
        producer.sendMessage(binaryMessage);

        // Receiving and showing messages
        Message receivedTextMessage = consumer.receiveMessage("text");
        consumer.showMessage(receivedTextMessage);

        Message receivedBinaryMessage = consumer.receiveMessage("binary");
        consumer.showMessage(receivedBinaryMessage);
    }
}
