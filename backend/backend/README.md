🧬 MediScan AI
A React and Spring Boot microservice application designed to transform unstructured laboratory diagnostic PDF reports into structured, actionable medical intelligence. This prototype demonstrates how AI-driven parsing can help users and practitioners better understand biometric thresholds and diagnostic data.

🎯 Project Goal
To simplify the interpretation of medical diagnostic reports by:

Automated Ingestion: Uploading and parsing complex PDF diagnostic documents.

Vector Extraction: Mapping noisy text into structured biomarker data.

Clinical Thresholding: Instantly flagging out-of-range metrics against standard medical guidelines.

Data Portability: Exporting structured findings into CSV format for personal health records.

🏗️ Architecture
The system utilizes a decoupled microservice architecture:

Frontend: A responsive React JS dashboard with a real-time extraction interface.

Backend: A robust Java Spring Boot enterprise server for document processing.

Extraction Engine: Apache PDFBox-based memory stream parsers for efficient text decoding.

Workflow:
PDF Upload → Spring Boot Decoder → Biomarker Mapping → React Matrix Rendering

📁 Project Structure
Plaintext
HEALTH-REPORT/
├── backend/            # Spring Boot Microservice
│   ├── src/            # Java source code & parsing logic
│   └── pom.xml         # Dependencies
├── frontend/           # React JS Interface
│   ├── src/            # UI Components & Hooks
│   ├── public/         # Static assets
│   └── package.json    # Frontend dependencies
└── README.md
🚀 Quick Start
Backend Setup
Navigate to the backend directory: cd backend

Build the project: ./mvnw clean install

Run the application: ./mvnw spring-boot:run

The service will be available at http://localhost:8080

Frontend Setup
Navigate to the frontend directory: cd frontend

Install dependencies: npm install

Run the development server: npm run dev

The interface will be available at http://localhost:5173

🧪 How It Works
Ingestion: The user uploads a laboratory PDF.

Parsing: The Spring Boot backend uses Apache PDFBox to extract text from the document stream.

Mapping: The parseBloodReportText logic identifies biomarkers (Hb, RBC, etc.) and compares them against predefined medical ranges.

Visualization: The React interface renders the data with color-coded "Threshold Maps" to indicate if values are Low, Normal, or High.

📊 Key Features
Dark/Light Mode: Full theme palette engine for visual comfort.

Vector Compiler: Real-time extraction of medical properties from unstructured text.

Export Tools: Instant CSV generation of all identified biomarkers.

Interactive Dashboard: Searchable and sortable biometric data grid.

🔑 License
MIT License - Feel free to use for your own research or development purposes!