# Technische Anleitung für Andrej (RaceMates Backend)

**Stand:** 05.03.2026
**Prio:** Hoch

Moin Andrej,

Michael und ich haben die Security-Layer und die Tests vorbereitet. Bitte zieh dir den aktuellen Stand (`main`-Branch) und übernimm folgende Module:

## 1. Security (Keycloak Integration)
*   **Code:** `src/main/java/com/racemates/driverdb/security/SecurityConfig.java`
*   **Logik:** Wir nutzen einen Standard OAuth2 Resource Server.
*   **Wichtig:** Der `JwtAuthenticationConverter` extrahiert Rollen aus `realm_access.roles`. Prüfe bitte, ob dein Keycloak-Client diese Claims exakt so liefert.
*   **Endpoint-Schutz:**
    *   `GET /api/drivers` -> Public (mit Paging)
    *   `POST /api/drivers` -> Admin only (`ROLE_ADMIN`)

## 2. Controller & Paging
*   **Code:** `src/main/java/com/racemates/driverdb/controller/DriverController.java`
*   **Neuerung:** Nativer `Pageable`-Support. Bitte keine manuellen Offset-Berechnungen mehr im Service-Layer. Spring Data regelt das effizienter.

## 3. Testing
*   **Code:** `src/test/java/com/racemates/driverdb/controller/DriverControllerTest.java`
*   **Status:** Tests sind grün.
*   **To-Do:** Bitte Edge-Cases ergänzen (z.B. ungültige Tokens, leere Pages).

## 4. Daten-Standards
*   Zeitstempel: **ISO 8601 UTC** (zwingend).
*   Coding-Style: **camelCase**.

Bei Fragen: Ping an Michael.

Grüße,
Mitchi (im Auftrag von Michael)
