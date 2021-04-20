Scenario: Testa olika figurer

Given en cirkel
When cirkeln har radius 3
Then arean borde vara 28.27 och omkretsen 31.42

Given en triangel
When basen är 3 och höjden är 2
Then arean borde vara 3
When ena sidan är 2, andra sidan 3 och sista sdan är 4
Then omkrets should be 9

Given en rektangel
When längden är 3 och höjden är 2
Then area borde vara 6 och omkretsen är 10
When längen är 5 och höjden är 3
Then area borde vara 15 och omkretsen 16

Given en pararellogram
When basen 6 och höjden är 4 och sidan är 4
Then area borde vara 12 och omkretsen är 28
when längden är 8 och höjden är 3 och sidan är 6
Then area borde vara 24 och omkretsen är 44

Given en kub 
When basen är 5 och höjden är 5 och djupen är 5
Then volym borde vara 125 och mantelarea 500
When basen är 8 och höjden är 8 och djupen är 8
Then volym borde bara 512 och mantelarea 2048 

