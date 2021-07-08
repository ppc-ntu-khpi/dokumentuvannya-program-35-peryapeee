package domain;

/**
 * Class Editor extends Artist
 */
public class Editor extends Artist {
    /**
     *
     * @param electronicEditing electronic editing
     * @param skiils skills of Artist
     * @param name name of Artist
     * @param jobTitle title of a job of Artist
     * @param level level of Artist
     * @param dept department of Artist
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     *
     * @param electronicEditing electronic editing
     * @param skiils skills of artist
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     *
     * @param electronicEditing electronic editing
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     *
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Method that return Editing preferences
     * @return String
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }


    private boolean electronicEditing;

    /**
     * Method that return electronic editing
     * @return boolean
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     *
     * @param electronic electoronic editing
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
