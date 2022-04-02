package thongke.model.payload.response;


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
public class reportResponse {
    protected String MSSV;
    protected double sad;
    protected double happy;
    protected double normal;
    protected List<TimeLine> lookAtScreen;
    protected List<TimeLine> present;
    protected LocalDate date;
    protected double percentPresent;
    protected double percentLook;

}
