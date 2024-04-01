package lesson5;
public class Time{
    //khai bao 3 thuoc tinh gio phut giay
    private int hour;
    private int minute;
    private int second;
    // Phuong thuc khoi tao
    public Time (int h, int m, int s){
        // goi ham thiet lap gio phut
        setTime (h,m,s);
    }
    // dinh nghia ham thiet lap gio, phut, giay
    public void setTime (int h, int m, int s){
        setHour (h);
        setMinute (m);
        setSecond (s);
    }
    // dinh nghia ham thiet lap gio, lon hon 23h thi thiet lap la 0
    public void setHour (int h){
        hour = ((h >= 0 && h < 24) ? h : 0 );
    }
    // dinh nghia ham thiet lap phut, neu lon hon 59 thi thiet lap la 0
    public void setMinute (int m){
        minute = ( ( m > 0 && m < 60 ) ? m : 0);
    }
    // dinh nghia ham thiet lap giay, neu giay lon hon 59 thi thiet lap la 0
    public void setSecond (int s){
        second = ( (s >=0 && s < 60) ? s:0 );
    }
    // hien thi thoi gian theo dinh dang neu nho hon 12 gio thi la AM
    // hien thi thoi gian theo dinh dang neu lon hon 12 gio thi la PM
    public String tostring(){
        return ( ( hour == 12 || hour == 0 ) ? 12 : hour % 12 )
        + ":" + (minute < 10 ? "0" : "") +minute+
          ":" + (second < 10 ? "0" : "") +second+
                (hour < 12 ? "AM" : "PM" );
    }
    // tang giay 1 don vi
    public  void tick()
    {
        setSecond( second + 1);
        // neu tang len 60 thi ham setSecond da thiet lap giay = 0 va do do tang phut len 1
        if (second == 0 )
            incrementMinute();
    }
    // tang phut len 1 don vi
    public void incrementMinute()
    {
        setMinute( minute + 1 );
        // neu phut tang len 60 thi ham setMinute da thiet lap phut = 0 va do do can tang gio len 1
        if ( minute == 0)
            incrementHour();
    }
    // tang gio len 1 don vi, neu gio tang len 24 thi thiet lap ve 0
    public void incrementHour()
    {
        setHour( hour + 1 );
    }

    public static void main(String[] args) {
        // tao doi tuong thoi gian 7h, 0phut, 0giay
        Time A = new Time(7,0,0);
        System.out.println(" Thoi gian da thiet lap =" +A.tostring());
        // tao vong lap vinh cuu
        while ( true )
        {
            // hien thi thoi gian hien tai
            System.out.println(A.tostring());
            try {
                // dung 1 giay = 1000 mili giay, ham sleep phai hoi trong khoi try ... catch
                Thread.sleep(1000);
                // sau khi cho 1 giay, tang giay len 1 don vi\
                A.tick();
            }catch (Exception e){

            }
        }
    }
}


