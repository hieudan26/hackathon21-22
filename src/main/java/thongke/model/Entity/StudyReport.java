package thongke.model.Entity;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.rest.core.annotation.RestResource;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestResource(exported=false)
@Document(collection = "StudyReport")
public class StudyReport {
    @Id
    protected ObjectId _id;
    protected String MSSV;
    protected double sad;
    protected double happy;
    protected double normal;
    protected List<TimeLine> lookAtScreen;
    protected List<TimeLine> present;
    protected LocalDate date;

    public StudyReport(ObjectId _id, String MSSV, double sad, double happy, double normal, List<TimeLine> lookAtScreen, List<TimeLine> present, LocalDate date) {
        this._id = _id;
        this.MSSV = MSSV;
        this.sad = sad;
        this.happy = happy;
        this.normal = normal;
        this.lookAtScreen = lookAtScreen;
        this.present = present;
        this.date = date;
    }

    public StudyReport(String MSSV, double sad, double happy, double normal, List<TimeLine> lookAtScreen, List<TimeLine> present, LocalDate date) {
        this._id = new ObjectId();
        this.MSSV = MSSV;
        this.sad = sad;
        this.happy = happy;
        this.normal = normal;
        this.lookAtScreen = lookAtScreen;
        this.present = present;
        this.date = date;
    }

    public StudyReport() {
    }



    public ObjectId getId() {
        return _id;
    }
    public void setId(ObjectId id) {
        this._id = id;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public double getSad() {
        return sad;
    }

    public void setSad(double sad) {
        this.sad = sad;
    }

    public double getHappy() {
        return happy;
    }

    public void setHappy(double happy) {
        this.happy = happy;
    }

    public double getNormal() {
        return normal;
    }

    public void setNormal(double normal) {
        this.normal = normal;
    }

    public List<TimeLine> getLookAtScreen() {
        return lookAtScreen;
    }

    public void setLookAtScreen(List<TimeLine> lookAtScreen) {
        this.lookAtScreen = lookAtScreen;
    }

    public List<TimeLine> getPresent() {
        return present;
    }

    public void setPresent(List<TimeLine> present) {
        this.present = present;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
