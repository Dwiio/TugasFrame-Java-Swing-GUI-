# 🖼️ TugasFrame (Java Swing GUI)

[![Java](https://img.shields.io/badge/Java-SE-ED8B00?style=for-for-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![IDE](https://img.shields.io/badge/NetBeans-IDE-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)](https://netbeans.apache.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)
[![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)](#)

> Aplikasi berbasis **Java Swing (GUI)** yang dikembangkan menggunakan **NetBeans IDE** untuk mengelola alur otentikasi pengguna (*Login*) dan antarmuka utama aplikasi (*Main Frame*).

---

## 📋 Table of Contents

- [Overview](#-overview)
- [Key Features](#-key-features)
- [Tech Stack](#-tech-stack)
- [Class & Architecture Overview](#-class--architecture-overview)
- [Project Structure](#-project-structure)
- [Getting Started](#-getting-started)
  - [Prerequisites](#prerequisites)
  - [Compilation & Execution](#compilation--execution)
- [Screenshots / Demo](#-screenshots--demo)
- [Roadmap](#-roadmap)
- [Contributing](#-contributing)
- [Author & License](#-author--license)

---

## 📖 Overview

**TugasFrame** adalah aplikasi desktop Java berbasis Grafis (GUI) yang dirancang untuk mensimulasikan antarmuka pengguna dalam sistem aplikasi desktop. Aplikasi ini menyediakan halaman login terintegrasi yang akan mengarahkan pengguna ke halaman utama (*Main Frame*) setelah berhasil melakukan autentikasi.

Proyek ini dibangun dengan memanfaatkan pustaka standar **Java Swing / AWT** untuk penataan layout dan komponen UI, serta dikelola menggunakan **Apache NetBeans / Ant Build System**.

---

## ✨ Key Features

- **Form Login (`LoginFrame`)** — Antarmuka pengguna untuk memasukkan kredensial masuk dengan komponen GUI terstruktur.
- **Antarmuka Utama (`MainFrame`)** — Tampilan jendela utama aplikasi yang muncul setelah pengguna berhasil masuk (*login*).
- **Event Handling & Navigation** — Integrasi listener antar form untuk perpindahan antarmuka yang responsif.
- **Visual Design Ready** — Didesain dengan antarmuka komponen Java Swing modern.

---

## 🧰 Tech Stack

| Category | Technology / Library |
| :--- | :--- |
| **Language** | Java (JDK 8 / 11 / 17+) |
| **GUI Framework** | Java Swing & AWT |
| **Build Tool / IDE** | Apache NetBeans IDE / Ant Build System[cite: 4] |

---

## 🧩 Class & Architecture Overview

Daftar kelas utama pada package `tugasframe`[cite: 4]:

| Class / Component | Tipe | Deskripsi / Peran |
| :--- | :---: | :--- |
| `LoginFrame` | `JFrame` (Class) | Menangani antarmuka login, masukan pengguna, dan validasi navigasi[cite: 4]. |
| `MainFrame` | `JFrame` (Class) | Menampilkan layar utama aplikasi setelah proses verifikasi login[cite: 4]. |

---

## 📁 Project Structure

```text
TugasFrame/
├── build.xml                    # Script kompilasi Ant Build[cite: 4]
├── manifest.mf                   # File manifest JAR[cite: 4]
├── nbproject/                   # Konfigurasi proyek NetBeans[cite: 4]
│   ├── build-impl.xml
│   ├── genfiles.properties
│   ├── project.properties
│   └── project.xml
└── src/
    └── tugasframe/              # Package utama proyek[cite: 4]
        ├── LoginFrame.java      # Kelas GUI Form Login[cite: 4]
        └── MainFrame.java       # Kelas GUI Form Utama[cite: 4]
