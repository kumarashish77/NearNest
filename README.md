# 🏠 NearNest – Nearby Store Locator App

NearNest is a modern, intuitive Android app built to help users quickly find nearby stores, shops, or essential services based on their current location. Designed for performance and simplicity, NearNest is perfect for anyone seeking local convenience at their fingertips.

---

## ✨ Features

- 📍 Real-time location tracking
- 🛒 Discover nearby stores and services
- 🗺️ Interactive map interface with store markers
- 🔍 Keyword-based store search
- 💬 Clean and minimal UI with smooth UX
- ⚡ Lightweight and fast performance

---

## 🚀 Tech Stack

| Layer        | Technology                      |
|-------------|----------------------------------|
| **Frontend** | Android (Kotlin + XML)          |
| **Location** | Google Maps SDK & Location API  |
| **Backend**  | Firebase Realtime Database (if used) |
| **APIs**     | Google Places API / Maps API    |
| **Others**   | Glide (image loading), Retrofit (if used), Material Components UI |

---

## 📱 Screenshots

| Home Screen | Store List | Map View |
|-------------|------------|----------|
| ![Home](assets/home.png) | ![List](assets/list.png) | ![Map](assets/map.png) |

---

NearNest/
├── app/
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/com/nearnest/ # Kotlin source files
│ │ │ │ ├── ui/ # Activities and UI
│ │ │ │ ├── data/ # Data models / API logic
│ │ │ │ └── utils/ # Utility classes/helpers
│ │ │ ├── res/ # Layouts, drawables, values
│ │ │ └── AndroidManifest.xml # App manifest
│ └── build.gradle # Module level Gradle
├── build.gradle # Project level Gradle
├── settings.gradle # Settings file
└── README.md # You’re here!

## 🛠️ Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/NearNest.git
