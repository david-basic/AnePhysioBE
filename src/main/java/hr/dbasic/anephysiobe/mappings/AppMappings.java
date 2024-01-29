package hr.dbasic.anephysiobe.mappings;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AppMappings {
    public static final String apiMapping = "/api/v1";
    public static final String apiAuthRequestMapping = apiMapping + "/user-management";
    public static final String apiDepartmentRequestMapping = apiMapping + "/department-management";
    public static final String apiPatientRequestMapping = apiMapping + "/patient-management";
    public static final String apiPhysioFileRequestMapping = apiMapping + "/physiofile-management";
    public static final String apiAssessmentRequestMapping = apiMapping + "/assessment-management";
    public static final String apiPhysioTestsRequestMapping = apiMapping + "/physiotest-management";
    public static final String apiFunctionalDiagnosisRequestMapping = apiMapping + "/functional-diagnosis-management";
    public static final String apiProcedureRequestMapping = apiMapping + "/procedure-management";
}
