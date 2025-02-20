package swingcrud;

/**
 *
 * @author hajer
 */
public class Region {

    String name, longitude, latitude;
    int id, pop, confirmes, morts;

    public Region(int id, String name, String longitude, String latitude, int pop, int confirmes, int morts) {
        this.id = id;
        this.name = name;
        this.longitude = latitude;
        this.latitude = latitude;
        this.pop = pop;
        this.confirmes = confirmes;
        this.morts = morts;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public int getPop() {
        return pop;
    }

    public int getConfirmes() {
        return confirmes;
    }

    public int getMorts() {
        return morts;
    }

}
