package technology;

public abstract class AbstractEntity {
    private int iD;

private static int globalID = 0;

    public AbstractEntity () {
       iD = globalID;
       globalID++;
    }

    public int getID() {
        return iD;
    }
}
