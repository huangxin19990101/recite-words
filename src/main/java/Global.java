import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Global")
public class Global {
    @DatabaseField
    private String currentWordNumber;
    @DatabaseField
    private String currentBookName;
    @DatabaseField
    private Integer autoPlay;
    @DatabaseField
    private Integer EngType;
    @DatabaseField
    private Integer autoLog;

    public String getCurrentWordNumber() {
        return currentWordNumber;
    }

    public void setCurrentWordNumber(String currentWordNumber) {
        this.currentWordNumber = currentWordNumber;
    }

    public String getCurrentBookName() {
        return currentBookName;
    }

    public void setCurrentBookName(String currentBookName) {
        this.currentBookName = currentBookName;
    }

    public Integer getAutoPlay() {
        return autoPlay;
    }

    public void setAutoPlay(Integer autoPlay) {
        this.autoPlay = autoPlay;
    }

    public Integer getEngType() {
        return EngType;
    }

    public void setEngType(Integer engType) {
        EngType = engType;
    }

    public Integer getAutoLog() {
        return autoLog;
    }

    public void setAutoLog(Integer autoLog) {
        this.autoLog = autoLog;
    }
}