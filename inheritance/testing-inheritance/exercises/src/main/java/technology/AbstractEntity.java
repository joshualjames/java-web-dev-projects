package technology;

public abstract class AbstractEntity {
    private int iD;

private static int globalID = 0;

    public AbstractEntity () {
       iD = globalID;
       globalID++;
    }

    abstract void getID();
    return iD;
}
