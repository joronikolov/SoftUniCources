package PetClinics;

public class Clinic {
    private String name;
    private int rooms;
    private Pet[] pets;
    private int  centerRoom;
    int numberFreeRooms;
    private boolean insertDown;
    private boolean releaseUp;
    int nextFreeRoom;
    int nextReleaseRoom;
    public String getName() {
        return name;
    }

    public int getRooms() {
        return rooms;
    }

    public Clinic(String name, int rooms) {
        if(rooms%2!=0) {
            this.name = name;
            this.rooms = rooms;
            this.pets=new Pet[rooms];
            this.centerRoom=rooms/2;
            this.nextFreeRoom=centerRoom;
            this.nextReleaseRoom=centerRoom;
            numberFreeRooms=rooms;
            this.insertDown=false;
            this.releaseUp =false;

        }else{
            throw new IllegalArgumentException("Invalid Operation!");
        }
    }



    public boolean add(Pet pet){
        if(numberFreeRooms==0){
            return  false;
        }
        this.pets[nextFreeRoom]=pet;
        numberFreeRooms--;
        int oldNextFreeRoom=nextFreeRoom;
        if(!insertDown){
            insertDown=true;
            for (int i = centerRoom; i >=0 ; i--) {
                if(pets[i]==null){
                    nextFreeRoom=i;
                    break;
                }

            }
        }else {
            insertDown=false;
            for (int i = centerRoom; i <pets.length ; i++) {
                if(pets[i]==null){
                    nextFreeRoom=i;
                    break;
                }

            }
        }

        return true;



    }

    public boolean release() {
        if (numberFreeRooms==rooms) {
            return false;
        }
        boolean removed =false;
        for(int i=nextReleaseRoom; i<rooms; i++){
            if(pets[i]!=null){
                pets[i]=null;
                nextReleaseRoom=i;
                removed=true;
                numberFreeRooms++;
                return true;
            }
        }
        if(!removed){
            for(int i=0; i<nextReleaseRoom; i++){
                if(pets[i]!=null){
                    pets[i]=null;
                    nextReleaseRoom=i;
                    removed=true;
                    numberFreeRooms++;
                    return true;
                }
            }
        }
return false;
    }
    public boolean hasEmptyRooms(){
        return numberFreeRooms>0;
    }
}
