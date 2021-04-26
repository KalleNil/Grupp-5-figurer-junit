# Geometriska figurer #

### MTE21LIN - Testverktyg och hårdvaruplattformar ####
### Grupp 5 ### 
#### - Najma Bano, Nureddin Elmas, Preecha Häll, Victor Jaque, Kalle Nilsson ###


På uppdrag av vår före detta lärare, Marcus, har vi byggt upp ett klassbibliotek för geometriska figurer.
Utöver detta har vi även skapat automatiska tester med JUnit, samt JBehave.
__OBS. Detta är inte ett körande program, utan ett bibliotek med moduler. Det finns ingen main metod att köra så användaren måste hårdkoda sina värden__

## Installation ##
Windows:
Kopiera följande och klistra in i [Git Bash](https://git-scm.com/downloads)
 
`git clone https://github.com/KalleNil/Grupp-5-figurer-junit`

Öppna projekt i valfri IDE. Apache NetBeans och Oracle Eclipse har använts under utveckling och skall fungera.
Från:
 
`.\nbcproject\`


Importera följande .JAR filer från till projektets 'Test Libraries' i din IDE:
 

```-commons.io.2.8.0.jar
-commons.lang-3-3.11.jar
-commons-text-1.9.jar
-freemarker-2.3.30.jar
-gson-2.8.5.jar
-hamcrest-2.2.jar
-hamcrest-core-4.8.3.jar
-jbehave-core-4.8.3.jar
-junit-4.13.1.jar
-paranamer-2.8.jar
-plexus-utils-3.3.0.jar
-xmlpull-1.1.3.1.jar
-xpp3_min-1.1.4c.jar
-xstream-1.4.15.jar
```
## Användning ##
__OBS. Som nämnt ovan, detta är inte ett körbart program, utan en samling moduler med funktioner för att räkna ut area och omkrets__

I och med att vi läser till mjukvarutestare har vi valt att utveckla ett 
 icke-körbart program för att lättare förstå oss på automatiska tester med JUnit.
Med andra ord kommer inget att hända om du väljer att köra programmet. 
Vårat program ligger i testfilerna istället.
 
#### För att köra JUnit tester : ####
Högerklicka på filen 
 

`.\test\TestAvObjekt.java`


och tryck "Test File" (CTRL+F6 i NetBeans för kortkommando)
 
För att se förinställda testvärden inför test, öppna 
 

`.\test\test_av_objekt.story
`
 
 i valfri ordbehandlingsprogram

#### För att köra JBehave test: ####
Högerklicka på filen

`
.\test\CirkelIT.java
`

och tryck "Test File" (CTRL+F6 i NetBeans för kortkommando)

För att se förinställda testvärden inför test, öppna 

`
.\test\cirkel_i_t.story
`

i valfri ordbehandlingsprogram.

###### Mer dokumentation ######
All dokumentation kring testfall finns på vår [JIRA-plattform](https://team-1617087125307.atlassian.net/secure/RapidBoard.jspa?rapidView=2&projectKey=GGEZ)
