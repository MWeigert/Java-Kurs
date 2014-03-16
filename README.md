Java-Kurs
=========

##Lektion 1

###Aufgabe 1.1
Schreiben Sie ein kleines Programm bestehend aus einer Klasse, 
definieren Sie in der Klasse einige Datenfelder und eine main-Methode.

Überprüfen Sie an den Datenfeldern die Namensregeln für Identifier.

Überprüfen Sie die möglichen Modifier für die Klasse und für die Datenfelder.

Überprüfen Sie die Regeln, die für die main-Methode gelten.

###Aufgabe 1.2
Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren Sie
in der Klasse einen Konstruktor, Instanz- und Klassen-Variablen, einen 
Initialisierungsblock sowie einen statischen Initialisierungsblock.

Überprüfen Sie in Ihrer Anwendung die Reihenfolge der Initialisierungen.

###Aufgabe 1.3
Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren
Sie in der Klasse verschiedene Datenfelder vom Typ der numerischen Wrapper Klassen.

Überprüfen Sie in Ihrer Anwendung die Funktionsweise der Methoden der numerischen
Wrapper Klassen.

###Aufgabe 1.4
Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren Sie in
der Klasse ein Datenfeld vom Typ StringBuilder und ein Datenfeld vom Typ String.

Überprüfen Sie in Ihrer Anwendung die Funktionsweise der Methoden der Klassen
StringBuilder und String.

Führen Sie in einem Loop Konkatenierungs-Operationen aus für StringBuilder und
String und vergleichen Sie die Performance der beiden Klassen.

## Lektion 2

###Aufgabe 2.1
Schreiben Sie ein kleines Programm, in dem Sie die Java Operatoren <<, >>, >>>, ^, 
& und  | auf ihre Funktionalität testen.

###Aufgabe 2.2
Schreiben Sie ein kleines Programm, in dem Sie eine Klasse Kunde mit einigen 
Datenfeldern definieren. Überschreiben Sie die equals()-Methode für die Klasse 
Kunde dahin, dass Objekte der Klasse Kunde auf Gleichheit der Datenfelder überprüft 
werden.

###Aufgabe 2.3
Schreiben Sie ein kleines Programm, in dem Sie einen zweidimensionalen Array 
definieren, erzeugen und initialisieren, initialisieren Sie den Array auf zwei 
verschiedene Arten.

###Aufgabe 2.4
Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren Sie in der 
Klasse ein Datenfeld vom Typ ArrayList .

Überprüfen Sie in Ihrer Anwendung die Funktionsweise der Methoden und die Features 
der Klasse ArrayList.

Wenden Sie dir arraycopy()-Methode der Klasse System auf die ArrayList an.

Wenden Sie die Algorithmen zur Manipulation von Listen (siehe Folien) der Klasse 
Collections auf die ArrayList an.

##Lektion 3

###Aufgabe 3.1
Schreiben Sie ein kleines Programm, in dem Sie die unterschiedlichen loop-Konstrukte 
auf ihre Funftionsfähigkeit hin überprüfen.

###Aufgabe 3.2
Schreiben Sie ein kleines Programm, in dem Sie drei Klassen mit beliebigen Datenfeldern 
implementieren, 2 der Klassen sollen in einem Package abgelegt werden(eine davon soll 
zusätzlich eine einfache innere Klasse haben), die andere Klasse in einem anderen Package, 
sie soll eine Vererbungsbeziehung zu einer der beiden anderen Klassen haben, testen Sie 
die Anwendung bezüglich unterschiedlicher Access Modifiers.

###Aufgabe 3.3
Implementieren Sie eine Klasse Outer mit einem Datenfeld x und einer Methode m1().

Implementieren Sie nun in der Methode m1() eine lokale Klasse Inner, die auf das 
Datenfeld x der Klasse Outer zugreift und ihren Wert am Bildschirm ausgibt.

Implementieren Sie schliesslich noch eine main-Methode, wo Sie die Methode m1() 
aufrufen.

Versuchen Sie in einem 2. Schritt, der lokalen Klasse einen Zugriffsmodifikator zuzuweisen, 
was passiert und warum?

###Aufgabe 3.4
Implementieren Sie bitte eine Klasse Outer mit einer Methode m1(int y), in der Methode 
definieren Sie bitte zunächst eine weitere lokale Variable x und anschliessend eine lokale 
Klasse Inner, in der Sie auf die Variablen y und x zugreifen.

Testen Sie Ihren Code in einer main-Methode.

Untersuchen Sie zusätzlich noch die Funktionsweise von anonymen inneren Klassen und 
statischen inneren Klassen.

##Lektion 4

###Aufgabe 4.1
Schreiben Sie ein kleines Programm, in dem Sie die verschiedenen Möglichkeiten des 
Überschreiben und Überladen von Methoden sowie das Verdecken von Datenfeldern überprüfen. 
Zeigen Sie in dem Programm auch, wie Polymorphismus angewendet wird.

###Aufgabe 4.2
Schreiben Sie ein kleines Programm, in dem Sie eine Klasse B implementieren, diese Klasse 
soll von einer abstrakten Klasse A abgeleitet sein die wiederum ein Interface mit zwei 
Methodendeklarationen sowie zwei Konstanten implementiert, das Interface wiederum soll 
zwei weitere Interfaces ableiten, jedes dieser Interfaces definiert eine Methodendeklaration. 
Instanzieren Sie ein Objekt der Klasse B, greifen Sie auf die Konstanten zu und rufen Sie 
die Methoden auf.

###Aufgabe 4.3
Implementieren Sie drei verschiedene Exceptions, die Vererbungsbeziehungen zueinander haben. 
Zeigen Sie in Ihrer Anwendung, dass eine überschriebene Methode nur gerade die Exceptions 
werfen kann, die die Originalmethode wirft.