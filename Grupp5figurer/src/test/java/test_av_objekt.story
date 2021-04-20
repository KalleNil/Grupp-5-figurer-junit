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