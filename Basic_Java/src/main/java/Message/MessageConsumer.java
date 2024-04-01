package Message;

public class MessageConsumer {
    public Message receiveMessage(String messageType) throws IllegalAccessException {
        if ( "text".equalsIgnoreCase(messageType)){
            return new TextMessage(" Default Text Header", " Default Text Body");
        }else if ("binary".equalsIgnoreCase(messageType));
        return new BinaryMessage("Default Binary Header ", " Default Binary Body");
    }
    public void showMessage(Message message){
        System.out.println("Received message: ");
        message.printMessage();
    }

}
