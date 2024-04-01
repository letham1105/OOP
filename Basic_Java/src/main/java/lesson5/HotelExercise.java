package lesson5;

public class HotelExercise {
    public static void main(String[] args) {
        Room array[] = new Room[4];
        array [0] = new Room (2, false, true);
        array [1] = new Room (4, false, false);
        array [2] = new Room (4, false, false);
        array [3] = new Room (2, true, true);
        Hotel hotel = new Hotel (array, " Da nang ");
        System.out.println(hotel);
    }
}
class Room
{
    private int beds;
    private boolean tv;
    private boolean telephone;
    Room (int numOfBeds, boolean tvExists, boolean telephoneExists)
    {
        beds = numOfBeds;
        tv = tvExists;
        telephone = telephoneExists;
    }
    public String toString()
    {
        return "beds= "+beds+" tv="+tv+" telephone= "+telephone+"\n";
    }
    public void setBeds (int num)
    {
        beds = num;
    }
    public int getBeds()
    {
        return beds;
    }
    public void setTv(boolean tvExists)
    {
        tv= tvExists;
    }
    public boolean getTV()
    {
        return tv;
    }
    public void setTelephone (boolean telephoneExists)
    {
        telephone =telephoneExists;
    }
    public boolean getTelephone()
    {
        return getTelephone();
    }
}
class Hotel {
    private Room rooms[];
    private String place;

    Hotel(Room vec[]) {
        rooms = vec;
    }

    Hotel(Room vec[], String place) {
        rooms = vec;
        this.place =place;
    }
    public void setRooms (Room vec[])
    {
        rooms = vec;
    }
    public void setPlace (String place)
    {
        this.place = place;
    }
    public Room[] getRooms()
    {
        return rooms;
    }
    public String getPlace()
    {
        return place;
    }
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("place: ");
        sb.append(place);
        sb.append("\n");
        for (int i = 0; i <rooms.length; i++)
        {
            sb.append("room num.");
            sb.append("i+1");
            sb.append(":");
            sb.append(rooms[i]);
        }
        return sb.toString();
    }
}
