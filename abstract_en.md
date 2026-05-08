Współbieżność, czyli żarty sie skończyły

W mojej krótkiej acz dynamicznej karierze, miałem przyjemność i niekłamaną radochę z zagłębiania się
coraz głębiej w odmęty szaleństwa w towarzystwie baz danych, języków programowania i systemów rozproproszonych.
Jednak to współbieżność raz na zawsze pozbawiła mnie złudzeń, popchnęła w traumę i zwątpienie.

Jako programiści, żyjemy w ułudzie, iluzji, że kod wykonuje się dokładnie tak jak widzimy go na ekranach.
Zapominamy o tym, że wszyscy kłamią. Procesory, kompilatory, biblioteki i model mentalne.

Celem tej prezentacji jest wprowadzenie was w świat programowania współbieżnego, który świadomie, czy też nie,
praktykujecie codziennie.

Wyjdziemy od definicji problemu. Dlaczego współbieżnością straszy się młodych programistów i dlaczego większość
problemów wynika z faktu, że już mało kto pamięta jak działają procesory.

Porozmawiamy o "consitency" i "cache coherence", "memory hierarchy" a także o "liveness", "mutual exlusion" i
"atomic operations". Zrozumiemy ograniczenia jakię wynikają dominującego modelu, opertego na "lockach" i jakie 
mamy alternatywne modele programowania. Zgłębimy dlaczego modele pamięci pomagają nam zachować resztki rozsądku i dlaczego
"sequential consistency" jest dominującym modelem przyjętym przez większość języków programowania.

Mam nadzieję, że ta prelekcja będzie łagodnym wprowadzeniem w fascynujący świat współbieżności, który de facto jest kluczowy
dla zapewnienia wydajności naszych systemów.
