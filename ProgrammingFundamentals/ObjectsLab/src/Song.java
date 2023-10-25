public class Song {
    private String typeList;
    private String name;
    private String time;
    public Song(String def){
        String[] arr = def.split("_");
        typeList=arr[0];
        name=arr[1];
        time=arr[2];
    }

    public String getTypeList() {
        return typeList;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
