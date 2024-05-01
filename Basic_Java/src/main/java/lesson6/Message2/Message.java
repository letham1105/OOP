package Message;

 interface Message {
     String getHeader();
     String setHeader(String str);
     String getBody();
     void setBody(String str);
     String getType();
     void setType ( String str);
     void printMessage();
}

