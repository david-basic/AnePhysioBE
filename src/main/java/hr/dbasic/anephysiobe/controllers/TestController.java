package hr.dbasic.anephysiobe.controllers;

import hr.dbasic.anephysiobe.dto.response.ApiResponse;
import hr.dbasic.anephysiobe.mappings.AppMappings;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(TestController.TestMappings.testRequestMapping)
@RequiredArgsConstructor
public class TestController {
    @GetMapping(TestMappings.getTestResponse)
    public ResponseEntity<ApiResponse<String>> getTestResponse() {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Test fetched.",
                        "This is a test response!"
                )
        );
    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class TestMappings {
        public static final String testRequestMapping = AppMappings.apiTestRequestMapping + "/test";
        public static final String getTestResponse = "";
    }
}