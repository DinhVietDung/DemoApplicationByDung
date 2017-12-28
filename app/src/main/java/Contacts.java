/**
 * Created by PC on 12/28/2017.
 */

public class Contacts {
    private String name;
    private String info;
    private long phone;
    private int image;

    public Contacts(String name, String info, long phone, int image) {
        this.name = name;
        this.info = info;
        this.phone = phone;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
