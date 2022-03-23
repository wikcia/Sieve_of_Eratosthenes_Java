# Sieve_of_Eratosthenes_Java
Stwórz publiczną klasę LiczbyPierwsze posiadającą jeden konstruktor LiczbyPierwsze(int
n), który tworzy tablicę liczb pierwszych znajdujących się w zakresie od 2 do n. Następnie
zaimplementuj publiczną metodę int liczba(int m) zwracającą wartość m-tej liczby pierwszej z tego zakresu. Funkcja ta powinna prawidłowo działać dla liczb od 0 do k, gdzie k to
ilość liczb pierwszych w zakresie od 2 do n.
Stwórz klasę Test której metoda statyczna main dla pierwszego argumentu wywołania stworzy tablicę liczb pierwszych a następnie dla kolejnych argumentów wypisze wartości liczb
pierwszych znajdujących się na poszczególnych pozycjach tablicy.
W przypadku błędnego pierwszego argumentu program wypisze komunikat błędu i skończy
pracę. W przypadku błednych pozostałych argumentów wypisze, zamiast wartości, informację
o tym błędzie i przejdzie do obliczeń dla następnego argumentu.
Przykładowe użycie programu:
> java Test 14 0 2 4 8 -1 aaaa
0 - 2
2 - 5
4 - 11
8 - liczba spoza zakresu
-1 - liczba spoza zakresu
aaaa - nieprawidłowa dana
> java Test -4 8
-4 - Nieprawidłowy zakres
