# Concept: RaceMates Prediction Market & Live Data

## Vision
Echtzeit-Daten als Treibstoff für den Prediction Market. Fans wetten nicht nur auf Ergebnisse, sondern auf Live-Ereignisse (Sektorzeiten, Pitstops), basierend auf echten Telemetriedaten.

## 1. Live Data Integration (Requirement)
- **Source:** Offizielle Live-Timing Feeds (WEC, DTM, GT World Challenge).
- **Target:** Anzeige direkt im Dashboard oder auf .
- **Datenpunkte:**
    - **Session Start Times:** Qualifying & Race (Countdown).
    - **Streaming Links:** Deep-Links zu Sky, WOW, YouTube (wo läuft was?).
    - **Live Timing Link:** Direktzugriff auf die Zeitnahme für Fans.

## 2. Prediction Mechanics
- **Pre-Race:** Wer holt Pole? Wer gewinnt? (Klassisch).
- **In-Race (Live):** 
    - "Fährt Rast im nächsten Stint unter 1:48.5?"
    - "Wer ist schneller im Sektor 2: Preining oder Engel?"
- **Resolution:** Automatische Auswertung durch den Live-Timing-Feed.

## 3. Tech Stack Needed
- **Scraper/API:** Mitchi-Dev muss Feeds von Alkamel (WEC) oder TSL (GT) anzapfen.
- **Frontend:** Widget "Next Session" mit Countdown und Stream-Button.

---
Status: Draft (28.02.2026) - Input by Michael
