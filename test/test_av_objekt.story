Narrative: Testa olika geometriska figurers 
grundläggande egenskaper som omkrets, area och volym
avstånd mellan olika punkter och sidor som vi ska få fram

Scenario: Räkna ut cirkels area pi*r^2 och omkrets pi*2r 
alltså pi*diameter

Given en cirkel 
When cirkeln har radius 3
Then arean borde vara 28.26 och omkretsen 18.84

When cirkeln har radius 1
Then arean borde vara 3.14 och omkretsen 6.28

When cirkeln har radius 2
Then arean borde vara 12.57 och omkretsen 12.57

Scenario: Höjden är alltid vinkelrät mot basen 
triangels area basen*höjden/2 och omkrets addera alla sidor
Given en triangel
When basen är 3 och höjden är 2
Then arean borde vara 3
When ena sidan är 2, andra sidan 3 och sista sdan är 4
Then omkrets should be 9

Scenario: Rektangel area blir basen*höjden
och omkretsen blir basen^2+höjden^2
Given en rektangel
When längden är 3 och höjden är 2
Then area borde vara 6 och omkretsen är 10
When längen är 5 och höjden är 3
Then area borde vara 15 och omkretsen 16

Scenario:I ett pararellogram är sidorna parvis
lika långa och parallella
area blir basen*höjden och omkretsen blir 
basen^2*sida*^2
Given ett pararellogram
When basen 6 och höjden är 4 och sidan är 4
Then area borde vara 12 och omkretsen är 28
When längden är 8 och höjden är 3 och sidan är 6
Then area borde vara 24 och omkretsen är 44

Scenario: I en kub är alla sidor lika långa
area blir basen*höjden*djup och omkrets bli
volym^2*2
Given en kub 
When basen är 5 och höjden är 5 och djupen är 5
Then volym borde vara 125 och mantelarea 500
When basen är 8 och höjden är 8 och djupen är 8
Then volym borde bara 512 och mantelarea 2048 

Scenario: För att räkna konnens volym behöver känna till 
basytans radie och höjden basytan är en cirkel
sidhöjd blir radie^2*höjd^2 där volymen blir pi*radie^2*höjd/3
och basytan blir pi*radie*sidhöjd+pi*radie^2
Given en kon
When radie är 3 och höjden är 6
Then sidhöj borde vara 40 och volym 56.52 och ytan är 10648,37
When radie är 6 och höjden 8
Then sidhöjd borde vara 73 och volym 301.44 och 155466.17
