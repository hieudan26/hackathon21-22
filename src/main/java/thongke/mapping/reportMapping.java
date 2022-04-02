package thongke.mapping;

import thongke.model.Entity.StudyReport;
import thongke.model.Entity.TimeLine;
import thongke.model.payload.response.reportResponse;

import java.io.Console;
import java.sql.Timestamp;
import java.util.List;

public class reportMapping {
    static public reportResponse responsemapping(StudyReport studyReport){
        List<TimeLine> timeLinesLook = studyReport.getLookAtScreen();
        List<TimeLine> timeLinespresent= studyReport.getPresent();

        Long totalTime = timeLinespresent.get(timeLinespresent.size() -1 ).getTimeEnd() - timeLinespresent.get(0).getTimeStart();
        Long presenttime = Long.valueOf(0) ;
        Long Looktime = Long.valueOf(0) ;
        for(TimeLine timeLine : timeLinespresent){
            presenttime += timeLine.getTimeEnd() - timeLine.getTimeStart() ;
        }

        for(TimeLine timeLine : timeLinesLook){
            Looktime += timeLine.getTimeEnd() - timeLine.getTimeStart() ;
        }
        Double percentPresent = Double.valueOf(presenttime) / Double.valueOf(totalTime);
        Double percentlook = Double.valueOf(Looktime) / Double.valueOf(totalTime);
        reportResponse temp = new reportResponse(studyReport.getMSSV(),
                studyReport.getSad(),
                studyReport.getHappy(),
                studyReport.getNormal(),
                studyReport.getLookAtScreen(),
                studyReport.getPresent(),
                studyReport.getDate(),
                percentPresent,
                percentlook);
        return temp;

    }
}
