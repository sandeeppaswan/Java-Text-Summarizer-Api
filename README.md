# 🧠 Gemini Research & Summarize Assistant

A containerized **Java 21** and **Spring Boot 3.4.4** web application integrated with the **Google Gemini API** to automate research workflows and generate concise, structured text summaries.

## ✨ Features
* **AI-Powered Summarization:** Uses Google Gemini to condense long articles, research notes, and documents into clear summaries.
* **RESTful Backend:** Built with Spring Boot 3.4.4 for fast, scalable API processing.
* **Containerized Deployment:** Multi-stage Docker build packaged with Eclipse Temurin Java 21 JRE for lightweight, portable execution.

## 🛠️ Tech Stack
* **Language:** Java 21
* **Framework:** Spring Boot 3.4.4
* **Build Tool:** Apache Maven
* **AI Model:** Google Gemini API
* **Containerization:** Docker

## 🐳 Docker Hub
* **Docker Hub Image:** [sandeep2026paswan/summerize-assistant](https://docker.com)

### Quick Start with Docker
Pull and run the container locally on port `8080` by passing your Google Gemini API key:

```bash
docker run -d \
  -p 8080:8080 \
  -e GEMINI_API_KEY="your_gemini_api_key_here" \
  --name summerize-assistant-app \
  sandeep2026paswan/summerize-assistant:latest
```

Once running, access the application at **`http://localhost:8080`**.

*(Note: If your `application.properties` uses a different environment variable name such as `GOOGLE_API_KEY` or `GEMINI_KEY`, update the `-e` flag accordingly).*

## 💻 Running Locally from Source

### Prerequisites
* **Java Development Kit (JDK) 21** installed and set in `JAVA_HOME`
* A valid **Google Gemini API Key**

### Setup Steps
1. **Clone the repository:**
   ```bash
   git clone https://github.com
   cd summerize-assistant
   ```
2. **Set your Gemini API key as an environment variable:**
   * **Windows (PowerShell):**
     ```powershell
     \$env:GEMINI_API_KEY="your_gemini_api_key_here"
     ```
   * **Mac / Linux:**
     ```bash
     export GEMINI_API_KEY="your_gemini_api_key_here"
     ```
3. **Run the application using the Maven Wrapper:**
   ```bash
   ./mvnw spring-boot:run
   ```

## 📬 Connect
* **GitHub:** [sandeeppaswan](https://github.com)
* **Docker Hub:** [sandeep2026paswan](https://docker.com)
