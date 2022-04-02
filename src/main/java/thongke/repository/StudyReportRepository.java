package thongke.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import thongke.model.Entity.StudyReport;
import thongke.model.Entity.User;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@EnableMongoRepositories
public interface StudyReportRepository extends MongoRepository<StudyReport, ObjectId> {
    List<StudyReport> findByMSSV(String mssv);
    Optional<StudyReport> findByMSSVAndDate(String mssv, LocalDate date);
}
