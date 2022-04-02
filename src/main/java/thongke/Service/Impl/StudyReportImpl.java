package thongke.Service.Impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thongke.Service.StudyReportService;
import thongke.model.Entity.StudyReport;
import thongke.model.Entity.User;
import thongke.repository.StudyReportRepository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class StudyReportImpl implements StudyReportService {
    @Autowired
    StudyReportRepository studyReportRepository;

    @Override
    public List<StudyReport> getStudyReports() {
        return studyReportRepository.findAll();
    }

    @Override
    public void saveStudyReport(StudyReport studyReport) {
        studyReportRepository.save(studyReport);
    }

    @Override
    public List<StudyReport> getStudyReport(String MSSV) {
        return studyReportRepository.findByMSSV(MSSV);
    }

    @Override
    public StudyReport getStudyReportAndDate(String MSSV, LocalDate date) {
        Optional<StudyReport> studyReport = studyReportRepository.findByMSSVAndDate(MSSV,date);
        if(studyReport.isEmpty())
            return null;
        return studyReport.get();
    }

    @Override
    public void deleteStudyReport(String MSSV) {
         studyReportRepository.deleteAll(getStudyReport(MSSV));
    }


}
