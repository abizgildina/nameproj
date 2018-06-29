import ru.abizgildina.interfaces.Storable;

public abstract class Staff implements Storable {
    /**
     * Идентификатор
     */
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "№"+id+" ";
    }
}
