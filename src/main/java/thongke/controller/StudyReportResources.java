package thongke.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import thongke.Service.StudyReportService;
import thongke.Service.UserService;
import thongke.model.Entity.StudyReport;
import thongke.model.Entity.User;
import thongke.model.payload.request.studyReport.addReportRequest;
import thongke.model.payload.request.user.InfoUserRequest;
import thongke.model.payload.response.SuccessResponse;
import thongke.repository.StudyReportRepository;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;

import static com.google.common.net.HttpHeaders.AUTHORIZATION;

@RestController
@RequestMapping("api/report")
@RequiredArgsConstructor
public class StudyReportResources {
    private final StudyReportService studyReportService;

    @GetMapping("")
    @ResponseBody
    public ResponseEntity<SuccessResponse> getReports() throws Exception {
        List<StudyReport> studyReportList = studyReportService.getStudyReports();

        SuccessResponse response = new SuccessResponse();
        response.setStatus(HttpStatus.OK.value());
        response.setMessage("study reports");
        response.setSuccess(true);
        response.getData().put("report",studyReportList);

        return new ResponseEntity<SuccessResponse>(response,HttpStatus.OK);
    }

    @PostMapping("")
    @ResponseBody
    public ResponseEntity<SuccessResponse>  updateInfo(@RequestBody @Valid addReportRequest studyReport, BindingResult errors, HttpServletRequest request) throws Exception {


        StudyReport studyReport1 = new StudyReport(studyReport.getMSSV(),
                studyReport.getSad(),
                studyReport.getHappy(),
                studyReport.getNormal(),
                studyReport.getLookAtScreen(),
                studyReport.getPresent(),
                studyReport.getDate());
        studyReportService.saveStudyReport(studyReport1);
        System.out.println(studyReport);
        SuccessResponse response = new SuccessResponse();
        response.setStatus(HttpStatus.OK.value());
        response.setMessage("add studyReport successful");
        response.setSuccess(true);
        response.getData().put("studyReport",studyReport);
        return new ResponseEntity<SuccessResponse>(response,HttpStatus.OK);
    }

}
