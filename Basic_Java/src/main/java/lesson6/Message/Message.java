package lesson6.Message;

public interface Message {
    public String setHearder ( String str);
    public String getBody();
    public void setBody ( String str);
    public String getType();
    public void setType ( String str);
    public void printMessage ();
}

