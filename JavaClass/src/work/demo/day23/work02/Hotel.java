package work.demo.day23.work02;

public class Hotel {
    private String name;
    Rooms[][] rooms;

    public Hotel() {
        rooms = new Rooms[4][4];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j] = new Rooms(((i+1)*100)+1+j,"标准间",true);
            }
        }
    }
    public void prilt(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                Rooms rooms1 = rooms[i][j];
                System.out.print(rooms1);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    public void openRoom(int k){
       Rooms rooms1 = rooms[k/100-1][k%100-1];
       rooms1.setYes(false);
        System.out.println(k+"以订房");
    }
    public void outRoom(int k){
        Rooms rooms1 = rooms[k/100-1][k%100-1];
        rooms1.setYes(true);
        System.out.println(k+"以退房");
    }
}
