package thongke.model.payload.request.studyReport;

import lombok.*;
import thongke.model.Entity.TimeLine;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class addReportRequest {
    protected String MSSV;
    protected double sad;
    protected double happy;
    protected double normal;
    protected double concentrate;
    protected List<TimeLine> lookAtScreen;
    protected List<TimeLine> present;
    protected LocalDate date;
}
