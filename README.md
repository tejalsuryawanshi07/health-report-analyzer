# 🩺 AI Health Report Analyzer

An AI-powered full-stack web application that allows users to upload their medical laboratory reports (PDF), automatically extracts test values, analyzes them using AI, identifies abnormal parameters, explains their meaning in simple language, and generates personalized health insights and recommendations.

---

# 🎯 Project Goal

Medical reports are often difficult for non-medical users to understand.

This project aims to make healthcare reports more accessible by allowing users to upload their blood test or laboratory reports and instantly receive:

* 📄 Automatic PDF text extraction
* 🧠 AI-powered medical report analysis
* ⚠️ Detection of abnormal values
* 📊 Easy-to-understand explanations
* ❤️ Personalized health recommendations
* 📈 Overall health summary

---

# ✨ Features

* Secure PDF Upload
* Automatic Laboratory Value Extraction
* AI-Based Medical Report Interpretation
* Normal vs Abnormal Parameter Detection
* Health Risk Assessment
* Personalized Lifestyle Suggestions
* Modern Responsive UI
* Dashboard with Report History *(Optional Future Feature)*

---

# 🏗️ System Architecture

```
                User Uploads Lab Report (PDF)
                          │
                          ▼
                 PDF Text Extraction
                          │
                          ▼
              Medical Parameter Parser
                          │
                          ▼
               AI Health Analysis Engine
                          │
        ┌─────────────────┴─────────────────┐
        ▼                                   ▼
 Abnormal Value Detection         Health Insights
        │                                   │
        └─────────────────┬─────────────────┘
                          ▼
                 Personalized Report
```

---

# 📁 Project Structure

```
health-report-analyzer/
│
├── backend/
│   ├── controllers/
│   ├── middleware/
│   ├── models/
│   ├── routes/
│   ├── services/
│   ├── uploads/
│   ├── server.js
│   └── package.json
│
├── frontend/
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── assets/
│   │   ├── App.jsx
│   │   └── main.jsx
│   ├── package.json
│   └── vite.config.js
│
├── README.md
└── .env
```

---

# 🚀 Tech Stack

### Frontend

* React.js
* Vite
* CSS
* Axios

### Backend

* Node.js
* Express.js
* MongoDB
* Mongoose

### AI

* Google Gemini API

### Other Tools

* Multer (PDF Upload)
* PDF Parser
* JWT Authentication *(if implemented)*

---

# 🚀 Quick Start

## Prerequisites

* Node.js (v18+)
* MongoDB
* Google Gemini API Key

---

## Clone Repository

```bash
git clone https://github.com/tejalsuryawanshi07/health-report-analyzer.git

cd health-report-analyzer
```

---

# Backend Setup

```bash
cd backend

npm install
```

Create a `.env` file

```env
PORT=5000

MONGO_URI=your_mongodb_connection

GEMINI_API_KEY=your_api_key
```

Run backend

```bash
npm run dev
```

Backend starts on

```
http://localhost:5000
```

---

# Frontend Setup

```bash
cd frontend

npm install

npm run dev
```

Frontend starts on

```
http://localhost:5173
```

---

# 🧪 How to Use

### Step 1

Open the application.

---

### Step 2

Upload your laboratory report (PDF).

---

### Step 3

The system automatically:

* Extracts report text
* Detects laboratory parameters
* Compares values with normal ranges
* Sends extracted data to Gemini AI

---

### Step 4

View:

* Overall Health Summary
* Abnormal Parameters
* Medical Explanations
* Lifestyle Recommendations
* Suggested Follow-up Tests *(if applicable)*

---

# ⚙️ AI Workflow

```
Upload PDF
      │
      ▼
Extract Text
      │
      ▼
Parse Medical Parameters
      │
      ▼
Gemini AI Analysis
      │
      ▼
Generate Health Insights
      │
      ▼
Display Interactive Report
```

---

# 📊 Example Analysis

### Input

```
Patient Report.pdf
```

---

### AI Output

```
Overall Health Score : Good

Abnormal Parameters

• Hemoglobin ↓
Possible Mild Anemia

• LDL Cholesterol ↑
Higher risk of cardiovascular disease

• Vitamin D ↓
Possible deficiency

Recommendations

✓ Increase iron-rich foods

✓ Regular exercise

✓ Improve Vitamin D intake

✓ Consult physician if symptoms persist
```

---

# 🔑 Environment Variables

```env
PORT=5000

MONGO_URI=

GEMINI_API_KEY=
```

---

# 📦 Dependencies

## Backend

* Express.js
* Mongoose
* Multer
* PDF Parser
* dotenv
* Cors

## Frontend

* React
* Axios
* React Router
* CSS

---

# 🎨 UI Features

* Responsive Design
* Modern Dashboard
* Drag & Drop PDF Upload
* Beautiful Health Cards
* Animated Loading States
* Dark & Light Theme *(Optional)*

---

# 🚧 Future Enhancements

* 📈 Health Trend Tracking
* 📊 Multiple Report Comparison
* 📅 Appointment Reminder
* 🩺 Doctor Consultation Integration
* 📥 PDF Download
* ☁️ Cloud Storage
* 🔐 User Authentication
* 📱 Mobile Application
* 🌍 Multi-language Support
* 📊 Interactive Health Charts

---

# 📸 Screenshots

```
Home Page

Upload Report

Analysis Dashboard

Health Summary

Recommendations
```

*(Add screenshots here after deployment.)*

---

# 🛡️ Disclaimer

This project is intended for educational and demonstration purposes only.

The AI-generated analysis should **not** be considered professional medical advice. Always consult a qualified healthcare professional for diagnosis and treatment.

---

# 🤝 Contributing

Contributions are welcome!

Feel free to fork this repository, create a new branch, and submit a pull request.

---

# ⭐ Support

If you found this project helpful, consider giving it a ⭐ on GitHub.

---

# 📄 License

This project is licensed under the MIT License.

---

# 👨‍💻 Author

**Tejal Suryawanshi**

Second Year Computer Science Student

Passionate about AI, Full Stack Development, and Healthcare Technology.

GitHub: https://github.com/tejalsuryawanshi07
