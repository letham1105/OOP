package lesson6.Message;

public class BinaryMessage implements Message {
    String header;
    String body;
    String type;

    public BinaryMessage(String header, String body) {
        this.header = header;
        this.body = body;
        this.type = "Binary";
    }


    public String getHearder() {
        return header;
    }
    @Override
    public String setHearder(String str) {
        return header=str;
    }

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public void setBody(String str) {
    body = str;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String str) {
      type= str;
    }

    @Override
    public void printMessage() {
        System.out.println(" Type: "+type+"\nheader:"+header+"\nbody: "+body);

    }
}
