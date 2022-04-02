package thongke.Service;

import thongke.model.Entity.StudyReport;
import thongke.model.Entity.User;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface StudyReportService {
    void saveStudyReport(StudyReport studyReport);
    List<StudyReport> getStudyReport(String MSSV);
    StudyReport getStudyReportAndDate(String MSSV, LocalDate date );
    List<StudyReport> getStudyReports();
    void deleteStudyReport(String MSSV);
}
