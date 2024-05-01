package Message;

public class BinaryMessage implements Message {
    String header;
    String body;
    String type;

    public BinaryMessage(String header, String body) {
        this.header = header;
        this.body = body;
        this.type = "Binary";
    }

    public String getHeader() {
        return header;
    }

    public String setHeader(String str) {
        header = str;
        return str;
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
        type = str;
    }

    @Override
    public void printMessage() {
        System.out.println(" Type: " + type + "\nheader:" + header + "\nbody: " + body);
    }
}
