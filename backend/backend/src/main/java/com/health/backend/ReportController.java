package com.health.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/reports")
@CrossOrigin(origins = "https://health-report-analyzer-azure.vercel.app")
public class ReportController {

    @Autowired
    private PdfService pdfService;

    @PostMapping("/upload")
    public String uploadReport(@RequestParam("file") MultipartFile file) {
        try {
            return pdfService.extractTextFromPdf(file);
        } catch (Exception e) {
            return "Error extracting text: " + e.getMessage();
        }
    }
}