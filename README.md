# App Turoldo

Applicazione Android sviluppata in Kotlin con Android Studio per fornire agli studenti un accesso rapido ai principali servizi scolastici.

## Funzionalità

L'app permette di accedere rapidamente a:

- 📅 Orario delle classi
- 📘 PTOF
- 🖥 Registro elettronico
- 📚 Libri di testo

## Tecnologie utilizzate

- Kotlin
- Android Studio
- ConstraintLayout
- Material Design 3
- XML Layout

## Interfaccia

L’interfaccia è stata realizzata seguendo i principi del Material Design per garantire:

- UI moderna
- Compatibilità con diversi schermi
- Pulsanti responsive
- Design semplice e intuitivo

## Struttura del progetto

```plaintext
app/
 ├── java/com.example.myapplication/
 │    └── MainActivity.kt
 │
 ├── res/
 │    ├── layout/
 │    │    └── activity_main.xml
 │    │
 │    ├── drawable/
 │    │    └── stemma.png
 │    │
 │    └── values/
 │         ├── themes.xml
 │         └── colors.xml
```

## Requisiti

- Android Studio
- SDK Android 24+
- Gradle compatibile con Material3

## Installazione

1. Clonare il repository:

```bash
git clone https://github.com/TUO_USERNAME/NOME_REPOSITORY.git
```

2. Aprire il progetto con Android Studio

3. Sincronizzare Gradle

4. Avviare l'app su emulatore o dispositivo Android

## Dipendenze principali

Nel file `build.gradle (:app)`:

```gradle
implementation "androidx.constraintlayout:constraintlayout:2.1.4"
implementation "com.google.android.material:material:1.11.0"
```

## Possibili miglioramenti futuri

- Dark Mode
- Animazioni Material
- Bottom Navigation
- Supporto tablet
- Integrazione notifiche
- Collegamento API scolastiche
- Migrazione a Jetpack Compose

## Screenshot

_Aggiungere qui eventuali screenshot dell'app._

## Licenza

Questo progetto è distribuito a scopo didattico.
