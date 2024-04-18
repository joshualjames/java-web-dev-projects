package technology;

public abstract class AbstractEntity {
    private int entityID = 0;

    public int getEntityID() {
        return entityID;
    }

    public void setEntityID(int entityID) {
        this.entityID = entityID;
    }

    abstract void assignAndSetEntityID();
}
