# FSE_Landerer_TDD

## AUFGABE 1: THEORIE

### Testdriven Development
Test Driven Development (TDD) ist eine Entwicklungspraktik, bei der Tests geschrieben werden, bevor der eigentliche Code geschrieben wird. Der Prozess besteht aus drei Schritten:

- Schreiben eines Tests: Zuerst wird ein Test geschrieben, der beschreibt, was das Programm tun soll. Dieser Test sollte fehlschlagen, da der Code, der das Verhalten implementiert, noch nicht geschrieben wurde.

- Schreiben des Codes: Als nächstes wird der Code geschrieben, der den Test bestehen lässt. Dieser Code sollte so einfach wie möglich sein und nur das nötigste tun, um den Test zu bestehen.

- Refactoring: Nachdem der Test erfolgreich bestanden wurde, wird der Code überarbeitet, um sicherzustellen, dass er lesbar, effizient und wartbar ist. Dann wird der Prozess mit einem neuen Test wiederholt.

Dieser iterative Prozess soll sicherstellen, dass der Code zuverlässig funktioniert und dass erwartete Ergebnisse produziert. Es kann auch dazu beitragen, Fehler frühzeitig zu entdecken und Zeit und Kosten zu sparen, da Fehler frühzeitig im Entwicklungsprozess gefunden und behoben werden können.

### Red-Green-Refactor
Red-Green-Refactor ist ein zentraler Teil des Test Driven Development (TDD) Prozesses und beschreibt die drei Schritte, die während der Entwicklung durchlaufen werden:

- Red: Im ersten Schritt schreibt man einen Test, der beschreibt, welche Funktion das Programm erfüllen soll. Da noch kein Code geschrieben wurde, der diese Funktion erfüllt, wird der Test fehlschlagen und "rot" sein.

- Green: Im zweiten Schritt schreibt man Code, um den Test zu bestehen, sodass der Test "grün" wird. Der Code sollte so einfach wie möglich sein, um nur die geforderte Funktion auszuführen.

- Refactor: Im dritten Schritt wird der Code verbessert, um sicherzustellen, dass er lesbar, wartbar und effizient ist, ohne dass der Test fehlschlägt. Dies wird als "Refactoring" bezeichnet.

Der Prozess wird wiederholt, indem man einen weiteren Test schreibt, der beschreibt, welche Funktion das Programm als nächstes erfüllen soll, und dann wieder durch die drei Schritte Red-Green-Refactor geht. Dieser iterative Prozess soll sicherstellen, dass der Code zuverlässig funktioniert und dass erwartete Ergebnisse produziert. Es kann auch dazu beitragen, Fehler frühzeitig zu entdecken und Zeit und Kosten zu sparen, da Fehler frühzeitig im Entwicklungsprozess gefunden und behoben werden können.

### FIRST-Acronym
FIRST ist ein Akronym, das oft im Kontext von Test-Driven Development (TDD) und Agile-Softwareentwicklung verwendet wird. Es steht für:

- Fast: Tests sollten schnell ausgeführt werden können, um den Entwicklungsprozess zu beschleunigen.

- Isolated: Tests sollten unabhängig von anderen Tests ausgeführt werden können, um sicherzustellen, dass Fehler leicht identifiziert und behoben werden können.

- Repeatable: Tests sollten in der Lage sein, wiederholt ausgeführt zu werden, um sicherzustellen, dass sie konsistente Ergebnisse liefern.

- Self-Verifying: Tests sollten selbst überprüfen können, ob sie erfolgreich sind oder fehlgeschlagen sind, ohne menschliche Intervention.

- Timely: Tests sollten rechtzeitig geschrieben werden, bevor der Code geschrieben wird, um sicherzustellen, dass der Code zuverlässig funktioniert und erwartete Ergebnisse produziert.

Diese Prinzipien sollen sicherstellen, dass die Tests effektiv sind und einen Beitrag zur Erstellung von zuverlässigem Code leisten. Wenn Tests diese Prinzipien erfüllen, können sie schnell ausgeführt werden, Fehler leicht identifiziert werden, der Entwicklungsprozess beschleunigt werden und zuverlässiger Code produziert werden.

### Kent Beck (welche Rolle spielt er in Bezug auf TDD)
Kent Beck ist ein bekannter Softwareentwickler und Autor, der eine wichtige Rolle bei der Entwicklung von Test Driven Development (TDD) gespielt hat.

Beck gilt als Begründer von TDD, da er in den späten 1990er Jahren begann, diese Technik zu praktizieren und darüber zu schreiben. Er hat zahlreiche Bücher über Softwareentwicklung geschrieben, darunter "Test Driven Development: By Example", das als ein Standardwerk in der Branche gilt.

Beck ist auch bekannt für seine Arbeit an der Extreme Programming (XP) Methode, einer agilen Entwicklungsmethode, die eng mit TDD verbunden ist. XP setzt stark auf TDD, um zu gewährleisten, dass der Code zuverlässig funktioniert und dass erwartete Ergebnisse produziert werden.

Beck hat sich auch als Vordenker im Bereich des Software-Designs etabliert und hat die Prinzipien von Einfachheit, Kommunikation und Feedback in der Softwareentwicklung betont. Er hat zahlreiche Auszeichnungen und Ehrungen für seine Arbeit erhalten und bleibt einflussreich in der Branche.

### Testarten

#### Unit-Tests (Sociable, Solitary, Mocks)
Unit-Tests sind eine Art von Tests, die auf einzelne Einheiten des Codes, wie z.B. Funktionen oder Methoden, angewendet werden. Es gibt verschiedene Arten von Unit-Tests, die je nach ihrem Zweck und ihrem Kontext unterschieden werden können, darunter sociable, solitary und Mock-Tests.

- Sociable Tests: Sociable Tests (auch bekannt als "Integrationstests") testen die Interaktion zwischen verschiedenen Komponenten des Systems. Diese Tests können mehrere Einheiten des Codes oder sogar mehrere Systeme umfassen und testen, ob sie korrekt zusammenarbeiten. Sociable Tests eignen sich besonders für Systeme, die aus mehreren Komponenten oder Diensten bestehen.

- Solitary Tests: Solitary Tests (auch bekannt als "Unit-Tests" oder "Isolationstests") testen einzelne Einheiten des Codes isoliert voneinander. Diese Tests überprüfen, ob die Funktion oder Methode, die getestet wird, in sich geschlossen und fehlerfrei ist. Solitary Tests eignen sich besonders für einfache Funktionen oder Methoden, die keine komplexen Interaktionen mit anderen Teilen des Systems aufweisen.

- Mock-Tests: Mock-Tests sind Tests, die verwendet werden, um die Interaktionen zwischen verschiedenen Teilen des Systems zu simulieren. Sie werden oft verwendet, um Komponenten zu testen, die auf externe Dienste oder Datenquellen zugreifen, wie z.B. Datenbanken oder APIs. Durch den Einsatz von Mock-Tests können Entwickler sicherstellen, dass die Einheiten des Codes korrekt auf externe Dienste zugreifen und auf unerwartete Bedingungen reagieren.

#### Integrationstests
Integrationstests sind Tests, die dazu dienen, das Zusammenspiel von verschiedenen Komponenten eines Systems zu testen. Im Gegensatz zu Unit-Tests, die einzelne Einheiten des Codes isoliert testen, testen Integrationstests die Interaktionen zwischen verschiedenen Komponenten des Systems.

Integrationstests können auf verschiedenen Ebenen des Systems durchgeführt werden, von der Integration von Komponenten innerhalb eines Moduls oder einer Anwendung bis hin zur Integration von mehreren Anwendungen oder Systemen. Sie können auch auf verschiedenen Ebenen der Integrationsebenen durchgeführt werden, von der Integration von Code auf der lokalen Entwicklungsplattform bis hin zur Integration auf einer Testumgebung, die der Produktion ähnelt.

Integrationstests können auf unterschiedliche Weise durchgeführt werden. Manuelle Tests, bei denen Testszenarien manuell ausgeführt werden, sind eine Möglichkeit, Integrationstests durchzuführen. Automatisierte Tests, bei denen Integrationstests automatisiert durchgeführt werden, sind jedoch die bevorzugte Methode. Automatisierte Integrationstests können mit verschiedenen Tools und Frameworks durchgeführt werden, einschließlich spezialisierter Integrationstest-Frameworks und Testautomatisierungs-Tools.

Integrationstests sind ein wichtiger Bestandteil des Testprozesses, da sie dazu beitragen, sicherzustellen, dass die verschiedenen Komponenten des Systems ordnungsgemäß zusammenarbeiten und dass das System als Ganzes zuverlässig und fehlerfrei ist. Durch Integrationstests können Probleme wie Integrationsschwierigkeiten, Inkompatibilitäten zwischen verschiedenen Komponenten oder Fehlfunktionen bei der Datenübertragung oder -verarbeitung entdeckt und behoben werden, bevor das System in die Produktion geht.

#### UI-Tests / End-To-End Tests / Systemtests
UI-Tests, End-to-End-Tests und Systemtests sind alle Arten von Tests, die darauf abzielen, das gesamte System in seiner Gesamtheit zu testen.

- UI-Tests: UI-Tests testen die Benutzeroberfläche (UI) des Systems. Sie testen, ob die UI korrekt funktioniert und ob die Benutzeraktionen die erwarteten Ergebnisse liefern. UI-Tests können entweder manuell oder automatisiert durchgeführt werden und erfordern typischerweise eine Testumgebung, die der tatsächlichen Produktionsumgebung so nahe wie möglich kommt.

- End-to-End-Tests: End-to-End-Tests testen das gesamte System vom Start bis zum Ende und simulieren typischerweise eine reale Nutzungssituation. Sie prüfen, ob alle Systemkomponenten und Interaktionen wie erwartet funktionieren und ob das System in der Lage ist, die vom Benutzer benötigten Ergebnisse zu liefern. End-to-End-Tests können manuell oder automatisiert durchgeführt werden und erfordern typischerweise eine Testumgebung, die der tatsächlichen Produktionsumgebung so nahe wie möglich kommt.

- Systemtests: Systemtests testen das System als Ganzes und überprüfen, ob alle Komponenten korrekt zusammenarbeiten und ob das System wie erwartet funktioniert. Sie prüfen, ob das System alle Anforderungen erfüllt und ob es in der Lage ist, die vom Benutzer benötigten Ergebnisse zu liefern. Systemtests können manuell oder automatisiert durchgeführt werden und erfordern typischerweise eine Testumgebung, die der tatsächlichen Produktionsumgebung so nahe wie möglich kommt.

#### Akzeptanztests
Akzeptanztests sind Tests, die darauf abzielen, zu überprüfen, ob das System die Anforderungen erfüllt und ob es den Bedürfnissen des Benutzers entspricht. Diese Tests werden normalerweise durchgeführt, um sicherzustellen, dass das System die gewünschte Funktionalität bietet und dass es korrekt funktioniert, bevor es dem Benutzer bereitgestellt wird.

Akzeptanztests werden typischerweise durchgeführt, um sicherzustellen, dass das System den Anforderungen der Benutzer entspricht und dass es in der Lage ist, die vom Benutzer erwarteten Ergebnisse zu liefern. Sie können manuell oder automatisiert durchgeführt werden und umfassen typischerweise Szenarien, die typische Benutzeraktivitäten und -interaktionen simulieren.

Die Ergebnisse von Akzeptanztests werden normalerweise in Form von Berichten oder Scorecards präsentiert, die den Entwicklern und anderen Stakeholdern dabei helfen, die Funktionalität und Qualität des Systems zu bewerten. Diese Ergebnisse können auch dazu beitragen, Entscheidungen über die Freigabe des Systems oder die Durchführung weiterer Tests zu treffen.

Akzeptanztests sind ein wichtiger Bestandteil des Testprozesses, da sie dazu beitragen, sicherzustellen, dass das System den Anforderungen der Benutzer entspricht und dass es in der Lage ist, die erwarteten Ergebnisse zu liefern. Durch Akzeptanztests können Probleme wie fehlende Funktionalität, fehlerhafte Ergebnisse und unerwartete Verhaltensweisen des Systems entdeckt und behoben werden, bevor es dem Benutzer zur Verfügung gestellt wird.

### Testpyramide
Die Testpyramide ist ein Konzept in der Softwareentwicklung, das besagt, dass ein Testprozess aus einer hierarchischen Struktur von Tests bestehen sollte, die verschiedene Arten von Tests auf verschiedenen Ebenen umfassen. Die Idee ist, dass durch diese Struktur eine optimale Testabdeckung und -effizienz erreicht werden kann.

Die Testpyramide besteht aus drei Ebenen:

- Unit-Tests: Die Basis der Pyramide sind Unit-Tests. Sie testen einzelne Einheiten des Codes, wie z.B. Funktionen oder Methoden. Sie sollten schnell und einfach automatisiert werden können und in der Regel die meisten Tests im Testprozess ausmachen.

- Integrationstests: Die mittlere Ebene der Pyramide sind Integrationstests. Sie testen die Interaktion zwischen verschiedenen Komponenten des Systems, wie z.B. die Integration von Modulen oder Diensten. Sie sollten weniger häufig als Unit-Tests durchgeführt werden, aber immer noch weitgehend automatisiert sein.

- UI-Tests / End-to-End-Tests: Die Spitze der Pyramide sind UI-Tests oder End-to-End-Tests. Diese Tests testen das System als Ganzes, einschließlich der Benutzeroberfläche und der Interaktion zwischen verschiedenen Komponenten des Systems. Sie sollten am wenigsten häufig durchgeführt werden, da sie länger dauern und schwieriger zu automatisieren sind.

Die Idee hinter der Testpyramide ist, dass sie eine optimale Testabdeckung und -effizienz bietet, indem sie einen größeren Fokus auf die Automatisierung von Tests legt und Unit-Tests als Basis für den Testprozess verwendet. Durch die Kombination von verschiedenen Testtypen können Entwickler sicherstellen, dass das System zuverlässig und fehlerfrei ist, bevor es in die Produktion geht.

### JUNIT (Junit5)
JUnit ist ein weit verbreitetes Open-Source-Testframework für Java, das dazu dient, Unit-Tests zu schreiben und auszuführen. Die aktuelle Version ist JUnit 5, auch bekannt als Jupiter.

JUnit bietet eine umfangreiche Suite von APIs und Annotationen, die Entwickler verwenden können, um Tests schnell und einfach zu schreiben. Einige der wichtigsten Funktionen von JUnit umfassen:

- Assert-Methode: JUnit bietet eine Vielzahl von Assert-Methode, die Entwickler verwenden können, um zu überprüfen, ob ein Test erfolgreich ist oder nicht. Dies erleichtert das Schreiben von Tests und das Überprüfen der erwarteten Ergebnisse.

- Testrunner: JUnit bietet einen Testrunner, der verwendet wird, um Tests auszuführen. Der Testrunner führt alle Tests automatisch aus und gibt Informationen darüber aus, welche Tests erfolgreich waren und welche fehlgeschlagen sind.

- Annotations: JUnit bietet eine Vielzahl von Annotationen, die verwendet werden können, um Tests und Testklassen zu konfigurieren. Beispiele für Annotationen sind @Test, @Before, @After, @BeforeEach und @AfterEach.

- Erweiterbarkeit: JUnit ist sehr erweiterbar und ermöglicht es Entwicklern, eigene Erweiterungen und Plugins zu schreiben, um den Funktionsumfang von JUnit zu erweitern.

JUnit ist eines der am häufigsten verwendeten Testframeworks in der Java-Entwicklung und wird von vielen IDEs und Build-Tools unterstützt. Durch die Verwendung von JUnit können Entwickler sicherstellen, dass der Code zuverlässig funktioniert und dass erwartete Ergebnisse produziert werden, bevor er in die Produktion geht.

### Mockito (Sinn und Funktionsweise von Mocking-Bibliotheken)
Mockito ist eine populäre Mocking-Bibliothek für Java, die es Entwicklern ermöglicht, Mock-Objekte zu erstellen, um Tests von komplexen Interaktionen zwischen verschiedenen Komponenten zu vereinfachen. Mocking ist eine Technik, bei der ein Stub-Objekt erstellt wird, das die Funktionalität einer bestimmten Klasse oder eines bestimmten Objekts imitiert, um es zu isolieren und Tests einfacher zu machen.

Die Funktionsweise von Mockito besteht darin, dass Entwickler Mock-Objekte erstellen, die die gleiche Schnittstelle wie die zu testende Komponente haben. Diese Mock-Objekte können dann verwendet werden, um Tests zu schreiben, die sich auf die Interaktionen zwischen der zu testenden Komponente und anderen Komponenten im System konzentrieren, ohne dass die tatsächlichen Komponenten involviert sind.

Mockito bietet eine Vielzahl von Funktionen und APIs, die Entwicklern helfen, Mock-Objekte effektiv zu verwenden und zu verwalten. Dazu gehören Methoden zum Setzen von Rückgabewerten für Mock-Methoden, zum Überprüfen von Methodenaufrufen auf Mock-Objekten und zum Konfigurieren von Verhaltensweisen für Mock-Objekte.

Die Verwendung von Mock-Objekten und Mocking-Bibliotheken wie Mockito kann Entwicklern dabei helfen, Tests effektiver und effizienter zu schreiben, indem sie die Komplexität der Tests reduzieren und die Testbarkeit von Code erhöhen. Durch die Verwendung von Mock-Objekten können Entwickler sicherstellen, dass der Code zuverlässig funktioniert und dass erwartete Ergebnisse produziert werden, bevor er in die Produktion geht.

## AUFGABE 2: AUSGANGSPROJEKT

![Test_01_ok](Bilder/Test_01_ok.jpg)

![Main_01_ausgeführt](Bilder/Main_01_ausgef%C3%BChrt.jpg)

## AUFGABE 3: EINARBEITUNG IN DEN GEGEBENEN CODE

![Main_02_ausgeführt](Bilder/Main_02_ausgeführt.jpg)

## AUFGABE 4: JUNIT-TESTS FÜR KINOSAAL

![KinosaalTest_01_ok](Bilder/KinosaalTest_01_ok.jpg)

## AUFGABE 5: JUNIT-TESTS FÜR VORSTELLUNG

![VorstellungTest_01_ok](Bilder/VorstellungTest_01_ok.jpg)

## AUFGABE 6: JUNIT-TESTS FÜR KINOVERWALTUNG

![KinoVerwaltungTest_01_ok](Bilder/KinoVerwaltungTest_01_ok.jpg)

## AUFGABE 7: JUNIT-TESTS ADVANCED

![AdvancedTest_01_ok](Bilder/AdvancedTest_01_ok.jpg)
![AdvancedTest_02_ok](Bilder/AdvancedTest_02_ok.jpg)
![AdvancedTest_03_ok](Bilder/AdvancedTest_03_ok.jpg)
![AdvancedTest_04_ok](Bilder/AdvancedTest_04_ok.jpg)

Die Rückgabetypen, die in den Testmethoden verwendet werden, sind alle Java-Sammlungstypen, die einen Satz von DynamicTest-Objekten enthalten. Jeder Rückgabetyp hat seine eigenen Eigenschaften und Verwendungszwecke:

- ````Iterable<DynamicTest>````: Iterable ist ein Interface, das eine Sammlung repräsentiert, über die iteriert werden kann. Es ist das grundlegende Interface, das von anderen Sammlungstypen wie List und Set implementiert wird. In diesem Fall gibt dynamicTestsWithIterable() eine Liste von DynamicTest-Objekten zurück, die als ````Iterable<DynamicTest>```` behandelt wird. Das bedeutet, dass Sie einfach über die Testobjekte iterieren und sie ausführen können.

- ````Iterator<DynamicTest>````: Iterator ist ein Interface, das eine Möglichkeit bietet, über eine Sammlung von Elementen zu iterieren, ohne die zugrunde liegende Implementierung der Sammlung zu kennen. Im Beispiel dynamicTestsWithIterator() wird eine Liste von DynamicTest-Objekten erstellt und anschließend in einen Iterator konvertiert, bevor sie zurückgegeben wird. Der Hauptunterschied zwischen Iterable und Iterator besteht darin, dass Iterator speziell für das Iterieren über eine Sammlung konzipiert ist und Methoden wie hasNext() und next() enthält, um die Iteration durchzuführen.

- ````Stream<DynamicTest>````: Stream ist eine Sequenz von Elementen, die parallele und sequenzielle Aggregate-Operationen unterstützt. Im Gegensatz zu Iterable und Iterator, die eher für traditionelle Sammlungen konzipiert sind, bietet Stream eine funktionale Programmierweise für die Verarbeitung von Sammlungen. Im Beispiel dynamicTestsFromIntStream() wird ein IntStream verwendet, um geradzahlige Zahlen zu generieren, die anschließend in DynamicTest-Objekte umgewandelt werden. Der resultierende ````Stream<DynamicTest>```` ermöglicht es Ihnen, Funktionen wie map, filter und reduce zu verwenden, um komplexe Testlogiken einfach zu implementieren.

Jeder dieser Rückgabetypen ermöglicht es JUnit, die dynamisch generierten Tests auszuführen. Sie können den für Ihre Anforderungen am besten geeigneten Typ auswählen, abhängig von der Art der Sammlung und den gewünschten Operationen, die Sie darauf ausführen möchten.

````java
@TestFactory
    List<DynamicTest> testKaufeTicketMitZufaelligenWerten() {
        int testAnzahl = 100; // Anzahl der zufälligen Tests
        long seed = 42; //
        /*
         * Wird verwendet, um Random mit einem Seed zu erstellen. Dies ermöglicht es, die mit Random generierten
         * Zufallswerte reproduzierbar zu machen. Das ist, vor allem mit Tests, die mehrmals ausgeführt werden, wichtig,
         * da diese konstant sein sollten.
         */
        Random random = new Random(seed);
        List<DynamicTest> dynamicTests = new ArrayList<>(); //Liste mit Tests

        for (int i = 0; i < testAnzahl; i++) { //ForSchleife, die, in diesem Fall, 100-mal durchgeführt werden.
            char reihe = (char) ('A' + random.nextInt(4)); // Zufällige Reihen: 'A', 'B', 'C', 'D'
            int platz = random.nextInt(19) + 1; // Zufällige Plätze: 1-20
            float geld = random.nextFloat() * 20; // Zufällige Geldbeträge: 0.0 - 20.0

            /*
             * In jedem Schleifendurchlauf wird ein DynamicTest-Objekt erstellt und mit den Testwerten befüllt.
             * Der erste Parameter des DynamicTests ist der DisplayName, der nach Ablauf des Tests angezeigt und mit
             * den verwendeten Werten befüllt ist. Anschließend werden in einer Lambda-Expression die eigentlichen
             * Tests durchgeführt. Im Try-Block wird geprüft, ob das Ticket korrekt erstellt wurde und nicht "null" ist,
             * ob die Reihe der vorgegebenen entspricht und ob der Platz dem vorgegebenen entspricht. Sollten
             * Exception auftreten, werden diese in den catch-Blöcken gefangen und auf ihre Korrektheit geprüft.
             */
            DynamicTest dynamicTest = DynamicTest.dynamicTest(
                    "Test Ticketkauf mit Reihe: " + reihe + ", Platz: " + platz + ", Geld: " + geld, () -> {

                        try {
                            Ticket ticket = kinoVerwaltung.kaufeTicket(v1, reihe, platz, geld);
                            assertNotNull(ticket, "Das Ticket sollte nicht null sein");
                            assertEquals(reihe, ticket.getReihe());
                            assertEquals(platz, ticket.getPlatz());
                        } catch (IllegalArgumentException e) {
                            assertTrue(e.getMessage().equals("Nicht ausreichend Geld.")
                                            || e.getMessage().startsWith("Der Platz "),
                                    "Unerwartete IllegalArgumentException: " + e.getMessage());
                        } catch (IllegalStateException e) {
                            assertTrue(e.getMessage().startsWith("Der Platz "),
                                    "Unerwartete IllegalStateException: " + e.getMessage());
                        }
                    });

            dynamicTests.add(dynamicTest);
        }

        return dynamicTests;
    }
````


![AdvancedTest_05_ok](Bilder/AdvancedTest_05_ok.jpg)

## AUFGABE 8: MOCKITO EINFÜHRUNG

![Mochtest_01_ok](Bilder/Mocktest_01_ok.jpg)

![Mochtest_02_ok](Bilder/Mocktest_02_ok.jpg)

![Mochtest_03_ok](Bilder/Mocktest_03_ok.jpg)

## AUFGABE 9: SELENIUM EINFÜHRUNG

Im Projekt TestSeleniumChatGPT wurde ein einfacher Selenium Test erstellt.
Zun#chst wird in der Methode 'setUp()' eine neue Firefox-Instanz mithilfe eines 'geckodriver.exe' erstellt. Im eigentlichen Test wird dann die gewünschte Seite aufgerufen und die Cookies über den Banner bestätigt. Als nächstes wird das Suchfeld gesucht und mit dem Suchtext befüllt. Nachdem auf die Ergebnisse gewartet wurde, werden diese nach einem bestimmten Element durchsucht - in diesem befinden sich die Suchergebnisse. Diese werden anschließend mit einer ForEach-Schleife nach dem gewünschten Wort durchsucht und das Ergebnis wird ausgegeben.

````java
public class MySeleniumTest {
    // Instanzvariable für den WebDriver, die zum Steuern des Browsers verwendet wird
    private WebDriver driver;

    // Set-Up-Methode, die vor jedem Test ausgeführt wird
    @Before
    public void setUp() {
        // Setzen des Pfades zum GeckoDriver, der für Firefox erforderlich ist
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        // Erstellen einer neuen FirefoxDriver-Instanz
        driver = new FirefoxDriver();
    }

    // Testmethode, die die Google-Suche testet
    @Test
    public void testSearch() {
        // Öffnen der Google-Website
        driver.get("https://www.google.com");
        // Akzeptieren von Cookies auf der Google-Website
        acceptGoogleCookies(driver);

        // Suchfeld auf der Google-Website suchen und Text eingeben
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        // Absenden des Suchformulars
        searchBox.submit();

        // Warten, bis die Suchergebnisse geladen sind
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".g")));

        // Überprüfen der Suchergebnisse
        List<WebElement> searchResults = driver.findElements(By.cssSelector(".g"));
        boolean seleniumFound = false;

        // Durchlaufen der Suchergebnisse und Überprüfen, ob "Selenium" im Text enthalten ist
        for (WebElement result : searchResults) {
            if (result.getText().toLowerCase().contains("selenium")) {
                seleniumFound = true;
                break;
            }
        }

        // Bestätigen, dass mindestens ein Suchergebnis "Selenium" enthält
        assertTrue("Selenium not found in search results.", seleniumFound);
    }

    // Hilfsmethode zum Akzeptieren von Cookies auf der Google-Website
    public void acceptGoogleCookies(WebDriver driver) {
        try {
            // Warten auf das Cookie-Banner, falls es vorhanden ist
            Thread.sleep(2000);
            WebElement cookieBanner = driver.findElement(By.id("CXQnmb"));
            // Klicken auf den "Ich stimme zu"-Button, um Cookies zu akzeptieren
            WebElement acceptButton = cookieBanner.findElement(By.id("L2AGLb"));
            acceptButton.click();
        } catch (TimeoutException e) {
            System.out.println("Cookie banner not found. Proceeding without accepting cookies.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Tear-Down-Methode, die nach jedem Test ausgeführt wird
    @After
    public void tearDown() {
        // Schließen des Browsers und Beenden des WebDriver
        driver.quit();
    }
}
````

![Selenium_01_ok](Bilder/Selenium_01_ok.jpg)

## AUFGABE 10: TDD IST DEAD

### Warum TDD (Test Driven Development) überbewertet ist!

Der Sprecher geht zunächst auf drei wesentliche Punkte von TDD ein:

- Nicht gut strukturierter Code ist schwer zu testen.
- Code entsteht nur dann, wenn es einen fehlschlagenden Test gibt.
- Für jede Codezeile gibt es einen Test, der diese begründet.
- Sehr hohe Testabdeckung - dadurch kann der Code gut aufgeräumt werden (Red-Green-Refactoring) 
Wendet man TDD an, so entsteht, nach guter Einarbeitung, viel sauberer und strukturierterer Code, als wenn man nach Büchern wie CleanCode, DesignPatterns o.Ä. codet. Bedingung für TDD: ich weiß genau, auf welches Ziel ich hinarbeite. Ich muss zunächst genau überlegen, was meine Funktion können soll, ob diese einen eindeutigen Rückgabetyp hat, ob sie Parameter entgegennimmt und ob es sein kann, dass z.B. eine Validierungsfunktion bei positiver Validierung einen Boolean zurück gibt und bei negativer eine Exception wirft. Wenn man Tests schreibt, muss man sich genau über solche Dinge aber auch Bezeichnung o.Ä. gedanken machen. Wenn ich aber noch nicht weiß, wie die Signatur der Funktion/en aussehen oder ich noch gar nicht genau verstehe, welches Problem ich eigentlich lösen muss, ist vor allem TDD nicht sinnvoll. Man würde dann denken, dass man einfach klein beginnt - sich Stück für Stück weiterarbeitet. Man könnte meinen, dass TDD dafür perfekt ist, da man dort ja auch mit kleinen Funktionen beginnt, immer wieder Tests schreibt und danach aufräumt. Aber diese Annahme ist falsch. Wenn man den Code andauernd Refactorn muss, so muss auch dauernd der Test refactored werden. Fügt man z.B. bei einer Methode einen zusätzlichen Parameter hinzu, so kann es passieren, dass man einige 100 Tests ebenfalls nachbessern muss, da diese die Methode verwenden könnten. Dies kann einige Zeit in Anspruch nehmen. Außerdem kann es passieren, dass man anschließend bemerkt, dass der neue Parameter doch nicht notwendig gewesen wäre, da es eine viel elegantere Lösung gibt, dann war das Refactoring umsonst. TDD ist also an dieser Stelle nicht hilfreich. Bis ich ein Problem noch nicht richtig verstanden habe, sollte ich Tests erstmal weglassen und versuchen, das Problem zu 100% zu verstehen und den Code ohne Tests zu entwickeln. Zumindest bis zu diesem Punkt, bis man einen Lösungsansatz gefunden hat und das Problem verstanden hat. Wenn man dann einen Lösungsansatz gefunden hat, sollte man den Code verwerfen und noch einmal von 0 beginnen - dieses mal mit der Verwendung von Tests. Das erfordert Disziplin - die aber sowieso für das Arbeiten mit TDD vorhanden sein soll. 
Niedrige Kopplung und hohe Kohäsion sind wichtig für gut Strukturierten Code und die Anwendung von TDD. Gut strukurierter Code kann auch ohne TDD entstehen, wenn man z.B. das SOLID-Prinzip verstanden hat und weiß, wie man es einbaut. TDD ist hilfreich, diese Struktur zu lernen. 
Neue Entwickler:innen sollten sich intensiv mit TDD auseinandersetzen, um zu lernen, wie man gut strukturierten und Qualitativ hochwertigen Code schreibt. Wenn man schon länger Erfahrung hat, kann man auch, wenn das Problem noch nicht ganz klar ist, Code ohne Tests entwickeln, da man ja weiß, wie dieser Code aufgebaut sein muss, um diesen gut testen zu können. 

### TDD Revisited 

Es gibt mehrere Ansätze, wie man Tests durchführen kann/soll. Zwei dieser Ansätze werden nun beschrieben:

- Entwickler schreiben ihre eigenen Unit-Tests - In der Praxis der TDD schreiben Entwickler zuerst Unit-Tests für ihre Funktionen oder Methoden, bevor sie den eigentlichen Code schreiben. Diese Tests beschreiben das erwartete Verhalten der Funktion oder Methode. Indem Entwickler zuerst die Tests schreiben und sie dann den eigentlichen Code entwickeln, um den Test zu bestehen, stellen sie sicher, dass der Code korrekt und fehlerfrei ist. Einige Entwickler sind der Meinung, dass das Schreiben von Unit-Tests von jemand anderem als dem Entwickler selbst durchgeführt werden sollte, um eine unvoreingenommene Sichtweise zu gewährleisten. In der TDD-Praxis ist es jedoch üblich, dass Entwickler ihre eigenen Tests schreiben, um ihre Funktionen oder Methoden kontinuierlich zu überprüfen und zu verbessern.

- Test After ist genauso effektiv wie Test First - "Test After" ist ein Ansatz, bei dem der Entwickler zunächst den Code schreibt und anschließend die Tests erstellt. Im Gegensatz dazu steht der "Test First"-Ansatz, bei dem die Tests vor der Implementierung des Codes geschrieben werden. Die Idee hinter "Test First" besteht darin, dass Entwickler den Code mit den Tests im Hinterkopf schreiben, was zu einem saubereren und weniger fehleranfälligen Code führt. "Test After" kann in einigen Fällen effektiv sein, aber der "Test First"-Ansatz hat den Vorteil, dass er dazu beiträgt, dass der Code von Anfang an auf Qualität und Fehlerfreiheit ausgerichtet ist. Es gibt auch eine stärkere Betonung der Anforderungen und Spezifikationen, bevor der Code geschrieben wird, was zu einer besseren Gesamtstruktur und Modularität führt.

### TDD is Dead?

Die Seite "Is TDD Dead?" auf martinfowler.com befasst sich mit der Frage, ob Test-Driven Development (TDD) als Entwicklungspraxis an Relevanz verloren hat. Der Artikel fasst eine Reihe von Diskussionen zwischen drei renommierten Entwicklern und Experten auf diesem Gebiet zusammen: Martin Fowler, Kent Beck und David Heinemeier Hansson. Die Diskussionen wurden in Form von sechs Video-Debatten durchgeführt, in denen sie verschiedene Aspekte von TDD und seine Bedeutung für die moderne Softwareentwicklung erörtern.

Im Verlauf der Diskussionen werden verschiedene Themen behandelt, darunter:

1. Bedeutung von Tests: Die Autoren stimmen darin überein, dass Tests für die Softwareentwicklung unerlässlich sind, um die Qualität des Codes und die Funktionalität des Systems zu gewährleisten. Sie betonen jedoch, dass der Umfang und die Art der Tests je nach Projekt und Kontext variieren können.

2. Rolle von Entwicklern beim Schreiben von Tests: Die Autoren diskutieren die Bedeutung der Entwicklerbeteiligung beim Schreiben von Tests und wie diese Tests dazu beitragen, den Entwicklungsprozess zu verbessern und die Qualität des Codes zu erhöhen.

3. Unit-Tests vs. Integrationstests: Die Diskussion dreht sich auch um die Vor- und Nachteile von Unit-Tests im Vergleich zu Integrationstests. Während Unit-Tests einzelne Komponenten des Systems isoliert prüfen, testen Integrationstests die Interaktion zwischen Komponenten. Beide Testarten haben ihren Platz in der Softwareentwicklung, und die Autoren betonen die Notwendigkeit, den richtigen Mix zu finden, der für das jeweilige Projekt am besten geeignet ist.

4. TDD-Ansätze und ihre Anwendung: Die Diskussion berührt verschiedene Ansätze von TDD, wie z.B. Test First, Test After und Test Last. Die Autoren sind sich einig, dass der richtige Ansatz vom jeweiligen Projekt und den spezifischen Anforderungen abhängt.

5. Integration von TDD in den Entwicklungsprozess: Die Autoren erörtern, wie TDD am besten in den Entwicklungsprozess integriert werden kann, und wie es in Kombination mit anderen Praktiken wie Continuous Integration und Continuous Delivery verwendet werden kann, um den Entwicklungsprozess zu optimieren.

Während die Diskussionen keine endgültige Antwort auf die Frage geben, ob TDD tot ist, stellen sie fest, dass TDD weiterhin ein wertvolles Werkzeug für Entwickler ist, solange es angemessen eingesetzt wird. Die Autoren betonen, dass der richtige Ansatz für TDD vom Kontext und den spezifischen Anforderungen des Projekts abhängt. Insgesamt sind sie sich einig, dass TDD eine bewährte Methode zur Verbesserung der Codequalität ist und Entwickler ermutigt, sich auf die Anforderungen und das Verhalten ihres Systems zu konzentrieren.