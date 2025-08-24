NearNest 🏠📍
An Android application built with Kotlin that helps users view and explore nearby locations using Google Maps integration. The app is designed with XML layouts for a clean and responsive UI.

📖 Table of Contents
About the Project

Features

Tech Stack

Getting Started

Prerequisites

Installation

Generate Google Maps API Key

Project Structure

UI Layouts

Screenshots

Future Improvements

Contributing

License

🔍 About the Project
NearNest is a location-based Android application that makes use of the Google Maps SDK for Android to display the user’s current location and nearby points of interest. The UI is powered by XML layouts, providing a modern and structured interface.

It aims to demonstrate:

Real-time location tracking

Integration of Google Maps in a Kotlin-based Android app

Separation of UI using XML and logic using Kotlin

✨ Features
📍 Show user's current location on Google Map

🔎 Search for nearby places (restaurants, hospitals, ATMs, etc.)

🗺 Zoom, pan, and map-style changes (normal, satellite, terrain)

🧭 Support for location permissions and runtime checks

📱 Intuitive UI built with ConstraintLayout and XML views

🛠 Tech Stack
Language: Kotlin

UI: XML Layout, ConstraintLayout, Material Components

Location Services: Google Maps SDK, FusedLocationProviderClient

IDE: Android Studio

🚀 Getting Started
✅ Prerequisites
Android Studio (latest stable version)

JDK 11+

Gradle (comes with Android Studio)

An active Google Maps API Key

⚙️ Installation
Clone the repository:

bash
git clone https://github.com/yourusername/nearnest-app.git
cd nearnest-app
Open the project in Android Studio.

Sync Gradle dependencies.

Insert your Google Maps API key in local.properties or directly in AndroidManifest.xml:

xml
<meta-data
    android:name="com.google.android.geo.API_KEY"
    android:value="YOUR_API_KEY_HERE" />
Run the app on an emulator/physical device.

🔑 Generate Google Maps API Key
Go to Google Cloud Console

Create a new Project

Enable Maps SDK for Android & Places API

Generate an API Key

Restrict the key for Android apps with your package name and SHA-1 signing certificate

## 🗂 Project Structure

```plaintext
NearNest/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/nearnest/
│   │   │   │   ├── MainActivity.kt        # Loads Google Map
│   │   │   │   ├── MapsActivity.kt        # Handles map fragment & logic
│   │   │   │   ├── LocationHelper.kt      # Manages location services
│   │   │   │   └── adapters/              # Custom adapters (if any)
│   │   │   ├── res/
│   │   │   │   ├── layout/                # XML layouts for activities
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   ├── activity_maps.xml
│   │   │   │   ├── values/                # Strings, colors, styles
│   │   │   └── AndroidManifest.xml
│   ├── build.gradle
└── README.md


🎨 UI Layouts
activity_main.xml → Splash/Entry screen with navigation button

activity_maps.xml → Contains SupportMapFragment for Google Map

custom_marker.xml → (Optional) Custom layout for map markers

All UI components are designed using ConstraintLayout for responsiveness.

📸 Screenshots (Optional)
Add screenshots or GIFs here once the app is built.

🔮 Future Improvements
🚖 Integration with Google Places API for more detailed nearby searches

💬 User reviews & ratings for locations

🧑‍🤝‍🧑 Login/Sign up functionality

🎨 Dark Mode for the map

🤝 Contributing
Contributions, issues, and feature requests are welcome!
Feel free to fork the repo and submit pull requests.

📜 License
Distributed under the MIT License. See LICENSE file for details.
