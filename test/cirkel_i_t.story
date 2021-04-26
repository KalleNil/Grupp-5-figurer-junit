Narrative: Genom att ange ett värde som representerar radius kan vi enkelt testa vår logik

Scenario: Testa cirklar med JBehave
Given en cirkel med radius 3
When cirkeln räknar ut area
Then borde arean vara 28.26
When cirkeln räknar ut omkretsen
Then borde omkretsen vara 18.84

Given en cirkel med radius 2
When cirkeln räknar ut area
Then borde arean vara 12.57
When cirkeln räknar ut omkretsen
Then borde omkretsen vara 12.57

Given en cirkel med radius 1
When cirkeln räknar ut area
Then borde arean vara 3.14
When cirkeln räknar ut omkretsen
Then borde omkretsen vara 6.28

