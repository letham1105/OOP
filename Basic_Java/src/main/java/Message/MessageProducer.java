package Message;

public class MessageProducer {
    public Message createMessage(String header, String body, String messageType) throws IllegalAccessException {
        if ("text".equalsIgnoreCase(messageType)){
            return new TextMessage(header, body);
        }else if ("binary".equalsIgnoreCase(messageType)){
            return new BinaryMessage(header,body);
        }else{
            throw new IllegalAccessException(" Invalid message type: "+ messageType);
        }
    }
    public void sendMessage (Message message ){
        System.out.println(" Sending message: ");
        message.printMessage();
    }
}
