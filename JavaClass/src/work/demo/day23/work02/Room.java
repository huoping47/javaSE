package work.demo.day23.work02;
//房间 对象
public class Room {
    private int[] id;
    private String name;
    private String noNull;
    private Room[][] rooms;

    public Room() {
        id = new int[8];
        rooms = new Room[5][24];
    }
    //订房方法
    public void opneRoom(int i){
        //先循环看传进来的房号是否有住人
        for (int j = 0; j < this.id.length-1; ) {
            int c = this.id[j];
            if (i !=c){
                this.id[j] = i;
                System.out.println("'"+this.id[j]+"’号房间以开好");
                this.name = "已入住";
                //没有住人就可以往里面存储数据
                for (int l = 0; l < 1; l++) {
                    for (int k = 0; k <1; k++) {
//                        System.out.print(this.rooms[l][k]= new Room());
                        this.rooms[j][k] = new Room();
                        System.out.println(j);
                        System.out.println(l);
                        System.out.println(k);
                    }
                }
                return;
            }else{
                System.out.println("'"+this.id[j]+"'号房间已经住人了");
                return;
            }
        }

    }

    public void outRoom(int i){
        for (int j = 0; j < this.id.length-1; j++) {
            if (this.id[j] == i) {
//                System.out.println(this.id[j]);
//                System.out.println(i);
            for (int l = 0; l < 1; l++) {
                for (int k = 0; k <1; k++) {
                    System.out.println("---------");
                    this.id[j] = 0;
                    System.out.println(i+"号房以退房");
                    this.rooms[l][k] = null;
                    System.out.println(this.rooms[l][k]);
                }
            }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }
}
