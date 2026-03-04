# Blueprint: RaceMates Driver App & Data Hub

## Vision
Vom reinen "Fan-Display" zum **Utility-Tool für Fahrer**. 
Fahrer nutzen RaceMates nicht nur zur Darstellung, sondern als **aktives Werkzeug** für ihre Karriere-Daten.

## 1. Feature: Driver Subscription (B2B/Pro)
- **Idee:** Fahrer zahlen (oder erhalten als Perk) Zugang zu einem **"Pro-Dashboard"**.
- **Funktionen:**
    - **Test-Datenbank:** Eingabe von Test-Tagen (Strecke, Fahrzeug, Chassis-Nr., Setup-Basis, Rundenzeiten).
    - **Digitaler Lizenz-Safe:** Verschlüsselte Speicherung von Lizenz-Nummer, Versicherungsdaten, Medicals (nur für Fahrer sichtbar).

## 2. Feature: Next Race (Fan & Driver View)
- **Display:** Automatische Anzeige des nächsten Rennens im Profil-Header.
- **Datenquelle:** Verknüpfung mit dem globalen Rennkalender (Serie -> Event -> Datum).
- **Beispiel:** "Next: 24h Nürburgring (22.06.2026) - Countdown: 4 Tage".

## 3. Feature: Career History (Legacy Data)
- **Erweiterung der Tabelle:** Statt nur "Season 2026" eine komplette Historie.
- **Struktur:**
    - Jahr | Serie | Team | Auto | Pts | Result
    - *2025 | WEC | Alpine | A424 | 120 | P4*
    - *2024 | WEC | Alpine | A424 | ... | ...*
- **Nutzen:** Kompletter CV auf einen Blick für Sponsoren und Fans.

## Nächste Schritte (Implementation)
1.  [ ] **Datenbank-Schema erweitern:** `history` Array und `next_race` Feld im Driver-Modell.
2.  [ ] **UI-Update:** "Next Race" Badge im Header integrieren.
3.  [ ] **UI-Update:** "Season 2026" zu "Career Stats" (expandable) ausbauen.
4.  [ ] **Private Area:** Login-Bereich für Fahrer (Mockup).

---
Erstellt: 28.02.2026

## 4. Mobile App Strategie (The "App" Goal)
- **Phase 1: PWA (Progressive Web App)**
    - Das aktuelle Dashboard ist bereits "Mobile First".
    - Wir fügen ein  und Service Worker hinzu.
    - **Resultat:** User können "Zum Home-Bildschirm hinzufügen" klicken. Es sieht aus wie eine App, fühlt sich so an (keine Adressleiste), läuft aber im Browser-Kern. Push-Notifications funktionieren hier bereits (Android/iOS 16.4+).
- **Phase 2: Native Wrapper (Capacitor/React Native)**
    - Wir verpacken die PWA in einen nativen Container.
    - **Resultat:** Echte App im App Store / Play Store.
    - Zugriff auf tiefere Hardware-Funktionen (Biometrie/FaceID für den "Lizenz-Safe", Offline-Modus für Setup-Sheets an der Strecke).

## 4. Mobile App Strategie (The "App" Goal)
- **Phase 1: PWA (Progressive Web App)**
    - Das aktuelle Dashboard ist bereits "Mobile First".
    - Wir fügen ein `manifest.json` und Service Worker hinzu.
    - **Resultat:** User können "Zum Home-Bildschirm hinzufügen" klicken. Es sieht aus wie eine App, fühlt sich so an (keine Adressleiste), läuft aber im Browser-Kern. Push-Notifications funktionieren hier bereits (Android/iOS 16.4+).
- **Phase 2: Native Wrapper (Capacitor/React Native)**
    - Wir verpacken die PWA in einen nativen Container.
    - **Resultat:** Echte App im App Store / Play Store.
    - Zugriff auf tiefere Hardware-Funktionen (Biometrie/FaceID für den "Lizenz-Safe", Offline-Modus für Setup-Sheets an der Strecke).

## 5. Monetization Strategy & Expansion (Michael's Vision)
### B2B: "Strava for Racing"
- **AI Performance Analysis:** Automatisches Feedback zur Session (basierend auf Foto/Daten). "Wie gut war der Stint?"
- **Engineer Interface:** Eigener Zugang für Ingenieure, um Setup-Daten direkt einzuspeisen (Laptop-Schnittstelle).
- **Verification Gate:** Start kostenlos (Onboarding) -> später Paywall/Abo für erweiterte History & Analytics.

### B2C: Fan-Economy
- **"Cards as Keys":** Besitz einer Sammelkarte schaltet exklusive Daten oder Inhalte im Profil frei (Token-Gating).
- **Gamification:** Fans müssen Leistungen "freikaufen" oder abonnieren, um tiefe Insights zu sehen.

## 6. Hardware-Integration (Karting Special)
- **Alfano/MyChron Schnittstelle:**
    - Viele Kart-Dashboards (Alfano 6, MyChron 5) bieten Bluetooth-Export.
    - **Ziel:** Direkter Import der  oder Rohdaten in die RaceMates App.
- **Analytics-Features:**
    - **Reifendruck-Wizard:** Eingabe Kalt/Warm -> KI berechnet optimales Delta basierend auf Streckentemp.
    - **Theoretical Best:** Automatischer Abgleich der Sektoren.
    - **Setup-Empfehlung:** "Bei 20°C Luft und Untersteuern -> Luftdruck vorne -0.05 bar" (wenn genug Daten da sind).

## 6. Hardware-Integration (Karting Special)
- **Alfano/MyChron Schnittstelle:**
    - Viele Kart-Dashboards (Alfano 6, MyChron 5) bieten Bluetooth-Export.
    - **Ziel:** Direkter Import der CSV oder Rohdaten in die RaceMates App.
- **Analytics-Features:**
    - **Reifendruck-Wizard:** Eingabe Kalt/Warm -> KI berechnet optimales Delta basierend auf Streckentemp.
    - **Theoretical Best:** Automatischer Abgleich der Sektoren.
    - **Setup-Empfehlung:** "Bei 20°C Luft und Untersteuern -> Luftdruck vorne -0.05 bar" (wenn genug Daten da sind).
