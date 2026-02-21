# Technische Anleitung für Andrej (RaceMates Backend)

Moin Andrej, hier ist die Roadmap für die nächsten Schritte basierend auf dem aktuellen Stand:

## 1. Aktueller Stand
- **DriverService:** Implementiert CRUD-Logik und Datenvalidierung.
- **JUnit Tests:** Erste Integrationstests für MongoDB-Anbindung sind unter `src/test` verfügbar.
- **JSON Mapping:** Die Logik zur Transformation von Rennergebnissen in DB-Entitäten ist vorbereitet.

## 2. Deine nächsten Aufgaben
- **Keycloak Integration:** Bitte binde den Keycloak-Sicherheitslayer final ein. Die Endpunkte in den Controllern sind bereits für Spring Security vorbereitet.
- **Test-Ausbau:** Erweitere die JUnit-Tests für die REST-Controller.
- **Paging-Feinschliff:** Die Paging-Logik ist aktiv, kann aber für extrem große Datenmengen noch optimiert werden.

## 3. Datenstandards
- Bitte konsequent **ISO 8601 UTC** für alle Zeitstempel beibehalten.
- Coding-Style: **camelCase**.

Bei Rückfragen einfach über Michael Bescheid geben!
